package com.anabatic.itAssets.endpoint.Request;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public class AssetFormRequest {

    private Long id;
    private String fields;
    private Long assetCatId;
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
    public Long getAssetCatId() {
        return assetCatId;
    }
    public void setAssetCatId(Long assetCatId) {
        this.assetCatId = assetCatId;
    }
    
    
}
