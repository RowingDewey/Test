package com.pattern.proxy.staticProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理：在jvm运行期间 生成的class 文件 
 *  
 * @author  xueshaoqi
 * @version  [版本号, 2019年3月15日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UserInvocationHandler implements InvocationHandler
{
    
    private UserInfo userInfo;
    
    public UserInvocationHandler(UserInfo userInfo)
    {
        this.userInfo = userInfo;
    }
    @Override
    public Object invoke(Object arg0, Method method, Object[] arg2)
        throws Throwable
    {
        // 前置
        System.out.println("前置操作--------");
        Object invoke =null;
        if ("updateUser".equals(method.getName()))
        {
            // Exception in thread "main" java.lang.IllegalArgumentException: object is not an instance of declaring class
            //  method.invoke(method, arg2);
            
             invoke = method.invoke(userInfo, arg2);
             System.out.println("updateUser 操作  +1 ");
             String s= invoke.toString();
             int i = Integer.parseInt(s) + 1;
             invoke = i;
             System.out.println(invoke);
        }else if("queryUser".equals(method.getName()))
        {
            // o = invoke(method, arg2); 错误
            invoke =  method.invoke(userInfo, arg2);
        }
        // 后置
        System.out.println("后置操作`````````````");
       
        return invoke;
    }
    
}
