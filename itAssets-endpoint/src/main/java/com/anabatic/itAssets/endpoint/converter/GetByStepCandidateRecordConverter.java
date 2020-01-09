package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByStepCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.GetByStepCandidateRecordResponse;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface GetByStepCandidateRecordConverter extends ToModelConverter<GetByStepCandidateRecordRequest, CandidateRecord>,ToContractConverter<CandidateRecord, GetByStepCandidateRecordResponse> {

}
