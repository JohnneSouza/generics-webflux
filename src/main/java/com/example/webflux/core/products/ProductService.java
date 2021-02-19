package com.example.webflux.core.products;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.BaseService;
import org.bson.types.ObjectId;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @Override
    public <S extends Product> Flux<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Product> Flux<S> saveAll(Publisher<S> publisher) {
        return null;
    }

    @Override
    public Mono<Product> findById(ObjectId objectId) {
        return null;
    }

    @Override
    public Mono<Product> findById(Publisher<ObjectId> publisher) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(ObjectId objectId) {
        return null;
    }

    @Override
    public Mono<Boolean> existsById(Publisher<ObjectId> publisher) {
        return null;
    }

    @Override
    public Flux<Product> findAllById(Iterable<ObjectId> iterable) {
        return null;
    }

    @Override
    public Flux<Product> findAllById(Publisher<ObjectId> publisher) {
        return null;
    }

    @Override
    public Mono<Long> count() {
        return null;
    }

    @Override
    public Mono<Void> deleteById(ObjectId objectId) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(Publisher<ObjectId> publisher) {
        return null;
    }

    @Override
    public Mono<Void> delete(Product product) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends Product> iterable) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends Product> publisher) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}
