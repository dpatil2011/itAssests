package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByIdPrivilegeTypeRequest;
import com.anabatic.itAssets.endpoint.Request.PrivilegeTypeRequest;
import com.anabatic.itAssets.persistence.model.PrivilegeType;

public interface GetByIdPriviligesTypeConverter

extends ToModelConverter<GetByIdPrivilegeTypeRequest, PrivilegeType>, ToContractConverter<PrivilegeType, PrivilegeTypeRequest> {



}
