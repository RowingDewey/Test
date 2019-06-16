package com.jdk8;
/**
 * 2.6   注解的扩展
 * 
 * Java 8扩展了注解可以使用的范围，现在我们几乎可以在所有的地方：局部变量、泛型、超类和接口实现、甚至是方法的Exception声明
 * @author xueshaoqi
 *
 * @version  2018-06-05 17:57
 * @since
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;


public class Annotations {
	
	@Retention( RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE_USE,ElementType.TYPE_PARAMETER })
	public @interface NonEmpty {
	}
	
	public static class Holder< @NonEmpty T> extends @NonEmpty Object {
		public void method() throws @NonEmpty Exception {
		}
	}
	/**
	 * Java 8 新增加了两个注解的程序元素类型ElementType.TYPE_USE 和ElementType.TYPE_PARAMETER ，
	 * 这两个新类型描述了可以使用注解的新场合。注解处理API（Annotation Processing API）也做了一些细微的改动，来识别这些新添加的注解类型。
	 * @author xueshaoqi
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		final Holder<String > holder = new @NonEmpty Holder<String>();
		@NonEmpty Collection<@NonEmpty String> strings = new ArrayList<>();
		
	}
}
