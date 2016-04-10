package com.lee.pojo;

/**
 * @author :lihaiboloveyou@live.com
 * @version ：2016年3月31日 下午9:07:45 :
 */
public class OrderQueryVo {
	private User user;
	private Orders orders;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderQueryVo [user=" + user + ", orders=" + orders + "]";
	}

}
