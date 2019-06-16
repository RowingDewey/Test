package com.pattern.factory.method.abstract01;


import com.pattern.factory.method.Enemy;
/**
 * 工厂方法可以被看做是一个升级为设计模式的变种，其工厂方法的抽象化带来了极大好处，
 * 与其把所有生产方式堆积在一个简单工厂类中，
 * 不如把生产方式被推迟到具体的子类工厂中实现，
 * 工厂本身也是需要分类的，这样后期的代码维护以及对新产品的扩展都会更加方便直观，
 * 而不是对单一工厂类翻来覆去地不停改动
 * 
 * 
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月7日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class BoosFactory implements Factory
{

    @Override
    public Enemy create(int screemWith)
    {
     return new Boss(screemWith/2, 0);
    }
    
}
