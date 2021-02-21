package com.example.webflux.core.sales;

import com.example.webflux.core.BaseRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface SalesRepository extends BaseRepository<Sale> {

    Mono<Sale> findByKey(String key);

}
