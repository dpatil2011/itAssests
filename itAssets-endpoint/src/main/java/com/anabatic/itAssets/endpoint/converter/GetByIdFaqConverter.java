package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByIdFaqRequest;
import com.anabatic.itAssets.endpoint.Response.GetByIdFaqResponse;
import com.anabatic.itAssets.persistence.model.Faq;

public interface GetByIdFaqConverter
		extends ToModelConverter<GetByIdFaqRequest, Faq>, ToContractConverter<Faq, GetByIdFaqResponse> {

}
