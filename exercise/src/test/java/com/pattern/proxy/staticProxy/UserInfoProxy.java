package com.pattern.proxy.staticProxy;
/**
 * 静态代理
     静态代理也就是在程序运行前就已经存在代理类的字节码文件，代理类和委托类的关系在运行前就确定了。
 * 
 */
public class UserInfoProxy implements UserInfo
{
    
    private UserInfo userImpl;
    
    public UserInfoProxy(UserInfo userInfo) {
        this.userImpl = userInfo;
    }
    
   

    @Override
    public int updateUser(int i)
    {
        int queryUser = 0;
        // 代理 增强 
        System.out.println("静态代理前置操作  updateUser。。。");
        if (null != userImpl)
        {
            queryUser = userImpl.queryUser();
            queryUser+= 1;
        }
        System.out.println("静态代理后置操作 updateUser 。。。");
        return queryUser;
    }

    @Override
    public int queryUser()
    {
        int queryUser = 0;
        System.out.println("静态代理前置操作  queryUser。。。");
        if (null != userImpl)
        {
            queryUser = userImpl.queryUser();
            queryUser += 2;
        }
        System.out.println("静态代理前置操作  queryUser。。。");
        return queryUser;
    }
    
}
