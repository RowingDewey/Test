package com.jdk8;

/**
 * 语言的设计者们思考了很多如何让现有的功能和lambda表达式友好兼容。
 * 于是就有了函数接口这个概念。
 * 函数接口是一种只有一个方法的接口，
 * 像这样地，函数接口可以隐式地转换成lambda表达式。
 * @version  2018-06-04 18:48
 * @since 函数接口是非常脆弱的，只要有人在接口里添加多一个方法，那么这个接口就不是函数接口了，就会导致编译失败。
 */

@FunctionalInterface  // 显示地表明函数接口的目的 克服上面提到的脆弱性
public interface FunInterface {
	void method();
	
	default void defaultMethod() {
		
	}
}

