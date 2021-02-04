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
public class AgregarNoticiaModel {
        private int ID;
    private String Titulo;
    private String Descrip;
    private String sport;
    private String Img1;
    private String Img2;
    private String Img3;
    private String Video;
    private int Estado;

    public AgregarNoticiaModel(int ID, String Titulo, String Descrip, String sport, String Img1, String Img2, String Img3, String Video, int Estado) {
        this.ID = ID;
        this.Titulo = Titulo;
        this.Descrip = Descrip;
        this.sport = sport;
        this.Img1 = Img1;
        this.Img2 = Img2;
        this.Img3 = Img3;
        this.Video = Video;
        this.Estado = Estado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

  
    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescrip() {
        return Descrip;
    }

    public void setDescrip(String Descrip) {
        this.Descrip = Descrip;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getImg1() {
        return Img1;
    }

    public void setImg1(String Img1) {
        this.Img1 = Img1;
    }

    public String getImg2() {
        return Img2;
    }

    public void setImg2(String Img2) {
        this.Img2 = Img2;
    }

    public String getImg3() {
        return Img3;
    }

    public void setImg3(String Img3) {
        this.Img3 = Img3;
    }

    public String getVideo() {
        return Video;
    }

    public void setVideo(String Video) {
        this.Video = Video;
    }
    
    
}
