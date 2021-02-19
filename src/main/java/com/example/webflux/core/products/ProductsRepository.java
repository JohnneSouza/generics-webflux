package com.example.webflux.core.products;

import com.example.webflux.core.BaseRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductsRepository extends BaseRepository<Product> {

    Flux<Product> findProductByCategory(String firstName);

    Flux<Product> findProductByColor(String color);

}
