package com.anabatic.itAssets.endpoint.Request;

public class GetByStatusPrivilegeRequest {

	
	private Integer status;
	private Long priviId;
	
	public Long getPriviId() {
        return priviId;
    }

    public void setPriviId(Long priviId) {
        this.priviId = priviId;
    }

    public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
