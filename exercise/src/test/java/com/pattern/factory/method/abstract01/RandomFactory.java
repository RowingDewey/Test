package com.pattern.factory.method.abstract01;

import java.util.Random;

import com.pattern.factory.method.Airplane;
import com.pattern.factory.method.Enemy;
import com.pattern.factory.method.Tank;

public class RandomFactory implements Factory
{
    private Random random = new Random();
    
    
    @Override
    public Enemy create(int screemWith)
    {   
       if (random.nextBoolean())
       {
           return new Tank(random.nextInt(screemWith), 0);
       }else {
           return new Airplane(random.nextInt(screemWith), 0);
       }
    }
    
}
