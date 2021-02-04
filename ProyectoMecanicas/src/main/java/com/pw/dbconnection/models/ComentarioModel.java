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
public class ComentarioModel {
    
    private int IDComment;
    
    private int IDP;
    
    private int IDU;
    
    private String content;

    public ComentarioModel() {
    }

    public ComentarioModel(int IDComment, int IDP, int IDU, String content) {
        this.IDComment = IDComment;
        this.IDP = IDP;
        this.IDU = IDU;
        this.content = content;
    }

    public ComentarioModel(int IDComment, String content) {
        this.IDComment = IDComment;
        this.content = content;
    }

    public ComentarioModel(int IDP, int IDU, String content) {
    
        this.IDP = IDP;
        this.IDU = IDU;
        this.content = content;
    }

    public ComentarioModel(int parseInt, UserModel userModel, String content) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIDComment() {
        return IDComment;
    }

    public void setIDComment(int IDComment) {
        this.IDComment = IDComment;
    }

    public int getIDP() {
        return IDP;
    }

    public void setIDP(int IDP) {
        this.IDP = IDP;
    }

    public int getIDU() {
        return IDU;
    }

    public void setIDU(int IDU) {
        this.IDU = IDU;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
    
    
}
