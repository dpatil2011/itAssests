package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.DeleteCandidateRecordRequest;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public interface DeleteCandidateRecordConverter extends ToModelConverter<DeleteCandidateRecordRequest, CandidateRecord>{

}
