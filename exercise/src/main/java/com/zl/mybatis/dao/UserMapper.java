package com.zl.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zl.mybatis.pojo.QueryVo;
import com.zl.mybatis.pojo.User;


public interface UserMapper {
	
	//根据用户id查询用户信息
	public User getUserById(int id) throws Exception;
	
	// //根据用户名称模糊查询
	public List<User> findByUserName(String username) throws Exception;
	
	//添加用户
	public void insertUser(User user) throws Exception;
	
	// 需要让mybatis底层帮你把2个参数封装到Map
	public User login(@Param("a") String username, @Param("b") String address);
	//public List<User> login(@Param("a") String username, @Param("b") String address);
	
	public void updateUser(User user) throws Exception;
	
	public List<User> findUserByUser(User user);/// 有问题
	
	// 4.1.4传递pojo包装对象
	public List<User> findUserList(QueryVo queryVo);
}
