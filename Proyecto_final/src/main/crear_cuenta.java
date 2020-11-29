/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author DominusDrow
 */
public class crear_cuenta extends javax.swing.JPanel {

    /**
     * Creates new form crear_cuenta
     */
    public crear_cuenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEdad_Usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombre_UsuarioR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPesp_Usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPesp_Usuario1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtContraseniaUsuarioRC = new javax.swing.JPasswordField();
        txtContraseniaUsuarioR = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 255, 232));

        jPanel2.setBackground(new java.awt.Color(30, 130, 28));

        lbltitulo.setFont(new java.awt.Font("Vrinda", 1, 36)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("REGISTRO:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña: ");

        txtEdad_Usuario.setBackground(new java.awt.Color(30, 130, 28));
        txtEdad_Usuario.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        txtEdad_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdad_UsuarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(239, 255, 232));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(239, 255, 232));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/registrar.png"))); // NOI18N
        jButton1.setText("Registar");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edad: ");

        txtNombre_UsuarioR.setBackground(new java.awt.Color(30, 130, 28));
        txtNombre_UsuarioR.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        txtNombre_UsuarioR.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre_UsuarioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_UsuarioRActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Peso: ");

        txtPesp_Usuario.setBackground(new java.awt.Color(30, 130, 28));
        txtPesp_Usuario.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        txtPesp_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txtPesp_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesp_UsuarioActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estatura: ");

        txtPesp_Usuario1.setBackground(new java.awt.Color(30, 130, 28));
        txtPesp_Usuario1.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        txtPesp_Usuario1.setForeground(new java.awt.Color(255, 255, 255));
        txtPesp_Usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesp_Usuario1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Confirmar: ");

        txtContraseniaUsuarioRC.setBackground(new java.awt.Color(30, 130, 28));
        txtContraseniaUsuarioRC.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseniaUsuarioRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaUsuarioRCActionPerformed(evt);
            }
        });

        txtContraseniaUsuarioR.setBackground(new java.awt.Color(30, 130, 28));
        txtContraseniaUsuarioR.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseniaUsuarioR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaUsuarioRActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("anios");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("kg");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("cm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbltitulo)
                            .addComponent(jLabel2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseniaUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContraseniaUsuarioRC))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtEdad_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPesp_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPesp_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton1)))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(157, Short.MAX_VALUE)
                    .addComponent(txtNombre_UsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPesp_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPesp_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtContraseniaUsuarioRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addComponent(txtContraseniaUsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addComponent(txtNombre_UsuarioR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(383, Short.MAX_VALUE)))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/manzana.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/arroz.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/aguacate.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/huevo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEdad_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdad_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdad_UsuarioActionPerformed

    private void txtNombre_UsuarioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_UsuarioRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_UsuarioRActionPerformed

    private void txtPesp_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesp_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesp_UsuarioActionPerformed

    private void txtPesp_Usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesp_Usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesp_Usuario1ActionPerformed

    private void txtContraseniaUsuarioRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaUsuarioRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaUsuarioRCActionPerformed

    private void txtContraseniaUsuarioRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaUsuarioRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaUsuarioRActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean p=Ventana_principal.getRegistro().Validar_registro(new String(txtContraseniaUsuarioR.getPassword()), new String(txtContraseniaUsuarioRC.getPassword()), 
        		txtNombre_UsuarioR.getText(),txtEdad_Usuario.getText(), txtPesp_Usuario1.getText(),txtPesp_Usuario.getText());
        if(p) {
        	Ventana_principal.getRegistro().Usuario_nuevo(txtNombre_UsuarioR.getText(), Integer.parseInt(txtEdad_Usuario.getText()),
        			Double.parseDouble(txtPesp_Usuario1.getText()),Double.parseDouble(txtPesp_Usuario1.getText()),new String(txtContraseniaUsuarioRC.getPassword()));
        	Ventana_principal.getPanelRegistrar().setVisible(false);
            Ventana_principal.getPanelLogin().setVisible(true);
        }else {
        	JOptionPane.showMessageDialog(null, "Registro incorrecto.\nRevisa que todos los campos esten correctos.");
        }
        
        txtContraseniaUsuarioR.setText("");
        txtContraseniaUsuarioRC.setText("");
        txtNombre_UsuarioR.setText("");
        txtEdad_Usuario.setText("");
        txtPesp_Usuario1.setText("");
        txtPesp_Usuario.setText("");
        
        
       
        //:: poner una validacion
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPasswordField txtContraseniaUsuarioR;
    private javax.swing.JPasswordField txtContraseniaUsuarioRC;
    private javax.swing.JTextField txtEdad_Usuario;
    private javax.swing.JTextField txtNombre_UsuarioR;
    private javax.swing.JTextField txtPesp_Usuario;
    private javax.swing.JTextField txtPesp_Usuario1;
    // End of variables declaration//GEN-END:variables
}
