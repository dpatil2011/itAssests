package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.itAssets.endpoint.Response.GetAllCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.Response.GetByCandidateCandidateRecordResponse;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface GetByCandidateConverter extends ToContractConverter<CandidateRecord, GetByCandidateCandidateRecordResponse> {
	
}
