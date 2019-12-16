package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.InsertFaqRequest;
import com.anabatic.itAssets.endpoint.Response.InsertFaqResponse;
import com.anabatic.itAssets.persistence.model.Faq;

public interface InsertFaqConverter
		extends ToModelConverter<InsertFaqRequest, Faq>, ToContractConverter<Faq, InsertFaqResponse> {

}
