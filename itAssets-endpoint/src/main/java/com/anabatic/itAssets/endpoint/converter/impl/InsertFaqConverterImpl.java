package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.InsertFaqRequest;
import com.anabatic.itAssets.endpoint.Response.InsertFaqResponse;
import com.anabatic.itAssets.endpoint.converter.InsertFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.persistence.model.Users;

public class InsertFaqConverterImpl implements InsertFaqConverter {

	@Override
	public Faq toModel(InsertFaqRequest object) {
		Faq faq = new Faq();
		faq.setQuestion(object.getQuestion());
		faq.setAnswer(object.getAnswer());
		Users users = new Users();
		users.setId(object.getUserId());
		faq.setUserId(users);
		Users users2 = new Users();
		users2.setId(object.getRepliedBy());
		faq.setRepliedBy(users2);
		faq.setStatus(object.getStatus());
		faq.setIdentifier(object.getIdentifier());
		return faq;
	}

	@Override
	public List<Faq> toModels(List<InsertFaqRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsertFaqResponse toContract(Faq object) {
		InsertFaqResponse response = new InsertFaqResponse();
		response.setId(object.getId());
		return response;
	}

	@Override
	public List<InsertFaqResponse> toContracts(List<Faq> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
