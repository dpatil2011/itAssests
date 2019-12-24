package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.http.HttpStatus;

import com.anabatic.generic.endpoint.contract.BaseResponse;
import com.anabatic.itAssets.persistence.dao.UsersDao;
import com.anabatic.itAssets.persistence.model.Users;

@javax.transaction.Transactional
public class UsersDaoImpl implements UsersDao {

	@PersistenceContext
	EntityManager manager;

	@Override
	public Users insert(Users model) {
		Users x = getEmpId(model.getEmployeeId());
		if(model.getEmployeeId()!=null) {
			if(x == null) {
				Users user = manager.merge(model);
				return user;
			}else {
				UsersException u = new UsersException(UsersErrorConstant.EMPLOYEE_ID);
				u.getError().getField().clear();
				u.getError().addField("employeId");			
				throw u;
			}
		} else {
			Users user = manager.merge(model);
			return user;
		}
		
		
	}

	@Override
	public List<Users> getAll() {
		try {
			return manager.createNativeQuery("SELECT * FROM users", Users.class).getResultList();
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Users getById(Long long1) {
		try {
			Users find = manager.find(Users.class, long1);
			return find;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Users update(Users user) {
		Users res = manager.merge(user);
		return res;
	}

	@Override
	public void deleteById(Long id) {
		try {
			Users u = getById(id);
			manager.remove(u);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Users login(String employeeId, String password) {
		try {
			Query query = manager
					.createQuery("select u from Users u where u.employeeId =:employeeId and u.password =:password");
			query.setParameter("employeeId", employeeId);
			query.setParameter("password", password);
			return (Users) query.getSingleResult();
		} catch (Exception e) {
			UsersException u = new UsersException(UsersErrorConstant.USER_LOGIN_VALIDATION);
			u.getError().getField().clear();
			u.getError().addField("employeId");
			u.getError().addField("password");
			throw u;
		}
	}

	@Override
	public Users getEmpId(String employeeId) {
		try {
			Query query = manager
					.createQuery("select u from Users u where u.employeeId =:employeeId");
			query.setParameter("employeeId", employeeId);
			
			return (Users) query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Users> getByStatus(Integer status) {
		try {
			Query query = manager
					.createQuery("select u from Users u where u.status =:status");
			query.setParameter("status", status);
			return query.getResultList();
		}  catch (Exception e) {
			return null;
		}
		
	}

}
