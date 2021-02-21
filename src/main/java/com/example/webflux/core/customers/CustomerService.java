package com.example.webflux.core.customers;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.BaseService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
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

}
