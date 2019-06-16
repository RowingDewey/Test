package com.pattern.factory.abstract1;

public class HackButter extends Unit
{

    public HackButter(int attack, int defence, int health, int x, int y)
    {
        super(attack, defence, health, x, y);
    }
    
    public HackButter(int x, int y)
    {
        super(20, 4, 350, x, y);
    }
    
    @Override
    public void show()
    {
        System.out.println("HackButter let in" + x +"," + y);
    }

    @Override
    public void attack()
    {
        System.out.println("For the Honour ! attack~~ the HackButters!");
    }
    
}
