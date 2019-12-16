package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.DeleteFaqRequest;
import com.anabatic.itAssets.persistence.model.Faq;

public interface DeleteFaqConverter extends ToModelConverter<DeleteFaqRequest, Faq> {

}
