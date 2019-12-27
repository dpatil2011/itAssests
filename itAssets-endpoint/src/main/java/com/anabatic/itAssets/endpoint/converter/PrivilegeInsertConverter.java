package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.PrivilegeInsertRequest;
import com.anabatic.itAssets.endpoint.Response.PrivilegeInsertResponse;
import com.anabatic.itAssets.persistence.model.Privilege;

public interface PrivilegeInsertConverter extends ToModelConverter<PrivilegeInsertRequest, Privilege>,
		ToContractConverter<Privilege, PrivilegeInsertResponse> {

}
