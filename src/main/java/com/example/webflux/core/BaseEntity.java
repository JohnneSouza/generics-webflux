package com.example.webflux.core;

import lombok.Getter;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

@Getter
@Setter
public class BaseEntity {

    @BsonId
    private ObjectId id;

}
