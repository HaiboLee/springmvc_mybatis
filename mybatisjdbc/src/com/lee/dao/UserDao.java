package com.lee.dao;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.lee.pojo.User;

public class UserDao implements Dao {
	private SqlSessionFactory sqlSessionFactory;

	public UserDao(SqlSessionFactory sqlSessionFactory) {
		// TODO Auto-generated constructor stub
		this.sqlSessionFactory=sqlSessionFactory;

	}

	@Override
	public User findUserById(int id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession=sqlSessionFactory.openSession();
		User user=sqlSession.selectOne("test.findUserById",id);
		System.out.println(user.toString());
		sqlSession.close();
		return user;
	}

	@Override
	public void insertUser(User user) throws Exception {
		// TODO Auto-generated method stub
		//获取会话SqlSession
				SqlSession sqlSession=sqlSessionFactory.openSession();
				sqlSession.insert("test.insertUser", user);
				//提交事务
				sqlSession.commit();
				System.out.println(user.getId());
				sqlSession.close();


	}

	@Override
	public void deleteUser(int id) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.delete("test.deleteUser", id);
		
		sqlSession.commit();
		
		sqlSession.close();

	}

}
