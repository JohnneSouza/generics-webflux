package com.example.webflux.core.customers;

import com.example.webflux.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Document("Customers")
public class Customer extends BaseEntity {

    @NotBlank(message = "firstName must not be blank")
    private String firstName;
    private String lastName;

}
