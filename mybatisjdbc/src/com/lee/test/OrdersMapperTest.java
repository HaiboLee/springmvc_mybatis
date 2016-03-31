package com.lee.test;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lee.mapper.OrdersMapper;
import com.lee.pojo.OrederCustom;

/**
* @author :lihaiboloveyou@live.com
* @version ：2016年3月31日 下午10:09:34
* :
*/
public class OrdersMapperTest {
	private static SqlSessionFactory sqlSessionFactory;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
		
	}

	@Test
	public void testFindUserByOrdersNumber() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		OrdersMapper ordersMapper= sqlSession.getMapper(OrdersMapper.class);
		
		List<OrederCustom> list=ordersMapper.findUserByOrdersNumber();
		
		System.out.println(list);
		
		
	}
	
	@Test
	public void testFindUserResultMap() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		OrdersMapper ordersMapper= sqlSession.getMapper(OrdersMapper.class);
		
		List<OrederCustom> list=ordersMapper.findUserByOrdersNumber();
		
		System.out.println(list);
		
		
	}

}
