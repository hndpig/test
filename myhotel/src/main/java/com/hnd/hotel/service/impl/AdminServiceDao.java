package com.hnd.hotel.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hnd.hotel.dao.ifac.IAdminDao;
import com.hnd.hotel.entity.Worker;
import com.hnd.hotel.service.ifac.IAdminService;
@Service("AdminServiceDao")
public class AdminServiceDao implements IAdminService {
	IAdminDao adminDao;
	public int addAdmin(Worker worker) {
		adminDao.insertAdmin(null);
		return 0;
	}

	public int removerAdmin(String id) {
		adminDao.deleteAdmin4Id("sd");
		
		return 0;
	}

	public int modifyAdmin(Worker worker) {
		adminDao.updateAdmin4Id("132");
		return 0;
	}

	public List<Worker> queryAllAdmin() {
		adminDao.selectAllAdmin();
		return null;
	}

	public Worker queryAdmin4Id(String id) {
		adminDao.selectAdmin4Id("123");
		return null;
	}

}
