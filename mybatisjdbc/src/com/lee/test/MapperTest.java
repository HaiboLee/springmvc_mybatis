package com.lee.test;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lee.mapper.Mapper;
import com.lee.pojo.User;
import com.lee.pojo.UserCustom;
import com.lee.pojo.UserQueryVo;

public class MapperTest {

	private static SqlSessionFactory sqlsessionFactory;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		sqlsessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));

	}

	@Test
	public void testFindUserById() throws Exception {
		SqlSession sqlSession=sqlsessionFactory.openSession();

		//使用sqlSession.getMapper()得到mapper接口的對象
		Mapper mapper=sqlSession.getMapper(Mapper.class);

		User user=mapper.findUserById(1);

		System.out.println(user.toString());

	}

	@Test
	public void testFindList() throws Exception {
		SqlSession sqlSession=sqlsessionFactory.openSession();

		//使用sqlSession.getMapper()得到mapper接口的對象
		Mapper mapper=sqlSession.getMapper(Mapper.class);
		
		UserQueryVo userQueryVo=new UserQueryVo();
		UserCustom userCustom=new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("小明");
		userQueryVo.setUsreCustom(userCustom);
		
		List<UserCustom> list=mapper.findList(userQueryVo);
		
		System.out.println(list);

	}

}
