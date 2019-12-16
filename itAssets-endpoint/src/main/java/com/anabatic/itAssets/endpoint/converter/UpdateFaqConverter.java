package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.UpdateFaqRequest;
import com.anabatic.itAssets.endpoint.Response.UpdateFaqResponse;
import com.anabatic.itAssets.persistence.model.Faq;

public interface UpdateFaqConverter
		extends ToModelConverter<UpdateFaqRequest, Faq>, ToContractConverter<Faq, UpdateFaqResponse> {

}
