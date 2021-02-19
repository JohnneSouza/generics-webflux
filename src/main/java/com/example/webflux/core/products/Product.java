package com.example.webflux.core.products;

import com.example.webflux.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("Products")
public class Product extends BaseEntity {

    private String category;
    private String color;
    private Double value;

}
