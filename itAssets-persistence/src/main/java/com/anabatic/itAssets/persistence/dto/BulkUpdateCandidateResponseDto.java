package com.anabatic.itAssets.persistence.dto;

import java.util.List;

import com.anabatic.itAssets.persistence.model.Candidate;

public class BulkUpdateCandidateResponseDto {
	private Integer totalRecords;
	private Integer successful;
	private Integer failed;
	private List<BulkUpdateCandidateFailedDto> failedRecords;
	
	public Integer getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(Integer totalRecords) {
		this.totalRecords = totalRecords;
	}
	public Integer getSuccessful() {
		return successful;
	}
	public void setSuccessful(Integer successful) {
		this.successful = successful;
	}
	public Integer getFailed() {
		return failed;
	}
	public void setFailed(Integer failed) {
		this.failed = failed;
	}
	public List<BulkUpdateCandidateFailedDto> getFailedRecords() {
		return failedRecords;
	}
	public void setFailedRecords(List<BulkUpdateCandidateFailedDto> failedRecords) {
		this.failedRecords = failedRecords;
	}

}
