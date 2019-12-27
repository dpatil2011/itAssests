package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.RemovePrivilegeRequest;
import com.anabatic.itAssets.endpoint.converter.RemovePrivilegeConverter;
import com.anabatic.itAssets.persistence.model.Privilege;

public class RemovePrivilegeConverterImpl implements RemovePrivilegeConverter {

	@Override
	public Privilege toModel(RemovePrivilegeRequest object) {
		Privilege p = new Privilege();
		p.setId(object.getId());
		return p;
	}

	@Override
	public List<Privilege> toModels(List<RemovePrivilegeRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
