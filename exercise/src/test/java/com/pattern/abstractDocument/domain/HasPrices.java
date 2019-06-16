package com.pattern.abstractDocument.domain;

import java.util.Optional;

import com.pattern.abstractDocument.Document;

public interface HasPrices extends Document
{
    String PROPERTY = "prices";
    
   // default Optional<String> getPrices()  // java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.String
    default Optional<Number> getPrices()
    {   
        Optional<Number> optional = 
         Optional.ofNullable((Number) get(PROPERTY));
        return optional;
    }
}
