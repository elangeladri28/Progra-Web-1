/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.dbconnection.dao;

import com.pw.dbconnection.models.AgregarNoticiaModel;
import com.pw.dbconnection.utils.DbConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adria
 */
public class AddNoticiaDAO {

    public static int AgregarNoticia(AgregarNoticiaModel Noticia) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {

            // En el proyecto solo podran hacer uso de Store Procedures
            // No llamadas directas como esta
            // Esta linea prepara la llamada a la base de datos para insertar
            // Cada ? significa un valor a ser remplazado
            CallableStatement statement = con.prepareCall("call AgregarNoticia(?,?,?,?,?,?,?);");
            // Remplazamos el primer parametro por el nombre
            statement.setString(1, Noticia.getTitulo());
            // El segundo por la contraseña
            statement.setString(2, Noticia.getDescrip());
            // El ultimo por la url de la imagen
            statement.setString(3, Noticia.getSport());

            statement.setString(4, Noticia.getImg1());

            statement.setString(5, Noticia.getImg2());

            statement.setString(6, Noticia.getImg3());

            statement.setString(7, Noticia.getVideo());
            // Ejecuta el Statement y retorna cuantos registros
            // fueron actualizados

            return statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return 0;
    }

    public static List<AgregarNoticiaModel> VerNoticiasEdicion() throws SQLException {
        List<AgregarNoticiaModel> news = new ArrayList<>();

        Connection con = null;
        try {
            con = DbConnection.getConnection();
            String sql = "call VerNoticiaEdicion;";
            CallableStatement statement = con.prepareCall(sql);

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt(1);
                String title = result.getString(2);
                String descripcion = result.getString(3);

                news.add(new AgregarNoticiaModel(id, title, descripcion, "", "", "", "", "", 0));

            }
            return news;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddNoticiaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return news;

    }

    public static List<AgregarNoticiaModel> NoticiasAceptadas() throws SQLException {
        List<AgregarNoticiaModel> news = new ArrayList<>();

        Connection con = null;
        try {
            con = DbConnection.getConnection();
            String sql = "call VerNoticias;";
            CallableStatement statement = con.prepareCall(sql);

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt(1);
                String title = result.getString(2);
                String descripcion = result.getString(3);
                String sport = result.getString(4);
                String img1 = result.getString(5);
                news.add(new AgregarNoticiaModel(id, title, descripcion, sport, img1, "", "", "", 0));

            }
            return news;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddNoticiaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return news;

    }

    public static AgregarNoticiaModel NoticiaEspecifica(int idNews) {

        Connection con = null;
        try {
            con = DbConnection.getConnection();
            String sql = "call NoticiaEspecifica(?);";
            CallableStatement statement = con.prepareCall(sql);

            statement.setInt(1, idNews);

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt(1);
                String title = result.getString(2);
                String descripcion = result.getString(3);
                String sport = result.getString(4);
                String img1 = result.getString(5);
                String img2 = result.getString(6);
                String img3 = result.getString(7);
                return new AgregarNoticiaModel(id, title, descripcion, sport, img1, img2, img3, "", 0);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddNoticiaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;

    }

    public static int AceptarPost(AgregarNoticiaModel Noticia) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {

            // En el proyecto solo podran hacer uso de Store Procedures
            // No llamadas directas como esta
            // Esta linea prepara la llamada a la base de datos para insertar
            // Cada ? significa un valor a ser remplazado
            CallableStatement statement = con.prepareCall("call NoticiaAceptada(?);");
            // Remplazamos el primer parametro por el nombre
            statement.setInt(1, Noticia.getID());
            // El segundo por la contraseña

            return statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return 0;
    }

    public static int RechazaPost(AgregarNoticiaModel Noticia) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {

            // En el proyecto solo podran hacer uso de Store Procedures
            // No llamadas directas como esta
            // Esta linea prepara la llamada a la base de datos para insertar
            // Cada ? significa un valor a ser remplazado
            CallableStatement statement = con.prepareCall("call NoticiaRechazada(?);");
            // Remplazamos el primer parametro por el nombre
            statement.setInt(1, Noticia.getID());
            // El segundo por la contraseña

            return statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return 0;
    }

    public static List<AgregarNoticiaModel> NoticiasFavs() throws SQLException {
        List<AgregarNoticiaModel> news = new ArrayList<>();

        Connection con = null;
        try {
            con = DbConnection.getConnection();
            String sql = "call NoticiasFavs;";
            CallableStatement statement = con.prepareCall(sql);

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt(1);
                String title = result.getString(2);
                String descripcion = result.getString(3);

                news.add(new AgregarNoticiaModel(id, title, descripcion, "", "", "", "", "", 0));

            }
            return news;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddNoticiaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return news;

    }

    public static List<AgregarNoticiaModel> NoticiasFavoritas(AgregarNoticiaModel newNews) throws SQLException {
        List<AgregarNoticiaModel> news = new ArrayList<>();

        Connection con = null;
        try {
            con = DbConnection.getConnection();
            String sql = "call NoticiasFavs;";
            CallableStatement statement = con.prepareCall(sql);

            ResultSet result = statement.executeQuery();
            while (result.next()) {

                int id = result.getInt(1);
                String title = result.getString(2);
                String descripcion = result.getString(3);

                news.add(new AgregarNoticiaModel(id, title, descripcion, "", "", "", "", "", 0));

            }
            return news;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddNoticiaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        return news;

}
