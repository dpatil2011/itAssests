package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByStatusCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.GetByStatusCandidateRecordResponse;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface GetByStatusCandidateRecordConverter extends ToModelConverter<GetByStatusCandidateRecordRequest, CandidateRecord>,ToContractConverter<CandidateRecord, GetByStatusCandidateRecordResponse> {

}
