package com.pattern.abstractDocument.domain;



import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import com.pattern.abstractDocument.Document;
// parts 就是 这个文档的所有 内容 ，
public interface HasParts extends Document
{   
    String PROPERTY = "parts";
    
   /* default Optional<String> getParts()
    {
        Optional<String> optional = Optional.ofNullable((String)get(PROPERTY));
        return optional;
    }*/
    // Part::new 啥意思？？？？
    // parts 就是 这个文档的所有 内容 ， 所以key：parts value： 就是 part 这个对象。  使用的children方法。
    default Stream<Part> getParts() 
    {
        return children(PROPERTY, Part::new);//   <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
                                             //所以 也就不难理解 Function<Map<String, Object>, T> 东西 就是 个 part对象; 但是new part()
                                             /*
                                              *  
                                                public Part(Map<String, Object> properties)
                                                {
                                                    super(properties);
                                                }
                                                part:new  就是 这个东西 = new Part(Map<String,Object> properties);  
                                                
                                              */
    }
}
