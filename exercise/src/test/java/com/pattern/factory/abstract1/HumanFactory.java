package com.pattern.factory.abstract1;

public class HumanFactory implements AbstractFactory
{
    private int x;
    
    private int y;
    
    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    @Override
    public Unit createLowClass()
    {
        return new FootMan(x,y);
        
    }

    @Override
    public Unit createMidClass()
    {
        return new HackButter(x, y);
        
    }

    @Override
    public Unit createHigClass()
    {
        return new Knight(x, y);
        
    }
    
}
