package com.jdk8;

import java.util.Arrays;
import org.junit.Test;
/**
 * 2.1Lambda表达式和函数式接口
 * @author xueshaoqi
 *
 * @version  2018-06-05 17:48
 * @since
 */
public class Jdk8Test {
	/**
	 * 允许我们将一个函数当作方法的参数（传递函数），或者说把代码当作数据，这是每个函数式编程者熟悉的概念
	 */
	@Test
	public void test1() {
		
		// 最简单的Lambda表达式可以用逗号分隔的参数列表、->符号和功能语句块来表示
		Arrays.asList("a","b","c").forEach(e -> System.out.print(e));
		
		Arrays.asList("a","b","d").forEach((String e) -> System.out.print(e));
		String separator = ",";
		Arrays.asList("a","b","c").forEach((String e) -> System.out.print(e + separator) );
		final String sep = ",";
		Arrays.asList("a","b","d").forEach((String e) -> System.out.print(e + sep));
		
		// 如果lambda的语句块只有一行，不需要return关键字
		Arrays.asList("f","h","dd").sort( (e1,e2) -> 
			e1.compareTo(e2)
		);
		
		Arrays.asList("a","b","c").sort((e1,e2) ->
		{
			int result = e1.compareTo(e2);
			System.out.println(result);
			return result;
		});
	}
}
