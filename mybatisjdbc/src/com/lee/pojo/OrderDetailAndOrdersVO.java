package com.lee.pojo;

import java.util.List;

/**
 * @author :lihaiboloveyou@live.com
 * @version ：2016年4月2日 下午1:42:39 :
 */
public class OrderDetailAndOrdersVO {
	private Orders orders;
	private List<OrderDetail> orderDetails;

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}
