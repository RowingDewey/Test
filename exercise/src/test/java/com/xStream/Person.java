package com.xStream;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Test
	public void test1() 
	{
	    Person person = new Person("jack", 18);
	    System.out.println(person);
	    XStream xstream = new XStream();
        String xml = xstream.toXML(person);
        System.out.println(xml);
	}
	
	
	public static void main(String[] args) {
		Person bean=new Person("张三",19);
		XStream xstream = new XStream();
			//XML序列化
		String xml = xstream.toXML(bean);
		System.out.println(xml);
		// xml 反序列化
		Person p2= (Person) xstream.fromXML(xml);
		System.out.println(p2);
		System.out.println("-------------1--------------");
		//  json 序列化
		xstream = new XStream(new JettisonMappedXmlDriver());
		String json = xstream.toXML(bean);
		System.out.println(json);
		// json反序列化
		bean = (Person) xstream.fromXML(json);
		System.out.println(bean);
		System.out.println("----------2-------- Xstream序列化XML时可以允许用户使用不同的XML解析器，用户可以使用一个标准的JAXP DOM解析器或自Java6集成StAX解析器。这样用户就不需要依赖xpp3-[version].jar。-------");
		
		XStream xm2 = new XStream(new StaxDriver());// 不需要xpp3库
		xm2.alias("人", Person.class); //为类名节点重命名
		Person person = new Person("Anna", 19);
		String x2 = xm2.toXML(person);
		//XML序列化
		System.out.println(x2 + "***");
		// xml 反序列化
		System.out.println( xm2.fromXML(x2));
		
		System.out.println("----------3---Xstream序列化Json------------");
		
		Person p3 = new Person("dv", 23);
		XStream xm3 = new XStream(new JettisonMappedXmlDriver());//设置Json解析器
		xm3.setMode(XStream.NO_REFERENCES);//设置reference模型,不引用
		xm3.alias("hero", Person.class);//为类名节点重命名
		
		String xml3 = xm3.toXML(p3);
		System.out.println(xml3);
		Person pb3 = (Person) xm3.fromXML(xml3);
		System.out.println(pb3);
		System.out.println("-------------------4-----------------");
		
		
	}
	// 为啥 test不行
	@Test
	public void test() {
//		Person person = new Person("Rowling", 23);
//		XStream xStream = new XStream();
//		//XML序列化
//		String xml = xStream.toXML(person);
//		System.out.println(xml);
		
		Person bean=new Person("张三",19);
		//XStream xstream = new XStream();//需要XPP3库
		//XStream xstream = new XStream(new DomDriver());//不需要XPP3库
		XStream xstream = new XStream(new StaxDriver());//不需要XPP3库开始使用Java6 
		xstream.alias("人",Person.class);//为类名节点重命名
		//XML序列化
		String xml = xstream.toXML(bean);
		System.out.println(xml);
		//XML反序列化
		bean=(Person)xstream.fromXML(xml);
		System.out.println(bean);
	}
}
