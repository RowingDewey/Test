package com.zl.mybatis.pojo;
/**
 * 订单自定义po，包括订单信息、用户信息
 * OrdersCustom类继承Orders类后OrdersCustom类包括了Orders类的所有字段，只需要定义用户的信息字段即可。
 */
public class OrdersCustom extends Orders {

	private String username;// 用户名称
	private String address;// 用户地址
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	

}
