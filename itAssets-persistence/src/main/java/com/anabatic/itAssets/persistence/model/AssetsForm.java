package com.anabatic.itAssets.persistence.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@Entity
@Table(name = "asset_form")
public class AssetsForm{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fields",columnDefinition="text")
    private String fields;

   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private AssetsCategory assetsCategory;

    @Column(name = "status")
    private short status;
    
    @OneToMany(mappedBy = "assetsForm", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<AvailableAsset> availableAsset;

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getFields() {
        return fields;
    }


    public void setFields(String fields) {
        this.fields = fields;
    }


    public AssetsCategory getAssetsCategory() {
        return assetsCategory;
    }


    public void setAssetsCategory(AssetsCategory assetsCategory) {
        this.assetsCategory = assetsCategory;
    }


    public List<AvailableAsset> getAvailableAsset() {
        return availableAsset;
    }


    public void setAvailableAsset(List<AvailableAsset> availableAsset) {
        this.availableAsset = availableAsset;
    }


    public short getStatus() {
        return status;
    }


    public void setStatus(short status) {
        this.status = status;
    }

   
}
