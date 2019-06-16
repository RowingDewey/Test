package com.pattern.factory.abstract1;

public class DeadDog extends Unit
{

    public DeadDog(int attack, int defence, int health, int x, int y)
    {
        super(attack, defence, health, x, y);
    }
    
    public DeadDog( int x, int y)
    {
        super(10, 2, 200, x, y);
    }
    
    @Override
    public void show()
    {
        System.out.println("DeadDog let in" + x +"," + y);
    }

    @Override
    public void attack()
    {
        System.out.println("For the Lich King ! attack~~ DeadDogs");
    }
    
}
