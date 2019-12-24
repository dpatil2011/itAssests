package com.anabatic.itAssets.endpoint.converter;

import com.anabatic.generic.service.converter.ToContractConverter;
import com.anabatic.generic.service.converter.ToModelConverter;
import com.anabatic.itAssets.endpoint.Request.AssetsCategoryRequest;
import com.anabatic.itAssets.endpoint.Request.InsertCandidateRequest;
import com.anabatic.itAssets.endpoint.Request.UsersRequest;
import com.anabatic.itAssets.endpoint.Response.AssetsCategoryResponse;
import com.anabatic.itAssets.endpoint.Response.GetAllCandidateResponse;
import com.anabatic.itAssets.endpoint.Response.GetAllUsersResponse;
import com.anabatic.itAssets.endpoint.Response.UsersResponse;
import com.anabatic.itAssets.persistence.model.AssetsCategory;
import com.anabatic.itAssets.persistence.model.Candidate;
import com.anabatic.itAssets.persistence.model.Users;

public interface GetAllCandidateConverter   extends ToModelConverter<InsertCandidateRequest, Candidate>,
ToContractConverter<Candidate, GetAllCandidateResponse>{

}
