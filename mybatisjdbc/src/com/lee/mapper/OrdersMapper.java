package com.lee.mapper;

import java.util.List;

import com.lee.pojo.OrederCustom;

/**
* @author :lihaiboloveyou@live.com
* @version ：2016年3月31日 下午10:05:00
* :
*/
public interface OrdersMapper {
	public List<OrederCustom> findUserByOrdersNumber() throws Exception;
	public List<OrederCustom> findUserResultMap() throws Exception;
	
}
