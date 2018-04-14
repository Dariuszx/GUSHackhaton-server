package pl.com.gus.domain.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.gus.domain.entity.Product;
import pl.com.gus.domain.repository.ProductRepository;
import pl.com.gus.domain.service.ProductService;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product findOne(String name) {
        return productRepository.findOne(name);
    }
}
