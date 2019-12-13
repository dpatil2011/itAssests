package com.anabatic.itAssets.endpoint.Response;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public class AssetFormResponse {

    private Long id;
    private String catName;
    private String fields;
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
    public String getFields() {
        return fields;
    }
    public void setFields(String fields) {
        this.fields = fields;
    }
    
    
}
