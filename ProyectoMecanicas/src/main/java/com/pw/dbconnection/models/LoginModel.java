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
public class LoginModel {
    
   private String userName;
    private String password;
    private String Imagen;
    private String Tipo;
private int UserID;
    public LoginModel(int UserID) {
        this.UserID = UserID;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public LoginModel(String userName, String password, String Imagen, String Tipo,int UserID) {
        this.UserID = UserID;
        this.userName = userName;
        this.password = password;
        this.Imagen = Imagen;
        this.Tipo = Tipo;
    }

  

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }
    

   

    public LoginModel(String userName) {
        this.userName = userName;
    }
    
    
}
