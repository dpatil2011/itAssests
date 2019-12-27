package com.anabatic.itAssets.services.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anabatic.itAssets.persistence.dao.PrivilegeTypeDao;
import com.anabatic.itAssets.persistence.model.PrivilegeType;
import com.anabatic.itAssets.services.service.PrivilegeTypeService;

@Transactional
public class PrivilegeTypeServiceImpl implements PrivilegeTypeService {
	@Autowired
	private PrivilegeTypeDao privilegeTypeDao;

	@PersistenceContext
    EntityManager entityManager;
	
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
	    try {
            Query query = entityManager
                    .createQuery("select u from PrivilegeType u where u.status =:status");
            query.setParameter("status", 1);
            return query.getResultList();
        }  catch (Exception e) {
            return null;
        }
	    
	}
	
	@Override
    public void delete(Long id) {
	    PrivilegeType response = entityManager.find(PrivilegeType.class, id);
	    response.setStatus(0);
	    privilegeTypeDao.insert(response);
        
    }

	@Override
	public PrivilegeType updatePriviCount(Long privilegeTypeId) {
		return privilegeTypeDao.updatePriviCount(privilegeTypeId);
	}
		
	public PrivilegeType getById(Long id) {
		// TODO Auto-generated method stub
		return privilegeTypeDao.getById(id);
	}

	@Override
	public PrivilegeType updatePriviCountTo(Long id) {
		// TODO Auto-generated method stub
		return privilegeTypeDao.updatePriviCountTo(id);
	}
}
