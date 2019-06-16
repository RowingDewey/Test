package com.pattern.proxy.staticProxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.xml.ws.soap.MTOM;


/**
 * 实现动态代理接口
 * @author Rowling.x
 * @version 1.0 ，2017年9月3日08:24:11
 *
 */
public class MyInvocationHandler implements InvocationHandler {
	/** 私有接口父类应用 */
	private Waiter waiter;
	
	public MyInvocationHandler(Waiter waiter) {
		this.waiter = waiter;
	}

	/**
	 * 方法的参数:
	 * proxy:产生的代理对象.
	 * method:当前正在调用的目标类的方法.
	 * params:正在执行的方法中的参数.
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] params)
			throws Throwable {
		System.out.println("InvocationHandler  invoke 执行了");
		
		if("server".equals(method.getName())) {
			System.out.println("^_^ 微笑");
			Object object = method.invoke(waiter, params);
			return object;
		} else {
			return method.invoke(waiter, params);
		}
	}

}
