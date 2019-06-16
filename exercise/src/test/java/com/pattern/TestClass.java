package com.pattern;

import java.lang.reflect.Proxy;
import java.util.Random;

import org.junit.Test;

import com.pattern.adapter.t01.Adapter;
import com.pattern.adapter.t01.TV;
import com.pattern.factory.abstract1.AbstractFactory;
import com.pattern.factory.abstract1.HumanFactory;
import com.pattern.factory.abstract1.Unit;
import com.pattern.factory.method.Airplane;
import com.pattern.factory.method.Enemy;
import com.pattern.factory.method.SimpleFactory;
import com.pattern.factory.method.Tank;
import com.pattern.factory.method.abstract01.BoosFactory;
import com.pattern.factory.method.abstract01.RandomFactory;
import com.pattern.observer.ObserverOne;
import com.pattern.observer.ObserverTwo;
import com.pattern.observer.Subject;
import com.pattern.observer.SubjectExtend;
import com.pattern.proxy.staticProxy.MyInvocationHandler;
import com.pattern.proxy.staticProxy.UserImpl;
import com.pattern.proxy.staticProxy.UserInfo;
import com.pattern.proxy.staticProxy.UserInfoProxy;
import com.pattern.proxy.staticProxy.UserInvocationHandler;
import com.pattern.proxy.staticProxy.Waiter;

public class TestClass
{
    @Test
    public void testAdapter()
    {
        TV tv = new TV();
        // tv.electrify(220, 0);
        
        Adapter adapter = new Adapter(tv);
        adapter.electrify(220, 0, 0);
    }
    
    @Test
    public void testT()
    {
        int screenWidth = 100;// 屏幕宽度
        System.out.println("游戏开始");
        Random random = new Random();// 准备随机数
        
        int x = random.nextInt(screenWidth);// 生成敌机横坐标随机数
        Enemy airplan = new Airplane(x, 0);// 实例化飞机
        airplan.show();// 显示飞机
        
        x = random.nextInt(screenWidth);// 坦克同上
        Enemy tank = new Tank(x, 0);
        tank.show();
    }
    // 工厂 方法 
    @Test
    public void simpleFactory() 
    {
        SimpleFactory simpleFactory = new SimpleFactory(100,new Random());
        Enemy airplean = simpleFactory.create("airPlane");
        airplean.show();
        Enemy tank = simpleFactory.create("tank");
        tank.show();
    }
    

    // 简单 工厂
    @Test
    public void testD()
    {
        System.out.println(new Random().nextBoolean());
        int screemWith = 100;
        for (int i = 0; i < 10; i++)
        {
            Enemy enemy = new RandomFactory().create(screemWith);;
            enemy.show();
        }
        System.out.println("Boss 关卡: *******");
        new BoosFactory().create(screemWith).show();
        
    }
    //工厂 抽象
    @Test
    public void testAbstractFactory() {
        AbstractFactory aFactory = new HumanFactory(100, 100);
        Unit unit = aFactory.createHigClass();
        unit.attack();
        Unit low = aFactory.createLowClass();
        low.attack();
        
        Unit mid = aFactory.createMidClass();
        mid.attack();
    }
    
    // 观察着
    @Test
    public void testObserver(){
        
        // 被观察着
        Subject sub = new SubjectExtend();
        // 添加观察着1
        sub.addObserver(new ObserverOne());
        sub.addObserver(new ObserverTwo());
        sub.doSomeThings();
    }
    
    // 静态代理测试
    @Test
    public void testStaticProxy()
    {
        UserInfo userImpl = new UserImpl();
        UserInfo userInfo = new UserInfoProxy(userImpl);
        int updateUser = userInfo.updateUser(1);
        int queryUser = userInfo.queryUser();
        System.out.println(updateUser);
        System.out.println(queryUser);
    }
    
    // 动态代理
    @Test       
    public void TestActiceProxy() 
    {
        UserInfo userInfo = new UserImpl();
         //UserInvocationHandler handler1 = new UserInvocationHandler(userInfo);
         // Proxy.getProxyClass(UserInvocationHandler.class.getClassLoader(), new Class[]{handler1.class});
        
         // 获得类 加载器
         ClassLoader loader = userInfo.getClass().getClassLoader();
         // 被增强的对象实现 所有接口
         Class<?>[] interfaces = userInfo.getClass().getInterfaces();
         UserInfo info = (UserInfo)Proxy.newProxyInstance(loader, interfaces, new UserInvocationHandler(userInfo));
         int updateUser = info.updateUser(2);
         System.out.println(updateUser);
    }
    
 
}
