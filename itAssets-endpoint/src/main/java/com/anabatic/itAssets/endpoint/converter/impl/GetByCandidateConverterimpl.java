package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Response.GetByCandidateCandidateRecordResponse;
import com.anabatic.itAssets.endpoint.converter.GetByCandidateConverter;
import com.anabatic.itAssets.persistence.model.CandidateRecord;

public class GetByCandidateConverterimpl implements GetByCandidateConverter {

	@Override
	public GetByCandidateCandidateRecordResponse toContract(CandidateRecord object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GetByCandidateCandidateRecordResponse> toContracts(List<CandidateRecord> objects) {
		List<GetByCandidateCandidateRecordResponse> responses=new ArrayList<>();
		for (CandidateRecord candidateRecord : objects) {
			GetByCandidateCandidateRecordResponse response=new GetByCandidateCandidateRecordResponse();
			response.setComment(candidateRecord.getComment());
			Integer step=candidateRecord.getSteps();
			if(step==1 || step==3 || step ==5) {
				response.setCommentedBy(candidateRecord.getHmUserId().getFirstName());
			}else if(step==2 || step==4) {
				response.setCommentedBy(candidateRecord.getrUserId().getFirstName());
			}
			responses.add(response);
		}
		return responses;
	}

}
