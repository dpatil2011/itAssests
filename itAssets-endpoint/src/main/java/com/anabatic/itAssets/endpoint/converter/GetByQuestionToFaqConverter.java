package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByQuestionToFaqRequest;
import com.anabatic.itAssets.endpoint.Response.GetByQuestionToFaqResponse;
import com.anabatic.itAssets.persistence.model.Faq;

public interface GetByQuestionToFaqConverter extends ToModelConverter<GetByQuestionToFaqRequest, Faq>,
ToContractConverter<Faq, GetByQuestionToFaqResponse>{

}
