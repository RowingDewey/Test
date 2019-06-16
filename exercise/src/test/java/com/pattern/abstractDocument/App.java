package com.pattern.abstractDocument;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pattern.abstractDocument.domain.Car;
import com.pattern.abstractDocument.domain.HasModel;
import com.pattern.abstractDocument.domain.HasParts;
import com.pattern.abstractDocument.domain.HasPrices;
import com.pattern.abstractDocument.domain.HasType;
import com.pattern.abstractDocument.domain.Part;

/**
 * https://blog.csdn.net/evan_leung/article/details/81546369
 * 抽象文档模式是什么
    一种面向对象的结构设计模式，用于在松散类型的键值存储中组织对象并使用类型化视图公开数据。
    该模式的目的是在强类型语言中实现组件之间的高度灵活性，其中可以动态地将新属性添加到对象树，
    而不会失去对类型安全的支持。该模式利用特征将类的不同属性分成不同的接口
    
     使用场景
    需要动态添加新属性
    你想要一种灵活的方式来组织树状结构中的域
    你想要构建更松散耦合的系统
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月21日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class App
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    
    public App() 
    {   
        LOGGER.info("Constructing parts and car");
        // 车属性
        Map<String, Object> carProperties = new HashMap<String, Object>();
        
        carProperties.put(HasModel.PROPERTY, "300SL");
        carProperties.put(HasPrices.PROPERTY, 30000000L);
            
        // 部件属性:wheel轮子
        Map<String, Object> wheelProperties = new HashMap<String, Object>();
        wheelProperties.put(HasType.PROPERTY, "wheel");
        wheelProperties.put(HasModel.PROPERTY, "15C");
        wheelProperties.put(HasPrices.PROPERTY, 1000L);
        
        //车门
        Map<String, Object> doorProperties = new HashMap<String, Object>();
        doorProperties.put(HasType.PROPERTY, "door");
        doorProperties.put(HasModel.PROPERTY, "BH");
        doorProperties.put(HasPrices.PROPERTY, 2000L); 
        List<Map<String, Object>> asList = Arrays.asList(wheelProperties,doorProperties);
        carProperties.put(HasParts.PROPERTY,asList);
        
        Car car = new Car(carProperties);
        LOGGER.info("Here is our car");
        
        // price
        Optional<Number> prices = car.getPrices();
        Number carPrice = car.getPrices().get();
        System.out.println(prices);
        System.out.println(carPrice);
        
        // model
        Optional<String> model = car.getModel();
        System.out.println(model); //Optional[300SL]
        String string = model.get(); // 300SL
        System.out.println(string);
        
        // 
        Stream<Part> parts2 = car.getParts();
        parts2.forEach(a -> LOGGER.info("\t{}/{}/{}",a.getModel().get(),a.getPrices().get(),a.getType().get()));
        
        //Optional<String> parts = car.getParts();
        
        Stream<Part> parts = car.getParts();
        //  stream has already been operated upon or closed 2个只可执行一个
        // parts.forEach(a -> LOGGER.info("\t{}/{}/{}",a.getModel(),a.getPrices(),a.getType()));
        parts.forEach(a -> LOGGER.info("\t{}/{}/{}",a.getModel().get(),a.getPrices().get(),a.getType().get()));
       
       
        
    }
    
    public static void main(String[] args)
    {
        App app = new App();
    }
}
