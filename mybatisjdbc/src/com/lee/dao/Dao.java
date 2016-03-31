package com.lee.dao;

import com.lee.pojo.User;

public interface Dao {
	//查找用户
	public User findUserById(int id) throws Exception;
	
	//添加用户
	public void insertUser(User user) throws Exception;
	
	//删除用户
	public void deleteUser(int id) throws Exception;
}
