package pl.com.gus.domain.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.com.gus.domain.entity.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, String> {

    @Query("select p from Product p where p.isScanned = false")
    List<Product> findAllNotScanned();
}
