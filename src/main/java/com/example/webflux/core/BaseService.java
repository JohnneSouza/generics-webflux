package com.example.webflux.core;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public abstract class BaseService<T extends BaseEntity> implements BaseRepository<T> {

    protected abstract BaseRepository<T> getRepository();

    @Override
    public <S extends T> Mono<S> save(S s) {
        return getRepository().save(s);
    }

    @Override
    public Mono<T> findById(String s) {
        return getRepository().findById(s);
    }

    @Override
    public Flux<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public Mono<Void> deleteById(String s) {
        return getRepository().deleteById(s);
    }
}
