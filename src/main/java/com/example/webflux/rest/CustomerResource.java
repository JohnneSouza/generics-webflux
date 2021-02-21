package com.example.webflux.rest;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.customers.Customer;
import com.example.webflux.core.customers.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/customers")
public class CustomerResource extends BaseResource<Customer> {

    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("firstName/{firstName}")
    public Flux<Customer> findByFirstName(@PathVariable String firstName){
        return customerService.findByFirstName(firstName);
    }

    @GetMapping("lastName/{lastName}")
    public Flux<Customer> findByLastName(@PathVariable String lastName){
        return customerService.findByLastName(lastName);
    }

    @Override
    protected BaseRepository<Customer> getService() {
        return customerService.getRepository();
    }
}
