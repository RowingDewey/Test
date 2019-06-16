package com.jdk8.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

interface MathOperation {
    int operation(int a,int b);
    
    // 这样就不行了 The target type of this expression must be a functional interface
    //int cc (int a, int b,int c);
}

interface GreeningService {
    void sayMessage(String message);
}



public class Jdk8Test1
{   
    
    private int operate(int a,int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    
    
    @Test
    public void test() 
    {
        List<String> names1 = new ArrayList<String>();
        names1.add("jack");
        names1.add("john");
        names1.add("tom");
        names1.add("dewey");
        names1.add("jojo");
        List<String> names2 = new ArrayList<String>();
        names2.add("dk");
        names2.add("zues");
        names2.add("sf");
        names2.add("ug");
        
        Jdk8Test1 test1 = new Jdk8Test1();
        test1.sortUsingjava7(names1);
        System.out.println(names1);
        
        test1.sortUsingJava8(names2);
        System.out.println(names2);
        
    }
    
    private void sortUsingjava7(List<String> names){
        Collections.sort(names,new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                return s1.compareTo(s2);
            }
        });
    }
    // 使用 java 8 排序
    private void sortUsingJava8(List<String> names)
    {
        Collections.sort(names,(s1,s2) -> s1.compareTo(s2));
    }
    
    /**
     *  Lambda 表达式，也可称为闭包，它是推动 Java 8 发布的最重要新特性。
        Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
        lambda 表达式的语法格式如下：

            (parameters) -> expression
            或
            (parameters) ->{ statements; }
     */
    @Test
    public void test2() 
    {
      Jdk8Test1 test1 = new Jdk8Test1();
      
      // 类型 声明
      MathOperation addition =  (int a,int b) -> a+ b;
      System.out.println(addition);
      // 不用 类型声明
      MathOperation subraction = (a,b) -> a-b;
      System.out.println(subraction);
      // 大括号中的返回语句
      MathOperation multiplication = (int a, int b) -> a * b;
      
      // 没有大括号及返回语句
      MathOperation division = (int a, int b) -> a/ b;
      
      System.out.println("10 + 5=" + test1.operate(10, 5, addition));
      System.out.println("10 - 5=" + test1.operate(10, 5, subraction));
      System.out.println("10 * 5=" + test1.operate(10, 5, multiplication));
      System.out.println("10 / 5=" + test1.operate(10, 5, division));
    }
    
    public void get(){
        
    }
    
    @Test
    public void test3() 
    {
        
    }
    
    
    @Test
    public void test4() 
    {
        
    }
    
    
    @Test
    public void test5() 
    {
        
    }
    
    
    @Test
    public void test6() 
    {
        
    }
    
    
    @Test
    public void test7() 
    {
        
    }
    
    
    @Test
    public void test8() 
    {
        
    }
    
    @Test
    public void test9() 
    {
        
    }
    
    @Test
    public void test11() 
    {
        
    }
    
    @Test
    public void test12() 
    {
        
    }
    
    @Test
    public void test13() 
    {
        
    }
    
    @Test
    public void test14() 
    {
        
    }
    
    @Test
    public void test15() 
    {
        
    }
    
    @Test
    public void test16() 
    {
        
    }
    
    @Test
    public void test17() 
    {
        
    }
    
    @Test
    public void test18() 
    {
        
    }
    
    @Test
    public void test19() 
    {
        
    }
    
    @Test
    public void test20() 
    {
        
    }
    
    
}
