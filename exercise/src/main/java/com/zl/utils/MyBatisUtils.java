package com.zl.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * 目的：面试使用
 * 到时候和spring整合，默认就是单例
 *
 */
public class MyBatisUtils {
	
	// 单例模式
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getnewInstance() {
		
		if (sqlSessionFactory == null) {
			synchronized(MyBatisUtils.class) {
				if (sqlSessionFactory == null) {
					String resource = "sqlMapConfig.xml";
					
					InputStream inputStream = MyBatisUtils.class.getClassLoader().getResourceAsStream(resource);
					
					sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				}
			}
		}
		
		return sqlSessionFactory;
	}
	
}
