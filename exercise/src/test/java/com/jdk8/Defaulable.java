package com.jdk8;

import java.util.function.Supplier;

/**
 * 2.2 接口的默认方法和静态方法
 * Java 8增加了两个新的概念在接口声明的时候：默认和静态方法
 */
public interface Defaulable {
	  // Interfaces now allow default methods, the implementer may or
	  // may not implement (override) them.
	default String notRequired() {
		return "default implementation";
	}
}

class DefaultableImpl implements Defaulable {
	
}

class OverridableImpl implements Defaulable {
	@Override
	public String notRequired() {
		return "Override implementation";
	}
}




