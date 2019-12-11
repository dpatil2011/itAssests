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

import com.anabatic.generic.persistence.model.TypicalGenericModel;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@Entity
@Table(name = "asset_form")
public class AssetsForm extends TypicalGenericModel {

    /**
     * !place your description! 
     *
     * long 
     * serialVersionUID 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    private Long id;

    @Column(name = "fields",columnDefinition="text")
    private String fields;

   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private AssetsCategory assetsCategory;

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

   
}
