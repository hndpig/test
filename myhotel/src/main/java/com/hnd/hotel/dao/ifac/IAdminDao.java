package com.hnd.hotel.dao.ifac;

import java.util.List;

import com.hnd.hotel.entity.Worker;

public interface IAdminDao {
	int deleteAdmin4Id(String id);
	int updateAdmin4Id(String id);
	int insertAdmin(Worker work);
	Worker selectAdmin4Id(String id);
	List<Worker>selectAllAdmin();
}
