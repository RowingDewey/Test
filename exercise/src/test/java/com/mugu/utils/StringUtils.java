package com.mugu.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 字符工具处理类
 *
 * @author wangzhuohui
 * @version 119 2016-10-13
 * @since SDP V300R003C10
 */
public class StringUtils
{	
	 public static boolean isBlank(CharSequence cs)
	    {
	        int strLen;
	        if (cs == null || (strLen = cs.length()) == 0)
	            return true;
	        for (int i = 0; i < strLen; i++)
	            if (!Character.isWhitespace(cs.charAt(i)))
	                return false;
	        
	        return true;
	    }
	
    
    /**
     * 判断字符串去空格后是否为空，如果为空返回true
     * 
     * @param str
     * @return
     */
    public static boolean isEmpty(String str)
    {
        return (null != str && str.length() > 0 && str.trim().length() > 0) ? false : true;
    }
    
    /**
     * 判断字符串去空格后是否为空，如果不为空返回true
     * 
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str)
    {
        return isEmpty(str) ? false : true;
    }
    
    /**
     * 允许null对象的trim方法
     * 
     * @param str
     * @return [参数说明]
     */
    public static String trim(String str)
    {
        return str == null ? null : str.trim();
    }
    
    /**
     * 判断两个字符串是否相等
     * 
     * @author wangzhuohui
     * @param str 字符串1
     * @param other 字符串2
     * @return true：相等
     */
    public static boolean isEq(String str, String other)
    {
        if (str == null)
        {
            return other == null;
        }
        return str.equals(other);
    }
    
    /**
     * 
     * 判断两个字符串是否不相等
     *
     * @author wangzhuohui
     * @param str
     * @param other
     * @return
     */
    public static boolean isNotEq(String str, String other)
    {
        return !isEq(str, other);
    }
    
    /**
     * 字符串转化整形
     * 
     * @param val
     * @param def 默认值
     * @return [参数说明]
     * 
     * @return int [返回类型说明]
     * @exception throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static int toIntValue(String val, int def)
    {
        val = StringUtils.trim(val);
        if (StringUtils.isEmpty(val))
        {
            return def;
        }
        int value;
        try
        {
            value = Integer.parseInt(val);
        }
        catch (Exception e)
        {
            value = def;
        }
        return value;
    }
    
    /**
     * 
     * 字符串去掉换行、回车、空格
     * 
     * @author wangzhuohui
     * @param str
     * @return
     */
    public static String replaceBlank(String str)
    {
        String dest = "";
        
        return dest;
    }
    
    /**
     * 
     * 按指定格式将字符串拆分，并放到列表中
     * 
     * @param source 待分割的字符串
     * @param seperator 分隔符
     * @return 分割好的字符串列表
     */
    public static List<String> parseStrToList(String source, String seperator)
    {
        // 参数检查
        if (source == null || seperator == null)
        {
            return null;
        }
        // 执行分拆
        String[] temp = source.split("\\" + seperator);
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < temp.length; i++)
        {
            list.add(temp[i]);
        }
        return list;
    }
    
    /**
     * 日期转字符串
     * 
     * @param date
     * @param pattern
     * @return
     */
    public static String dateToString(Date date, String pattern)
    {
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        return sf.format(date);
    }
    
    /**
     * 获取昨天日期
     * 
     * @param pattern
     * @return
     */
    public static String getYesterday(String pattern)
    {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return new SimpleDateFormat(pattern).format(cal.getTime());
    }
    
    /**
     * 获取第二天日期
     * 
     * @param date
     * @param pattern
     * @return
     */
    public static String getNextDay(Date date, String pattern)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return new SimpleDateFormat(pattern).format(cal.getTime());
    }
    
    /**
     * 字符串转日期
     * 
     * @param date
     * @param pattern
     * @return
     * @throws Exception
     */
    public static Date stringToDate(String date, String pattern)
        throws Exception
    {
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        return sf.parse(date);
    }
    
    /**
     * 
     * TODO 添加方法注释
     * 
     * @author admini
     * @param str
     * @param defaultStr
     * @return
     */
    public static String setDefaultStr(String str, String defaultStr)
    {
        return isEmpty(str) ? defaultStr : str;
    }
    
    /**
     * 获取后i毫秒日期
     * 
     * @param date
     * @param pattern
     * @param i
     * @return
     */
    public static String getNextMilliSecond(Date date, String pattern, int i)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MILLISECOND, i);
        return new SimpleDateFormat(pattern).format(cal.getTime());
    }

    /**
     * 判断指定的对象是否为空
     * 
     * @param obj
     * @return [参数说明]
     * 
     * @return boolean [返回类型说明]
     * @exception throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static boolean isEmpty(Object obj)
    {
        if (null == obj)
        {
            return true;
        }
        return false;
    }

    /**
     * 判断指定的对象是否为空
     * 
     * @param obj
     * @return [参数说明]
     * 
     * @return boolean [返回类型说明]
     * @exception throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static boolean isNotEmpty(Object obj)
    {
        return !isEmpty(obj);
    }
    /**
     * 将日期型转换成字符串
     * 
     * @author mWX177641
     * @param time 时间
     * @param pattern 时间格式
     * @return 日期字符串
     */
    public static String date2TimeStr(Date time, String pattern)
    {
        if (null == pattern)
        {
            throw new IllegalArgumentException("pattern parameter can not be null");
        }
        if (null == time)
        {
            throw new IllegalArgumentException("time parameter can not be null");
        }
        SimpleDateFormat sdf = new SimpleDateFormat(pattern, new Locale("EN"));
        return sdf.format(time);
    }
    
    /**
     * 
     * 获取uuid 32位  除去"-"
     *
     * @author wangzhuohui
     * @return
     */
    public static String getStrUtilUUID()
    {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        
        return uuid;
    }
    
    /**
     * 
     * 数组中是否有指定的字符串(不包含空串)
     *
     * @author lwp
     * @return
     */
    public static boolean accordWith(String[] stringattr, String url)
    {
        if (isEmpty(stringattr) || isEmpty(url))
        {
            return false;
        }
        for (String str : stringattr)
        {
            if (isEmpty(str))
            {
                continue;
            }
            if (url.contains(str))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 
     * 集合中是否有指定的字符串(不包含空串)
     *
     * @author lwp
     * @return
     */
    public static boolean accordWithList(List<String> list, String url)
    {
        if (isEmpty(list) || isEmpty(url))
        {
            return false;
        }
        for (String str : list)
        {
            if (isEmpty(str))
            {
                continue;
            }
            if (url.contains(str))
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * 把分转换成元
     * 
     * @param fen int
     * @return String
     */
    public static String changeFentoYuan(int fen)
    {
        String sFen = Math.abs(fen) + "";
        int len = sFen.length();

        String yuan;
        if (len == 1)
        {
            yuan = "0.0" + sFen;
        }
        else if (len == 2)
        {
            yuan = "0." + sFen;
        }
        else
        {
            yuan = sFen.substring(0, len - 2) + '.' + sFen.substring(len - 2);
        }

        return (fen < 0) ? ('-' + yuan) : yuan;
    }
    
}
