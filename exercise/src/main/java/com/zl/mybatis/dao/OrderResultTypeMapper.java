package com.zl.mybatis.dao;

import java.util.List;

import com.zl.mybatis.pojo.OrdersCustom;
/**
 * ResultType类型
 *
 * @author Rowling.Xe
 * @Version v1.0 2017年11月27日 下午5:36:32
 *
 */
public interface OrderResultTypeMapper {
	
	
	public List<OrdersCustom> findOrderListResultType() throws Exception;
}
