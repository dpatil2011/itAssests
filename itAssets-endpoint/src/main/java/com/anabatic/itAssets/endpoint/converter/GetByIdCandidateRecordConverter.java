package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByIdCandidateRecordRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdCandidateRecordRespone;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface GetByIdCandidateRecordConverter extends ToModelConverter<GetByIdCandidateRecordRequest, CandidateRecord>,ToContractConverter<CandidateRecord, GetByIdCandidateRecordRespone> {

}
