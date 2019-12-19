package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByIdFaqRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdFaqResponse;
import com.anabatic.itAssets.endpoint.converter.GetByIdFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;

public class GetByIdFaqConverterImpl implements GetByIdFaqConverter {

	@Override
	public Faq toModel(GetByIdFaqRequest object) {
		Faq faq = new Faq();
		faq.setId(object.getId());
		return faq;
	}

	@Override
	public List<Faq> toModels(List<GetByIdFaqRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByIdFaqResponse toContract(Faq object) {
		GetByIdFaqResponse response = new GetByIdFaqResponse();
		response.setId(object.getId());
		response.setQuestion(object.getQuestion());
		response.setQuestionTo(object.getQuestionTo());
		response.setAnswer(object.getAnswer());
		response.setIdentifier(object.getIdentifier());
		response.setUserId(object.getUserId().getId());
		response.setRepliedBy(object.getUserId().getId());
		response.setStatus(object.getStatus());
		return response;
	}

	@Override
	public List<GetByIdFaqResponse> toContracts(List<Faq> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
