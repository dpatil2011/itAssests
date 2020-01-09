package com.anabatic.itAssets.persistence.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.itAssests.core.constant.UsersErrorConstant;
import org.itAssests.core.exception.UsersException;
import org.springframework.boot.CommandLineRunner;

import com.anabatic.itAssets.persistence.dao.LoginDao;
import com.anabatic.itAssets.persistence.model.Login;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.Users;

@Transactional
public class LoginDaoImpl implements LoginDao {

    @PersistenceContext
    EntityManager manager;

    @Override
    public CommandLineRunner insert() {
        Login l = new Login();
        l.setPassword("pass");
        l.setProfile("profile");
        l.setStatus(0);
        Login lo = manager.merge(l);
        return (CommandLineRunner) lo;
    }

    @Override
    public List<Login> getAll() {
        try {
            return manager.createNativeQuery("SELECT * FROM login", Login.class)
                    .getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Login insert(Login can) {
        Login record2 = manager.merge(can);
        return record2;
    }

    @Override
    public Login update(Login request2) {
        Login request = manager.merge(request2);
        return request;
    }

    @Override
    public Login login(String userName, String password, String role) {
        try {
            Query query = manager.createQuery(
                    "select u from Login u where u.status = 1 and u.userName =:userName and u.password =:password and u.role =:role");
            query.setParameter("userName", userName);
            query.setParameter("password", password);
            query.setParameter("role", role);
            return (Login) query.getSingleResult();
        } catch (Exception e) {
            UsersException u = new UsersException(
                    UsersErrorConstant.LOGIN_VALIDATION);
            u.getError().getField().clear();
            u.getError().addField("userName");
            u.getError().addField("password");
            throw u;
        }
    }

    @Override
    public Long userLogin(String username, String password, Long privi) {
        Long id = null;
        try {
            if (privi != null) {
                Query query = manager.createQuery(
                        "select p from Privilege p where p.status = 1 and p.privilegeType.id =: privi and p.users.status = 3 and p.users.employeeId =:username and p.users.password =:password");
                query.setParameter("username", username);
                query.setParameter("password", password);
                query.setParameter("privi", privi);
                Privilege privilege = (Privilege) query.getSingleResult();
                if (privilege != null) {
                    Query query2 = manager.createQuery(
                            "select u from Users u where u.status = 3 and u.employeeId =:username and u.password =:password");
                    query2.setParameter("username", username);
                    query2.setParameter("password", password);
                    Users data = (Users) query2.getSingleResult();
                    id = data.getId();
                }

            } else {
                Query query = manager.createQuery(
                        "select u from Users u where u.status = 3 and u.employeeId =:username and u.password =:password");
                query.setParameter("username", username);
                query.setParameter("password", password);
                Users data = (Users) query.getSingleResult();
                id = data.getId();
            }
            return id;

        } catch (Exception e) {
            UsersException u = new UsersException(
                    UsersErrorConstant.LOGIN_VALIDATION);
            u.getError().getField().clear();
            u.getError().addField("username");
            u.getError().addField("password");
            throw u;
        }
    }
}
