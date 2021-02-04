/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.dbconnection.dao;


import com.pw.dbconnection.models.RegisterModel;
import com.pw.dbconnection.utils.DbConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adria
 */
public class RegisterUserDAO {
    public static int AgregarUsuario(RegisterModel user) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {
            
            // En el proyecto solo podran hacer uso de Store Procedures
            // No llamadas directas como esta
            // Esta linea prepara la llamada a la base de datos para insertar
            // Cada ? significa un valor a ser remplazado
            CallableStatement statement = con.prepareCall("call AgregarUsuario (?,?,?,?,?,?,?);");
            // Remplazamos el primer parametro por el nombre
            statement.setString(1, user.getRUsername());
            // El segundo por la contraseña
            statement.setString(2, user.getREmail());
            // El ultimo por la url de la imagen
            statement.setString(3, user.getRPassword());
            
            statement.setString(4, user.getRFacebook());
            
            statement.setString(5, user.getRInsta());
           
            statement.setString(6, user.getRTwitter());
            
            statement.setString(7, user.getRImage());
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
}
