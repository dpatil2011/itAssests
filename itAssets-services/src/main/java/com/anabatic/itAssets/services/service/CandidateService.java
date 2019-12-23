package com.anabatic.itAssets.services.service;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Candidate;

public interface CandidateService {

	Candidate insert(Candidate can);

	Candidate getById(Long id);

	List<Candidate> getAll();

	Candidate update(Candidate request);

}
