package com.lee.pojo;

import java.util.List;

/**
 * @author :lihaiboloveyou@live.com
 * @version ：2016年3月31日 上午10:42:04
 * :包裝類型pojo
 */
public class UserQueryVo {
	private UserCustom usreCustom;
	private List<Integer> ids;

	public UserCustom getUsreCustom() {
		return usreCustom;
	}

	public void setUsreCustom(UserCustom usreCustom) {
		this.usreCustom = usreCustom;
	}

	public List<Integer> getList() {
		return ids;
	}

	public void setList(List<Integer> ids) {
		this.ids = ids;
	}
	

}
