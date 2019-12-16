package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Response.GetAllFaqResponse;
import com.anabatic.itAssets.endpoint.converter.GetAllFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;

public class GetAllFaqConverterImpl implements GetAllFaqConverter {

	@Override
	public GetAllFaqResponse toContract(Faq object) {
		GetAllFaqResponse response = new GetAllFaqResponse();
		response.setId(object.getId());
		response.setQuestion(object.getQuestion());
		response.setAnswer(object.getAnswer());
		response.setIdentifier(object.getIdentifier());
		response.setUserId(object.getUserId().getId());
		response.setRepliedBy(object.getUserId().getId());
		response.setStatus(object.getStatus());
		return response;
	}

	@Override
	public List<GetAllFaqResponse> toContracts(List<Faq> objects) {
		List<GetAllFaqResponse> list = new ArrayList<>();
		objects.forEach(x -> list.add(toContract(x)));
		return list;
	}

}
