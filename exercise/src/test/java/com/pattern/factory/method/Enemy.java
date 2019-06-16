package com.pattern.factory.method;

/**
 * 敌人 抽象类
 *  
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月7日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class Enemy
{
    protected int x;
    
    protected int y;

    public Enemy(int x,int y)
    {
       this.x = x;
       this.y = y;
    }
    
    public abstract void show();
    
}
