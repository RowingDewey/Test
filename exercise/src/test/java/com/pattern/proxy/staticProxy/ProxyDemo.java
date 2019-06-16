package com.pattern.proxy.staticProxy;


import java.lang.reflect.Proxy;
public class ProxyDemo {

	
	public static void main(String[] args) {
		
		Waiter waiter = new Waitress();
		// 使用动态代理  proxy.newInstance
		/**
		 * ClassLoader :类加载器.
		 * Class[]     :被增强的对象实现的所有接口
		 * InvocationHandler	:处理类.
		 */
		// 获得类加载器 
		ClassLoader	classLoader = waiter.getClass().getClassLoader();
		// 被增强的对象实现所有的接口
		Class[] interfaces = waiter.getClass().getInterfaces();
		// 处理类 也可使用匿名内部类实现InvocationHandleWWr
		Waiter __waiter = (Waiter) Proxy.newProxyInstance(classLoader, interfaces, new MyInvocationHandler(waiter));
		//__waiter.Server();
		String sayHello = __waiter.sayHello("DeWey");
		__waiter.server();
		System.out.println(sayHello);
	}
}
