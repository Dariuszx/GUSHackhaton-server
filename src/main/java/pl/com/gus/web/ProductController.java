package pl.com.gus.web;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.gus.domain.entity.ListWrapper;
import pl.com.gus.domain.entity.Product;
import pl.com.gus.domain.service.ProductService;

@RestController
@RequestMapping("/api/product/")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {

    private final ProductService productService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product findOne(@PathVariable("id") String id) {
        return productService.findOne(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ListWrapper<Product> findNotScanned() {
        return new ListWrapper<>(productService.findAllNotScanned());
    }

}
