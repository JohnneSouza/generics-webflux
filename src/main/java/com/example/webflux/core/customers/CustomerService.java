package com.example.webflux.core.customers;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.BaseService;
import org.bson.types.ObjectId;
import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class CustomerService extends BaseService<Customer> {

    private final CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Flux<Customer> findByFirstName(String firstName){
        return customerRepository.findCustomersByFirstName(firstName);
    }

    public Flux<Customer> findByLastName(String lastName){
        return customerRepository.findCustomersByLastName(lastName);
    }

    public BaseRepository<Customer> getRepository() {
        return customerRepository;
    }

    @Override
    public <S extends Customer> Flux<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends Customer> Flux<S> saveAll(Publisher<S> publisher) {
        return null;
    }

    @Override
    public Mono<Customer> findById(ObjectId objectId) {
        return null;
    }

    @Override
    public Mono<Customer> findById(Publisher<ObjectId> publisher) {
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
    public Flux<Customer> findAllById(Iterable<ObjectId> iterable) {
        return null;
    }

    @Override
    public Flux<Customer> findAllById(Publisher<ObjectId> publisher) {
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
    public Mono<Void> delete(Customer customer) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Iterable<? extends Customer> iterable) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll(Publisher<? extends Customer> publisher) {
        return null;
    }

    @Override
    public Mono<Void> deleteAll() {
        return null;
    }
}
