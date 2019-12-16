package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.itAssets.endpoint.Response.GetAllFaqResponse;
import com.anabatic.itAssets.persistence.model.Faq;

public interface GetAllFaqConverter extends ToContractConverter<Faq, GetAllFaqResponse> {

}
