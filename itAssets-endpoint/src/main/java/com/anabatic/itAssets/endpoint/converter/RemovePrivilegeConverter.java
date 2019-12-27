package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.RemovePrivilegeRequest;
import com.anabatic.itAssets.persistence.model.Privilege;

public interface RemovePrivilegeConverter 
extends ToModelConverter<RemovePrivilegeRequest, Privilege> 

{

}
