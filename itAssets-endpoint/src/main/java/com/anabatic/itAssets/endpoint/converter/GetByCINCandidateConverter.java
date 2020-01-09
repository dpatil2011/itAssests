package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByCINCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.GetByCINCandidateResponse;
import com.anabatic.itAssets.persistence.model.Candidate;

public interface GetByCINCandidateConverter 
extends ToModelConverter<GetByCINCandidateRequest, Candidate>, ToContractConverter<Candidate, GetByCINCandidateResponse>{

}
