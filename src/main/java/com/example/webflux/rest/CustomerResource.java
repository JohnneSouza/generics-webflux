package com.example.webflux.rest;

import com.example.webflux.core.BaseRepository;
import com.example.webflux.core.customers.Customer;
import com.example.webflux.core.customers.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerResource extends BaseResource<Customer> {

    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    protected BaseRepository<Customer> getService() {
        return customerService.getRepository();
    }
}
