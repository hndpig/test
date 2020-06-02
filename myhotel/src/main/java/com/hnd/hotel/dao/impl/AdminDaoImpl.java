package com.hnd.hotel.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.hnd.hotel.dao.ifac.IAdminDao;
import com.hnd.hotel.entity.Worker;
@Repository("IAdminDao")
public class AdminDaoImpl implements IAdminDao {

	public int deleteAdmin4Id(String id) {
		System.out.println("========deleteAdmin4Id======");
		return 0;
	}

	public int updateAdmin4Id(String id) {
		System.out.println("========updateAdmin4Id======");
		return 0;
	}

	public int insertAdmin(Worker work) {
		System.out.println("========insertAdmin======");

		return 0;
	}

	public Worker selectAdmin4Id(String id) {
		System.out.println("========selectAdmin4Id======");

		return null;
	}

	public List<Worker> selectAllAdmin() {
		System.out.println("========selectAllAdmin======");

		return null;
	}

}
