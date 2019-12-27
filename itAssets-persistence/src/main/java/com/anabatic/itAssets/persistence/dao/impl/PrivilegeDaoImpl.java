package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.anabatic.itAssets.persistence.dao.PrivilegeDao;
import com.anabatic.itAssets.persistence.model.Privilege;

public class PrivilegeDaoImpl  implements PrivilegeDao{
	

	@PersistenceContext
	EntityManager entityManager;

	

	@Override
	public List<Privilege> getByStatus(Privilege p) {
		try {
			Query query = entityManager
					.createQuery("SELECT u FROM Privilege u where u.status =:status");
			query.setParameter("status", p.getStatus());
            return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

}