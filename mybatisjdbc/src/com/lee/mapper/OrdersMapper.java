package com.lee.mapper;

import java.util.List;

import com.lee.pojo.OrderQueryVo;
import com.lee.pojo.Orders;
import com.lee.pojo.OrederCustom;
import com.lee.pojo.User;

/**
 * @author :lihaiboloveyou@live.com
 * @version ：2016年3月31日 下午10:05:00
 * :
 */
public interface OrdersMapper {
	public List<OrederCustom> findUserByOrdersNumber() throws Exception;
	public List<OrderQueryVo> findUserResultMap() throws Exception;
	public List<Orders> queryOrderDetailByOrders() throws Exception;
	public List<User> queryUserAndItems()throws Exception;
	
	//使用延时加载查询,当使用getUsre的时候才会去查询User
	public List<Orders> queryOrdersLazeLoading() throws Exception;
	
	public List<User> queryUserLazyLoading() throws Exception;

}
