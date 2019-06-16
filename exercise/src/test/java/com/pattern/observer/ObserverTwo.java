package com.pattern.observer;

public class ObserverTwo implements Observer
{

    @Override
    public void update()
    {
        System.out.println(" 观察着 2 收到 信息 进行处理~~");
    }
    
}
