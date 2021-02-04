/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.dbconnection.models;

/**
 *
 * @author adria
 */
public class RegisterModel {
    private int IDUser;
    private String RUsername;
    private String REmail;
    private String RPassword;
    private String RFacebook;
    private String RInsta;
    private String RTwitter;
    private String RImage;

    public RegisterModel(int IDUser) {
        this.IDUser = IDUser;
    }

    public RegisterModel(String RUsername, String REmail, String RPassword, String RFacebook, String RInsta, String RTwitter, String RImage) {
        this.RUsername = RUsername;
        this.REmail = REmail;
        this.RPassword = RPassword;
        this.RFacebook = RFacebook;
        this.RInsta = RInsta;
        this.RTwitter = RTwitter;
        this.RImage = RImage;
    }

    public String getRUsername() {
        return RUsername;
    }

    public void setRUsername(String RUsername) {
        this.RUsername = RUsername;
    }

    public String getREmail() {
        return REmail;
    }

    public void setREmail(String REmail) {
        this.REmail = REmail;
    }

    public String getRPassword() {
        return RPassword;
    }

    public void setRPassword(String RPassword) {
        this.RPassword = RPassword;
    }

    public String getRFacebook() {
        return RFacebook;
    }

    public void setRFacebook(String RFacebook) {
        this.RFacebook = RFacebook;
    }

    public String getRInsta() {
        return RInsta;
    }

    public void setRInsta(String RInsta) {
        this.RInsta = RInsta;
    }

    public String getRTwitter() {
        return RTwitter;
    }

    public void setRTwitter(String RTwitter) {
        this.RTwitter = RTwitter;
    }

    public String getRImage() {
        return RImage;
    }

    public void setRImage(String RImage) {
        this.RImage = RImage;
    }
}
