package com.anabatic.itAssets.persistence.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.anabatic.itAssets.persistence.dao.PrivilegeDao;
import com.anabatic.itAssets.persistence.model.Privilege;

@javax.transaction.Transactional
public class PrivilegeDaoImpl implements PrivilegeDao {

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Privilege> getByStatus(Privilege p, Long priviId) {
		try {
			if (priviId == null) {
				Query query = entityManager.createQuery("SELECT u FROM Privilege u where u.status =:status ");
				query.setParameter("status", p.getStatus());

				return query.getResultList();
			} else {
				Query query = entityManager.createQuery(
						"SELECT u FROM Privilege u where u.status =:status and  privilegetype_id =:priviId");
				query.setParameter("status", p.getStatus());
				query.setParameter("priviId", priviId);
				return query.getResultList();
			}

		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Privilege insert(Privilege model) {
		// TODO Auto-generated method stub
		try {
		    Query query = entityManager
                    .createQuery("SELECT u FROM Privilege u where user_id =:id and  privilegetype_id =:priviId and u.status=1");
            query.setParameter("id", model.getUsers().getId());
            query.setParameter("priviId",model.getPrivilegeType().getId());
            List<Privilege> p =  query.getResultList();
            if(p.isEmpty()){
                Privilege merge = entityManager.merge(model);
                return merge;
            }
			
		}
		catch(Exception e) {
		    System.out.println("MSG");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Privilege removePrivilege(Privilege model) {
		Privilege byId = getById(model);
		byId.setToDate(new Date());
		byId.setStatus(0);
		try {
			Privilege p = entityManager.merge(byId);
			return p;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Privilege getById(Privilege model) {
		try {
			Privilege getById = entityManager.find(Privilege.class, model.getId());
			return getById;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    @Override
    public List<Privilege> recents() {
        try {
                Query query = entityManager
                        .createQuery("SELECT u FROM Privilege u where u.status = 1 ORDER BY u.id DESC");  
                query.setMaxResults(10);
                return query.getResultList();
             
        } catch (Exception e) {
            throw e;
        }
    }

}
