package com.jdk8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import lombok.val;

import org.apache.xmlbeans.impl.xb.ltgfmt.impl.TestsDocumentImpl.TestsImpl;
import org.junit.Test;
/**
 * java.util.Stream 表示能应用在一组元素上一次执行的操作序列。
 * Stream 操作分为中间操作或者最终操作两种，最终操作返回一特定类型的计算结果，而中间操作返回Stream本身，
 * 这样你就可以将多个操作依次串起来。
 * 
 * Stream 的创建需要指定一个数据源，比如 java.util.Collection的子类，
 * List或者Set， Map不支持。Stream的操作可以串行执行或者并行执行。
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月20日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class TestStream1
{   
    @Test
    public void test0()
    {
        
    }
    
    @Test
    public void test() 
    {   // Stream 的创建需要指定一个数据源，比如 java.util.Collection的子类，List或者Set， Map不支持。Stream的操作可以串行执行或者并行执行。
        List<String> list = new ArrayList<String>();
        list.add("aa1");
        list.add("aa2");
        list.add("aa3");
        list.add("aa4");
        list.add("bb1");
        list.add("bb2");
        list.add("bb3");
        // Collection.stream() 或者 Collection.parallelStream() 来创建一个Stream
        
        Stream<String> stream = list.stream();
        //Stream<String> sorted = stream.sorted();
       // System.out.println(sorted.toString());
        
        //Stream<String> stream2 = stream.sorted().filter((s) -> s.startsWith("b"));
        stream.sorted().filter((s) -> s.startsWith("b")).forEach(System.out::println);
        System.out.println("----------------------");
        list.stream().map(String::toUpperCase).sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
    }
    
    /**
     * Match 匹配
        Stream提供了多种匹配操作，允许检测指定的Predicate是否匹配整个Stream。
                所有的匹配操作都是最终操作，并返回一个boolean类型的值。
     *
     */
    @Test
    public void testMatch() 
    {
        
        List<String> list = new ArrayList<String>();
        list.add("aa1");
        list.add("aa2");
        list.add("aa3");
        list.add("aa4");
        list.add("bb1");
        list.add("bb2");
        list.add("bb3");
        boolean anyMatch = list.stream().anyMatch((s) -> s.startsWith("a")); // true
        System.out.println(anyMatch);
        
        boolean allMatch = list.stream().allMatch((s) -> s.startsWith("a")); // false 
        System.out.println(allMatch);
        
        boolean noneMatch = list.stream().noneMatch((s) -> s.startsWith("z")); // true
        System.out.println(noneMatch);
    }
    
    /**
     * Count 计数
            计数是一个最终操作，返回Stream中元素的个数，返回值类型是long。
     */
    @Test
    public void testCount()
    {
        List<String> list = new ArrayList<String>();
        list.add("aa1");
        list.add("aa2");
        list.add("aa3");
        list.add("aa4");
        list.add("bb1");
        list.add("bb2");
        list.add("bb3");
        Stream<String> stream = list.stream();
        System.out.println(stream);
        long count = list.stream().count();
        System.out.println(count);
        
        long l = list.stream().filter(a -> a.startsWith("a")).count();
        System.out.println(l);
    }
    
    /**predicate  英 [ˈpredɪkət] 断言，断定;
     * Reduce 规约
        这是一个最终操作，允许通过指定的函数来讲stream中的多个元素规约为一个元素，规越后的结果是通过Optional接口表示的：
     */
    @Test
    public void testReduce()
    {
        List<String> list = new ArrayList<String>();
        list.add("aa1");
        list.add("aa2");
        list.add("aa3");
        list.add("aa4");
        list.add("bb1");
        list.add("bb2");
        list.add("bb3");
        
        Optional<String> reduce = list.stream().reduce((s1,s2) -> s1 +"#" + s2);
        System.out.println(reduce);
        reduce.ifPresent(System.out::println);
        
    }
    
    @Test
    public void OfStream()
    {   
        Map<String, Object> bigHashMap = new HashMap<String, Object>(); // string string
        Map<String,Object> hashMap = new HashMap<String, Object>(); // string list
        Map<String, Object> properties  = new HashMap<String, Object>();
        
        properties.put("jojo", "Rowing.JOJO");
        properties.put("dewey", "Rowing.DEWEY");
        
        HashMap<String, Object> pro = new HashMap<String, Object>();
        pro.put("ann", "Rowing.ANN");
        pro.put("AnQ","Rowing.AnQ" );
        Stream<Map<String,Object>> of = Stream.of(properties);
        System.out.println(of);
        Stream<Map<String,Object>> map = of.map(el -> el);
        System.out.println(map);
        List<Map<String, Object>> list = Arrays.asList(properties);
        hashMap.put("key",list); // string list
        
        List<Map<String, Object>> l = Arrays.asList(properties,pro);  // string 多个list 可变参数 
        System.err.println(l);
        bigHashMap.put("bigKey", Arrays.asList(properties,pro)); // string 多个list
        
        // java.lang.ClassCastException: java.lang.String cannot be cast to java.util.List  这里是数据类型 不对。。。
        //Optional<List<Map<String, Object>>>  o = Stream.of(properties.get("dewey")).map(el -> (List<Map<String, Object>>) el).findAny();
       /* Optional<List<Map<String, Object>>> o =
            Stream.of(properties.get("dewey")).filter(el -> el !=null).map(el -> List<Map<String, Object>> el).findAny();
        */
        System.out.println("******************************");
        Optional<Object> findAny = Stream.of(properties.get("dewey")).filter(el -> el != null).map(s -> s).findAny();
        System.err.println(findAny);
        System.out.println("----");
        
        Optional<Object> findAny3 = Stream.of(hashMap.get("key")).map(s -> s).findAny();
        System.out.println(findAny3);
        System.out.println("----------");
        Optional<List<Map<String, Object>>> o =
        Stream.of(bigHashMap.get("bigKey")).filter(el -> el != null).map(s -> (List<Map<String, Object>>) s).findAny();
        
        System.err.println(o);
        System.out.println("******************************");
        
        Optional<Map<String,Object>> findAny2 = Stream.of(properties).findAny();
        System.out.println(findAny2);
        Optional<Map<String,Object>> any = Stream.of(properties).filter( s -> s!= null).map(el -> el).findAny();
        System.out.println(any);
        // any.isPresent() ? any.get().stream().map(constructor) : Stream.empty();  
        
        Optional<List<Map<String, Object>>> optional =
        Stream.of(bigHashMap.get("bigKey")).filter(el -> el != null).map(s -> (List<Map<String, Object>>) s).findAny();
        
        if (optional.isPresent())
        {
            Stream<Map<String, Object>> stream = optional.get().stream();
            System.out.println(stream);
            System.out.println("^^^^^^^^^^^^^^");
            //<T> constructor = null;
             Optional<Map<String, Object>> findAny4 = optional.get().stream().map(e -> e).findAny();
             
            System.out.println(findAny4);
        }
    }
    
    /**
     * 并行Streams
            前面提到过Stream有串行和并行两种，串行Stream上的操作是在一个线程中依次完成，而并行Stream则是在多个线程上同时执行。
            下面的例子展示了是如何通过并行Stream来提升性能：
     */
    @Test
    public void testStreams()
    {
        // 首先我们创建一个没有重复元素的大表：
        int max = 1000000;
        List<String> values = new ArrayList<String>(max);
        for (int i = 0; i < max; i++)
        {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        
        // 串行排序 然后我们计算一下排序这个Stream要耗时多久，
        long t0 = System.nanoTime();
        //System.out.println(t0); // 2946482527584848
        Stream<String> sorted = values.stream().sorted();
        
        long count = values.stream().sorted().count();
        System.out.println(count);
        long t1 = System.nanoTime(); // 2946484318386751
        //System.out.println(t1);
        System.err.println(TimeUnit.NANOSECONDS);
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        //System.out.println(millis); // 1790
        //System.out.println(String.format("%d ms", millis)); //1790ms
        System.out.println(String.format("sequential sort took: %d ms", millis));
        
        System.out.println("---------------------");
        
        // 并行 排序
        long t2 = System.nanoTime();
        long count2 = values.parallelStream().sorted().count();
        System.out.println(count2);
        
        long t3 = System.nanoTime();
        long millis2 = TimeUnit.NANOSECONDS.toMillis(t3 - t2);
        
        System.out.println(String.format("并行排序耗时:  %d ms", millis2));
        // 并行版的快了50%之多，唯一需要做的改动就是将stream()改为parallelStream()
    }
    
    // Map类型不支持stream，不过Map提供了一些新的有用的方法来处理一些日常任务。
    @Test
    public void streamMap()
    {   
        Map<Integer, String > hashMap= new HashMap<Integer, String>();
        for (int i = 0; i < 10; i++)
        {
            hashMap.putIfAbsent(i, "var" + i);
        }
       
       // hashMap.forEach((id,var2) -> System.out.println(var2));  // var0...  key 为String 就不行了
      //  hashMap.computeIfPresent(3, (num, val) -> val + num);
        
        String string = hashMap.computeIfPresent(3, (num,val) -> val + num); // 如果我 new HashMap<Integer, Object>() value 为Object 就会报错。
        System.out.println(string);
        String var3 = hashMap.get(3);
        System.out.println(var3);  // 在遍历的时候直接把 值给改了。 var33
        
        hashMap.computeIfPresent(9, (num, val) -> null);
        boolean containsKey = hashMap.containsKey(9); //false
        System.out.println(containsKey);
        
        // computeIfAbsent
        String ifAbsent = hashMap.computeIfAbsent(23, num -> "val" + num); //Absent 不在的缺席的
        System.out.println(ifAbsent);
        System.out.println( hashMap.containsKey(23)); //true
        
        System.out.println("------------------");
        hashMap.computeIfAbsent(3, num -> "bam"); // Absen 方法 存在的值，去改 ，改不了
        System.out.println(hashMap.get(3)); // var33
        
        //接下来展示如何在Map里删除一个键值全都匹配的项：
        boolean remove = hashMap.remove(3, "var3");
        System.out.println(remove);
        System.out.println(hashMap.get(3));
        boolean remove2 = hashMap.remove(3,"var33");
        System.out.println(remove2);
        System.out.println(hashMap.get(3));
        
        String orDefault = hashMap.getOrDefault(42, "not found");
        System.out.println(orDefault);
        System.out.println(hashMap.get(42));
        
        // Merge做的事情是如果键名不存在则插入，否则则对原键对应的值做合并操作并重新插入到map中。
        hashMap.merge(8, "值88", (value,newValue) -> value.concat(newValue));
        hashMap.merge(100, "value-100", (value,newValue) ->value+ newValue);
        System.out.println(hashMap.get(8));
        System.out.println(hashMap.get(100));
    }
    
    /**
     *
     * @author Administrator
     */
    @Test
    public void test1()
    {
        
    }
}