package com.jdk8;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 2.4   重复注释
 * @author xueshaoqi
 *
 * @version  2018-06-05 17:47
 * @since
 */
public class RepeationAnnotations {
	
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Filters {
		Filter[] value();
	}
	
	@Target(ElementType.TYPE)
	@Retention(RetentionPolicy.RUNTIME)
	@Repeatable(Filters.class)
	public @interface Filter {
		String value();
	}
	
	@Filter("filter1")
	@Filter("filter2")
	public interface Filterable {
	}
	/**
	 * 我们可以看到，注释Filter被@Repeatable( Filters.class )注释。
	 * Filters 只是一个容器，它持有Filter, 编译器尽力向程序员隐藏它的存在。
	 * 通过这样的方式，Filterable接口可以被Filter注释两次。

		另外，反射的API提供一个新方法getAnnotationsByType() 来返回重复注释的类
		（请注意Filterable.class.getAnnotation( Filters.class )将会返回编译器注入的Filters实例）。
	 */
	public static void main(String[] args) {
		for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
			System.out.println(filter.value());
		}
	}
}
