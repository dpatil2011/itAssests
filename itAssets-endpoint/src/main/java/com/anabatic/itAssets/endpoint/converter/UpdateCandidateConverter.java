package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.UpdateCandidateResponse;
import com.anabatic.itAssets.persistence.model.Candidate;

public interface UpdateCandidateConverter extends ToModelConverter<UpdateCandidateRequest, Candidate>,
ToContractConverter<Candidate, UpdateCandidateResponse> {

}
