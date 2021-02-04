/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.dbconnection.controllers;

import com.pw.dbconnection.dao.AddNoticiaDAO;
import com.pw.dbconnection.models.AgregarNoticiaModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author adria
 */
@WebServlet(name = "CheckNoticias", urlPatterns = {"/CheckNoticias"})
public class CheckNoticias extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            List<AgregarNoticiaModel> newsRevisa = AddNoticiaDAO.VerNoticiasEdicion();
            request.setAttribute("NewsRevisa", newsRevisa);
        } catch (SQLException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }

        request.getRequestDispatcher("acceptpost.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
         
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        //Parte donde se inserta la noticia 
        int idnoti = Integer.parseInt(request.getParameter("id"), 10);
        String respuestita = request.getParameter("Respuesta");
        if (respuestita.equals("Rechazado") == true) {
            AgregarNoticiaModel newNews = new AgregarNoticiaModel(idnoti, "", "", "", "", "", "", "", 0);
            try {
                AddNoticiaDAO.RechazaPost(newNews);
            } catch (SQLException ex) {
                Logger.getLogger(CheckNoticias.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            AgregarNoticiaModel newNews = new AgregarNoticiaModel(idnoti, "", "", "", "", "", "", "", 0);

            try {
                AddNoticiaDAO.AceptarPost(newNews);
            } catch (SQLException ex) {
                Logger.getLogger(CheckNoticias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        //Parte donde se inserta la noticia 
        int idnoti = Integer.parseInt(request.getParameter("id"), 10);
        String respuestita = request.getParameter("Respuesta");
        if (respuestita.equals("Rechazado") == true) {
            AgregarNoticiaModel newNews = new AgregarNoticiaModel(idnoti, "", "", "", "", "", "", "", 0);
            try {
                AddNoticiaDAO.RechazaPost(newNews);
            } catch (SQLException ex) {
                Logger.getLogger(CheckNoticias.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {

            AgregarNoticiaModel newNews = new AgregarNoticiaModel(idnoti, "", "", "", "", "", "", "", 0);

            try {
                AddNoticiaDAO.AceptarPost(newNews);
            } catch (SQLException ex) {
                Logger.getLogger(CheckNoticias.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
    */
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
