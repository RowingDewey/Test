package com.zl.mybatis.pojo;
/**
 * 定义包装对象将查询条件(pojo)以类组合的方式包装起来。
 */
public class QueryVo {
	
	private User user;
	
	// 自定义用户扩展类
	private UserCustom  userCustom;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
	
	
}
