package com.anabatic.itAssets.endpoint.converter.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByStatusPrivilegeRequest;
import com.anabatic.itAssets.endpoint.Response.GetByStatusPrivilegeResponse;
import com.anabatic.itAssets.endpoint.converter.GetByStatusPrivilegeConverter;
import com.anabatic.itAssets.persistence.model.Privilege;

public class GetByStatusPrivilegeConverterImpl implements GetByStatusPrivilegeConverter{

	@Override
	public Privilege toModel(GetByStatusPrivilegeRequest object) {
		// TODO Auto-generated method stub
		Privilege p=new Privilege();
		p.setStatus(object.getStatus());
		return p;
	}

	@Override
	public List<Privilege> toModels(List<GetByStatusPrivilegeRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByStatusPrivilegeResponse toContract(Privilege object) {
		// TODO Auto-generated method stub
		GetByStatusPrivilegeResponse user=new GetByStatusPrivilegeResponse();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date fromDate = object.getFromDate();
	    Date toDate = object.getToDate();
	    String fDate = formatter.format(fromDate);
	    user.setFromDate(fDate);
		user.setToDate(object.getToDate());
		user.setFullName(object.getUsers().getFullName());
		user.setId(object.getId());
		user.setStatus(object.getStatus());
		user.setPrivilegeTypeId(object.getPrivilegeType().getId());
		user.setPrivilegeType(object.getPrivilegeType().getPrivilegeType());
		user.setPriviCount(object.getPrivilegeType().getPriviCount());
		user.setUserId(object.getUsers().getId());
		user.setDepartment(object.getUsers().getDepartment());
		user.setEmployeeId(object.getUsers().getEmployeeId());
		user.setOfficalEmail(object.getUsers().getOfficalEmail());
		return user;
	}

	@Override
	public List<GetByStatusPrivilegeResponse> toContracts(List<Privilege> objects) {
		List<GetByStatusPrivilegeResponse> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;
	}

}
