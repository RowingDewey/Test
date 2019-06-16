package com.pattern.abstractDocument.domain;

import java.util.Optional;

import com.pattern.abstractDocument.Document;

public interface HasModel extends Document
{
    String PROPERTY = "model";
    
    default Optional<String> getModel()
    {
        //Optional<Object> of = Optional.of(get(PROPERTY));
        Optional<String> ofNullable = Optional.ofNullable((String)get(PROPERTY));
        
        return ofNullable;
    }
}
