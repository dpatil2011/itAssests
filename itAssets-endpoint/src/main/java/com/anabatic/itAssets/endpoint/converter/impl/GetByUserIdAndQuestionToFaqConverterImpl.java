package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByUserIdAndQuestionToFaqRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdFaqResponse;
import com.anabatic.itAssets.endpoint.Response.GetByUserIdAndQuestionToFaqResponse;
import com.anabatic.itAssets.endpoint.converter.GetByUserIdAndQuestionToFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.persistence.model.Users;

public class GetByUserIdAndQuestionToFaqConverterImpl implements GetByUserIdAndQuestionToFaqConverter {

	@Override
	public Faq toModel(GetByUserIdAndQuestionToFaqRequest object) {
		Faq faq = new Faq();
		Users u = new Users();
		u.setId(object.getUserId());
		faq.setUserId(u);
		faq.setQuestionTo(object.getQuestionTo());
		return faq;
	}

	@Override
	public List<Faq> toModels(List<GetByUserIdAndQuestionToFaqRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GetByUserIdAndQuestionToFaqResponse toContract(Faq object) {
		GetByUserIdAndQuestionToFaqResponse response = new GetByUserIdAndQuestionToFaqResponse();
		response.setId(object.getId());
		response.setQuestion(object.getQuestion());
		response.setQuestionTo(object.getQuestionTo());
		response.setAnswer(object.getAnswer());
		response.setIdentifier(object.getIdentifier());
		response.setUserId(object.getUserId().getId());
		response.setRepliedBy(object.getUserId().getId());
		response.setStatus(object.getStatus());
		response.setDor(object.getDor());
		response.setCod(object.getCod());
		return response;
	}

	@Override
	public List<GetByUserIdAndQuestionToFaqResponse> toContracts(List<Faq> objects) {
		List<GetByUserIdAndQuestionToFaqResponse> list=new ArrayList<>(objects.size());
		for (Faq object:objects) {
			GetByUserIdAndQuestionToFaqResponse response=new GetByUserIdAndQuestionToFaqResponse();
			response.setId(object.getId());
			response.setQuestion(object.getQuestion());
			response.setQuestionTo(object.getQuestionTo());
			response.setAnswer(object.getAnswer());
			response.setIdentifier(object.getIdentifier());
			response.setUserId(object.getUserId().getId());
			response.setRepliedBy(object.getUserId().getId());
			response.setStatus(object.getStatus());
			list.add(response);
		}
		return list;
	}

}
