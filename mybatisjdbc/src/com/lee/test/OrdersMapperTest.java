package com.lee.test;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lee.mapper.OrdersMapper;
import com.lee.pojo.OrderQueryVo;
import com.lee.pojo.Orders;
import com.lee.pojo.OrederCustom;
import com.lee.pojo.User;

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
		sqlSession.close();
		
		
	}
	
	@Test
	public void testFindUserResultMap() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		OrdersMapper ordersMapper= sqlSession.getMapper(OrdersMapper.class);
		
		List<OrderQueryVo> list=ordersMapper.findUserResultMap();
		
		System.out.println(list);
		sqlSession.close();
		
		
	}
	@Test
	public void testqueryOrderDetailByOrders() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		OrdersMapper ordersMapper= sqlSession.getMapper(OrdersMapper.class);
		
		List<Orders> list=ordersMapper.queryOrderDetailByOrders();
		
		System.out.println(list.size());
		sqlSession.close();
		
		
	}
	@Test
	public void testqueryUserAndItems() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		OrdersMapper ordersMapper= sqlSession.getMapper(OrdersMapper.class);
		
		List<User> list=ordersMapper.queryUserAndItems();
		
		System.out.println(list);
		sqlSession.close();
		
		
	}
	
	@Test
	public void testqueryOrdersLazyLoading() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		OrdersMapper ordersMapper= sqlSession.getMapper(OrdersMapper.class);
		
		List<Orders> list=ordersMapper.queryOrdersLazeLoading();
		
		for (Orders orders : list) {
			System.out.println(orders.getUser());
		}
		sqlSession.close();
		
		
	}
	
	@Test
	public void testqueryUserLazyLoading() throws Exception {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		OrdersMapper ordersMapper= sqlSession.getMapper(OrdersMapper.class);
		
		List<User> list=ordersMapper.queryUserLazyLoading();
		
		for (User user : list) {
			System.out.println(user.getOrderlist());
		}
		sqlSession.close();
		
		
	}

}
