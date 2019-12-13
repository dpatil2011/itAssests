package com.anabatic.itAssets.endpoint.Request;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public class AvailableAssetRequest {

    private Long id;
    private Long catId;
    private String fields;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getCatId() {
        return catId;
    }
    public void setCatId(Long catId) {
        this.catId = catId;
    }
    public String getFields() {
        return fields;
    }
    public void setFields(String fields) {
        this.fields = fields;
    }
    
}
