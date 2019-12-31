package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.UpdateFaqRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdFaqResponse;
import com.anabatic.itAssets.endpoint.Response.UpdateFaqResponse;
import com.anabatic.itAssets.endpoint.converter.UpdateFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.persistence.model.Users;

public class UpdateFaqConverterImpl implements UpdateFaqConverter {

	@Override
	public Faq toModel(UpdateFaqRequest object) {
		Faq faq = new Faq();
		faq.setId(object.getId());
		faq.setQuestion(object.getQuestion());
		faq.setQuestionTo(object.getQuestionTo());
		faq.setAnswer(object.getAnswer());
		Users users = new Users();
		users.setId(object.getUserId());
		faq.setUserId(users);
		Users users2 = new Users();
		users2.setId(object.getRepliedBy());
		faq.setRepliedBy(users2);
		faq.setStatus(object.getStatus());
		faq.setCod(object.getCod());
		return faq;
	}

	@Override
	public List<Faq> toModels(List<UpdateFaqRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateFaqResponse toContract(Faq object) {
		UpdateFaqResponse response = new UpdateFaqResponse();
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
	public List<UpdateFaqResponse> toContracts(List<Faq> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
