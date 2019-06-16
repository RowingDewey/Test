package com.zl.zl;

import java.util.ArrayList;

import org.junit.Test;
public class Demo1 {
	
	public void heapException() {
		for(;;) {
			ArrayList<Object> list = new ArrayList<>(2000);
		}
	}
	
	int count = 1;
	public void stackException() {
		count++;
		this.stackException();
	}

	@Test
	public void test22()
	{
		String serviceName = "POST".substring("POST".lastIndexOf("/") + 1);
		System.out.println(serviceName);
	}
	private static final String WECHAT_PAY = "225_6";
	@Test
	public void test33()
	{
	boolean b =	equals("225_6", WECHAT_PAY);
		System.out.println(b);
	}
	public static boolean equals(String str1, String str2) {
		return str1 == null ? str2 == null : str1.equals(str2);
	}
	public static void main(String[] args) {
		/*Demo1 demo1 = new Demo1();
		demo1.heapException();
		demo1.stackException();*/
		String lineTxt ="15267104048;;05;20180323035200;20180323035200;01;698041;10005705;;0238BIP5A13520180323035207130080;;571BIP5A13520180323035207060859;;0000;;999";
		String lin2 = lineTxt.replaceAll(";", "|");
		String lin3 = "15267104048||05|20180323035200|20180323035200|01|698041|10005705||0238BIP5A13520180323035207130080||571BIP5A13520180323035207060859||0000|| ";
		int last = lineTxt.lastIndexOf(";");
		System.out.println(last);
		String ll = lineTxt.replace(";", ";|");
		System.out.println();
		int lastIndexOf = lin3.lastIndexOf("|");
		
		System.out.println(lastIndexOf);
		String[] split = lin3.split("\\|");
		String phonenumber = split[0].trim();
		
		System.out.println(phonenumber);
		System.err.println(split.length);
		String[] tempParam = lineTxt.split(";");
		System.out.println(tempParam.length);
	}
	
	
	@Test
	public void test() {
		String lineTxt ="15267104048;;05;20180323035200;20180323035200;01;698041;10005705;;0238BIP5A13520180323035207130080;;571BIP5A13520180323035207060859;;0000;;;";
		//int last = lineTxt.lastIndexOf(";");
		//System.out.println(last);
		String ll= lineTxt+ "|";
		System.out.println();
		//String lin2 = lineTxt.replace(";", "|");
		System.out.println(ll);
		String[] split = ll.split(";");
		System.out.println(split[15]);
		System.err.println(split.length);
	}
	
	/**
	 * 问：简单说说 StackOverflowError 与 OutOfMemeryError 的区别？

答：区别如下。


StackOverflowError：当启动一个新的线程时虚拟机会为其分配一个栈空间，java 栈以帧为单位保存线程运行状态，当线程调用一个方法时 JVM 会压入一个新的栈帧到这个线程的栈空间中，
只要这个方法还没返回则这个栈帧就会一直存在。所以如果方法的嵌套调用层次太多（如递归调用），随着栈帧的增加导致总和大于 JVM 设置的 -Xss 值就会抛出 StackOverflowError 异常。

OutOfMemoryError：OOM 异常会分几种情况出现。

堆内存溢出：当需要为对象实例化分配堆内存空间时，而堆的占用已经达到了设置的最大值（通过 -Xmx）就会抛出 OutOfMemoryError 异常。

方法区内存溢出：方法区存放 java 类信息（如类名、访问修饰符、常量池、字段描述、方法描述等），在类加载器加载 class 文件到内存时 JVM 会提取类的这些信息放到方法区，而此时如果需要存储这些类信息且方法区的内存占用又已经达到最大值（通过 -XX:MaxPermSize）则会抛出 OutOfMemoryError 异常。
	 */
	
	
}
