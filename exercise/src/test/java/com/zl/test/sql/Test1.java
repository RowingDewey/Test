package com.zl.test.sql;

import org.junit.Test;
/**
 * 
 * :int max=2147483647 int min=-2147483648
 * 
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2018年9月21日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Test1
{
    
    public static void main(String[] args)
    {
        System.out.println("Integer.MIN_VALUE = " + Integer.MAX_VALUE);
        
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("-------------");
    }
    
    @Test
    public void tes2t() 
    {
        Integer FINISHED_PAY = Integer.valueOf(3);
        System.out.println(FINISHED_PAY);
    }
    
    @Test
    public void test() 
    {
        String VOUCHER_PARAMETER_IS_ERROR  = "2500020003";
        System.out.println(Integer.parseInt(VOUCHER_PARAMETER_IS_ERROR));
    }
}
