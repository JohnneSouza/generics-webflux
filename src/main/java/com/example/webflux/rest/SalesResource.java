package com.example.webflux.rest;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.sales.Sale;
import com.example.webflux.core.sales.SalesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/sales")
public class SalesResource extends BaseResource<Sale>{

    SalesService salesService;

    public SalesResource(SalesService salesService) {
        this.salesService = salesService;
    }

    @GetMapping("{key}")
    public Mono<Sale> findByKey(@PathVariable String key){
        return salesService.findByKey(key);
    }

    @Override
    protected BaseRepository<Sale> getService() {
        return this.salesService.getRepository();
    }
}
