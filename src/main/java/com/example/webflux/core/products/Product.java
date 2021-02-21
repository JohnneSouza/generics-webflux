package com.example.webflux.core.products;

import com.example.webflux.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Document("Products")
public class Product extends BaseEntity {

    private String category;
    private String color;
    @NotNull(message = "Value must not be null")
    private Double value;

}
