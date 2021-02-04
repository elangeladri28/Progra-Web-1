/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pw.dbconnection.dao;

import com.pw.dbconnection.models.LoginModel;
import com.pw.dbconnection.utils.DbConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author magoc
 */
public class LoginUserDAO {

    // Query de creacion de Tabla
    /**
     * CREATE TABLE `user` ( `idUser` INT NOT NULL AUTO_INCREMENT, `nameUser`
     * VARCHAR(45) NULL, `password` VARCHAR(45) NULL, `urlImage` VARCHAR(255)
     * NULL, PRIMARY KEY (`idUser`));
     *
     */
    /**
     * Inserta un usuario en la base de datos
     *
     * @param user
     * @return
     */
    public static LoginModel getUsers(LoginModel login) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {

            CallableStatement statement = con.prepareCall("call InicioSesion(?,?);");

            statement.setString(1, login.getUserName());

            statement.setString(2, login.getPassword());

            ResultSet resultSet = statement.executeQuery();
            // Si el resultSet tiene resultados lo recorremos
            while (resultSet.next()) {
                // Obtenemos el valor del result set en base al nombre de la
                // columna
                String name = resultSet.getString("Username");
                // Agregamos el usuario a la lista
                String foto = resultSet.getString("Image");
                
                String tipo = resultSet.getString("Tipo");
                
                
                Integer ID = resultSet.getInt("Id_User");
                
                
                return new LoginModel(name,"",foto,tipo, ID);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return null;
    }
    
    
    public static LoginModel tenerIDuser(LoginModel login) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {

            CallableStatement statement = con.prepareCall("call tenerIDusuario(?,?);");

            statement.setString(1, login.getUserName());

            statement.setString(2, login.getPassword());

            ResultSet resultSet = statement.executeQuery();
            // Si el resultSet tiene resultados lo recorremos
            while (resultSet.next()) {
                // Obtenemos el valor del result set en base al nombre de la
                // columna
                String ID = resultSet.getString("Username");
                
                
                return new LoginModel(ID);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return null;
    }
    
     public static LoginModel getIDUser(int idUser) throws SQLException {
        Connection con = DbConnection.getConnection();
        try {

            CallableStatement statement = con.prepareCall("call getIDUser(?,?);");

            statement.setInt(1,idUser);

            ResultSet resultSet = statement.executeQuery();
            // Si el resultSet tiene resultados lo recorremos
            while (resultSet.next()) {
                // Obtenemos el valor del result set en base al nombre de la
                // columna
                String ID = resultSet.getString("Username");
                
                
                return new LoginModel(ID);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.close();
        }
        return null;
    }
}

