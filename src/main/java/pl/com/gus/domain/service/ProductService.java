package pl.com.gus.domain.service;

import pl.com.gus.domain.entity.Product;

import java.util.List;

public interface ProductService {

    Product findOne(String name);
    List<Product> findAllNotScanned();
}
