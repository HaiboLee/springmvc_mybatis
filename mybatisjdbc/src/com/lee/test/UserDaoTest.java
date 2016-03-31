package com.lee.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lee.dao.UserDao;

public class UserDaoTest {
	private static SqlSessionFactory sqlsessionFactory;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		sqlsessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
		
	}

	@Test
	public void testFindUserById() throws Exception {
		UserDao userDao=new UserDao(sqlsessionFactory);
		
		userDao.findUserById(1);
	}
	
	@Test
	public void testDeleteUserById() throws Exception {
		UserDao userDao=new UserDao(sqlsessionFactory);
		
		userDao.deleteUser(2);
	}

}
