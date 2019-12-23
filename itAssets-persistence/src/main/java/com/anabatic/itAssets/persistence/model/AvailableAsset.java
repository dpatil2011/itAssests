package com.anabatic.itAssets.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;11-Dec-2019)
 */
@Entity
@Table(name = "available_asset")
public class AvailableAsset {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "data")
	private String data;

	@Column(name = "status")
	private short status;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cat_id")
	private AssetsForm assetsForm;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public AssetsForm getAssetsForm() {
		return assetsForm;
	}

	public void setAssetsForm(AssetsForm assetsForm) {
		this.assetsForm = assetsForm;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}
