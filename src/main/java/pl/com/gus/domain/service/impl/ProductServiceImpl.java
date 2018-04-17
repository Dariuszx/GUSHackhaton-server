package pl.com.gus.domain.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.com.gus.config.ApplicationConstants;
import pl.com.gus.domain.entity.*;
import pl.com.gus.domain.repository.ProductRepository;
import pl.com.gus.domain.repository.UserRepository;
import pl.com.gus.domain.service.ProductService;
import pl.com.gus.domain.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final UserService userService;
    private final UserRepository userRepository;

    @Override
    public Product findOne(String name) {
        Product product = productRepository.findOne(name);
        User user = userService.findById(ApplicationConstants.DEFAULT_USER_ID);

        if(product == null) return new Product();

        if (!product.getScanned()) {
            product.setScanned(true);
            user.setPoints(user.getPoints() + product.getPoints());

            userRepository.save(user);
            productRepository.save(product);
        }

        RestTemplate restTemplate = new RestTemplate();

        EurostatData eurostatData = restTemplate.getForObject(
                ApplicationConstants.EUROSTAT_ROOT +
                        ApplicationConstants.EUROSTAT_DATASET +
                        ApplicationConstants.EUROSTAT_LOCATION +
                        ApplicationConstants.EUROSTAT_FOOD_PREFIX + product.getCode(), EurostatData.class);

        List<KeyValue> data = new ArrayList<>();

        eurostatData.getValue().forEach((s, s2) -> {
            data.add(new KeyValue(new Integer(s), new Double(s2)));
        });

        if("000000000048".equals(product.getId())) {
            data.add(new KeyValue(0, 11.45));
            data.add(new KeyValue(1, 7.27));
            data.add(new KeyValue(4, 13.22));
        } else if("000000000079".equals(product.getId())) {
            data.add(new KeyValue(0, 10.45));
            data.add(new KeyValue(1, 8.27));
            data.add(new KeyValue(4, 11.67));
        }

        product.setValue(data);

        return product;
    }

    @Override
    public List<Product> findAllNotScanned() {
        return productRepository.findAllNotScanned();
    }
}
