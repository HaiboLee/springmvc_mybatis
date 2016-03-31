package com.lee.mapper;

import java.util.List;

import com.lee.pojo.User;
import com.lee.pojo.UserCustom;
import com.lee.pojo.UserQueryVo;

public interface Mapper {
	//遵循规范开发mapper接口
	public User findUserById(int id) throws Exception;
	
	//综合查询用户信息,输入使用pojo包装类型
	public List<UserCustom> findList(UserQueryVo userQUeryVo)throws Exception;
}
