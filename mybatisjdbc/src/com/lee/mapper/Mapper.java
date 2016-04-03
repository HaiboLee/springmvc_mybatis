package com.lee.mapper;

import java.util.List;

import com.lee.pojo.OrderQueryVo;
import com.lee.pojo.User;
import com.lee.pojo.UserCustom;
import com.lee.pojo.UserQueryVo;

public interface Mapper {
	//遵循规范开发mapper接口
	public User findUserById(int id) throws Exception;
	public void updateUser(User user) throws Exception;
	
	//综合查询用户信息,输入使用pojo包装类型
	public List<UserCustom> findList(UserQueryVo userQUeryVo)throws Exception;
	
	//综合查询的总数
	public int findUserCount(UserQueryVo userQueryVo)throws Exception;
	
	//使用resultmap接收查詢結果
	public UserCustom findUserResultMap(int id)throws Exception;
	
	//多表查询一对一
	public OrderQueryVo findUserByOrdersNumber(String number) throws Exception;
}
