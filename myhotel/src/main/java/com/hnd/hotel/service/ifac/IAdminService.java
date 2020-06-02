package com.hnd.hotel.service.ifac;

import java.util.List;

import com.hnd.hotel.entity.Worker;

public interface IAdminService {
	int addAdmin(Worker worker);
	int removerAdmin(String id);
	int modifyAdmin(Worker worker);
	List<Worker> queryAllAdmin();
	Worker queryAdmin4Id(String id);
	
}
