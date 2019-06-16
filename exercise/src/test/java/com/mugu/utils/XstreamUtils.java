package com.mugu.utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import com.thoughtworks.xstream.io.xml.XppDriver;

public class XstreamUtils {
	 /**
     * 将bean转换为xml
     * @param obj 转换的bean
     * @return bean转换为xml
     */
    public static String objectToXml(Object obj) {
      //  XStream xStream = new XStream();
 XStream xStream = new XStream(new XppDriver(new XmlFriendlyNameCoder("_-", "_")));//解决下划线问题
        //xstream使用注解转换
       xStream.processAnnotations(obj.getClass());
        return xStream.toXML(obj);
    }
 
    /**
     * 将xml转换为bean
     * @param <T> 泛型
     * @param xml 要转换为bean的xml
     * @param cls bean对应的Class
     * @return xml转换为bean
     */
    public static <T> T xmlToObject(String xml, Class<T> cls){
        XStream xstream = new XStream(new DomDriver());
        //xstream使用注解转换
        xstream.processAnnotations(cls);
        return (T) xstream.fromXML(xml);
    }
}
