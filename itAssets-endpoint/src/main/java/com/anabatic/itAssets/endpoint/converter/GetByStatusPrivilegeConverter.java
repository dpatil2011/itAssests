package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByStatusPrivilegeRequest;
import com.anabatic.itAssets.endpoint.Response.GetByStatusPrivilegeResponse;
import com.anabatic.itAssets.persistence.model.Privilege;

public interface GetByStatusPrivilegeConverter extends ToModelConverter< GetByStatusPrivilegeRequest, Privilege>, ToContractConverter<Privilege, GetByStatusPrivilegeResponse> {

}
