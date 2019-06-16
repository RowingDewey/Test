package com.zl.test.patter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

import org.junit.Test;

public class PatternTest
{
    
    
    @Test
    public void test1()
    {
        String content = "I am noob " +
            "from runoob.com.";
     
          String pattern = ".*am.*";
     
          boolean isMatch = Pattern.matches(pattern, content);
          System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
    }
    
    @Test
    public void test2()
    {
        int i = incrementAndGet(new AtomicInteger(1),new AtomicInteger(10000));
        System.out.println(i);
    }
    
    
    public final int incrementAndGet(AtomicInteger tc,AtomicInteger gc) {
        int current;
        int next;
        do {
            current = tc.get();
            if(current >= (Integer.MAX_VALUE-1)){
                next = 1;
                gc.set(0);
            }else{
                next = current + 1;
            }
        } while(!tc.compareAndSet(current, next));

        return next;
    }
    
    
}
