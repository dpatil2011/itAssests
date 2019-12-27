package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.PrivilegeTypeDao;
import com.anabatic.itAssets.persistence.model.Candidate;
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
	public PrivilegeType getById(Long id) {
		PrivilegeType response = entityManager.find(PrivilegeType.class,
                id);
        return response;
	}

}
