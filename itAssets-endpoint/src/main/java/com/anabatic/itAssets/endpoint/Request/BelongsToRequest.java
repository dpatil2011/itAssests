package com.anabatic.itAssets.endpoint.Request;

import com.anabatic.generic.persistence.annotation.IsRequired;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;20-Dec-2019) 
 */
public class BelongsToRequest {
    @IsRequired
    String belongsTo;

    public String getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(String belongsTo) {
        this.belongsTo = belongsTo;
    }
    
}
