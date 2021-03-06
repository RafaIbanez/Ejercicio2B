/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
/**
 *
 * @author ribanez
 */
public class Fabricantes extends javax.swing.JFrame {

static public ResultSet r; char esNuevo = ' ';

    public Fabricantes() throws SQLException {
        initComponents();

        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url,user, pass);
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        // Statement s = connection.createStatement();
        String query = "select * from fabricantes";
        r = s.executeQuery(query);
        r.first();
        cod_fabricante.setText(r.getString("COD_FABRICANTE"));
        nombre.setText(r.getString("NOMBRE"));
        pais.setText(r.getString("PAIS"));
        
        //Desactivar campos
            cod_fabricante.setEditable(false);
            nombre.setEditable(false);
            pais.setEditable(false);
 
        this.BotonAceptar.setVisible(false);
        this.BotonCancelar.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTITULO = new javax.swing.JLabel();
        LabelCOD_FABRICANTE = new javax.swing.JLabel();
        LabelNOMBRE = new javax.swing.JLabel();
        LabelPAIS = new javax.swing.JLabel();
        cod_fabricante = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        pais = new javax.swing.JTextField();
        BotonPrimero = new javax.swing.JButton();
        BotonAnterior = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        BotonUltimo = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonSuprimir = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        BotonAceptar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACION : EJERCICIO2 (BASES)");

        LabelTITULO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelTITULO.setText("MANTENIMIENTO DE FABRICANTES");

        LabelCOD_FABRICANTE.setText("FABRICANTE");

        LabelNOMBRE.setText("NOMBRE");

        LabelPAIS.setText("PAIS");

