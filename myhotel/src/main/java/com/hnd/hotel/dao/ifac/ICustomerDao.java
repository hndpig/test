package com.hnd.hotel.dao.ifac;

import com.hnd.hotel.entity.Customer;

public interface ICustomerDao {
//	接口中的属性的默认是public static final 、方法是public abstract
	 Customer selectCustomerById(String id);
	
}
