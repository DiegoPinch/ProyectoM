/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmanejo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PERSONAL
 */
public class registroempleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form empleados
     */
    DefaultTableModel modelo = new DefaultTableModel();
    Integer fila;

    public registroempleados() {
        initComponents();
//        cargarTablas();
//        cargarTextos();
//        bloquearTextos();
//        bloquearBotones();
        
    }

//    public void bloquearTextos() {
//        jtxtCedula.setEnabled(false);
//        jtxtNombre.setEnabled(false);
//        jtxtApellido.setEnabled(false);
//        jtxtCargo.setEnabled(false);
//        jtxtFecNac.setEnabled(false);
//    }
//
//    public void desbloquearTextos() {
//        jtxtCedula.setEnabled(true);
//        jtxtNombre.setEnabled(true);
//        jtxtApellido.setEnabled(true);
//        jtxtCargo.setEnabled(true);
//       jtxtFecNac.setEnabled(true);
//    }
//
//    public void bloquearBotones() {
//        jbtnNuevo.setEnabled(true);
//        jbtnAgregar.setEnabled(false);
//        jbtnCancelar.setEnabled(false);
//        jbtnEditar.setEnabled(false);
//        jbtnSalir.setEnabled(true);
//        jbtnEliminar.setEnabled(false);
//    }
//
//    public void desbloquearBotones() {
//        jbtnNuevo.setEnabled(false);
//        jbtnAgregar.setEnabled(true);
//        jbtnCancelar.setEnabled(true);
//        jbtnEditar.setEnabled(false);
//        jbtnSalir.setEnabled(true);
//        jbtnEliminar.setEnabled(false);
//    }
//
//    public void desbloquearBotonesEditarEliminar() {
//        jbtnNuevo.setEnabled(false);
//        jbtnAgregar.setEnabled(false);
//        jbtnCancelar.setEnabled(true);
//        jbtnEditar.setEnabled(true);
//        jbtnSalir.setEnabled(true);
//        jbtnEliminar.setEnabled(true);
//    }
//
//    public void desbloquearTextosEditarEliminar() {
//        jtxtCedula.setEnabled(false);
//        jtxtNombre.setEnabled(true);
//        jtxtApellido.setEnabled(true);
//        jtxtCargo.setEnabled(true);
//        jtxtFecNac.setEnabled(true);
//    }
//
//    public void limpliartexto() {
//        jtxtCedula.setText("");
//        jtxtNombre.setText("");
//        jtxtApellido.setText("");
//        jtxtCargo.setText("");
//        jtxtFecNac.setText("");
//        
//
//    }

    public void cargarTextos() {
//        jtblTablaEmpleados.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                if (jtblTablaEmpleados.getSelectedRow() != -1) {
//                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                    fila = jtblTablaEmpleados.getSelectedRow();
//                    jtxtCedula.setText(jtblTablaEmpleados.getValueAt(fila, 0).toString());
//                    jtxtNombre.setText(jtblTablaEmpleados.getValueAt(fila, 1).toString());
//                    jtxtApellido.setText(jtblTablaEmpleados.getValueAt(fila, 2).toString());
//                    jtxtFecNac.setText(jtblTablaEmpleados.getValueAt(fila, 3).toString());
//                    jtxtCargo.setText(jtblTablaEmpleados.getValueAt(fila, 4).toString());
//                    desbloquearBotonesEditarEliminar();
//                    desbloquearTextosEditarEliminar();
//                }
//            }
//        });
    }

    public void cargarTablas() {
//        try {
//            String[] titulos = {"Cedula", "Nombre", "Apellidos", "Fecha Nacimiento", "Cargo"};
//            String[] registros = new String[5];
//            modelo = new DefaultTableModel(null, titulos);
////            Conexion cc = new Conexion();
////            Connection cn = cc.conectar();
//            String sql = "";
//            sql = "select * from empleados_emp";
//
//            Statement psd = cn.createStatement();
//            ResultSet rs = psd.executeQuery(sql);
//            while (rs.next()) {
//                registros[0] = rs.getString("CED_EMP_EP");
//                registros[1] = rs.getString("NOM_EMP_EP");
//                registros[2] = rs.getString("APE_EMP_EP");
//                registros[3] = rs.getString("FEC_NAC_EMP_EP");
//                registros[4] = rs.getString("CAR_EMP_EP");
//                modelo.addRow(registros);
//            }
//            jtblTablaEmpleados.setModel(modelo);
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//            //Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

    private void agregarDatosEtudiantes() {
//        if (jtxtCedula.getText().isEmpty() || jtxtCedula.getText() == "") {
//            JOptionPane.showMessageDialog(this, "Debe ingresar la cedula");
//            jtxtCedula.requestFocus();
//        } else if (jtxtNombre.getText().isEmpty() || jtxtNombre.getText() == "") {
//            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre");
//            jtxtNombre.requestFocus();
//        } else if (jtxtApellido.getText().isEmpty() || jtxtApellido.getText() == "") {
//            JOptionPane.showMessageDialog(this, "Debe ingresar la cedula");
//            jtxtApellido.requestFocus();
//        } else {
//            try {
//                // TODO add your handling code here:
////                Conexion cc = new Conexion();
////                Connection cn = cc.conectar();
//                String sql = "";
//                sql = "insert into empleados_emp(CED_EMP_EP, NOM_EMP_EP,"
//                        + "APE_EMP_EP,FEC_NAC_EMP_EP,CAR_EMP_EP)values(?,?,?,?,?)";
//
////                PreparedStatement psd = cn.prepareStatement(sql);
//
//                psd.setString(1, jtxtCedula.getText());
//                psd.setString(2, jtxtNombre.getText());
//                psd.setString(3, jtxtApellido.getText());
//                psd.setString(4, jtxtFecNac.getText());
//                psd.setString(5, jtxtCargo.getText());
//
//                int n = psd.executeUpdate();
//                if (n > 0) {
//                    JOptionPane.showConfirmDialog(null, "Agregado");
//                    cargarTablas();
//                    bloquearTextos();
//                    bloquearBotones();
//                    limpliartexto();
//                }
//            } catch (SQLException ex) {
//                // Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, ex);
//            }
//        }
    }

    private void actualizarDatos() {
//        
//            try {
//                Conexion cc = new Conexion();
//                Connection cn = cc.conectar();
//                String sql = "";
//
//                sql = "update empleados_emp set NOM_EMP_EP='" + jtxtNombre.getText()
//                        + "',APE_EMP_EP='" + jtxtApellido.getText()
//                        + "',FEC_NAC_EMP_EP='" + jtxtFecNac.getText()
//                        + "',CAR_EMP_EP='" + jtxtCargo.getText()
//                        + "'where CED_EMP_EP='" + jtxtCedula.getText() + "'";
//
//                PreparedStatement psd = cn.prepareStatement(sql);
//                int n = psd.executeUpdate();
//                if (n > 0) {
//                    JOptionPane.showMessageDialog(null, "Se actualizo Correctamente");
//                    cargarTablas();
//                    limpliartexto();
//                    bloquearTextos();
//                    bloquearBotones();
//                }
//            } catch (SQLException ex) {
//              JOptionPane.showMessageDialog(null, "Error: " + ex);
//            }
        
    }

    public void EliminarDatos() {
        
//            if (JOptionPane.showConfirmDialog(new JInternalFrame(), "Estas seguro de borrar el registro",
//                    "Borrar registro", JOptionPane.WARNING_MESSAGE,
//                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
//
//                try {
//                    // TODO add your handling code here:
//                    Conexion cc = new Conexion();
//                    Connection cn = cc.conectar();
//                    String sql = "";
//                    sql = "delete from empleados_emp where CED_EMP_EP='" + jtxtCedula.getText() + "'";
//                    PreparedStatement psd = cn.prepareStatement(sql);
//                    int n = psd.executeUpdate();
//                    if (n > 0) {
//                        JOptionPane.showMessageDialog(null, "Se elimino correctamente");
//                        limpliartexto();
//                        cargarTablas();
//                        //bloquearBotones();
//                        bloquearTextos();
//                    }
//
//                } catch (SQLException ex) {
//                    //Logger.getLogger(Estudiantes.class.getName()).log(Level.SEVERE, null, ex);
//                    JOptionPane.showMessageDialog(null, "Error: " + ex);
//                }
//
//            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtFecNac = new javax.swing.JTextField();
        jbtnEliminar = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();
        jbtnCancelar = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbtnAgregar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtTelefono = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRO DE EMPLEADOS");

        jLabel2.setText("CÉDULA:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("APELLIDO:");

        jLabel5.setText("CONTRASEÑA:");

        jbtnEliminar.setText("ELIMINAR");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnNuevo.setText("NUEVO");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnCancelar.setText("CANCELAR");
        jbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCancelarActionPerformed(evt);
            }
        });

        jbtnSalir.setText("SALIR");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jLabel6.setText("CARGO:");

        jbtnAgregar.setText("AGREGAR");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        jbtnEditar.setText("EDITAR");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jLabel7.setText("TELEFONO:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jtxtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jtxtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jtxtNombre))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEliminar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnCancelar)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(340, 340, 340))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnEditar)
                            .addComponent(jbtnNuevo)
                            .addComponent(jbtnSalir))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAgregar)
                            .addComponent(jbtnEliminar)
                            .addComponent(jbtnCancelar))
                        .addContainerGap())))
        );

        jScrollPane1.setViewportView(jtable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed
        // TODO add your handling code here:
        agregarDatosEtudiantes();
    }//GEN-LAST:event_jbtnAgregarActionPerformed

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
        // TODO add your handling code here:
        actualizarDatos();
    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
        EliminarDatos();
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // TODO add your handling code here:
//        desbloquearTextos();
//        desbloquearBotones();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCancelarActionPerformed
        // TODO add your handling code here:
//        limpliartexto();
//        bloquearBotones();
//        bloquearTextos();
    }//GEN-LAST:event_jbtnCancelarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registroempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroempleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JButton jbtnCancelar;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtFecNac;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtTelefono;
    // End of variables declaration//GEN-END:variables
}
