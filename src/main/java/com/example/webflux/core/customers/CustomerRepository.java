package com.example.webflux.core.customers;

import com.example.webflux.core.BaseRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CustomerRepository extends BaseRepository<Customer> {

    Flux<Customer> findCustomersByFirstName(String firstName);

    Flux<Customer> findCustomersByLastName(String lastName);

}
