package com.anabatic.itAssets.persistence.dao;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Candidate;

public interface CandidateDao {

	/**
	 * 
	 * @param can
	 * @return
	 */
	public Candidate insert(Candidate can);

	public Candidate getById(Long can);

	public List<Candidate> getAll();

	public Candidate update(Candidate request);

	public Boolean validatePhone(Candidate can);

	public Boolean validateEmail(Candidate can);

	public Candidate getByCIN(String cin);
}
