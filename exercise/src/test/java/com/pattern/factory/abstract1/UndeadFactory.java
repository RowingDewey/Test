package com.pattern.factory.abstract1;

public class UndeadFactory implements AbstractFactory
{
    private int x;
    
    private int y;
    
    public UndeadFactory(int x,int y)
    {
        this.x = x;
        this.y =y;
    }

    @Override
    public Unit createLowClass()
    {
        return new DeadDog(x, y);
        
    }

    @Override
    public Unit createMidClass()
    {
        return new Butcher(x, y);
        
    }

    @Override
    public Unit createHigClass()
    {
        return new DeadDog(x, y);
        
    }
    
}
