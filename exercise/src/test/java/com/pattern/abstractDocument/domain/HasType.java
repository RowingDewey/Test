package com.pattern.abstractDocument.domain;

import java.util.Optional;

import com.pattern.abstractDocument.Document;

public interface HasType extends Document
{
    String PROPERTY = "type";
    
    default Optional<String> getType()
    {
        return Optional.ofNullable((String) get(PROPERTY));
    }
}
