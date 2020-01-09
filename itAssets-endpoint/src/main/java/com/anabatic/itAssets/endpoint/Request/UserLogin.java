package com.anabatic.itAssets.endpoint.Request;

/**
 * !place your description here!
 *
 * @author yeshwantk (&copy;08-Jan-2020) 
 */
public class UserLogin {

    private String username;
    private String password;
    private Long privi;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Long getPrivi() {
        return privi;
    }
    public void setPrivi(Long privi) {
        this.privi = privi;
    }
    
    
}
