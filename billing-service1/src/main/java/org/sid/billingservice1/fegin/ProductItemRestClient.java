package org.sid.billingservice1.fegin;

import org.sid.billingservice1.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.QueryParam;

@FeignClient(name="PRODUCT-SERVICE")
public interface ProductItemRestClient {
    @GetMapping(path ="/products")
    PagedModel<Product> pageProducts();
    @GetMapping(path = "/products/{id}")
    Product getProductById(@PathVariable Long id);
}
