package com.jdk8;

import java.util.HashMap;
import java.util.function.Supplier;
/**
 * 默认方法使已经存在的接口可以修改而不会影响编译的过程。
 * java.util.Collection中添加的额外方法就是最好的例子
 * stream(), parallelStream(), forEach(), removeIf()
 * 虽然默认方法很强大，但是使用之前一定要仔细考虑是不是真的需要使用默认方法，因为在层级很复杂的情况下很容易引起模糊不清甚至变异错误
 */
/** Java 8 的另外一个有意思的新特性是接口里可以声明静态方法，并且可以实现 */
public interface DefaulableFactory2 {
	
	// Interfaces now allow static methods
	static Defaulable create( Supplier<Defaulable> supplier) {
		return supplier.get();
	}
	
	
	public static void main(String[] args) {
		//  Supplier<Defaulable> supplier 放入的是 supplier的实现类
		Defaulable defaulable = DefaulableFactory2.create(DefaultableImpl :: new);
		System.out.println(defaulable.notRequired());
		
		defaulable = DefaulableFactory2.create(OverridableImpl :: new );
		System.err.println(defaulable.notRequired());
		
		new HashMap<>();
	}
}
