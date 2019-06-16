package com.pattern.factory.abstract1;

public class Knight extends Unit
{

    public Knight(int attack, int defence, int health, int x, int y)
    {
        super(attack, defence, health, x, y);
    }
    
    public Knight( int x, int y)
    {
        super(40, 5, 500, x, y);
    }
    
    @Override
    public void show()
    {
        System.out.println("Knight let in" + x +"," + y);
    }

    @Override
    public void attack()
    {
        System.out.println("For the Honour ! attack~~ the Knights");
    }
    
}
