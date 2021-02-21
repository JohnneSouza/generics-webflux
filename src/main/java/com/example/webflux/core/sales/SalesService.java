package com.example.webflux.core.sales;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.BaseService;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

@Service
public class SalesService extends BaseService<Sale> {

    private final SalesRepository salesRepository;

    public SalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    public Mono<Sale> findByKey(String key){
        return salesRepository.findByKey(key)
                .switchIfEmpty(Mono.error(new NotFoundException("Sale not Found")));
    }

    @Override
    public BaseRepository<Sale> getRepository() {
        Flux.interval(Duration.of(100L, ChronoUnit.MILLIS)).take(10L);
        return this.salesRepository;

    }
}
