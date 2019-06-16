package com.pattern.abstractDocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * document interface
 * 
界面“文档”表示可以使用“put”方法编辑属性，使用“get”方法读取，可以使用“children”方法遍历子文档。
“children”方法需要对一个方法的功能性引用，该方法可以在给定子项应具有的数据的映射集合的情况下生成子类型的视图。
映射集合应该是指向原始映射集合的指针，以便视图中的更改也会影响原始文档。

实现可以从描述不同属性的多个特征接口继承。多个实现甚至可以共享相同的映射集合，
模式对实现设计的唯一限制是它必须是无状态的，除了从“BaseDocument”继承的属性。
--------------------- 
    https://blog.csdn.net/evan_leung/article/details/81546369 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月20日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface Document
{
    void put(String key,Object value);
    
    Object get(String key);
    
    /**
     * Gets the stream of chinld documents
     */
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);
}
