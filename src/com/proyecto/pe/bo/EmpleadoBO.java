/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.pe.bo;

import com.proyecto.pe.dao.EmpleadoDao;
import com.proyecto.pe.db.Conexion;
import com.proyecto.pe.entity.Empleado;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
/**
 *
 * @author Favio
 */
public class EmpleadoBO {
      private String mensaje = "";
    private EmpleadoDao edao = new EmpleadoDao();
    
     public String agregarEmpleado(Empleado empleado){
              Connection conn  = Conexion.getConnection();
              try {
                  mensaje = edao.agregarEmpleado(conn, empleado);
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
     
      public String modificarEmpleado(Empleado empleado){
                        Connection conn  = Conexion.getConnection();
              try {
                  mensaje = edao.modificarEmpleado(conn, empleado);
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
     public String eliminarEmpleado(int id){
                       Connection conn  = Conexion.getConnection();
              try {
                  mensaje = edao.eliminarEmpleado(conn, id);
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
     
        public void listarEmpleado(JTable tabla){
                Connection conn = Conexion.getConnection();
                  edao.listarEmpleado(conn, tabla);
              try {
                  conn.close();
              } catch (SQLException ex) {
                  System.out.println(ex.getMessage());
              }
          }
       public int getMaxId(){
              Connection conn = Conexion.getConnection();
                int id =   edao.getMaxId(conn);
              try {
                  conn.close();
              } catch (SQLException ex) {
                  System.out.println(ex.getMessage());
              }
              return id;
           }
}
