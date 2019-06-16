package com.pattern.proxy.staticProxy;

/**
 * 服务员的实现类
 * @author Rowling.x
 * @version 1.0 ，2017年9月3日08:24:11
 *
 */
public class Waitress implements Waiter {

	@Override
	public void server() {
		System.out.println("服务");
	}

	@Override
	public String sayHello(String name) {
		
		return "Hello---" + name;
	}

}
