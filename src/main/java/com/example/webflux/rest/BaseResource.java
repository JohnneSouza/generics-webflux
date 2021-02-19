package com.example.webflux.rest;

import com.example.webflux.core.BaseEntity;
import com.example.webflux.core.BaseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public abstract class BaseResource<T extends BaseEntity> {

    protected abstract BaseRepository<T> getService();

    @GetMapping
    public Flux<T> findAll(){
        return getService().findAll();
    }

    @PostMapping
    public Mono<T> save(@RequestBody T t){
        return getService().save(t);
    }

}
