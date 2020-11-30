
package main;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import objetos.Paciente;
import objetos.Persona;


public class Ingresar extends javax.swing.JPanel {

    
    public Ingresar() {
       
        
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre_Usuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnNuevaCuenta = new javax.swing.JButton();
        txtContraseniaUsuario = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 255, 232));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/hoja1 (2).png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(30, 130, 28));

        lbltitulo.setFont(new java.awt.Font("Vrinda", 1, 36)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("INGRESO:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña: ");

        txtNombre_Usuario.setBackground(new java.awt.Color(30, 130, 28));
        txtNombre_Usuario.setFont(new java.awt.Font("Verdana", 2, 18)); // NOI18N
        txtNombre_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_UsuarioActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(239, 255, 232));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(239, 255, 232));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/entrar2.png"))); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setToolTipText("");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnNuevaCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/add.png"))); // NOI18N
        btnNuevaCuenta.setText("Crear Cuenta");
        btnNuevaCuenta.setBorderPainted(false);
        btnNuevaCuenta.setContentAreaFilled(false);
        btnNuevaCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCuentaActionPerformed(evt);
            }
        });

        txtContraseniaUsuario.setBackground(new java.awt.Color(30, 130, 28));
        txtContraseniaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseniaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitulo)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtContraseniaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNuevaCuenta)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addGap(161, 161, 161))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContraseniaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnIngresar)
                .addGap(30, 30, 30)
                .addComponent(btnNuevaCuenta)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/planta1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel4)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombre_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre_UsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
          
            if(btnNuevaCuenta.isVisible()){
                
                Ventana_principal.setPaciente(Ventana_principal.getRegistro().Validar_usuarioYcontrasenia(txtNombre_Usuario.getText(), new String(txtContraseniaUsuario.getPassword())));
                
                if(Ventana_principal.getPaciente()!=null){
                    Ventana_principal.getPanelLogin().setVisible(false);
                    Ventana_principal.getPanelUsuario().setVisible(true);
                    
                    Ventana_principal.getPanelUsuario().getLblNombreUsuario().setText(Ventana_principal.getPaciente().getNombre());
                    Ventana_principal.getPanelUsuario().getLblEdadUsuario().setText(""+Ventana_principal.getPaciente().getEdad()+" anios.");
                    Ventana_principal.getPanelUsuario().getLblPesoUsuario().setText(""+Ventana_principal.getPaciente().getPeso()+" kg.");
                    Ventana_principal.getPanelUsuario().getLblAlturaUsuario().setText(""+Ventana_principal.getPaciente().getEstatura()+" cm."); 
                    Ventana_principal.getPanelUsuario().getLblFechaInicio().setText("Inicio: "+Ventana_principal.getPaciente().getInicio());
                    Ventana_principal.getPanelUsuario().getLblFechaActual().setText(""+Ventana_principal.getPaciente().getDias()+" Dias.");
                    Ventana_principal.getPanelUsuario().getLblCaloriasR().setText(""+Ventana_principal.getRegistro().getNutriologo().CalculCalo(Ventana_principal.getPaciente().getPeso(), Ventana_principal.getPaciente().getEstatura(), Ventana_principal.getPaciente().getEdad())+" kcal.");
                    Ventana_principal.getPanelUsuario().getLblIMC().setText("Tu IMC: "+Ventana_principal.getPaciente().getIMC());
                    Ventana_principal.getPanelUsuario().getLblVEcesComer().setText(""+Ventana_principal.getRegistro().getNutriologo().ComerDia(Ventana_principal.getPaciente().getIMC()));
                    if(Ventana_principal.getPaciente().getPesoPerdido()<0) {
                    	Ventana_principal.getPanelUsuario().getLblProgesoPeso().setText("<html><center>Haz ganado: "+Math.abs(Ventana_principal.getPaciente().getPesoPerdido())+" kg");
                    }else {
                    	Ventana_principal.getPanelUsuario().getLblProgesoPeso().setText("<html><center>"+Ventana_principal.getPaciente().msgHumano());
                    }
                    Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblVecesEjercicio().setText(""+Ventana_principal.getRegistro().getNutriologo().EjercicioDia(Ventana_principal.getPaciente().getIMC()));
                    Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblEstadoFisico().setText(Ventana_principal.getRegistro().getNutriologo().VerEstado(Ventana_principal.getPaciente().getIMC()));
                }else
                    JOptionPane.showMessageDialog(null, "Ingreso incorrecto \n Revise sus cambios.");

            }else{
                
                Ventana_principal.getPanelNutriologo().getLblNombreNutriologo().setText("Dr."+Ventana_principal.getRegistro().getNutriologo().getNombre());
                Ventana_principal.getPanelNutriologo().getLblNumPacientes().setText("Pacientes: "+Ventana_principal.getRegistro().getUsuarios().size());
                
                if(Ventana_principal.getRegistro().Valida_nutriologo(txtNombre_Usuario.getText(),new String(txtContraseniaUsuario.getPassword()))){
                    Ventana_principal.getPanelLogin().setVisible(false);
                    Ventana_principal.getPanelNutriologo().setVisible(true);
                }else
                    JOptionPane.showMessageDialog(null, "Ingreso incorrecto \n Revise sus cambios.");
            }     
        
            
      
            
        txtNombre_Usuario.setText("");
        txtContraseniaUsuario.setText("");
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCuentaActionPerformed
        
        Ventana_principal.getPanelLogin().setVisible(false);
        Ventana_principal.getPanelRegistrar().setVisible(true);        
    }//GEN-LAST:event_btnNuevaCuentaActionPerformed

    private void txtContraseniaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaUsuarioActionPerformed
    
    
    public JButton getBotonCuenta(){
        return btnNuevaCuenta;
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnNuevaCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPasswordField txtContraseniaUsuario;
    private javax.swing.JTextField txtNombre_Usuario;
    // End of variables declaration//GEN-END:variables
}
