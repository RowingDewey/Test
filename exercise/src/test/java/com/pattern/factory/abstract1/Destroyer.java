package com.pattern.factory.abstract1;

public class Destroyer extends Unit
{

    public Destroyer(int attack, int defence, int health, int x, int y)
    {
        super(attack, defence, health, x, y);
    }
    
    public Destroyer( int x, int y)
    {
        super(40, 5, 500, x, y);
    }
    
    @Override
    public void show()
    {
        System.out.println("Destroyer let in" + x +"," + y);
    }

    @Override
    public void attack()
    {
        System.out.println("For the Lich King ! attack~~ Destroyers");
    }
    
}