        cod_fabricante.setEditable(false);
        cod_fabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod_fabricanteActionPerformed(evt);
            }
        });

        pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisActionPerformed(evt);
            }
        });

        BotonPrimero.setText("Primero");
        BotonPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPrimeroActionPerformed(evt);
            }
        });

        BotonAnterior.setText("Anterior");
        BotonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnteriorActionPerformed(evt);
            }
        });

        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        BotonUltimo.setText("Ultimo");
        BotonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUltimoActionPerformed(evt);
            }
        });

        BotonNuevo.setForeground(new java.awt.Color(0, 153, 204));
        BotonNuevo.setText("Nuevo");
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        BotonModificar.setForeground(new java.awt.Color(255, 153, 51));
        BotonModificar.setText("Modificar");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });

        BotonSuprimir.setForeground(new java.awt.Color(255, 0, 51));
        BotonSuprimir.setText("Suprimir");
        BotonSuprimir.setToolTipText("");
        BotonSuprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSuprimirActionPerformed(evt);
            }
        });

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonAceptar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonAceptar.setForeground(new java.awt.Color(0, 204, 102));
        BotonAceptar.setText("√");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonCancelar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonCancelar.setForeground(new java.awt.Color(255, 0, 0));
        BotonCancelar.setText("X");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelPAIS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelNOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(LabelCOD_FABRICANTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cod_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonPrimero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonSiguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonUltimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSuprimir)))
                        .addGap(33, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCancelar)
                            .addComponent(BotonAceptar))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonSalir))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(LabelTITULO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelTITULO)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCOD_FABRICANTE)
                    .addComponent(cod_fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNOMBRE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPAIS)
                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPrimero)
                    .addComponent(BotonAnterior)
                    .addComponent(BotonSiguiente)
                    .addComponent(BotonUltimo)
                    .addComponent(BotonAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonNuevo)
                    .addComponent(BotonModificar)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonSuprimir))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisActionPerformed

    private void cod_fabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod_fabricanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod_fabricanteActionPerformed

    private void BotonPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPrimeroActionPerformed
    try {
        r.first();
        cod_fabricante.setText(r.getString("COD_FABRICANTE"));
        nombre.setText(r.getString("NOMBRE"));
        pais.setText(r.getString("PAIS"));
    } catch (SQLException ex) {
        Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonPrimeroActionPerformed

    private void BotonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUltimoActionPerformed
    try {
        r.last();
        cod_fabricante.setText(r.getString("COD_FABRICANTE"));
        nombre.setText(r.getString("NOMBRE"));
        pais.setText(r.getString("PAIS"));
    } catch (SQLException ex) {
        Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonUltimoActionPerformed

    private void BotonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnteriorActionPerformed
    try {
        if (r.previous()){
            cod_fabricante.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
    }        
    }//GEN-LAST:event_BotonAnteriorActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
    try {
        if (r.next()){
            cod_fabricante.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));
        }
    } catch (SQLException ex) {
        Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        // instrucciones para insertar nuevo registro
        // hay que ocultar botones y poner nuevos ACEPTAR y CANCELAR
        this.BotonPrimero.setVisible(false);
        this.BotonAnterior.setVisible(false);
        this.BotonSiguiente.setVisible(false);
        this.BotonUltimo.setVisible(false);
        this.BotonNuevo.setVisible(false);
        this.BotonModificar.setVisible(false);
        this.BotonSuprimir.setVisible(false);
        
        this.BotonAceptar.setVisible(true);
        this.BotonCancelar.setVisible(true);
        
        //this.BotonAceptar.setEnabled(true);
        //this.BotonAceptar.setEnabled(true);
       
        // Limpiar la pantalla
        cod_fabricante.setText(""); 
        nombre.setText(""); 
        pais.setText("");
                    
        //Activar campos
            cod_fabricante.setEditable(true);
            nombre.setEditable(true);
            pais.setEditable(true);
        
        // Activar el foco
        cod_fabricante.requestFocus();
     
        // Variable control boton Aceptar
        esNuevo = 'N';    
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // hay que ocultar botones y poner nuevos ACEPTAR y CANCELAR
        this.BotonPrimero.setVisible(false);
        this.BotonAnterior.setVisible(false);
        this.BotonSiguiente.setVisible(false);
        this.BotonUltimo.setVisible(false);
        this.BotonNuevo.setVisible(false);
        this.BotonModificar.setVisible(false);
        this.BotonSuprimir.setVisible(false);
           
        this.BotonAceptar.setVisible(true);
        this.BotonCancelar.setVisible(true);
                          
        //Activar campos
            cod_fabricante.setEditable(false);
            nombre.setEditable(true);
            pais.setEditable(true);
        
        // Activar el foco
            nombre.requestFocus();
                  
        // Variable control boton Modificar
            esNuevo = 'M';  
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
    try {
        String vCod_fabricante, vNombre, vPais;
        vCod_fabricante = cod_fabricante.getText();
        vNombre = nombre.getText();
        vPais = pais.getText();
        // conectar la base de datos
        String url = "jdbc:mysql://localhost:3306/bases";
        String user = "root";
        String pass = "";
        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement s = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
      
        // Generar la instruccion de borrar
        if (esNuevo == 'B'){
        String BorraRegistro = "DELETE FROM fabricantes WHERE COD_FABRICANTE='" + vCod_fabricante + "'";
        int controlBorra = s.executeUpdate(BorraRegistro);
        // r.refreshRow(); 
        }
        // Generar la instruccion de actualizar        
        if (esNuevo == 'M'){
        String ActualizaRegistro = "update fabricantes set NOMBRE='" + vNombre + "', PAIS='" + vPais + "' WHERE COD_FABRICANTE='" + vCod_fabricante +"'";
        int controlActualiza = s.executeUpdate(ActualizaRegistro);
        r.refreshRow();
        }
        // Generar la instruccion de Nuevo Registro
        if (esNuevo == 'N'){
        String NuevoRegistro = "insert into fabricantes values ('" + vCod_fabricante + "','" + vNombre + "','" + vPais + "')";
        int controlNuevo = s.executeUpdate(NuevoRegistro);
        // r.refreshRow(); 
        }
        // Volver a refrescar la base de datos
        if (esNuevo != 'M'){
        String query = "select * from fabricantes";   
            r = s.executeQuery(query);
            r.first();
            cod_fabricante.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));
            }
    } catch (SQLException ex) {
        Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
    }
        // Volver activar los botones
            this.BotonPrimero.setVisible(true);
            this.BotonAnterior.setVisible(true);
            this.BotonSiguiente.setVisible(true);
            this.BotonUltimo.setVisible(true);
            this.BotonNuevo.setVisible(true);
            this.BotonModificar.setVisible(true);
            this.BotonSuprimir.setVisible(true);
            
            this.BotonAceptar.setVisible(false);
            this.BotonCancelar.setVisible(false);
 
        // Activar campos
            cod_fabricante.setEditable(false);
            nombre.setEditable(false);
            pais.setEditable(false);   
            
        // Variable control boton
            esNuevo = ' ';        
    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        // Volver activar los botones
            this.BotonPrimero.setVisible(true);
            this.BotonAnterior.setVisible(true);
            this.BotonSiguiente.setVisible(true);
            this.BotonUltimo.setVisible(true);
            this.BotonNuevo.setVisible(true);
            this.BotonModificar.setVisible(true);
            this.BotonSuprimir.setVisible(true);
            
            this.BotonAceptar.setVisible(false);
            this.BotonCancelar.setVisible(false);
        
        try {
            r.first();
            cod_fabricante.setText(r.getString("COD_FABRICANTE"));
            nombre.setText(r.getString("NOMBRE"));
            pais.setText(r.getString("PAIS"));
        } catch (SQLException ex) {
            Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Activar campos
            cod_fabricante.setEditable(false);
            nombre.setEditable(false);
            pais.setEditable(false);   
            
        // Variable control boton
            esNuevo = ' '; 
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonSuprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSuprimirActionPerformed
            // hay que ocultar botones y poner nuevos ACEPTAR y CANCELAR
            this.BotonPrimero.setVisible(false);
            this.BotonAnterior.setVisible(false);
            this.BotonSiguiente.setVisible(false);
            this.BotonUltimo.setVisible(false);
            this.BotonNuevo.setVisible(false);
            this.BotonModificar.setVisible(false);
            this.BotonSuprimir.setVisible(false);

            this.BotonAceptar.setVisible(true);
            this.BotonCancelar.setVisible(true);
            
        //Activar campos
            cod_fabricante.setEditable(false);
            nombre.setEditable(false);
            pais.setEditable(false);
            
        // Variable control boton Suprimir
            esNuevo = 'B';
    }//GEN-LAST:event_BotonSuprimirActionPerformed

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
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fabricantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Fabricantes().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Fabricantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonAnterior;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonPrimero;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton BotonSuprimir;
    private javax.swing.JButton BotonUltimo;
    private javax.swing.JLabel LabelCOD_FABRICANTE;
    private javax.swing.JLabel LabelNOMBRE;
    private javax.swing.JLabel LabelPAIS;
    private javax.swing.JLabel LabelTITULO;
    private javax.swing.JTextField cod_fabricante;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pais;
    // End of variables declaration//GEN-END:variables
}
