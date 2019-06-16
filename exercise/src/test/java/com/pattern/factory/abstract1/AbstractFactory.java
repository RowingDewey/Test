package com.pattern.factory.abstract1;

public interface AbstractFactory
{
    public abstract Unit createLowClass();
    
    public abstract Unit createMidClass();
    
    public abstract Unit createHigClass();
}
