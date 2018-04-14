package pl.com.gus.domain.service;

import pl.com.gus.domain.entity.Product;

public interface ProductService {

    Product findOne(String name);
}
