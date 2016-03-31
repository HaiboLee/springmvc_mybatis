package com.lee.first;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.lee.pojo.User;

public class MybatisFirst {
	//更具用戶id查詢用戶信息
	@Test
	public void findById() throws IOException{
		//加载配置文件
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);

		//获取会话工程
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

		//获取会话SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();

		//查询数据
		User user=sqlSession.selectOne("test.findUserById", 10);

		System.out.println(user.toString());
		sqlSession.close();
	}

	@Test
	public void findByName() throws IOException{
		//加载配置文件
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);

		//获取会话工程
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

		//获取会话SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();

		List<User> list=sqlSession.selectList("test.findUserByUsername", "%王%");
		System.out.println(list);
		sqlSession.close();


	}

	//添加用户
	@Test
	public void insertUser() throws IOException{
		//加载配置文件
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);

		//获取会话工程
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

		//获取会话SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		User user=new User();
		user.setUsername("赵小亮");
		user.setBirthday(new Date());

		sqlSession.insert("test.insertUser", user);
		//提交事务
		sqlSession.commit();
		System.out.println(user.getId());
		sqlSession.close();


	}
	@Test
	public void deleteUser() throws IOException{
		//加载配置文件
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);

		//获取会话工程
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

		//获取会话SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.delete("test.deleteUser", 27);
		//提交事务
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void updateUser() throws IOException{
		//加载配置文件
		String resource="SqlMapConfig.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);

		//获取会话工程
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

		//获取会话SqlSession
		SqlSession sqlSession=sqlSessionFactory.openSession();
		User user=new User();
		user.setId(2);
		user.setUsername("李四");
		user.setAddress("日照");
		user.setBirthday(new Date());
		user.setSex(1);
		
		sqlSession.update("test.updateUser", user);
		//提交事务
		sqlSession.commit();
		sqlSession.close();
	}
}
