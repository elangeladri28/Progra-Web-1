/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.dbconnection.dao;

import com.pw.dbconnection.models.ComentarioModel;
import com.pw.dbconnection.models.LoginModel;
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
public class CommentsDAO {

    public static int AgregarComentario(ComentarioModel Comment) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {

            // En el proyecto solo podran hacer uso de Store Procedures
            // No llamadas directas como esta 
            // Esta linea prepara la llamada a la base de datos para insertar
            // Cada ? significa un valor a ser remplazado
            CallableStatement statement = con.prepareCall("call AgregarComentario(?,?,?);");
            // Remplazamos el primer parametro por el nombre
            statement.setInt(1, Comment.getIDP());
            // El segundo por la contraseña
            statement.setInt(2, Comment.getIDU());
            // El ultimo por la url de la imagen
            statement.setString(3, Comment.getContent());
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

    public static List<ComentarioModel> getCommentsByNews(int idNews) throws SQLException {
        List<ComentarioModel> commentaries = new ArrayList();
        Connection con = null;
        try {
            con = DbConnection.getConnection();
            CallableStatement statement = con.prepareCall("call getCommentsByNews(?);");

            statement.setInt(1, idNews);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                int id = result.getInt(1);
                int idPost = result.getInt(2);
                int idUser = result.getInt(3);
                String content = result.getString(4);
                
                commentaries.add(new ComentarioModel(id, idPost, idUser, content));
            }
            return commentaries;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (con != null) {
                con.close();
            }

        }
        return commentaries;

    }
}
