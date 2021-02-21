package com.example.webflux.core;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public abstract class BaseService<T extends BaseEntity> {

    protected abstract BaseRepository<T> getRepository();

    public Mono<T> findById(String s) {
        return getRepository().findById(s);
    }

    public <S extends T> Mono<S> save(S s) {
        return getRepository().save(s);
    }

    public Flux<T> findAll() {
        return getRepository().findAll();
    }

    public Mono<Void> deleteById(String s) {
        return getRepository().deleteById(s);
    }
}
