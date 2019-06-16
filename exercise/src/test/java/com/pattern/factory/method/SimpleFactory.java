package com.pattern.factory.method;

import java.util.Random;

/**
 * 这个简单工厂并不是一种设计模式，它只是对实例化逻辑进行了一层简单包裹而已，
 * 客户端依然是要告诉工厂我要的是哪个产品，虽然没有出现对产品实例化的关键字new，
 * 但这依然无疑是另一种形式的耦合。
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月7日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class SimpleFactory
{
    private int screenWith;
    
    private Random random;

    public SimpleFactory(int screenWith,Random random)
    {
        this.screenWith = screenWith;
        this.random = random;
    }
    
    public Enemy  create(String type) {
        int x = random.nextInt(screenWith);
        Enemy enemy = null;
        switch (type)
        {
            case "airPlane":
                enemy =new Airplane(x,0);
                return enemy;
            case "tank":
                enemy = new Tank(x, 0);
                return enemy;
        }
        return enemy;
        
    }
}
