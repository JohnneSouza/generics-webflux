package com.example.webflux.rest;

import com.example.webflux.core.BaseEntity;
import com.example.webflux.core.BaseRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@NoRepositoryBean
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

    @GetMapping("{id}")
    public Mono<T> findById(@PathVariable String id){
        return getService().findById(id);
    }

}
