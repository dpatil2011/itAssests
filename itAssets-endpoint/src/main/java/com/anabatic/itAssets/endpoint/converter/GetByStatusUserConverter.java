package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.ChangePasswordRequest;
import com.anabatic.itAssets.endpoint.Request.GetByStatusRequest;
import com.anabatic.itAssets.endpoint.Response.ChangePasswordResponse;
import com.anabatic.itAssets.endpoint.Response.GetByStatusResponse;
import com.anabatic.itAssets.persistence.model.Users;

public interface GetByStatusUserConverter
		extends ToModelConverter<GetByStatusRequest, Users>, ToContractConverter<Users, GetByStatusResponse> {

}
