package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.Date;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.PrivilegeInsertRequest;
import com.anabatic.itAssets.endpoint.Response.PrivilegeInsertResponse;
import com.anabatic.itAssets.endpoint.converter.PrivilegeInsertConverter;
import com.anabatic.itAssets.persistence.model.Privilege;
import com.anabatic.itAssets.persistence.model.PrivilegeType;
import com.anabatic.itAssets.persistence.model.Users;

public class PrivilegeInsertConverterImpl implements PrivilegeInsertConverter {

	@Override
	public Privilege toModel(PrivilegeInsertRequest object) {
		
		 Privilege p = new Privilege();
		 PrivilegeType t = new PrivilegeType();
	     t.setId(object.getPrivilegeTypeId());
	     Users u = new Users();
	     u.setId(object.getUsersId());
	     Date date = new Date();
	     p.setUsers(u);
	     p.setStatus(1);
	     p.setFromDate(date);
	     p.setPrivilegeType(t);
	     
	     
	//	p.setPrivilegeType();
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public List<Privilege> toModels(List<PrivilegeInsertRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrivilegeInsertResponse toContract(Privilege object) {
		// TODO Auto-generated method stub
		PrivilegeInsertResponse res = new PrivilegeInsertResponse();
		res.setId(object.getId());
		res.setColor(object.getPrivilegeType().getColor());
		res.setDepartment(object.getUsers().getDepartment());
		res.setEmployeeId(object.getUsers().getEmployeeId());
		res.setFromDate(object.getFromDate());
		res.setFullName(object.getUsers().getFullName());
		res.setIcon(object.getPrivilegeType().getIcon());
		res.setOfficalEmail(object.getUsers().getOfficalEmail());
		res.setPriviCount(object.getPrivilegeType().getPriviCount());
		res.setPrivilegeType(object.getPrivilegeType().getPrivilegeType());
		res.setPrivilegeTypeId(object.getPrivilegeType().getId());
		res.setPrivilegeTypeStatus(object.getPrivilegeType().getStatus());
		res.setUserId(object.getUsers().getId());
		return res;
	}

	@Override
	public List<PrivilegeInsertResponse> toContracts(List<Privilege> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
