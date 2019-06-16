package com.pattern.factory.method;

public class Tank extends Enemy
{
    
    public Tank(int x, int y)
    {
        super(x, y);
    }

    @Override
    public void show()
    {
        System.out.println("坦克出现 坐标 " + x + ", " + y +",发动攻击...");
        
    }
    
}
