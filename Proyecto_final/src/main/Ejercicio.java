
package main;

import javax.swing.JLabel;


public class Ejercicio extends javax.swing.JPanel {

 
    public Ejercicio() {
        initComponents();
        
        lblMensajeMotivacional.setVisible(false);
        
        lblAbdominales.setVisible(false);
        lblCardio.setVisible(false);
        lblCorrer.setVisible(false);
        lblCrossFit.setVisible(false);
        lblDormido.setVisible(false);
        lblFlexiones.setVisible(false);
        lblMEsfuerzo.setVisible(false);
        lblNada.setVisible(false);
        lblNadar.setVisible(false);
        lblNoDormido.setVisible(false);
        lblParado.setVisible(false);
        lblPesas.setVisible(false);
        lblSalir.setVisible(false);
        lblSentadillas.setVisible(false);
        lblSentado.setVisible(false);
        lblTrotar.setVisible(false);
        lblYoga.setVisible(false);
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lblEstadoFisico = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        RbtnHoyEjercicio = new javax.swing.JRadioButton();
        lblMensajeMotivacional = new javax.swing.JLabel();
        lblTrotar = new javax.swing.JLabel();
        lblSentadillas = new javax.swing.JLabel();
        lblAbdominales = new javax.swing.JLabel();
        lblFlexiones = new javax.swing.JLabel();
        lblPesas = new javax.swing.JLabel();
        lblCrossFit = new javax.swing.JLabel();
        lblCardio = new javax.swing.JLabel();
        lblYoga = new javax.swing.JLabel();
        lblNada = new javax.swing.JLabel();
        lblSentado = new javax.swing.JLabel();
        lblParado = new javax.swing.JLabel();
        lblDormido = new javax.swing.JLabel();
        lblNoDormido = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        lblNadar = new javax.swing.JLabel();
        lblCorrer = new javax.swing.JLabel();
        lblMEsfuerzo = new javax.swing.JLabel();
        lblVecesEjercicio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(239, 255, 232));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Tu estado fisico es:");

