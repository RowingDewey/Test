package com.pattern.abstractDocument.domain;

import java.util.Map;

import com.pattern.abstractDocument.AbstractDocument;

public class Car extends AbstractDocument implements HasModel,HasPrices,HasParts
{

    public Car(Map<String, Object> properties)
    {
        super(properties);
    }

}
