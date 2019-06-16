package com.pattern.factory.abstract1;

public class FootMan extends Unit
{

    public FootMan(int attack, int defence, int health, int x, int y)
    {
        super(attack, defence, health, x, y);
    }
    
    public FootMan(int x, int y)
    {
        super(10, 2, 200, x, y);
    }

    @Override
    public void show()
    {
        System.out.println("FootMan let in" + x +"," + y);
    }

    @Override
    public void attack()
    {
        System.out.println("For the honour ! attack~~ FootMans");
    }
    
}
