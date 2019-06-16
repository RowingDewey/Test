package com.pattern.factory.abstract1;

/**
 * 
 * 抽象兵种 
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月7日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class Unit
{
    protected int attack;
    
    protected int defence;
    
    protected int health;
    
    protected int x;
    
    protected int y;

    public Unit(int attack,int defence,int health,int x,int y)
    {
        this.attack = attack;
        this.defence = defence;
        this.health = health;
        this.x =x;
        this.y = y;
    }
    
    public Unit(int x,int y)
    {
       
        this.x =x;
        this.y = y;
    }
    
    public abstract void show();
    
    public abstract void attack();
    
}
