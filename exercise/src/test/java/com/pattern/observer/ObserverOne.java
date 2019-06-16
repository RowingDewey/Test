package com.pattern.observer;

public class ObserverOne implements Observer
{

    @Override
    public void update()
    {
        System.out.println("观察着1 收到事件 进行处理~~");
    }
    
}
