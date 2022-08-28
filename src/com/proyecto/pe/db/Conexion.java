/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.pe.db;

/**
 *
 * @author Favio
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static Connection conn = null;
    private static String login = "proyectoBD";
    private static String password = "proyectoBD";
    private static String url = "jdbc:oracle:thin:@192.168.1.2:1521/xepdb1";
    
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(url,login,password);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Conectado Exitosamente");
            }else{
                System.out.println("Conexion Errónea");
            }
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Conexión Errónea "+e.getMessage());
        }
        return conn;
    }
    
    public void desconexion(){
        try{
            conn.close();
        }catch(Exception e){
            System.out.println("Error al desconectarse "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.getConnection();
    }
}
