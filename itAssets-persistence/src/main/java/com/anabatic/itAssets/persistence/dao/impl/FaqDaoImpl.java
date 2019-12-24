package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.anabatic.itAssets.persistence.dao.FaqDao;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.persistence.model.Request;
import com.anabatic.itAssets.persistence.model.Users;

@Transactional
public class FaqDaoImpl implements FaqDao {

	@PersistenceContext
	EntityManager manager;

	@Override
	public Faq insert(Faq faq) {
		Faq faq1 = manager.merge(faq);
		return faq1;
	}

	@Override
	public Faq getById(Faq faq) {
		Faq faq1 = manager.find(Faq.class, faq.getId());
		return faq1;
	}

	@Override
	public Faq update(Faq faq) {
		Faq faq1 = manager.merge(faq);
		return faq1;
	}

	@Override
	public void delete(Faq faq) {
		manager.remove(manager.contains(faq) ? faq : manager.merge(faq));
	}

	@Override
	public List<Faq> getall() {
		try {
			return manager.createNativeQuery("SELECT * FROM faq", Faq.class).getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Faq> getByQueTo(Faq questionTo) {
		try {
			//return manager.createNativeQuery("SELECT * FROM faq where ", Faq.class).getResultList();
			Query query = manager
					.createQuery("select u from Faq u where u.questionTo =:questionTo");
			query.setParameter("questionTo", questionTo.getQuestionTo());
	//	return null;
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public List<Faq> getByUIdAndQueTo(Faq faq) {
		Users u = new Users();
		u.setId(faq.getUserId().getId());
		System.out.println(u.getId() +"  j"+ faq.getQuestionTo());

		try {
			//return manager.createNativeQuery("SELECT * FROM faq where ", Faq.class).getResultList();
			Query query = manager
					.createQuery("select u from Faq u where user_id =:userId and u.questionTo =:questionTo");
			query.setParameter("userId", faq.getUserId().getId());
			query.setParameter("questionTo", faq.getQuestionTo());
			
	//	return null;
			return query.getResultList();
		} catch (Exception e) {
			throw e;
		}		
	}
}
