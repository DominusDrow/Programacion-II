
package main;
    

public class Pnutriologo extends javax.swing.JPanel {
    
    private Pacientes panelUsuarios;
    private static Blog panelBlog;
    
    public Pnutriologo() {
        initComponents();
        
        //tabla de blogs
        panelBlog = new Blog();
        panelBlog.setBounds(255, 85, 745, 483);
        panelBlog.setVisible(false);
        add(panelBlog);
        
        //tabla de los pacientes
        panelUsuarios = new Pacientes();
        panelUsuarios.setBounds(255, 85, 745, 483);
        panelUsuarios.setVisible(false);
        add(panelUsuarios);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblBlogsDoc = new javax.swing.JLabel();
        lblPacientesDoc = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        panelDieta = new javax.swing.JPanel();
        btnConsejos = new javax.swing.JToggleButton();
        btnBlog = new javax.swing.JToggleButton();
        btnPacientes = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(30, 130, 28));

        jPanel1.setBackground(new java.awt.Color(30, 130, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/doctor1.png"))); // NOI18N

        lblNombreUsuario.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreUsuario.setText("Nutriologo");

        lblBlogsDoc.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblBlogsDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblBlogsDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlogsDoc.setText("Blogs:");

        lblPacientesDoc.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblPacientesDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblPacientesDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPacientesDoc.setText("Pacientes:");

        btnIngresar.setBackground(new java.awt.Color(239, 255, 232));
        btnIngresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(239, 255, 232));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/salir1.png"))); // NOI18N
        btnIngresar.setText("SALIR");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblBlogsDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblPacientesDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(btnIngresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lblBlogsDoc)
                .addGap(43, 43, 43)
                .addComponent(lblPacientesDoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addGap(55, 55, 55))
        );

        panelDieta.setBackground(new java.awt.Color(239, 255, 232));

        javax.swing.GroupLayout panelDietaLayout = new javax.swing.GroupLayout(panelDieta);
        panelDieta.setLayout(panelDietaLayout);
        panelDietaLayout.setHorizontalGroup(
            panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDietaLayout.setVerticalGroup(
            panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnConsejos.setBackground(new java.awt.Color(30, 130, 28));
        btnConsejos.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnConsejos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/tips1.png"))); // NOI18N
        btnConsejos.setSelected(true);
        btnConsejos.setText("CONSEJOS");
        btnConsejos.setBorderPainted(false);
        btnConsejos.setFocusPainted(false);
        btnConsejos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsejosActionPerformed(evt);
            }
        });

        btnBlog.setBackground(new java.awt.Color(30, 130, 28));
        btnBlog.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnBlog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/blog1.png"))); // NOI18N
        btnBlog.setText("BLOGS");
        btnBlog.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnBlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlogActionPerformed(evt);
            }
        });

        btnPacientes.setBackground(new java.awt.Color(30, 130, 28));
        btnPacientes.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/pacientes1.png"))); // NOI18N
        btnPacientes.setText("USUARIOS");
        btnPacientes.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsejos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBlog, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                    .addComponent(panelDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsejos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBlog, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        Ventana_principal.getPanelNutriologo().setVisible(false);
        Ventana_principal.getPanelLogin().setVisible(true);
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnConsejosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsejosActionPerformed
        
        panelDieta.setVisible(true);
        panelBlog.setVisible(false);
        panelUsuarios.setVisible(false);

        btnBlog.setSelected(false);
        btnPacientes.setSelected(false);

    }//GEN-LAST:event_btnConsejosActionPerformed

    private void btnBlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlogActionPerformed
        
        panelDieta.setVisible(false);
        panelBlog.setVisible(true);
        panelUsuarios.setVisible(false);
        
        btnConsejos.setSelected(false);
        btnPacientes.setSelected(false);
    }//GEN-LAST:event_btnBlogActionPerformed

    private void btnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacientesActionPerformed
        
        panelUsuarios.setVisible(true);
        panelDieta.setVisible(false);
        panelBlog.setVisible(false);
        
        btnConsejos.setSelected(false);
        btnBlog.setSelected(false);
    }//GEN-LAST:event_btnPacientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBlog;
    private javax.swing.JToggleButton btnConsejos;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JToggleButton btnPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBlogsDoc;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPacientesDoc;
    private javax.swing.JPanel panelDieta;
    // End of variables declaration//GEN-END:variables
}
