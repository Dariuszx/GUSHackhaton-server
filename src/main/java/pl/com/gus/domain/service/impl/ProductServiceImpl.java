package pl.com.gus.domain.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.gus.config.ApplicationConstants;
import pl.com.gus.domain.entity.Product;
import pl.com.gus.domain.entity.User;
import pl.com.gus.domain.repository.ProductRepository;
import pl.com.gus.domain.repository.UserRepository;
import pl.com.gus.domain.service.ProductService;
import pl.com.gus.domain.service.UserService;

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

        if (!product.getScanned()) {
            product.setScanned(true);
            user.setPoints(user.getPoints() + product.getPoints());

            userRepository.save(user);
            productRepository.save(product);
        }

        return productRepository.findOne(name);
    }
}
