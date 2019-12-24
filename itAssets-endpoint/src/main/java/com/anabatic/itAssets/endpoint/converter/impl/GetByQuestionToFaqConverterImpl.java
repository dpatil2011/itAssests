package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.ArrayList;
import java.util.List;

import com.anabatic.itAssets.endpoint.Request.GetByQuestionToFaqRequest;
import com.anabatic.itAssets.endpoint.Response.GetByQuestionToFaqResponse;
import com.anabatic.itAssets.endpoint.converter.GetByQuestionToFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;

public class GetByQuestionToFaqConverterImpl implements GetByQuestionToFaqConverter{

		@Override
		public Faq toModel(GetByQuestionToFaqRequest object) {
			Faq faq = new Faq();
			faq.setQuestionTo(object.getQuestionTo());
			return faq;
		}

		@Override
		public List<Faq> toModels(List<GetByQuestionToFaqRequest> objects) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public GetByQuestionToFaqResponse toContract(Faq object) {
			GetByQuestionToFaqResponse response = new GetByQuestionToFaqResponse();
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
		public List<GetByQuestionToFaqResponse> toContracts(List<Faq> objects) {
			List<GetByQuestionToFaqResponse> list=new ArrayList<>(objects.size());
			for (Faq object:objects) {
				GetByQuestionToFaqResponse response=new GetByQuestionToFaqResponse();
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


