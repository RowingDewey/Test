package com.jdk8;
/**
 * 2.5   更好的类型推断
 * @author xueshaoqi
 *
 * @version  2018-06-05 17:49
 * @since
 */
public class Value<T> {
	public static<T> T defaultValue() {
		return null;
	}
	
	public T getOrDefault(T value, T defaultValue) {
		return ( value != null) ? value : defaultValue;
	}
	public static void main(String[] args) {
		Value<String> value = new Value<>();
		String s = value.getOrDefault("22", Value.defaultValue());
		System.out.println(s);
	}
	
	/**
	 * 参数Value.defaultValue()的类型被编译器推断出来，不需要显式地提供类型。在java 7,
	 *  相同的代码不会被编译，需要写成：Value.< String >defaultValue()
	 */
}
