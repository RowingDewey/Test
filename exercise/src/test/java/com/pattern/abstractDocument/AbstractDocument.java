package com.pattern.abstractDocument;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *   组成部分抽象类
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月21日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public abstract class AbstractDocument implements Document
{
    private final Map<String, Object> properties;

    public AbstractDocument(Map<String, Object> properties)
    {
        Objects.requireNonNull(properties,"properties map is requied");
        this.properties = properties;
    }

    @Override
    public void put(String key, Object value)
    {
        properties.put(key, value);
    }

    @Override
    public Object get(String key)
    {   
        
        return properties.get(key);
    }
    
    /**
     *
     */
    @Override
    public <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor)
    {
        Optional<List<Map<String, Object>>> any =
        Stream.of(get(key)).filter(el -> el != null).map(el -> (List<Map<String, Object>>) el).findAny();
        System.err.println(any);
        System.out.println("--------");
        System.out.println(any.get().stream().map(constructor));
         return any.isPresent() ? any.get().stream().map(constructor) : Stream.empty();
    }
    
    @Override
    public String toString()
    {   
        StringBuffer buffer = new StringBuffer();
        buffer.append(getClass().getName()).append("[");
        properties.entrySet().
        forEach(e -> buffer.append("[").append(e.getKey()).append(":").append(e.getValue()).append("]"));
        return buffer.toString();
    }
    
    
    
}
