package com.example.webflux.rest;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.products.Product;
import com.example.webflux.core.products.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource extends BaseResource<Product> {

    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @Override
    protected BaseRepository<Product> getService() {
        return productService.getRepository();
    }
}
