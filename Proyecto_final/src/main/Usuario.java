
package main;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Usuario extends javax.swing.JPanel {
    
    private static Blog panelBlog;
    private Ejercicio panelEjercicio;
    
    
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
        
        //iniciar las etiquetas:
        lblFrutas.setVisible(false);
        lblVerduras.setVisible(false);
         lblAgua.setVisible(false);
        lblAlcohol.setVisible(false);
         lblCarne.setVisible(false);
         lblCereales.setVisible(false);
         lblCerealesE.setVisible(false);
         lblDulce.setVisible(false);
         lblDulceE.setVisible(false);
         lblEmbutidos.setVisible(false);
         lblEnlatados.setVisible(false);
         lblFibra.setVisible(false);
      lblFritura.setVisible(false);
        lblFrutas.setVisible(false);
     lblGranos.setVisible(false);
     lblGrasas.setVisible(false);
     lblHierba.setVisible(false);
     lblPan.setVisible(false);
      lblRefresco.setVisible(false);
       lblSodio.setVisible(false);
     lblVerduras.setVisible(false);
        
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
        lblFrutas = new javax.swing.JLabel();
        lblVerduras = new javax.swing.JLabel();
        lblCereales = new javax.swing.JLabel();
        lblGranos = new javax.swing.JLabel();
        lblHierba = new javax.swing.JLabel();
        lblFibra = new javax.swing.JLabel();
        lblCarne = new javax.swing.JLabel();
        lblDulce = new javax.swing.JLabel();
        lblAgua = new javax.swing.JLabel();
        lblPan = new javax.swing.JLabel();
        lblSodio = new javax.swing.JLabel();
        lblDulceE = new javax.swing.JLabel();
        lblFritura = new javax.swing.JLabel();
        lblRefresco = new javax.swing.JLabel();
        lblCerealesE = new javax.swing.JLabel();
        lblGrasas = new javax.swing.JLabel();
        lblEmbutidos = new javax.swing.JLabel();
        lblAlcohol = new javax.swing.JLabel();
        lblEnlatados = new javax.swing.JLabel();
        lblVEcesComer = new javax.swing.JLabel();
        lblCaloriasR = new javax.swing.JLabel();
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

        lblFrutas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFrutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c240-2427880_85675.png"))); // NOI18N
        lblFrutas.setToolTipText("");
        lblFrutas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblVerduras.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVerduras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        lblVerduras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCereales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCereales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        lblCereales.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblGranos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGranos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        lblGranos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblHierba.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHierba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        lblHierba.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblFibra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFibra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Porridge_icon-icons.com_68703.png"))); // NOI18N
        lblFibra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCarne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        lblCarne.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblDulce.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDulce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        lblDulce.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblAgua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAgua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/water_drink_bottle_icon-icons.com_51087.png"))); // NOI18N
        lblAgua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblPan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/christmas_pan_47215.png"))); // NOI18N
        lblPan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblSodio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSodio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        lblSodio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblDulceE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDulceE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        lblDulceE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblFritura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFritura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/iconfinder-food-and-restaurantnot-allowedsignalingfast-foodprohibitionforbidden-4394756_119512.png"))); // NOI18N
        lblFritura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblRefresco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRefresco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/fast-food-icons-freecoke-soda_107427.png"))); // NOI18N
        lblRefresco.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblCerealesE.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCerealesE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        lblCerealesE.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblGrasas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGrasas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/egg-free_icon-icons.com_49231.png"))); // NOI18N
        lblGrasas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblEmbutidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmbutidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/sausage-1_icon-icons.com_63232.png"))); // NOI18N
        lblEmbutidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblAlcohol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAlcohol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Drinks-33_icon-icons.com_61965.png"))); // NOI18N
        lblAlcohol.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblEnlatados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEnlatados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/pixel-pastels-littledr3ams-22_106726.png"))); // NOI18N
        lblEnlatados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblVEcesComer.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblVEcesComer.setText("Veces");

        lblCaloriasR.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblCaloriasR.setText("calorias");

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
                                    .addComponent(lblFrutas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblVerduras)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCereales)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblGranos)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblHierba)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblFibra)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblCarne)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblDulce)
                                    .addGap(12, 12, 12)
                                    .addComponent(lblAgua)
                                    .addGap(12, 12, 12)
                                    .addComponent(lblPan))
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
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(panelDietaLayout.createSequentialGroup()
                        .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(panelDietaLayout.createSequentialGroup()
                                .addComponent(lblSodio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDulceE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFritura)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDietaLayout.createSequentialGroup()
                                .addComponent(lblRefresco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCerealesE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblGrasas)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmbutidos)
                                .addGap(18, 18, 18)
                                .addComponent(lblAlcohol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEnlatados))
                            .addGroup(panelDietaLayout.createSequentialGroup()
                                .addComponent(lblCaloriasR)
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
                        .addComponent(lblFrutas)
                        .addComponent(lblVerduras, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblGranos)
                        .addComponent(lblCereales)
                        .addComponent(lblHierba)
                        .addComponent(lblFibra)
                        .addComponent(lblCarne)
                        .addComponent(lblDulce)
                        .addComponent(lblAgua)
                        .addComponent(lblPan)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSodio)
                    .addComponent(lblDulceE)
                    .addComponent(lblFritura)
                    .addComponent(lblRefresco)
                    .addComponent(lblGrasas)
                    .addComponent(lblEmbutidos)
                    .addComponent(lblAlcohol)
                    .addComponent(lblEnlatados)
                    .addComponent(lblCerealesE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblProgesoPeso)
                    .addComponent(lblCaloriasR))
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
                        .addComponent(btnEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public JPanel getPanelDieta() {
        return panelDieta;
    }

    public JLabel getLblAlcohol() {
        return lblAlcohol;
    }

    public JLabel getLblCaloriasR() {
        return lblCaloriasR;
    }

    public JLabel getLblCarne() {
        return lblCarne;
    }

    public JLabel getLblCereales() {
        return lblCereales;
    }

    public JLabel getLblCerealesE() {
        return lblCerealesE;
    }

    public JLabel getLblDulce() {
        return lblDulce;
    }

    public JLabel getLblDulceE() {
        return lblDulceE;
    }

    public JLabel getLblEmbutidos() {
        return lblEmbutidos;
    }

    public JLabel getLblEnlatados() {
        return lblEnlatados;
    }

    public JLabel getLblFibra() {
        return lblFibra;
    }

    public JLabel getLblFritura() {
        return lblFritura;
    }

    public JLabel getLblFrutas() {
        return lblFrutas;
    }

    public JLabel getLblGranos() {
        return lblGranos;
    }

    public JLabel getLblGrasas() {
        return lblGrasas;
    }

    public JLabel getLblHierba() {
        return lblHierba;
    }

    public JLabel getLblPan() {
        return lblPan;
    }

    public JLabel getLblRefresco() {
        return lblRefresco;
    }

    public JLabel getLblSodio() {
        return lblSodio;
    }

    public JLabel getLblVerduras() {
        return lblVerduras;
    }

    public JLabel getLblAgua() {
        return lblAgua;
    }

    public Ejercicio getPanelEjercicio() {
        return panelEjercicio;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarDatos;
    private javax.swing.JToggleButton btnBlog;
    private javax.swing.JToggleButton btnDieta;
    private javax.swing.JToggleButton btnEjercicio;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAgua;
    private javax.swing.JLabel lblAlcohol;
    private javax.swing.JLabel lblAlturaUsuario;
    private javax.swing.JLabel lblCaloriasR;
    private javax.swing.JLabel lblCarne;
    private javax.swing.JLabel lblCereales;
    private javax.swing.JLabel lblCerealesE;
    private javax.swing.JLabel lblDulce;
    private javax.swing.JLabel lblDulceE;
    private javax.swing.JLabel lblEdadUsuario;
    private javax.swing.JLabel lblEmbutidos;
    private javax.swing.JLabel lblEnlatados;
    private javax.swing.JLabel lblFechaActual;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblFibra;
    private javax.swing.JLabel lblFritura;
    private javax.swing.JLabel lblFrutas;
    private javax.swing.JLabel lblGranos;
    private javax.swing.JLabel lblGrasas;
    private javax.swing.JLabel lblHierba;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPan;
    private javax.swing.JLabel lblPesoUsuario;
    private javax.swing.JLabel lblProgesoPeso;
    private javax.swing.JLabel lblRefresco;
    private javax.swing.JLabel lblSodio;
    private javax.swing.JLabel lblVEcesComer;
    private javax.swing.JLabel lblVerduras;
    private javax.swing.JPanel panelDieta;
    // End of variables declaration//GEN-END:variables
}
