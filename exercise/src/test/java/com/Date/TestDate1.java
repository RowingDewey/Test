package com.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestDate1
{
    @Test
    public void test() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
        Date updateTime = format.parse("2018-09-19"); 
        
        Date now = new Date();
        boolean isToday = compareTime(updateTime, now, "yyyyMMdd");
        boolean isThisMonth =
            compareTime(updateTime, now, "yyyyMM");
        System.out.println("isToday; " + isToday);
        System.out.println("isThisMonth:  " + isThisMonth);
    }
    
    
    
 // 根据传入的pattern格式比较时间
    private boolean compareTime(Date updateTime, Date now, String pattern)
    {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String format = sdf.format(updateTime);
        System.out.println(format);
        return (sdf.format(updateTime).equals(sdf.format(now)));
    }
}
