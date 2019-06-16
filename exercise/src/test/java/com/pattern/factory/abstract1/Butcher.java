package com.pattern.factory.abstract1;

public class Butcher extends Unit
{

    public Butcher(int attack, int defence, int health, int x, int y)
    {
        super(attack, defence, health, x, y);
    }
    
    public Butcher(int x, int y)
    {
        super(20, 4, 350, x, y);
    }
    
    @Override
    public void show()
    {
        System.out.println("Butcher let in" + x +"," + y);
    }

    @Override
    public void attack()
    {
        System.out.println("For the Lich King ! attack~~ Butchers");
    }
    
}
