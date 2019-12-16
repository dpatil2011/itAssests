package com.anabatic.itAssets.endpoint.Response;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;25-Jul-2019) 
 */
public class AssetsCategoryResponse {

    private Long id;
    private String catName;
    private short fields;
    private String belongsTo;
    private Integer stock;
    private short status;
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
    public short getStatus() {
        return status;
    }
    public void setStatus(short status) {
        this.status = status;
    }
    
}
