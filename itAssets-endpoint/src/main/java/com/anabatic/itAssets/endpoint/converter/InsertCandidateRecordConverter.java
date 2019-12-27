package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.InsertCandidateRecordResponse;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface InsertCandidateRecordConverter extends ToModelConverter<InsertCandidateRecordRequest, CandidateRecord>,
ToContractConverter<CandidateRecord, InsertCandidateRecordResponse>{

}
