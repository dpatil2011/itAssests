package com.anabatic.itAssets.endpoint.Request;

public class PrivilegeTypeRequest {

	private Long id;
	private String privilegeType;
	private Integer status;
	private String icon;
	private String color;
	private Integer priviCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrivilegeType() {
		return privilegeType;
	}

	public void setPrivilegeType(String privilegeType) {
		this.privilegeType = privilegeType;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public Integer getPriviCount() {
        return priviCount;
    }

    public void setPriviCount(Integer priviCount) {
        this.priviCount = priviCount;
    }
	
}