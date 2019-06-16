package com.java.se;

public class Base {
	  
	public Base() {    
		test();
	}

	public void test() {
	    System.out.println("1111");
	}
}
class child extends Base{
	
	private int a = 123;
	
	public void test() {
		System.out.println(a);
	}
}

