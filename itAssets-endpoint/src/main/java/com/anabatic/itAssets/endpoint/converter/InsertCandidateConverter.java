package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateResponse;
import com.anabatic.itAssets.persistence.model.Candidate;

public interface InsertCandidateConverter extends ToModelConverter<InsertCandidateRequest, Candidate>,
ToContractConverter<Candidate, InsertCandidateResponse> {

}
