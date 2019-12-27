package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.PrivilegeTypeDao;
import com.anabatic.itAssets.persistence.model.PrivilegeType;

@Transactional
public class PrivilegeTypeDaoImpl implements PrivilegeTypeDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public PrivilegeType insert(PrivilegeType request) {
		PrivilegeType response = entityManager.merge(request);
		return response;
	}

	@Override
	public List<PrivilegeType> getAll() {
		try {
			return entityManager.createNativeQuery("SELECT * FROM privilege_type", PrivilegeType.class).getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public PrivilegeType updatePriviCount(Long privilegeTypeId) {
		PrivilegeType byId = getById(privilegeTypeId);
		byId.setPriviCount(byId.getPriviCount()+1);
		PrivilegeType merge = entityManager.merge(byId);
		return merge;		
	}

	@Override
	public PrivilegeType getById(Long id) {
		try {
			PrivilegeType find = entityManager.find(PrivilegeType.class, id);
			return find;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PrivilegeType updatePriviCountTo(Long id) {
		PrivilegeType byId = getById(id);
		byId.setPriviCount(byId.getPriviCount()-1);
		PrivilegeType merge = entityManager.merge(byId);
		return merge;		
	}


}
