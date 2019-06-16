package com.pattern.factory.method.abstract01;

import com.pattern.factory.method.Enemy;

/**
 * 
 * 
 * 简单的需要工厂生产一个坦克而已，那么我们还有必要加载实例化这么臃肿一个简单工厂类么？问题显而易见了，
 * 简单工厂应对简单情况，而针对我们的场景，简单工厂需要多态化，
 * 我们应该对生产方式（工厂方法）进行抽象化。首先，定义一个工厂接口。
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月7日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface Factory
{
    public Enemy create(int screemWith);
}
