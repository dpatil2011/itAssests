package com.anabatic.itAssets.services.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.PrivilegeTypeDao;
import com.anabatic.itAssets.persistence.model.PrivilegeType;
import com.anabatic.itAssets.services.service.PrivilegeTypeService;

public class PrivilegeTypeServiceImpl implements PrivilegeTypeService {
	@Autowired
	private PrivilegeTypeDao privilegeTypeDao;

	@Override
	public PrivilegeType insert(PrivilegeType faq) {
		return privilegeTypeDao.insert(faq);
	}

	@Override
	public List<PrivilegeType> getAll() {
		return privilegeTypeDao.getAll();
	}

	@Override
	public List<PrivilegeType> getAllByStatus() {
		List<PrivilegeType> status = new ArrayList<>();
		List<PrivilegeType> list = privilegeTypeDao.getAll();
		for (PrivilegeType privilegeType : list) {
			Integer i = new Integer(1);
			if (privilegeType.getStatus().equals(i)) {
				status.add(privilegeType);
			}
		}
		return status;
	}
}
