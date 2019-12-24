package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.GetByUserIdAndQuestionToFaqRequest;
import com.anabatic.itAssets.endpoint.Response.GetByUserIdAndQuestionToFaqResponse;
import com.anabatic.itAssets.persistence.model.Faq;
import com.anabatic.itAssets.persistence.model.Users;

public interface GetByUserIdAndQuestionToFaqConverter extends ToModelConverter<GetByUserIdAndQuestionToFaqRequest, Faq>,
ToContractConverter<Faq, GetByUserIdAndQuestionToFaqResponse>{

}
