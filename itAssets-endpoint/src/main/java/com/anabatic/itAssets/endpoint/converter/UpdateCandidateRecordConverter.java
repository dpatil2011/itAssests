package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.UpdateCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.UpdateCandidateRecordResponse;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface UpdateCandidateRecordConverter extends ToModelConverter<UpdateCandidateRecordRequest, CandidateRecord>,
ToContractConverter<CandidateRecord, UpdateCandidateRecordResponse>{

}
