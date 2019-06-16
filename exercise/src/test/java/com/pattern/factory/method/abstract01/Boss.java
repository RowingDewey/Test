package com.pattern.factory.method.abstract01;

import com.pattern.factory.method.Enemy;

public class Boss extends Enemy
{

    public Boss(int x, int y)
    {
        super(x, y);
    }

    @Override
    public void show()
    {
        System.out.println("Boss Attack! ," + x +","+y);
    }
    
}
