package com.zl.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;




/**
 * 
 * 日期工具类
 * 
 * @author wWX190899
 * @version CMR23 2014-6-12
 * @since V100R001C01LCM023
 */
public class DateUtil
{
	
	  /** 2018/6/7 11:15:21
     * 缺省的日期字符串格式
     */
    public static final String DEFAULT_FORMAT = "yyyyMMddHHmmss";
    
    public static final String HOR_SEC_FORMAT = "yyyyMMdd HH:mm:ss";
	/**
     * 
     * 格式化成系统常用日期格式：yyyyMMddHHmmss
     * 
     * @author wWX190899
     * @param date 日期
     * @return String
     */
    public static String format(Date date)
    {
        return format(date, HOR_SEC_FORMAT);
    }
    
    /**
     * 
     * 格式化日期
     * 
     * @author wWX190899
     * @param date 日期
     * @param formatStr 转换格式
     * @return String
     */
    public static String format(Date date, String formatStr)
    {
        if (date == null)
        {
            return null;
        }
        
        SimpleDateFormat sf = new SimpleDateFormat(formatStr);
        return sf.format(date);
    }
    
   public static Date getDate(Date date) {
    	SimpleDateFormat sj = new SimpleDateFormat(DEFAULT_FORMAT);
        Calendar calendar = Calendar.getInstance();
        calendar.add(calendar.DATE, -7);
        //System.out.println("前天：" + sj.format(calendar.getTime()));
       Date time = calendar.getTime();
        return time;
    }
    
   
   /**
    * 将指定的字符串按缺省格式转换为日期
    * 
    * @param strDate 日期的字符串表示
    * @return 对应指定字符串的日期
    */
   public static Date strToDate(String strDate)
   {
       return strToDate(strDate, DEFAULT_FORMAT);
   }
   
   /**
    * 将指定的字符串按指定格式转换为日期
    * 
    * @param strDate 日期的字符串表示
    * @param strFormat 指定的格式
    * @return 对应指定字符串的日期
    */
   public static Date strToDate(String strDate, String strFormat)
   {
       // 如果入参为null则直接返回null
     /*  if (StringUtils.isEmpty(strDate) || StringUtils.isEmpty(strFormat))
       {
           return null;
       }*/
       
       SimpleDateFormat df = null;
       Date date = null;
       try
       {
           // 使用指定的格式创建日期时间格式
           df = new SimpleDateFormat(strFormat);
       }
       catch (IllegalArgumentException e)
       {
           df = new SimpleDateFormat(DateUtil.DEFAULT_FORMAT);
       }
       
       try
       {
           // 解析指定的字符串
           date = df.parse(strDate);
           System.out.println(date);
       }
       catch (ParseException e)
       {
           
           // 如果解析失败则使用当前日期
           date = new Date();
       }
       
       return date;
   }
   
    
    public static Timestamp getCurrentDatetime()
    {
        return new Timestamp(System.currentTimeMillis());
    }
    
}
