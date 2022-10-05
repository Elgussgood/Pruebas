/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */

import java.sql.*;

public class Conexion {

    public Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost/sys?useTimezone=true&serverTimezone=UTC";
            String user = "root";
            String password = "n0m3l0";

            Connection conexion = DriverManager.getConnection(url, user, password);

            return conexion;
        } catch (ClassNotFoundException e) {
            System.err.println("Error -> " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error -> " + e.getMessage());
        }

        return null;
    }
}