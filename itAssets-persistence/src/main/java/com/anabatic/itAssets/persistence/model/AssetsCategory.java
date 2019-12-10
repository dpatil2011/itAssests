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

import com.anabatic.generic.persistence.model.TypicalGenericModel;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019)
 */
@Entity
@Table(name = "assets_category")
public class AssetsCategory extends TypicalGenericModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(name = "cat_name")
    private String catName;

    @OneToMany(mappedBy = "assetsCategory", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Assets> assets;

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

    public List<Assets> getAssets() {
        return assets;
    }

    public void setAssets(List<Assets> assets) {
        this.assets = assets;
    }

}
