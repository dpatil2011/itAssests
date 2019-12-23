package com.anabatic.itAssets.persistence.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@Entity
@Table(name = "assets_category")
public class AssetsCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "cat_name")
	private String catName;

	@Column(name = "fields")
	private short fields;

	@Column(name = "belongs_to")
	private String belongsTo;

	@Column(name = "stock")
	private Integer stock;

	@Column(name = "status")
	private short status;

	@OneToMany(mappedBy = "assetsCategory", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<AssetsForm> assetsForm;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public short getFields() {
		return fields;
	}

	public void setFields(short fields) {
		this.fields = fields;
	}

	public String getBelongsTo() {
		return belongsTo;
	}

	public void setBelongsTo(String belongsTo) {
		this.belongsTo = belongsTo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public List<AssetsForm> getAssetsForm() {
		return assetsForm;
	}

	public void setAssetsForm(List<AssetsForm> assetsForm) {
		this.assetsForm = assetsForm;
	}

	public short getStatus() {
		return status;
	}

	public void setStatus(short status) {
		this.status = status;
	}

}
