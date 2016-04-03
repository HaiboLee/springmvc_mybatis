package com.lee.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lee.mapper.Mapper;
import com.lee.pojo.OrderQueryVo;
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
		SqlSession sqlSession1=sqlsessionFactory.openSession();
		SqlSession sqlSession2=sqlsessionFactory.openSession();
		SqlSession sqlSession3=sqlsessionFactory.openSession();

		//使用sqlSession.getMapper()得到mapper接口的對象
		Mapper mapper1=sqlSession1.getMapper(Mapper.class);
		Mapper mapper2=sqlSession2.getMapper(Mapper.class);
		Mapper mapper3=sqlSession3.getMapper(Mapper.class);

		User user1=mapper1.findUserById(1);
		System.out.println(user1.toString());
		sqlSession1.close();
		
		User user3=mapper3.findUserById(1);
//		user3.setUsername("马六");
//		mapper3.updateUser(user3);
//		sqlSession3.commit();
		sqlSession3.close();
		
		User user2=mapper2.findUserById(1);
		System.out.println(user2.toString());
		sqlSession2.close();
		
		//User user3=mapper3.findUserById(1);

		//System.out.println(user1.toString());

	}

	@Test
	public void testFindList() throws Exception {
		SqlSession sqlSession=sqlsessionFactory.openSession();

		//使用sqlSession.getMapper()得到mapper接口的對象
		Mapper mapper=sqlSession.getMapper(Mapper.class);
		
		UserQueryVo userQueryVo=new UserQueryVo();
		UserCustom userCustom=new UserCustom();
		//userCustom.setSex("1");
		List<Integer> ids=new ArrayList<Integer>();
		
		ids.add(16);
		ids.add(2);
		ids.add(1);
		//userCustom.setUsername("小明");
		userQueryVo.setUsreCustom(userCustom);
		userQueryVo.setList(ids);
		List<UserCustom> list=mapper.findList(userQueryVo);
		
		System.out.println(list);

	}
	
	@Test
	public void testFindUserCount() throws Exception {
		SqlSession sqlSession=sqlsessionFactory.openSession();

		//使用sqlSession.getMapper()得到mapper接口的對象
		Mapper mapper=sqlSession.getMapper(Mapper.class);
		
		UserQueryVo userQueryVo=new UserQueryVo();
		UserCustom userCustom=new UserCustom();
		userCustom.setSex("1");
		userCustom.setUsername("小明");
		userQueryVo.setUsreCustom(userCustom);
		
		int count=mapper.findUserCount(userQueryVo);
		
		System.out.println(count);

	}
	
	@Test
	public void testFindUserResultMap() throws Exception {
		SqlSession sqlSession=sqlsessionFactory.openSession();

		//使用sqlSession.getMapper()得到mapper接口的對象
		Mapper mapper=sqlSession.getMapper(Mapper.class);
		
		
		
		UserCustom count=mapper.findUserResultMap(1);
		
		System.out.println(count.toString());

	}
	@Test
	public void testFindUserByOrders() throws Exception {
		SqlSession sqlSession=sqlsessionFactory.openSession();

		//使用sqlSession.getMapper()得到mapper接口的對象
		Mapper mapper=sqlSession.getMapper(Mapper.class);
		
		
		
		OrderQueryVo count=mapper.findUserByOrdersNumber("1000010");
		
		//System.out.println(count.getUser().toString());

	}

}
