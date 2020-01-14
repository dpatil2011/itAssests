package com.anabatic.itAssets.endpoint.Response;

import java.util.Date;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;14-Jan-2020) 
 */
public class UserInitiationResponse {
    
    private Long id;
    private String link;
    private Date activeFrom;
    private Date expireOn;
    private String email;
    private String cinNumber;
    private String userData;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public Date getActiveFrom() {
        return activeFrom;
    }
    public void setActiveFrom(Date activeFrom) {
        this.activeFrom = activeFrom;
    }
    public Date getExpireOn() {
        return expireOn;
    }
    public void setExpireOn(Date expireOn) {
        this.expireOn = expireOn;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCinNumber() {
        return cinNumber;
    }
    public void setCinNumber(String cinNumber) {
        this.cinNumber = cinNumber;
    }
    public String getUserData() {
        return userData;
    }
    public void setUserData(String userData) {
        this.userData = userData;
    }

}
