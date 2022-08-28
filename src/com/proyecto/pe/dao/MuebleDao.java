  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.pe.dao;

/**
 *
 * @author Favio
 */


import com.proyecto.pe.entity.Mueble;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MuebleDao {
    private String mensaje = "";
    
    public String agregarMueble(Connection con,Mueble mueble){
        PreparedStatement pst = null;  
      String sql = "INSERT INTO MUEBLE(mueble_id,color_id,tipo_id,modelo_id,nombre,costo,precio_venta,stock) "
              + "values (?,?,?,?,?,?,?,?)"; 
      
      try{
          pst = con.prepareStatement(sql);
          pst.setInt(1, mueble.getIdMueble());
          pst.setInt(2, mueble.getIdColor());
          pst.setInt(3, mueble.getIdTipo());
          pst.setInt(4, mueble.getIdModelo());
          pst.setString(5,mueble.getNombre());
          pst.setInt(6, mueble.getCosto());
          pst.setInt(7, mueble.getPrecioVenta());
          pst.setInt(8, mueble.getStock());
          mensaje = "Guardado Correctamente";
          pst.executeUpdate();
          
      }catch(SQLException e){
          mensaje = "No se guardo correctamente\n"+e.getMessage().toString();
      }finally{
          try{
              con.close();
          }catch(SQLException ex){
              System.out.println("ERROR!"+ex.getMessage().toString());
          }
      }
      return mensaje;
    }
    
    public String modificarMueble(Connection con, Mueble mueble){
        PreparedStatement pst = null;
        String sql = "UPDATE MUEBLE SET  color_id = ?,tipo_id = ?,modelo_id = ?,nombre = ?, costo = ?,precio_venta = ?, stock = ? where mueble_id = ?";
        
        try {
            pst = con.prepareStatement(sql);
            //pst.setInt(1,mueble.getIdModelo());
            pst.setInt(1, mueble.getIdColor());
            pst.setInt(2, mueble.getIdTipo());
            pst.setInt(3, mueble.getIdModelo());
            pst.setString(4, mueble.getNombre());
            pst.setInt(5, mueble.getCosto());
            pst.setInt(6, mueble.getPrecioVenta());
            pst.setInt(7, mueble.getStock());
            pst.setInt(8, mueble.getIdMueble());
            mensaje = "Actualizado Correctamente";
            pst.executeUpdate();
            
        }catch(SQLException e){
              mensaje = "No se pudo modificar  correctamente\n"+e.getMessage().toString();
        }
       finally{
         try{
             con.close();
         }catch(SQLException e){
             System.out.println("Error"+e.getMessage());
         } 
        }   
        return mensaje;
    }
    public String eliminarMueble(Connection con,int id){
        PreparedStatement pst = null;
        String sql = "DELETE from mueble where mueble_id = ? ";
        
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            
            mensaje = "Borrado Correctamente";
            pst.executeUpdate();
        }catch(SQLException e){
            mensaje = "No se pudo borrar correctamente\n"+e.getMessage().toString();
        }finally{
            try{
                con.close();
            }catch(SQLException ex){
                System.out.println("Error"+ex.getMessage().toString());
            }
        }
        return mensaje;
    }
    
    public void listarMueble(Connection con,JTable tabla){
        DefaultTableModel model;
        String [] columnas = {"ID Mueble","Color Id","Tipo Id","Modelo Id","Nombre","Costo","Precio Venta","Stock"};
        model = new DefaultTableModel(null,columnas);
        
        String sql = "select mueble_id , color_mueble.nombre  as color, tipo_mueble.nombre as \"Tipo Mueble\" , \n" +
"modelo_mueble.nombre as Modelo , mueble.nombre,mueble.costo,mueble.precio_venta,mueble.stock \n" +
"from mueble,color_mueble,tipo_mueble, modelo_mueble\n" +
"where mueble.color_id = color_mueble.color_id and\n" +
"mueble.tipo_id = tipo_mueble.tipo_id and\n" +
"mueble.modelo_id = modelo_mueble.modelo_id order by mueble_id";
        String[] filas = new String[8];
        Statement st = null;
        ResultSet rs = null;
        
        try{
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                for (int i = 0; i < 8; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"No se puede listar los datos");
        }
    }
    
           public int getMaxId(Connection con){
               int id = 0;
               PreparedStatement pst = null;
               ResultSet rs = null;
               String sql = "select max(mueble_id)+1 as id  from mueble";
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
