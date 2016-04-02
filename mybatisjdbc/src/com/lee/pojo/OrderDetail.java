package com.lee.pojo;
/**
* @author :lihaiboloveyou@live.com
* @version ：2016年4月2日 下午1:32:04
* :
*/
public class OrderDetail {
	private int id;
	private int orders_id;
	private int items_id;
	private int items_num;
	private Items ite;

	public Items getIte() {
		return ite;
	}
	public void setIte(Items ite) {
		this.ite = ite;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(int orders_id) {
		this.orders_id = orders_id;
	}
	public int getItems_id() {
		return items_id;
	}
	public void setItems_id(int items_id) {
		this.items_id = items_id;
	}
	public int getItems_num() {
		return items_num;
	}
	public void setItems_num(int items_num) {
		this.items_num = items_num;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orders_id=" + orders_id + ", items_id=" + items_id + ", items_num="
				+ items_num + "]";
	}
	
}
