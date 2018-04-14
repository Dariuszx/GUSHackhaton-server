package pl.com.gus.domain.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.Product;

public interface ProductRepository extends CrudRepository<Product, String> {

}
