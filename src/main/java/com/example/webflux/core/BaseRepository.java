package com.example.webflux.core;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BaseRepository<T extends BaseEntity> extends ReactiveCrudRepository<T, ObjectId> {

    <S extends T> Mono<S> save(S s);

    Mono<T> findById(String s);

    Flux<T> findAll();

    Mono<Void> deleteById(String s);

}
