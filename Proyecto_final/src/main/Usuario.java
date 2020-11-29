
package main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Usuario extends javax.swing.JPanel {
    
    private static Blog panelBlog;
    private static Ejercicio panelEjercicio;
    
    
    public Usuario() {
        initComponents();
        
        //panel blog
        panelBlog = new Blog();
        panelBlog.setBounds(255, 85, 745, 483);
        panelBlog.setVisible(false);
        panelBlog.getBtnNuevaEntrada().setVisible(false);
        add(panelBlog);
        
        //panel ejercicio
        panelEjercicio = new Ejercicio();
        panelEjercicio.setBounds(255, 85, 745, 483);
        panelEjercicio.setVisible(false);
        add(panelEjercicio);
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblEdadUsuario = new javax.swing.JLabel();
        lblPesoUsuario = new javax.swing.JLabel();
        lblAlturaUsuario = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblFechaActual = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnActualizarDatos = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();
        panelDieta = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblProgesoPeso = new javax.swing.JLabel();
        lblIMC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblVEcesComer = new javax.swing.JLabel();
        btnDieta = new javax.swing.JToggleButton();
        btnBlog = new javax.swing.JToggleButton();
        btnEjercicio = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(30, 130, 28));

        jPanel1.setBackground(new java.awt.Color(30, 130, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/usuario1.png"))); // NOI18N

        lblNombreUsuario.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblEdadUsuario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblEdadUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblEdadUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEdadUsuario.setText("Edad: ");

        lblPesoUsuario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblPesoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblPesoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPesoUsuario.setText("Peso: ");

        lblAlturaUsuario.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblAlturaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblAlturaUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlturaUsuario.setText("Altura: ");

        lblFechaInicio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaInicio.setText("Inicio: ");

        lblFechaActual.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblFechaActual.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechaActual.setText("Dias: ");

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

        btnActualizarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/actualizar1.png"))); // NOI18N
        btnActualizarDatos.setText("Actualizar datos");
        btnActualizarDatos.setBorderPainted(false);
        btnActualizarDatos.setContentAreaFilled(false);
        btnActualizarDatos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnActualizarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDatosActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/eliminar1.png"))); // NOI18N
        btnEliminarCuenta.setText("Eliminar cuenta");
        btnEliminarCuenta.setBorderPainted(false);
        btnEliminarCuenta.setContentAreaFilled(false);
        btnEliminarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblEdadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblPesoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnIngresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAlturaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnActualizarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEdadUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPesoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlturaUsuario)
                .addGap(32, 32, 32)
                .addComponent(lblFechaInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFechaActual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addContainerGap())
        );

        panelDieta.setBackground(new java.awt.Color(239, 255, 232));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Se recomienda que consumas:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("veces al dia");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setText("Debes de comer ");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setText("Total calorias p/d:");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setText("Debes evitar ingerir:");

        lblProgesoPeso.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblProgesoPeso.setText("Peso Perdido:");

        lblIMC.setFont(new java.awt.Font("Verdana", 1, 29)); // NOI18N
        lblIMC.setForeground(new java.awt.Color(0, 102, 0));
        lblIMC.setText("IMC");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c240-2427880_85675.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Porridge_icon-icons.com_68703.png"))); // NOI18N
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/water_drink_bottle_icon-icons.com_51087.png"))); // NOI18N
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/christmas_pan_47215.png"))); // NOI18N
        jLabel19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/iconfinder-food-and-restaurantnot-allowedsignalingfast-foodprohibitionforbidden-4394756_119512.png"))); // NOI18N
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/fast-food-icons-freecoke-soda_107427.png"))); // NOI18N
        jLabel23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/egg-free_icon-icons.com_49231.png"))); // NOI18N
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/sausage-1_icon-icons.com_63232.png"))); // NOI18N
        jLabel26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Drinks-33_icon-icons.com_61965.png"))); // NOI18N
        jLabel27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/pixel-pastels-littledr3ams-22_106726.png"))); // NOI18N
        jLabel28.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblVEcesComer.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblVEcesComer.setText("Veces");

        javax.swing.GroupLayout panelDietaLayout = new javax.swing.GroupLayout(panelDieta);
        panelDieta.setLayout(panelDietaLayout);
        panelDietaLayout.setHorizontalGroup(
            panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDietaLayout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(lblIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDietaLayout.createSequentialGroup()
                        .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDietaLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel17)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel18)
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel19))
                                .addGroup(panelDietaLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDietaLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(17, 17, 17)
                                            .addComponent(lblVEcesComer)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel4))
                                        .addComponent(jLabel3))))
                            .addGroup(panelDietaLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDietaLayout.createSequentialGroup()
                        .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(panelDietaLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)))
                        .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDietaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDietaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProgesoPeso)
                                .addGap(85, 85, 85))))))
        );
        panelDietaLayout.setVerticalGroup(
            panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(lblVEcesComer))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblProgesoPeso))
                .addGap(59, 59, 59))
        );

        btnDieta.setBackground(new java.awt.Color(30, 130, 28));
        btnDieta.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/dieta1.png"))); // NOI18N
        btnDieta.setSelected(true);
        btnDieta.setText("DIETA");
        btnDieta.setBorderPainted(false);
        btnDieta.setFocusPainted(false);
        btnDieta.setFocusable(false);
        btnDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDietaActionPerformed(evt);
            }
        });

        btnBlog.setBackground(new java.awt.Color(30, 130, 28));
        btnBlog.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnBlog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/blog1.png"))); // NOI18N
        btnBlog.setText("BLOGS");
        btnBlog.setBorderPainted(false);
        btnBlog.setFocusPainted(false);
        btnBlog.setFocusable(false);
        btnBlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlogActionPerformed(evt);
            }
        });

        btnEjercicio.setBackground(new java.awt.Color(30, 130, 28));
        btnEjercicio.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnEjercicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/ejercicio1.png"))); // NOI18N
        btnEjercicio.setText("EJERCICIO");
        btnEjercicio.setBorderPainted(false);
        btnEjercicio.setFocusPainted(false);
        btnEjercicio.setFocusable(false);
        btnEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercicioActionPerformed(evt);
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
                    .addComponent(panelDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBlog, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBlog, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        Ventana_principal.getPanelUsuario().setVisible(false);
        Ventana_principal.getPanelLogin().setVisible(true);
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercicioActionPerformed
        
        panelDieta.setVisible(false);
        panelBlog.setVisible(false);
        panelEjercicio.setVisible(true);
        
        btnDieta.setSelected(false);
        btnBlog.setSelected(false);
    }//GEN-LAST:event_btnEjercicioActionPerformed

    private void btnBlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlogActionPerformed
        
        panelDieta.setVisible(false);
        panelBlog.setVisible(true);
        panelEjercicio.setVisible(false);

        btnDieta.setSelected(false);
        btnEjercicio.setSelected(false);
    }//GEN-LAST:event_btnBlogActionPerformed

    private void btnDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDietaActionPerformed
        
        panelDieta.setVisible(true);
        panelBlog.setVisible(false);
        panelEjercicio.setVisible(false);

        btnBlog.setSelected(false);
        btnEjercicio.setSelected(false);
        
    }//GEN-LAST:event_btnDietaActionPerformed

    private void btnActualizarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDatosActionPerformed

         Ventana_principal.getPanelUsuario().setVisible(false);
        Ventana_principal.getPanelActualizar().setVisible(true);
    }//GEN-LAST:event_btnActualizarDatosActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
    	 int i=JOptionPane.showConfirmDialog(null, "¿Desea eliminar su cuenta?",
                 "OK_CANCEL_OPTION", JOptionPane.OK_CANCEL_OPTION,
                 JOptionPane.INFORMATION_MESSAGE);
    	 if(i==0){//si elije aceptar
    		 Ventana_principal.getRegistro().eliminaCuenta(Ventana_principal.getPaciente()); 
                 
                Ventana_principal.getPanelUsuario().setVisible(false);
                Ventana_principal.getPanelLogin().setVisible(true);
    	 }
    		 
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    public JLabel getLblAlturaUsuario() {
        return lblAlturaUsuario;
    }

    public JLabel getLblEdadUsuario() {
        return lblEdadUsuario;
    }

    public JLabel getLblFechaActual() {
        return lblFechaActual;
    }

    public JLabel getLblFechaInicio() {
        return lblFechaInicio;
    }

    public JLabel getLblIMC() {
        return lblIMC;
    }

    public JLabel getLblNombreUsuario() {
        return lblNombreUsuario;
    }

    public JLabel getLblPesoUsuario() {
        return lblPesoUsuario;
    }

    public JLabel getLblProgesoPeso() {
        return lblProgesoPeso;
    }

    public JLabel getLblVEcesComer() {
        return lblVEcesComer;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JToggleButton btnBlog;
    private javax.swing.JToggleButton btnDieta;
    private javax.swing.JToggleButton btnEjercicio;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlturaUsuario;
    private javax.swing.JLabel lblEdadUsuario;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPesoUsuario;
    private javax.swing.JLabel lblProgesoPeso;
    private javax.swing.JLabel lblVEcesComer;
    private javax.swing.JPanel panelDieta;
    // End of variables declaration//GEN-END:variables
}
