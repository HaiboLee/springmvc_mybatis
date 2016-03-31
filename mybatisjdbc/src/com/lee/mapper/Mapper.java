package com.lee.mapper;

import com.lee.pojo.User;

public interface Mapper {
	//遵循规范开发mapper接口
	public User findUserById(int id) throws Exception;
}
