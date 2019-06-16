package com.pattern.factory.method;

public class Airplane extends Enemy
{
    
    public Airplane(int x, int y)
    {
        super(x, y);//调用父类构造子初始化坐标
    }

    @Override
    public void show()
    {
        System.out.println("Airplane出现 坐标 " + x + ", " + y +",发动攻击...");
    }
    
}
