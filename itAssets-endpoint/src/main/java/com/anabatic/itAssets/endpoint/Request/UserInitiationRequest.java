package com.anabatic.itAssets.endpoint.Request;

import java.util.Date;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;09-Jan-2020) 
 */
public class UserInitiationRequest {

    private Long id;
    private String link;
    private Date date;
    private String email;
    private String cinNumber;
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
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
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
    
}
