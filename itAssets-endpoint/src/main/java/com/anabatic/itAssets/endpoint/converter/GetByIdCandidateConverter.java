package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdCandidateResponse;
import com.anabatic.itAssets.persistence.model.Candidate;

public interface GetByIdCandidateConverter 
extends ToModelConverter<GetByIdCandidateRequest, Candidate>, ToContractConverter<Candidate, GetByIdCandidateResponse>{

}
