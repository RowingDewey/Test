package com.xStream;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


import org.junit.Test;

import com.mugu.utils.XstreamUtils;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
/**
 * XStream xstream=new XStream(new DomDriver()); //注意：不是new Xstream(); 
 * 													//否则报错：java.lang.NoClassDefFoundError: org/xmlpull/v1/XmlPullParserFactory  
        xstream.processAnnotations(PersonBean.class); //如果是用注解的方式，这句不能少  
        PersonBean person=(PersonBean)xstream.fromXML(xmlStr);  
        System.out.println("person=firstname=="+person.getFirstName());  
 * @author xueshaoqi
 *
 * @version  2018-06-04 14:50
 * @since
 */
public class TestKnow1 {
	public static void main(String[] args) {
		String s = "a";
		System.out.println(UpperCase(s));
	}
	
	public static String UpperCase(String name){
		// java首字母大写的修改方式（利用ascii编码前移的方式） ascii编码中字母大小写之间相差32个单位，大写在前小写在后
		//将string类型转化成char类型
		char []  cs = name.toCharArray();
		
				//通过ASCII表格将首字母减32个位
		cs[0]  -= 32;
		
				//输出
		return String.valueOf(cs);
	}
	@Test
	public void test() {
		Staff s1 = new Staff("wuyun", 20);
		XStream xStream = new XStream(new DomDriver());
		xStream.alias("s1", Staff.class);
		
		System.out.println(xStream.toString());
		 String Xml = "<xml>\r\n" + 
			 		"<name>dk</name>\r\n" + 
			 		"<age>11</age>\r\n" + 
			 		"</xml>";
		 Staff fromXML = (Staff)xStream.fromXML(Xml);
		System.out.println(fromXML);
	}
	
	
	@Test
	public void test1() {
		 //java bean 转 xml
        Dept d = new Dept();
        List<Staff> staffs = new ArrayList<>();
        Staff s1 = new Staff("wuyun", 20);
        Staff s2 = new Staff("lilei", 22);
        staffs.add(s1);
        staffs.add(s2);
        d.setDeptName("开放平台");
        d.setStaffs(staffs);
        
        System.out.println(XstreamUtils.objectToXml(d));
	}
	private XStream requestXStream;
	
	@Test
	public void test3() {
	    
	}
//	
//	 public Object getRequest(HttpServletRequest request, Class<?> clazz) throws IOException
//	    {
//	        requestXStream = XStreamUtil.baseParseXStream(clazz.getName());
//	        setRequestAlias(clazz);
////	        requestXStream.alias("Request", clazz);
//	        Reader reader = request.getReader();
//	        return requestXStream.fromXML(reader);
//	    }
}

