package com.zl.mybatis.dao;

import java.util.List;

import com.zl.mybatis.pojo.Orders;


public interface OrderMapper {
	// 通过订单查询相关用户 一对一
	public List<Orders> findOrderListResultMap() throws Exception;
	
	// 查询所有订单信息及 订单下的订单明细信息 一对多
	public List<Orders> findOrdersDetailList() throws Exception;
	
	// 需要查询所有用户信息，关联查询订单及订单明细信息，订单明细信息中关联查询商品信息
	public List<Orders> findOrderDetailToItem() throws Exception;
	
	public List<Orders> findOrdersOrderLazyLoadingUser() throws Exception;
}
