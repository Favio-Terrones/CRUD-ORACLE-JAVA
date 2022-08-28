/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.pe.dao;

import com.proyecto.pe.entity.Empleado;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Favio
 */
public class EmpleadoDao {
     private String mensaje = "";
     
     public String agregarEmpleado(Connection con,Empleado emp){
         PreparedStatement pst = null;
         String sql = "INSERT INTO EMPLEADO(empleado_id,puesto_id,nombres,apellidos,dni,telefono,e_mail,direccion,fecha_nacimiento,fecha_contratacion)"
                 + "values (?,?,?,?,?,?,?,?,?,?)";
         
     try{
         pst = con.prepareStatement(sql);
         pst.setInt(1, emp.getEmpleado_ID());
         pst.setInt(2, emp.getPuesto_ID());
         pst.setString(3,emp.getNombres());
         pst.setString(4, emp.getApellidos());
         pst.setString(5, emp.getDni());
         pst.setString(6, emp.getTelefono());
         pst.setString(7, emp.getEmail());
         pst.setString(8, emp.getDireccion());
         pst.setString(9, emp.getFechaNac());
         pst.setString(10, emp.getFechaContr());
         mensaje = "Guardado Correctamente";
         pst.executeUpdate();
     }catch(SQLException e){
         mensaje = "No se guardo correctamente\n"+e.getMessage();
     }finally{
         try{
             con.close();
         }catch(SQLException ex){
             System.out.println("ERROR!"+ex.getMessage());
         }
     }
         return mensaje;
     }
     
     public String modificarEmpleado(Connection con,Empleado emp){
         PreparedStatement pst = null;
         String sql = "UPDATE EMPLEADO SET puesto_id = ? , nombres=?,apellidos=?,dni=?,telefono=?,e_mail=?,direccion=?,fecha_nacimiento=?,fecha_contratacion=?"
                 + "where empleado_id=?";
         
         try {
             pst = con.prepareStatement(sql);
             pst.setInt(1, emp.getPuesto_ID());
             pst.setString(2, emp.getNombres());
             pst.setString(3, emp.getApellidos());
             pst.setString(4, emp.getDni());
             pst.setString(5, emp.getTelefono());
             pst.setString(6, emp.getEmail());
             pst.setString(7, emp.getDireccion());
             pst.setString(8, emp.getFechaNac());
             pst.setString(9, emp.getFechaContr());
             pst.setInt(10, emp.getEmpleado_ID());
             mensaje = "Actualizado Correctamente";
             pst.executeUpdate();
         } catch (SQLException e) {
             mensaje = "No se pudo modificar correctamente"+e.getMessage();
         }
         finally{
             try {
                 con.close();
             } catch (SQLException e) {
                 System.out.println("Error"+e.getMessage());
             }
         }
       return mensaje;  
     }
     
     public String eliminarEmpleado(Connection con, int id){
         PreparedStatement pst = null;
         String sql = "DELETE from empleado where empleado_id = ? ";
         
         try{
             pst = con.prepareStatement(sql);
             pst.setInt(1, id);
             mensaje = "Borrado Correctamente";
             pst.executeUpdate();
         }catch(SQLException e){
             mensaje = "No se pudo borrar correctamente"+e.getMessage();
         }
         finally{
             try {
                 con.close();
             } catch (SQLException ex) {
                 System.out.println("Error"+ex.getMessage());
             }
         }
         return mensaje ;
     }
     
     public void listarEmpleado(Connection con, JTable tabla){
         DefaultTableModel model;
         String[] columnas = {"ID Empleado","Puesto ID","Nombres","Apellidos","DNI","Telefono","Email","Dirección","Fecha Nac","Fecha Contratación"};
         model = new DefaultTableModel(null,columnas);
         
         String sql = "select empleado_id , puesto_empleado.nombre as \"Nombre Puesto\" , nombres,apellidos,dni,telefono,e_mail,direccion,fecha_nacimiento,fecha_contratacion\n" +
"from empleado,puesto_empleado \n" +
"where empleado.puesto_id = puesto_empleado.puesto_id order by empleado_id";
         String[] filas = new String[10];
         Statement st = null;
         ResultSet rs = null;
         
         try {
             st = con.createStatement();
             rs = st.executeQuery(sql);
             while(rs.next()){
                 for(int i = 0 ; i < 10 ; i++){
                     filas[i] = rs.getString(i+1);
                 }
                 model.addRow(filas);
             }
             tabla.setModel(model);
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,"No se puede listar los datos","Error",JOptionPane.WARNING_MESSAGE);
         }
     }   
        public int getMaxId(Connection con){
               int id = 0;
               PreparedStatement pst = null;
               ResultSet rs = null;
               String sql = "select max(empleado_id)+1 as id  from empleado";
               try {
                   pst = con.prepareStatement(sql);
                   rs=pst.executeQuery();
                   if(rs.next()){
                       id = rs.getInt(1);
                   }
                   rs.close();
                   pst.close();
               } catch (SQLException e) {
                   System.out.println("Error al mostrar id"+e.getMessage());
               }
               return id;
           }  
         
         
         
     }

