/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.pe.view;


import com.proyecto.pe.bo.MuebleBO;
import com.proyecto.pe.entity.Mueble;
import javax.swing.JOptionPane;

/**
 *
 * @author Favio
 */
public class FrmMueble extends javax.swing.JFrame {

    /**
     * Creates new form FrmEmpleado
     */
    private MuebleBO mbo = new MuebleBO();
    
    public FrmMueble() {
        initComponents();
        listarMueble();
        idMax();
        setTitle("CRUD-MUEBLE");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void listarMueble(){
         mbo.listarMueble(tbMueble); 
    }
    public void idMax(){
        txtIDMueble.setText(mbo.getMaxId()+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupEstado = new javax.swing.ButtonGroup();
        groupGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtColorID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIDMueble = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtModeloID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreMueble = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMueble = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btn_FrmEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BioMueble", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 0, 14), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario Mueble");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 840, -1));

        txtColorID.setBackground(new java.awt.Color(255, 255, 255));
        txtColorID.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtColorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, -1));

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Color ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        txtIDMueble.setBackground(new java.awt.Color(255, 255, 255));
        txtIDMueble.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtIDMueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, -1));

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 40, -1));

        txtTipoID.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoID.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtTipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, -1));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Modelo ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        txtModeloID.setBackground(new java.awt.Color(255, 255, 255));
        txtModeloID.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtModeloID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 130, -1));

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Nombre");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        txtNombreMueble.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreMueble.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtNombreMueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, -1));

        tbMueble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbMueble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMuebleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMueble);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 660, 250));

        btnAgregar.setBackground(new java.awt.Color(0, 134, 190));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 80, 30));

        btnModificar.setBackground(new java.awt.Color(0, 134, 190));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 80, 30));

        btnEliminar.setBackground(new java.awt.Color(0, 134, 190));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 80, 30));

        btnLimpiar.setBackground(new java.awt.Color(0, 134, 190));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 80, 30));

        btnRetroceder.setBackground(new java.awt.Color(0, 134, 190));
        btnRetroceder.setForeground(new java.awt.Color(255, 255, 255));
        btnRetroceder.setText("Retroceder");
        btnRetroceder.setBorder(null);
        btnRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 80, 30));

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Costo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtCosto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 130, -1));

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Precio Venta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        txtPrecioVenta.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioVenta.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 130, -1));

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Stock");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 130, -1));

        btn_FrmEmpleado.setBackground(new java.awt.Color(0, 134, 150));
        btn_FrmEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btn_FrmEmpleado.setText("Abrir Frm-Empleado");
        btn_FrmEmpleado.setBorder(null);
        btn_FrmEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FrmEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_FrmEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
        FrmInicio vistaInicio = new FrmInicio();
        vistaInicio.setVisible(true);
        vistaInicio.setLocationRelativeTo(null);
        vistaInicio.setTitle("BioMueble.SAC");
        vistaInicio.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
          limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(txtIDMueble.getText().isEmpty() || txtColorID.getText().isEmpty() || txtTipoID.getText().isEmpty() || 
                txtModeloID.getText().isEmpty() || txtNombreMueble.getText().isEmpty()|| txtCosto.getText().isEmpty()
                ||txtPrecioVenta.getText().isEmpty()||txtStock.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            
        
            
             Mueble mueble = new Mueble();
             mueble.setIdMueble(Integer.parseInt(txtIDMueble.getText()));
             mueble.setIdColor(Integer.parseInt(txtColorID.getText()));
             mueble.setIdTipo(Integer.parseInt(txtTipoID.getText()));
             mueble.setIdModelo(Integer.parseInt(txtModeloID.getText()));
             mueble.setNombre(txtNombreMueble.getText());
             mueble.setCosto(Integer.parseInt(txtCosto.getText()));
             mueble.setPrecioVenta(Integer.parseInt(txtPrecioVenta.getText()));
             mueble.setStock(Integer.parseInt(txtStock.getText()));
             
           
            String mensaje = mbo.agregarMueble(mueble);
            JOptionPane.showMessageDialog(null,mensaje);
            limpiar();
            listarMueble();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
           if(txtIDMueble.getText().isEmpty() || txtColorID.getText().isEmpty() || txtTipoID.getText().isEmpty() || 
                txtModeloID.getText().isEmpty() || txtNombreMueble.getText().isEmpty()
                   ||txtCosto.getText().isEmpty()||txtPrecioVenta.getText().isEmpty()||
                   txtStock.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
            
      
            
            Mueble mueble = new Mueble();
             mueble.setIdMueble(Integer.parseInt(txtIDMueble.getText()));
             mueble.setIdColor(Integer.parseInt(txtColorID.getText()));
             mueble.setIdTipo(Integer.parseInt(txtTipoID.getText()));
             mueble.setIdModelo(Integer.parseInt(txtModeloID.getText()));
             mueble.setNombre(txtNombreMueble.getText());
             mueble.setCosto(Integer.parseInt(txtCosto.getText()));
             mueble.setPrecioVenta(Integer.parseInt(txtPrecioVenta.getText()));
             mueble.setStock(Integer.parseInt(txtStock.getText()));
            String mensaje = mbo.modificarMueble(mueble);
            JOptionPane.showMessageDialog(null,mensaje);
            limpiar();
            listarMueble();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
              if(txtIDMueble.getText().isEmpty() || txtColorID.getText().isEmpty() || txtTipoID.getText().isEmpty() || 
                txtModeloID.getText().isEmpty() || txtNombreMueble.getText().isEmpty()
                      ||txtCosto.getText().isEmpty()||txtPrecioVenta.getText().isEmpty()
                      ||txtStock.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{

            String mensaje = mbo.eliminarMueble(Integer.parseInt(txtIDMueble.getText()));
            JOptionPane.showMessageDialog(null,mensaje);
            limpiar();
            listarMueble();
                }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbMuebleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMuebleMouseClicked
        // TODO add your handling code here:
        int seleccion = tbMueble.rowAtPoint(evt.getPoint());
        txtIDMueble.setText(tbMueble.getValueAt(seleccion, 0)+"");
        txtColorID.setText(tbMueble.getValueAt(seleccion, 1)+"");
        txtTipoID.setText(tbMueble.getValueAt(seleccion, 2)+"");
        txtModeloID.setText(tbMueble.getValueAt(seleccion, 3)+"");
        txtNombreMueble.setText(tbMueble.getValueAt(seleccion, 4)+"");
        txtCosto.setText(tbMueble.getValueAt(seleccion, 5)+"");
        txtPrecioVenta.setText(tbMueble.getValueAt(seleccion,6)+"");
        txtStock.setText(tbMueble.getValueAt(seleccion,7)+"");
    }//GEN-LAST:event_tbMuebleMouseClicked

    private void btn_FrmEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FrmEmpleadoActionPerformed
        // TODO add your handling code here:
        FrmEmpleado vista = new FrmEmpleado();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.setResizable(false);
        vista.setTitle("CRUD-Empleado");
        this.setVisible(false);
    }//GEN-LAST:event_btn_FrmEmpleadoActionPerformed

    public void limpiar(){
        txtIDMueble.setText("");
        txtColorID.setText("");
        txtTipoID.setText("");
        txtModeloID.setText("");
        txtNombreMueble.setText("");
        txtCosto.setText("");
        txtPrecioVenta.setText("");
        txtStock.setText("");
        idMax();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMueble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMueble().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JButton btn_FrmEmpleado;
    private javax.swing.ButtonGroup groupEstado;
    private javax.swing.ButtonGroup groupGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbMueble;
    private javax.swing.JTextField txtColorID;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtIDMueble;
    private javax.swing.JTextField txtModeloID;
    private javax.swing.JTextField txtNombreMueble;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipoID;
    // End of variables declaration//GEN-END:variables
}
