package com.lee.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable{
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	private int id;
	private String username;
	private Date birthday;
	private String sex;
	private String address;
	private List<Orders> orderlist;
	public int getId() {
		return id;
	}

	public List<Orders> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Orders> orderlist) {
		this.orderlist = orderlist;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", sex=" + sex + ", address="
				+ address + "]";
	}


}
