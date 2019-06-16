package com.pattern.observer;

public class SubjectExtend  extends Subject
{

    @Override
    public void doSomeThings()
    {
        System.out.println("被观察着 发生事件， 进行通知~");
        notifyObserver();
    }
    
}
