package com.zl.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Oracle JDBC工具类
 * 
 * @author Rowling.Xe ，tel:18191459874
 * @vision 1.0 ，2017-9-16下午8:32:38
 *
 */
public class OracleDaoUtil {
	
	// 加载驱动
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获得连接的方法
	 * @return connection
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@10.211.95.97:1521:SITSC", "dbscript", "dbtest");
		return connection;
	}
	
	/**
	 * 释放资源的方法
	 * @param resultSet
	 * @param statement
	 * @param connection
	 */
	public static void release(ResultSet resultSet,Statement statement,Connection connection) {
		
		if(resultSet !=null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				resultSet = null;
			}
		}
		
		if(statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				statement = null;
			}
		}
		
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				connection = null;
			}
		}
	}
}
