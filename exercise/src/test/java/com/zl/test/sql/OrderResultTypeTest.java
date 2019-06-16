package com.zl.test.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Before;
import org.junit.Test;

import com.zl.mybatis.dao.OrderMapper;
import com.zl.mybatis.dao.OrderResultTypeMapper;
import com.zl.mybatis.entity.SaleUserRecord;
import com.zl.mybatis.pojo.Orders;
import com.zl.mybatis.pojo.OrdersCustom;
import com.zl.utils.MyBatisUtils;
import com.zl.utils.OracleDaoUtil;

public class OrderResultTypeTest {
	
private SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void before() {
		sqlSessionFactory = MyBatisUtils.getnewInstance();
	}
	
	
	
	@Test
	public void findOrderListResultType() throws Exception {
		
		// 获取session
		SqlSession session = sqlSessionFactory.openSession();
		
		session.close();
	}
	

}
