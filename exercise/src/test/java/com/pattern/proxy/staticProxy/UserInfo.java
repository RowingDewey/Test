package com.pattern.proxy.staticProxy;
/**
 * 抽象角色，真实对象和代理对象共同的接口
 * 
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月15日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface UserInfo
{
    public int  updateUser(int i);
    
    public int  queryUser();
}