        lblEstadoFisico.setFont(new java.awt.Font("Verdana", 1, 29)); // NOI18N
        lblEstadoFisico.setForeground(new java.awt.Color(0, 102, 0));
        lblEstadoFisico.setText("peso normal");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Debes hacer ejercicio ");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("veces por semana");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Se recomienda que realices: ");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setText("Debes evitar:");

        RbtnHoyEjercicio.setBackground(new java.awt.Color(239, 255, 232));
        RbtnHoyEjercicio.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        RbtnHoyEjercicio.setText("Hoy hice ejercicio");
        RbtnHoyEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnHoyEjercicioActionPerformed(evt);
            }
        });

        lblMensajeMotivacional.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblMensajeMotivacional.setForeground(new java.awt.Color(147, 11, 36));
        lblMensajeMotivacional.setText("Sigue Esforzandote!!!!!!!");

        lblTrotar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTrotar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/8_116658.png"))); // NOI18N
        lblTrotar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblSentadillas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSentadillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_sport_fitness_icon_133373.png"))); // NOI18N
        lblSentadillas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblAbdominales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAbdominales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_abs_sport_icon_133367.png"))); // NOI18N
        lblAbdominales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblFlexiones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFlexiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_pushups_sport_icon_133368.png"))); // NOI18N
        lblFlexiones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblPesas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_fitness_sport_icon_133372.png"))); // NOI18N
        lblPesas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCrossFit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCrossFit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        lblCrossFit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCardio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCardio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2_116664.png"))); // NOI18N
        lblCardio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblYoga.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblYoga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11_116668.png"))); // NOI18N
        lblYoga.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblNada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11184manshrugginglightskintone_111301.png"))); // NOI18N
        lblNada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblSentado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSentado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492636-basicman09_81758.png"))); // NOI18N
        lblSentado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblParado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblParado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492638-basicman01_81729.png"))); // NOI18N
        lblParado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblDormido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDormido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3561857-bedroom-emoji-emoticon-rest-sleep-sleeping_107895.png"))); // NOI18N
        lblDormido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblNoDormido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNoDormido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Smiley-17_256_icon-icons.com_62517.png"))); // NOI18N
        lblNoDormido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/logout_90894.png"))); // NOI18N
        lblSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblNadar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNadar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/swimgirl_119533.png"))); // NOI18N
        lblNadar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCorrer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCorrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Sports_Mode_icon-icons.com_54137.png"))); // NOI18N
        lblCorrer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblMEsfuerzo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMEsfuerzo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        lblMEsfuerzo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblVecesEjercicio.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblVecesEjercicio.setText("Veces");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblTrotar)
                                .addGap(36, 36, 36)
                                .addComponent(lblSentadillas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSentado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblParado))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAbdominales)
                                    .addComponent(lblDormido))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lblNoDormido)
                                        .addGap(36, 36, 36)
                                        .addComponent(lblSalir)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNadar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblFlexiones)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addComponent(lblPesas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblCrossFit)
                                        .addGap(28, 28, 28)
                                        .addComponent(lblCardio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblYoga))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblVecesEjercicio)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMEsfuerzo)
                            .addComponent(lblNada)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RbtnHoyEjercicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCorrer)
                                .addGap(2, 2, 2))
                            .addComponent(lblMensajeMotivacional, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEstadoFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstadoFisico))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(lblVecesEjercicio))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSentadillas)
                        .addComponent(lblAbdominales)
                        .addComponent(lblPesas)
                        .addComponent(lblNada, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblYoga)
                            .addComponent(lblCardio)
                            .addComponent(lblCrossFit)))
                    .addComponent(lblFlexiones)
                    .addComponent(lblTrotar))
                .addGap(53, 53, 53)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSentado)
                            .addComponent(lblParado)
                            .addComponent(lblNoDormido, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCorrer, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNadar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDormido, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblMEsfuerzo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RbtnHoyEjercicio)
                    .addComponent(lblMensajeMotivacional))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RbtnHoyEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnHoyEjercicioActionPerformed
        lblMensajeMotivacional.setVisible(true);
    }//GEN-LAST:event_RbtnHoyEjercicioActionPerformed

    public JLabel getLblAbdominales() {
        return lblAbdominales;
    }

    public JLabel getLblCardio() {
        return lblCardio;
    }

    public JLabel getLblCorrer() {
        return lblCorrer;
    }

    public JLabel getLblCrossFit() {
        return lblCrossFit;
    }

    public JLabel getLblDormido() {
        return lblDormido;
    }

    public JLabel getLblEstadoFisico() {
        return lblEstadoFisico;
    }

    public JLabel getLblFlexiones() {
        return lblFlexiones;
    }

    public JLabel getLblMEsfuerzo() {
        return lblMEsfuerzo;
    }

    public JLabel getLblNada() {
        return lblNada;
    }

    public JLabel getLblNadar() {
        return lblNadar;
    }

    public JLabel getLblNoDormido() {
        return lblNoDormido;
    }

    public JLabel getLblParado() {
        return lblParado;
    }

    public JLabel getLblPesas() {
        return lblPesas;
    }

    public JLabel getLblSalir() {
        return lblSalir;
    }

    public JLabel getLblSentadillas() {
        return lblSentadillas;
    }

    public JLabel getLblSentado() {
        return lblSentado;
    }

    public JLabel getLblTrotar() {
        return lblTrotar;
    }

    public JLabel getLblVecesEjercicio() {
        return lblVecesEjercicio;
    }

    public JLabel getLblYoga() {
        return lblYoga;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RbtnHoyEjercicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAbdominales;
    private javax.swing.JLabel lblCardio;
    private javax.swing.JLabel lblCorrer;
    private javax.swing.JLabel lblCrossFit;
    private javax.swing.JLabel lblDormido;
    private javax.swing.JLabel lblEstadoFisico;
    private javax.swing.JLabel lblFlexiones;
    private javax.swing.JLabel lblMEsfuerzo;
    private javax.swing.JLabel lblMensajeMotivacional;
    private javax.swing.JLabel lblNada;
    private javax.swing.JLabel lblNadar;
    private javax.swing.JLabel lblNoDormido;
    private javax.swing.JLabel lblParado;
    private javax.swing.JLabel lblPesas;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblSentadillas;
    private javax.swing.JLabel lblSentado;
    private javax.swing.JLabel lblTrotar;
    private javax.swing.JLabel lblVecesEjercicio;
    private javax.swing.JLabel lblYoga;
    // End of variables declaration//GEN-END:variables
}
