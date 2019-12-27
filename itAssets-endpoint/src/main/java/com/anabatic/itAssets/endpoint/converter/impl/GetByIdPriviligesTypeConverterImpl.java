package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByIdPrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.Request.PrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.converter.GetByIdPriviligesTypeConverter;
import com.anabatic.itAssets.persistence.model.PrivilegeType;

public class GetByIdPriviligesTypeConverterImpl implements GetByIdPriviligesTypeConverter {

	@Override
	public PrivilegeType toModel(GetByIdPrivilegeTypeRequest object) {
		// TODO Auto-generated method stub
		PrivilegeType p=new PrivilegeType();
		p.setId(object.getId());
		return p;
	}

	@Override
	public List<PrivilegeType> toModels(List<GetByIdPrivilegeTypeRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrivilegeTypeRequest toContract(PrivilegeType object) {
		// TODO Auto-generated method stub
		PrivilegeTypeRequest privilegeTypeRequest = new PrivilegeTypeRequest();
		privilegeTypeRequest.setId(object.getId());
		privilegeTypeRequest.setPrivilegeType(object.getPrivilegeType());
		privilegeTypeRequest.setStatus(object.getStatus());
		privilegeTypeRequest.setIcon(object.getIcon());
		privilegeTypeRequest.setColor(object.getColor());
		privilegeTypeRequest.setPriviCount(object.getPriviCount());
		return privilegeTypeRequest;
	}

	@Override
	public List<PrivilegeTypeRequest> toContracts(List<PrivilegeType> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
