/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.pe.bo;

import com.proyecto.pe.dao.MuebleDao;
import com.proyecto.pe.db.Conexion;
import com.proyecto.pe.entity.Mueble;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Favio
 */
public class MuebleBO {
    private String mensaje = "";
    private MuebleDao mdao = new MuebleDao();
    
     public String agregarMueble(Mueble mueble){
              Connection conn  = Conexion.getConnection();
              try {
                  mensaje = mdao.agregarMueble(conn, mueble);
                  conn.rollback();
              } catch (SQLException e) {
                  
                  mensaje = mensaje + "  "+ e.getMessage();
              }finally{
                  try {
                      if(conn != null){
                          conn.close();
                      }
                  } catch (SQLException e) {
                      mensaje = mensaje + "  "+ e.getMessage();
                      
                  }
              }
              
               return mensaje;
          }
     
      public String modificarMueble(Mueble mueble){
                        Connection conn  = Conexion.getConnection();
              try {
                  mensaje = mdao.modificarMueble(conn, mueble);
                  conn.rollback();
              } catch (SQLException e) {
                  
                  mensaje = mensaje + "  "+ e.getMessage();
              }finally{
                  try {
                      if(conn != null){
                          conn.close();
                      }
                  } catch (SQLException e) {
                      mensaje = mensaje + "  "+ e.getMessage();
                      
                  }
              }
              
               return mensaje;
              
            
          }
     public String eliminarMueble(int id){
                       Connection conn  = Conexion.getConnection();
              try {
                  mensaje = mdao.eliminarMueble(conn, id);
                  conn.rollback();
              } catch (SQLException e) {
                  
                  mensaje = mensaje + "  "+ e.getMessage();
              }finally{
                  try {
                      if(conn != null){
                          conn.close();
                      }
                  } catch (SQLException e) {
                      mensaje = mensaje + "  "+ e.getMessage();
                      
                  }
              }
              
               return mensaje;
          }   
     
        public void listarMueble(JTable tabla){
                Connection conn = Conexion.getConnection();
                  mdao.listarMueble(conn, tabla);
              try {
                  conn.close();
              } catch (SQLException ex) {
                  System.out.println(ex.getMessage());
              }
          }
       public int getMaxId(){
              Connection conn = Conexion.getConnection();
                int id =   mdao.getMaxId(conn);
              try {
                  conn.close();
              } catch (SQLException ex) {
                  System.out.println(ex.getMessage());
              }
              return id;
           }
}
