package com.pattern.observer;

import java.util.Vector;

/**
 * 
 * 被观察着 
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月11日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class Subject
{
    // 放有 被观察的对象
    private Vector<Observer> vector = new Vector<Observer>();
    
    // 添加对象
    public void addObserver(Observer o) 
    {
        vector.add(o);
    }

    // 删除对象
    public void delObserver(Observer o)
    {
        vector.remove(o);
    }
    
    // 通知方法 空参数
    public void notifyObserver()
    {
        for (Observer observer : vector)
        {
            observer.update();
        }
    }
    
    public abstract void doSomeThings();
    
}

