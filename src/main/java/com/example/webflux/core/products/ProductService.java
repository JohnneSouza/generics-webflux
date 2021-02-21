package com.example.webflux.core.products;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.BaseService;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class ProductService extends BaseService<Product> {

    private final ProductsRepository productsRepository;

    ProductService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public Flux<Product> findProductByCategory(String category){
        return productsRepository.findProductByCategory(category);
    }

    public Flux<Product> findProductByColor(String color){
        return productsRepository.findProductByColor(color);
    }

    public BaseRepository<Product> getRepository() {
        return productsRepository;
    }
}
