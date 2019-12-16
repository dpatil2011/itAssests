package com.anabatic.itAssets.endpoint.converter.impl;

import java.util.List;

import com.anabatic.itAssets.endpoint.Request.DeleteFaqRequest;
import com.anabatic.itAssets.endpoint.converter.DeleteFaqConverter;
import com.anabatic.itAssets.persistence.model.Faq;

public class DeleteFaqConverterImpl implements DeleteFaqConverter {

	@Override
	public Faq toModel(DeleteFaqRequest object) {
		Faq faq = new Faq();
		faq.setId(object.getId());
		return faq;
	}

	@Override
	public List<Faq> toModels(List<DeleteFaqRequest> objects) {
		// TODO Auto-generated method stub
		return null;
	}

}
