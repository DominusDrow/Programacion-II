
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox38 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jCheckBox71 = new javax.swing.JCheckBox();
        jLabel84 = new javax.swing.JLabel();
        jCheckBox72 = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jCheckBox73 = new javax.swing.JCheckBox();
        jLabel86 = new javax.swing.JLabel();
        jCheckBox74 = new javax.swing.JCheckBox();
        jLabel87 = new javax.swing.JLabel();
        jCheckBox75 = new javax.swing.JCheckBox();
        jCheckBox76 = new javax.swing.JCheckBox();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jCheckBox77 = new javax.swing.JCheckBox();
        jLabel90 = new javax.swing.JLabel();
        jCheckBox78 = new javax.swing.JCheckBox();
        jLabel91 = new javax.swing.JLabel();
        jCheckBox79 = new javax.swing.JCheckBox();
        jLabel92 = new javax.swing.JLabel();
        jCheckBox80 = new javax.swing.JCheckBox();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jCheckBox81 = new javax.swing.JCheckBox();
        jLabel95 = new javax.swing.JLabel();
        jCheckBox82 = new javax.swing.JCheckBox();
        jLabel96 = new javax.swing.JLabel();
        jCheckBox83 = new javax.swing.JCheckBox();
        jCheckBox84 = new javax.swing.JCheckBox();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jCheckBox85 = new javax.swing.JCheckBox();
        jLabel99 = new javax.swing.JLabel();
        jCheckBox86 = new javax.swing.JCheckBox();
        jLabel100 = new javax.swing.JLabel();
        jCheckBox87 = new javax.swing.JCheckBox();
        jLabel101 = new javax.swing.JLabel();
        jCheckBox88 = new javax.swing.JCheckBox();
        jLabel102 = new javax.swing.JLabel();
        jCheckBox89 = new javax.swing.JCheckBox();
        jLabel103 = new javax.swing.JLabel();
        jCheckBox90 = new javax.swing.JCheckBox();
        jLabel104 = new javax.swing.JLabel();
        jCheckBox91 = new javax.swing.JCheckBox();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jCheckBox92 = new javax.swing.JCheckBox();
        jCheckBox93 = new javax.swing.JCheckBox();
        jLabel107 = new javax.swing.JLabel();
        jCheckBox94 = new javax.swing.JCheckBox();
        jLabel108 = new javax.swing.JLabel();
        jCheckBox95 = new javax.swing.JCheckBox();
        jLabel109 = new javax.swing.JLabel();
        jCheckBox96 = new javax.swing.JCheckBox();
        jLabel110 = new javax.swing.JLabel();
        jCheckBox97 = new javax.swing.JCheckBox();
        jLabel111 = new javax.swing.JLabel();
        jCheckBox98 = new javax.swing.JCheckBox();
        jLabel112 = new javax.swing.JLabel();
        jCheckBox99 = new javax.swing.JCheckBox();
        jLabel113 = new javax.swing.JLabel();
        jCheckBox100 = new javax.swing.JCheckBox();
        jLabel114 = new javax.swing.JLabel();
        jCheckBox101 = new javax.swing.JCheckBox();
        jLabel115 = new javax.swing.JLabel();
        jCheckBox102 = new javax.swing.JCheckBox();
        jLabel116 = new javax.swing.JLabel();
        jCheckBox103 = new javax.swing.JCheckBox();
        jLabel117 = new javax.swing.JLabel();
        jCheckBox104 = new javax.swing.JCheckBox();
        jLabel118 = new javax.swing.JLabel();
        jCheckBox105 = new javax.swing.JCheckBox();
        jLabel119 = new javax.swing.JLabel();
        jCheckBox106 = new javax.swing.JCheckBox();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jCheckBox107 = new javax.swing.JCheckBox();
        jLabel124 = new javax.swing.JLabel();
        jCheckBox108 = new javax.swing.JCheckBox();
        jLabel125 = new javax.swing.JLabel();
        jCheckBox109 = new javax.swing.JCheckBox();
        jLabel126 = new javax.swing.JLabel();
        jCheckBox110 = new javax.swing.JCheckBox();
        jLabel127 = new javax.swing.JLabel();
        jCheckBox111 = new javax.swing.JCheckBox();
        jCheckBox112 = new javax.swing.JCheckBox();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jCheckBox113 = new javax.swing.JCheckBox();
        jLabel130 = new javax.swing.JLabel();
        jCheckBox114 = new javax.swing.JCheckBox();
        jLabel131 = new javax.swing.JLabel();
        jCheckBox115 = new javax.swing.JCheckBox();
        jLabel132 = new javax.swing.JLabel();
        jCheckBox116 = new javax.swing.JCheckBox();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jCheckBox117 = new javax.swing.JCheckBox();
        jLabel135 = new javax.swing.JLabel();
        jCheckBox118 = new javax.swing.JCheckBox();
        jLabel136 = new javax.swing.JLabel();
        jCheckBox119 = new javax.swing.JCheckBox();
        jCheckBox120 = new javax.swing.JCheckBox();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jCheckBox121 = new javax.swing.JCheckBox();
        jLabel139 = new javax.swing.JLabel();
        jCheckBox122 = new javax.swing.JCheckBox();
        jLabel140 = new javax.swing.JLabel();
        jCheckBox123 = new javax.swing.JCheckBox();
        jLabel141 = new javax.swing.JLabel();
        jCheckBox124 = new javax.swing.JCheckBox();
        jLabel142 = new javax.swing.JLabel();
        jCheckBox125 = new javax.swing.JCheckBox();
        jLabel143 = new javax.swing.JLabel();
        jCheckBox126 = new javax.swing.JCheckBox();
        jLabel144 = new javax.swing.JLabel();
        jCheckBox127 = new javax.swing.JCheckBox();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jCheckBox128 = new javax.swing.JCheckBox();
        jCheckBox129 = new javax.swing.JCheckBox();
        jLabel147 = new javax.swing.JLabel();
        jCheckBox130 = new javax.swing.JCheckBox();
        jLabel148 = new javax.swing.JLabel();
        jCheckBox131 = new javax.swing.JCheckBox();
        jLabel149 = new javax.swing.JLabel();
        jCheckBox132 = new javax.swing.JCheckBox();
        jLabel150 = new javax.swing.JLabel();
        jCheckBox133 = new javax.swing.JCheckBox();
        jLabel151 = new javax.swing.JLabel();
        jCheckBox134 = new javax.swing.JCheckBox();
        jLabel152 = new javax.swing.JLabel();
        jCheckBox135 = new javax.swing.JCheckBox();
        jLabel153 = new javax.swing.JLabel();
        jCheckBox136 = new javax.swing.JCheckBox();
        jLabel154 = new javax.swing.JLabel();
        jCheckBox137 = new javax.swing.JCheckBox();
        jLabel155 = new javax.swing.JLabel();
        jCheckBox138 = new javax.swing.JCheckBox();
        jLabel156 = new javax.swing.JLabel();
        jCheckBox139 = new javax.swing.JCheckBox();
        jLabel157 = new javax.swing.JLabel();
        jCheckBox140 = new javax.swing.JCheckBox();
        jLabel158 = new javax.swing.JLabel();
        jCheckBox141 = new javax.swing.JCheckBox();
        jLabel159 = new javax.swing.JLabel();
        jCheckBox142 = new javax.swing.JCheckBox();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
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

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 29)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Modificar recomendaciones");

        jPanel2.setBackground(new java.awt.Color(239, 255, 232));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Usuario con IMC de 18.5 a 24.5");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Usuario con IMC mas de 25 ");

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 0));
        jLabel8.setText("Usuario con IMC menos de 18");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setText("Debes evitar ingerir:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Se recomienda que consumas:");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setText("Se recomienda que realices: ");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setText("Debes evitar:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c240-2427880_85675.png"))); // NOI18N
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox1.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Frutas");

        jCheckBox2.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox2.setText("Verduras");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox4.setText("Granos");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox6.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox6.setText("Carne");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox7.setText("Azucar");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox8.setText("Hierbas");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox9.setText("Sodio");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox11.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox11.setText("Azucar");

        jCheckBox12.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox12.setText("Bebidas");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox13.setText("Grasas");

        jCheckBox14.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox14.setText("Alcohol");

        jCheckBox17.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox17.setText("Agua");

        jCheckBox19.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox19.setText("Cereales");

        jCheckBox22.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox22.setText("Fibra");

        jCheckBox23.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox23.setText("Cereales");

        jCheckBox24.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox24.setText("Fritura");

        jCheckBox29.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox29.setText("Embutidos");

        jCheckBox32.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox32.setText("Enlatados");

        jCheckBox33.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox33.setText("Trotar");

        jCheckBox34.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox34.setText("Sentadillas");

        jCheckBox36.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox36.setText("Abdominales");

        jCheckBox37.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox37.setText("Pesas");

        jCheckBox38.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox38.setText("Flexiones");

        jCheckBox39.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox39.setText("Cardio");

        jCheckBox40.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox40.setText("Crossfit");

        jCheckBox41.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox41.setText("Estar parado");

        jCheckBox42.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox42.setText("Estar sentado");

        jCheckBox43.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox43.setText("Dormir mucho");

        jCheckBox44.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox44.setText("Salir");

        jCheckBox45.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox45.setText("Correr");

        jCheckBox46.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox46.setText("Dormir poco");

        jCheckBox18.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox18.setText("Pan");

        jCheckBox47.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox47.setText("Yoga");

        jCheckBox48.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox48.setText("Nada");

        jCheckBox49.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox49.setText("Nadar");

        jCheckBox50.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox50.setText("Cardio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Porridge_icon-icons.com_68703.png"))); // NOI18N
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/water_drink_bottle_icon-icons.com_51087.png"))); // NOI18N
        jLabel19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/christmas_pan_47215.png"))); // NOI18N
        jLabel20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/iconfinder-food-and-restaurantnot-allowedsignalingfast-foodprohibitionforbidden-4394756_119512.png"))); // NOI18N
        jLabel22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/fast-food-icons-freecoke-soda_107427.png"))); // NOI18N
        jLabel23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/8_116658.png"))); // NOI18N
        jLabel29.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_sport_fitness_icon_133373.png"))); // NOI18N
        jLabel30.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_abs_sport_icon_133367.png"))); // NOI18N
        jLabel31.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_pushups_sport_icon_133368.png"))); // NOI18N
        jLabel32.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_fitness_sport_icon_133372.png"))); // NOI18N
        jLabel33.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        jLabel34.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2_116664.png"))); // NOI18N
        jLabel35.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11_116668.png"))); // NOI18N
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11184manshrugginglightskintone_111301.png"))); // NOI18N
        jLabel37.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492636-basicman09_81758.png"))); // NOI18N
        jLabel38.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492638-basicman01_81729.png"))); // NOI18N
        jLabel39.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3561857-bedroom-emoji-emoticon-rest-sleep-sleeping_107895.png"))); // NOI18N
        jLabel40.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Smiley-17_256_icon-icons.com_62517.png"))); // NOI18N
        jLabel41.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/logout_90894.png"))); // NOI18N
        jLabel42.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Sports_Mode_icon-icons.com_54137.png"))); // NOI18N
        jLabel43.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/swimgirl_119533.png"))); // NOI18N
        jLabel44.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        jLabel45.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel46.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel46.setText("Se recomienda que consumas:");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c240-2427880_85675.png"))); // NOI18N
        jLabel83.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox71.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox71.setText("Frutas");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        jLabel84.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox72.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox72.setText("Verduras");
        jCheckBox72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox72ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel85.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox73.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox73.setText("Cereales");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        jLabel86.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox74.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox74.setText("Granos");
        jCheckBox74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox74ActionPerformed(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        jLabel87.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox75.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox75.setText("Hierbas");
        jCheckBox75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox75ActionPerformed(evt);
            }
        });

        jCheckBox76.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox76.setText("Fibra");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Porridge_icon-icons.com_68703.png"))); // NOI18N
        jLabel88.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        jLabel89.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox77.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox77.setText("Carne");
        jCheckBox77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox77ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel90.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox78.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox78.setText("Azucar");
        jCheckBox78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox78ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/water_drink_bottle_icon-icons.com_51087.png"))); // NOI18N
        jLabel91.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox79.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox79.setText("Agua");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/christmas_pan_47215.png"))); // NOI18N
        jLabel92.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox80.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox80.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox80.setText("Pan");

        jLabel93.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel93.setText("Debes evitar ingerir:");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        jLabel94.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox81.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox81.setText("Sodio");
        jCheckBox81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox81ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel95.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox82.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox82.setText("Azucar");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/iconfinder-food-and-restaurantnot-allowedsignalingfast-foodprohibitionforbidden-4394756_119512.png"))); // NOI18N
        jLabel96.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox83.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox83.setText("Fritura");

        jCheckBox84.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox84.setText("Bebidas");
        jCheckBox84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox84ActionPerformed(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/fast-food-icons-freecoke-soda_107427.png"))); // NOI18N
        jLabel97.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel98.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox85.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox85.setText("Cereales");

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/egg-free_icon-icons.com_49231.png"))); // NOI18N
        jLabel99.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox86.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox86.setText("Grasas");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/sausage-1_icon-icons.com_63232.png"))); // NOI18N
        jLabel100.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox87.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox87.setText("Embutidos");

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Drinks-33_icon-icons.com_61965.png"))); // NOI18N
        jLabel101.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox88.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox88.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox88.setText("Alcohol");

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/pixel-pastels-littledr3ams-22_106726.png"))); // NOI18N
        jLabel102.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox89.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox89.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox89.setText("Enlatados");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/8_116658.png"))); // NOI18N
        jLabel103.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox90.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox90.setText("Trotar");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_sport_fitness_icon_133373.png"))); // NOI18N
        jLabel104.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox91.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox91.setText("Sentadillas");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_abs_sport_icon_133367.png"))); // NOI18N
        jLabel105.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_pushups_sport_icon_133368.png"))); // NOI18N
        jLabel106.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox92.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox92.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox92.setText("Flexiones");

        jCheckBox93.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox93.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox93.setText("Abdominales");

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_fitness_sport_icon_133372.png"))); // NOI18N
        jLabel107.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox94.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox94.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox94.setText("Pesas");

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        jLabel108.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox95.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox95.setText("Cardio");

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2_116664.png"))); // NOI18N
        jLabel109.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox96.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox96.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox96.setText("Crossfit");

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11_116668.png"))); // NOI18N
        jLabel110.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox97.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox97.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox97.setText("Yoga");

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11184manshrugginglightskintone_111301.png"))); // NOI18N
        jLabel111.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox98.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox98.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox98.setText("Nada");

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492636-basicman09_81758.png"))); // NOI18N
        jLabel112.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox99.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox99.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox99.setText("Estar sentado");

        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492638-basicman01_81729.png"))); // NOI18N
        jLabel113.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox100.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox100.setText("Estar parado");

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3561857-bedroom-emoji-emoticon-rest-sleep-sleeping_107895.png"))); // NOI18N
        jLabel114.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox101.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox101.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox101.setText("Dormir mucho");

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Smiley-17_256_icon-icons.com_62517.png"))); // NOI18N
        jLabel115.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox102.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox102.setText("Dormir poco");

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/logout_90894.png"))); // NOI18N
        jLabel116.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox103.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox103.setText("Salir");

        jLabel117.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/swimgirl_119533.png"))); // NOI18N
        jLabel117.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox104.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox104.setText("Correr");

        jLabel118.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Sports_Mode_icon-icons.com_54137.png"))); // NOI18N
        jLabel118.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox105.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox105.setText("Nadar");

        jLabel119.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        jLabel119.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox106.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox106.setText("Cardio");

        jLabel120.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel120.setText("Debes evitar:");

        jLabel121.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel121.setText("Se recomienda que realices: ");

        jLabel122.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel122.setText("Se recomienda que consumas:");

        jLabel123.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c240-2427880_85675.png"))); // NOI18N
        jLabel123.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox107.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox107.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox107.setText("Frutas");

        jLabel124.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        jLabel124.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox108.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox108.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox108.setText("Verduras");
        jCheckBox108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox108ActionPerformed(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel125.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox109.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox109.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox109.setText("Cereales");

        jLabel126.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        jLabel126.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox110.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox110.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox110.setText("Granos");
        jCheckBox110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox110ActionPerformed(evt);
            }
        });

        jLabel127.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        jLabel127.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox111.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox111.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox111.setText("Hierbas");
        jCheckBox111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox111ActionPerformed(evt);
            }
        });

        jCheckBox112.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox112.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox112.setText("Fibra");

        jLabel128.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Porridge_icon-icons.com_68703.png"))); // NOI18N
        jLabel128.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel129.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        jLabel129.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox113.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox113.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox113.setText("Carne");
        jCheckBox113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox113ActionPerformed(evt);
            }
        });

        jLabel130.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel130.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox114.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox114.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox114.setText("Azucar");
        jCheckBox114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox114ActionPerformed(evt);
            }
        });

        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/water_drink_bottle_icon-icons.com_51087.png"))); // NOI18N
        jLabel131.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox115.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox115.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox115.setText("Agua");

        jLabel132.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/christmas_pan_47215.png"))); // NOI18N
        jLabel132.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox116.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox116.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox116.setText("Pan");

        jLabel133.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel133.setText("Debes evitar ingerir:");

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        jLabel134.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox117.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox117.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox117.setText("Sodio");
        jCheckBox117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox117ActionPerformed(evt);
            }
        });

        jLabel135.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel135.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox118.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox118.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox118.setText("Azucar");

        jLabel136.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/iconfinder-food-and-restaurantnot-allowedsignalingfast-foodprohibitionforbidden-4394756_119512.png"))); // NOI18N
        jLabel136.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox119.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox119.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox119.setText("Fritura");

        jCheckBox120.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox120.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox120.setText("Bebidas");
        jCheckBox120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox120ActionPerformed(evt);
            }
        });

        jLabel137.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/fast-food-icons-freecoke-soda_107427.png"))); // NOI18N
        jLabel137.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel138.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/nature_121939.png"))); // NOI18N
        jLabel138.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox121.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox121.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox121.setText("Cereales");

        jLabel139.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/egg-free_icon-icons.com_49231.png"))); // NOI18N
        jLabel139.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox122.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox122.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox122.setText("Grasas");

        jLabel140.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/sausage-1_icon-icons.com_63232.png"))); // NOI18N
        jLabel140.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox123.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox123.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox123.setText("Embutidos");

        jLabel141.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Drinks-33_icon-icons.com_61965.png"))); // NOI18N
        jLabel141.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox124.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox124.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox124.setText("Alcohol");

        jLabel142.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/pixel-pastels-littledr3ams-22_106726.png"))); // NOI18N
        jLabel142.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox125.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox125.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox125.setText("Enlatados");

        jLabel143.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/8_116658.png"))); // NOI18N
        jLabel143.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox126.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox126.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox126.setText("Trotar");

        jLabel144.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_sport_fitness_icon_133373.png"))); // NOI18N
        jLabel144.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox127.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox127.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox127.setText("Sentadillas");

        jLabel145.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_abs_sport_icon_133367.png"))); // NOI18N
        jLabel145.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel146.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_pushups_sport_icon_133368.png"))); // NOI18N
        jLabel146.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox128.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox128.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox128.setText("Flexiones");

        jCheckBox129.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox129.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox129.setText("Abdominales");

        jLabel147.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_fitness_sport_icon_133372.png"))); // NOI18N
        jLabel147.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox130.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox130.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox130.setText("Pesas");

        jLabel148.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        jLabel148.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox131.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox131.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox131.setText("Cardio");

        jLabel149.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2_116664.png"))); // NOI18N
        jLabel149.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox132.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox132.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox132.setText("Crossfit");

        jLabel150.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11_116668.png"))); // NOI18N
        jLabel150.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox133.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox133.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox133.setText("Yoga");

        jLabel151.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11184manshrugginglightskintone_111301.png"))); // NOI18N
        jLabel151.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox134.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox134.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox134.setText("Nada");

        jLabel152.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492636-basicman09_81758.png"))); // NOI18N
        jLabel152.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox135.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox135.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox135.setText("Estar sentado");

        jLabel153.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492638-basicman01_81729.png"))); // NOI18N
        jLabel153.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox136.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox136.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox136.setText("Estar parado");

        jLabel154.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3561857-bedroom-emoji-emoticon-rest-sleep-sleeping_107895.png"))); // NOI18N
        jLabel154.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox137.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox137.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox137.setText("Dormir mucho");

        jLabel155.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Smiley-17_256_icon-icons.com_62517.png"))); // NOI18N
        jLabel155.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox138.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox138.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox138.setText("Dormir poco");

        jLabel156.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/logout_90894.png"))); // NOI18N
        jLabel156.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox139.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox139.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox139.setText("Salir");

        jLabel157.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/swimgirl_119533.png"))); // NOI18N
        jLabel157.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox140.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox140.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox140.setText("Correr");

        jLabel158.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Sports_Mode_icon-icons.com_54137.png"))); // NOI18N
        jLabel158.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox141.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox141.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox141.setText("Nadar");

        jLabel159.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/10_116669.png"))); // NOI18N
        jLabel159.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jCheckBox142.setBackground(new java.awt.Color(239, 255, 232));
        jCheckBox142.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox142.setText("Cardio");

        jLabel160.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel160.setText("Debes evitar:");

        jLabel161.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel161.setText("Se recomienda que realices: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox22)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox17)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jCheckBox18)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox11)
                                        .addGap(12, 12, 12)
                                        .addComponent(jCheckBox24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBox32))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel28))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel29)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel30)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel31))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jCheckBox33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox36)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox38)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox37)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox39)
                                                .addGap(14, 14, 14)
                                                .addComponent(jCheckBox40)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox47))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel38)
                                                        .addGap(72, 72, 72)
                                                        .addComponent(jLabel39)
                                                        .addGap(67, 67, 67)
                                                        .addComponent(jLabel40)
                                                        .addGap(41, 41, 41)
                                                        .addComponent(jLabel41)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel42)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel44)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel43))
                                                    .addComponent(jLabel11)))))
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox49)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox50))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jCheckBox48)
                                            .addComponent(jLabel37)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(9, 9, 9)))
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jCheckBox72)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox73)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox74)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox75)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox76)
                                        .addComponent(jLabel88))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jCheckBox77)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCheckBox78))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel89)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel90)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox79)
                                        .addComponent(jLabel91))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel92)
                                        .addComponent(jCheckBox80)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel83)
                                        .addComponent(jCheckBox71))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel84)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel85)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel86)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel87))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jCheckBox81)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox82)
                                            .addGap(12, 12, 12)
                                            .addComponent(jCheckBox83)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCheckBox84)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCheckBox85)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox86)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCheckBox87)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox88)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jCheckBox89))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel94)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel95)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel96)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel97)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel98)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel99)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel100)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel101)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel102))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(21, 21, 21)
                                            .addComponent(jLabel103)
                                            .addGap(36, 36, 36)
                                            .addComponent(jLabel104)
                                            .addGap(29, 29, 29)
                                            .addComponent(jLabel105))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jCheckBox90)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox91)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox93)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox92)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox94)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox95)
                                                    .addGap(14, 14, 14)
                                                    .addComponent(jCheckBox96)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jCheckBox97))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jLabel112)
                                                            .addGap(72, 72, 72)
                                                            .addComponent(jLabel113)
                                                            .addGap(67, 67, 67)
                                                            .addComponent(jLabel114)
                                                            .addGap(41, 41, 41)
                                                            .addComponent(jLabel115)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jLabel116)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(jLabel117)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel118))
                                                        .addComponent(jLabel120)))))
                                        .addComponent(jLabel7)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel122)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jCheckBox99)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox100)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jCheckBox101)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox102)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox103)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox104)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox105)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCheckBox106))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel106)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel107)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel108)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel109)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel110)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jCheckBox98)
                                                .addComponent(jLabel111)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel119)
                                            .addGap(9, 9, 9)))
                                    .addGap(15, 15, 15)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel46))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel93))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel121)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jCheckBox108)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jCheckBox109)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox110)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox111)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox112)
                                .addComponent(jLabel128))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox113)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox114))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel129)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel130)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox115)
                                .addComponent(jLabel131))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel132)
                                .addComponent(jCheckBox116)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel123)
                                .addComponent(jCheckBox107))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel124)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel125)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel126)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel127))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox117)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox118)
                                    .addGap(12, 12, 12)
                                    .addComponent(jCheckBox119)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox120)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox121)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox122)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox123)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox124)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCheckBox125))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel134)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel135)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel136)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel137)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel138)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel139)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel140)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel141)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel142))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel143)
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel144)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel145))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox135)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox136)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox137)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox138)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox139)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox140)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox141)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jCheckBox142))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel161)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jCheckBox126)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox127)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox129)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox128)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox130)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCheckBox131)
                                                .addGap(14, 14, 14)
                                                .addComponent(jCheckBox132)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jCheckBox133))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel152)
                                                        .addGap(72, 72, 72)
                                                        .addComponent(jLabel153)
                                                        .addGap(67, 67, 67)
                                                        .addComponent(jLabel154)
                                                        .addGap(41, 41, 41)
                                                        .addComponent(jLabel155)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel156)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel157)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel158))
                                                    .addComponent(jLabel160))))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel146)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel147)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel148)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel149)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel150)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox134)
                                        .addComponent(jLabel151)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel159)
                                    .addGap(9, 9, 9)))
                            .addGap(15, 15, 15))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel133)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel3))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel10)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox4)
                        .addComponent(jCheckBox19)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox22)
                        .addComponent(jCheckBox8)
                        .addComponent(jCheckBox6)
                        .addComponent(jCheckBox7)
                        .addComponent(jCheckBox17)
                        .addComponent(jCheckBox18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox29)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox32)))
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel30)
                        .addComponent(jLabel31)
                        .addComponent(jLabel33)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel34))
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel32)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox33)
                    .addComponent(jCheckBox34)
                    .addComponent(jCheckBox36)
                    .addComponent(jCheckBox38)
                    .addComponent(jCheckBox37)
                    .addComponent(jCheckBox39)
                    .addComponent(jCheckBox40)
                    .addComponent(jCheckBox47)
                    .addComponent(jCheckBox48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel42)
                        .addComponent(jLabel43)
                        .addComponent(jLabel44)
                        .addComponent(jLabel40))
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox42)
                    .addComponent(jCheckBox41)
                    .addComponent(jCheckBox43)
                    .addComponent(jCheckBox46)
                    .addComponent(jCheckBox44)
                    .addComponent(jCheckBox45)
                    .addComponent(jCheckBox49)
                    .addComponent(jCheckBox50))
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel83)
                        .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel86)
                        .addComponent(jLabel85)
                        .addComponent(jLabel87)
                        .addComponent(jLabel88)
                        .addComponent(jLabel89)
                        .addComponent(jLabel90)
                        .addComponent(jLabel91)
                        .addComponent(jLabel92)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox71)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox74)
                        .addComponent(jCheckBox73)
                        .addComponent(jCheckBox72)
                        .addComponent(jCheckBox76)
                        .addComponent(jCheckBox75)
                        .addComponent(jCheckBox77)
                        .addComponent(jCheckBox78)
                        .addComponent(jCheckBox79)
                        .addComponent(jCheckBox80)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95)
                            .addComponent(jLabel96)
                            .addComponent(jLabel97)
                            .addComponent(jLabel99)
                            .addComponent(jLabel100)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox83)
                            .addComponent(jCheckBox87)
                            .addComponent(jCheckBox81)
                            .addComponent(jCheckBox82)
                            .addComponent(jCheckBox84)
                            .addComponent(jCheckBox85)
                            .addComponent(jCheckBox86)
                            .addComponent(jCheckBox88)
                            .addComponent(jCheckBox89)))
                    .addComponent(jLabel98))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel104)
                        .addComponent(jLabel105)
                        .addComponent(jLabel107)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel108))
                        .addComponent(jLabel109, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel106)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox90)
                    .addComponent(jCheckBox91)
                    .addComponent(jCheckBox93)
                    .addComponent(jCheckBox92)
                    .addComponent(jCheckBox94)
                    .addComponent(jCheckBox95)
                    .addComponent(jCheckBox96)
                    .addComponent(jCheckBox97)
                    .addComponent(jCheckBox98))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112)
                            .addComponent(jLabel113)
                            .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel116)
                        .addComponent(jLabel118)
                        .addComponent(jLabel117)
                        .addComponent(jLabel114))
                    .addComponent(jLabel119))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox99)
                    .addComponent(jCheckBox100)
                    .addComponent(jCheckBox101)
                    .addComponent(jCheckBox102)
                    .addComponent(jCheckBox103)
                    .addComponent(jCheckBox104)
                    .addComponent(jCheckBox105)
                    .addComponent(jCheckBox106))
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel123)
                        .addComponent(jLabel124, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel126)
                        .addComponent(jLabel125)
                        .addComponent(jLabel127)
                        .addComponent(jLabel128)
                        .addComponent(jLabel129)
                        .addComponent(jLabel130)
                        .addComponent(jLabel131)
                        .addComponent(jLabel132)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox107)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox110)
                        .addComponent(jCheckBox109)
                        .addComponent(jCheckBox108)
                        .addComponent(jCheckBox112)
                        .addComponent(jCheckBox111)
                        .addComponent(jCheckBox113)
                        .addComponent(jCheckBox114)
                        .addComponent(jCheckBox115)
                        .addComponent(jCheckBox116)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel133)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel134)
                            .addComponent(jLabel135)
                            .addComponent(jLabel136)
                            .addComponent(jLabel137)
                            .addComponent(jLabel139)
                            .addComponent(jLabel140)
                            .addComponent(jLabel141)
                            .addComponent(jLabel142))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox119)
                            .addComponent(jCheckBox123)
                            .addComponent(jCheckBox117)
                            .addComponent(jCheckBox118)
                            .addComponent(jCheckBox120)
                            .addComponent(jCheckBox121)
                            .addComponent(jCheckBox122)
                            .addComponent(jCheckBox124)
                            .addComponent(jCheckBox125)))
                    .addComponent(jLabel138))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel144)
                        .addComponent(jLabel145)
                        .addComponent(jLabel147)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(jLabel148))
                        .addComponent(jLabel149, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel150, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel151, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel146)
                    .addComponent(jLabel143))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox126)
                    .addComponent(jCheckBox127)
                    .addComponent(jCheckBox129)
                    .addComponent(jCheckBox128)
                    .addComponent(jCheckBox130)
                    .addComponent(jCheckBox131)
                    .addComponent(jCheckBox132)
                    .addComponent(jCheckBox133)
                    .addComponent(jCheckBox134))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel160)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel152)
                            .addComponent(jLabel153)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel156)
                        .addComponent(jLabel158)
                        .addComponent(jLabel157)
                        .addComponent(jLabel154))
                    .addComponent(jLabel159))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox135)
                    .addComponent(jCheckBox136)
                    .addComponent(jCheckBox137)
                    .addComponent(jCheckBox138)
                    .addComponent(jCheckBox139)
                    .addComponent(jCheckBox140)
                    .addComponent(jCheckBox141)
                    .addComponent(jCheckBox142))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout panelDietaLayout = new javax.swing.GroupLayout(panelDieta);
        panelDieta.setLayout(panelDietaLayout);
        panelDietaLayout.setHorizontalGroup(
            panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
            .addGroup(panelDietaLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDietaLayout.setVerticalGroup(
            panelDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
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
        btnBlog.setBorderPainted(false);
        btnBlog.setFocusable(false);
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
        btnPacientes.setBorderPainted(false);
        btnPacientes.setFocusPainted(false);
        btnPacientes.setFocusable(false);
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
                        .addComponent(btnPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
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

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox72ActionPerformed

    private void jCheckBox74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox74ActionPerformed

    private void jCheckBox75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox75ActionPerformed

    private void jCheckBox77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox77ActionPerformed

    private void jCheckBox78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox78ActionPerformed

    private void jCheckBox81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox81ActionPerformed

    private void jCheckBox84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox84ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox84ActionPerformed

    private void jCheckBox108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox108ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox108ActionPerformed

    private void jCheckBox110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox110ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox110ActionPerformed

    private void jCheckBox111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox111ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox111ActionPerformed

    private void jCheckBox113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox113ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox113ActionPerformed

    private void jCheckBox114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox114ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox114ActionPerformed

    private void jCheckBox117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox117ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox117ActionPerformed

    private void jCheckBox120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox120ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox120ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBlog;
    private javax.swing.JToggleButton btnConsejos;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JToggleButton btnPacientes;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox100;
    private javax.swing.JCheckBox jCheckBox101;
    private javax.swing.JCheckBox jCheckBox102;
    private javax.swing.JCheckBox jCheckBox103;
    private javax.swing.JCheckBox jCheckBox104;
    private javax.swing.JCheckBox jCheckBox105;
    private javax.swing.JCheckBox jCheckBox106;
    private javax.swing.JCheckBox jCheckBox107;
    private javax.swing.JCheckBox jCheckBox108;
    private javax.swing.JCheckBox jCheckBox109;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox110;
    private javax.swing.JCheckBox jCheckBox111;
    private javax.swing.JCheckBox jCheckBox112;
    private javax.swing.JCheckBox jCheckBox113;
    private javax.swing.JCheckBox jCheckBox114;
    private javax.swing.JCheckBox jCheckBox115;
    private javax.swing.JCheckBox jCheckBox116;
    private javax.swing.JCheckBox jCheckBox117;
    private javax.swing.JCheckBox jCheckBox118;
    private javax.swing.JCheckBox jCheckBox119;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox120;
    private javax.swing.JCheckBox jCheckBox121;
    private javax.swing.JCheckBox jCheckBox122;
    private javax.swing.JCheckBox jCheckBox123;
    private javax.swing.JCheckBox jCheckBox124;
    private javax.swing.JCheckBox jCheckBox125;
    private javax.swing.JCheckBox jCheckBox126;
    private javax.swing.JCheckBox jCheckBox127;
    private javax.swing.JCheckBox jCheckBox128;
    private javax.swing.JCheckBox jCheckBox129;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox130;
    private javax.swing.JCheckBox jCheckBox131;
    private javax.swing.JCheckBox jCheckBox132;
    private javax.swing.JCheckBox jCheckBox133;
    private javax.swing.JCheckBox jCheckBox134;
    private javax.swing.JCheckBox jCheckBox135;
    private javax.swing.JCheckBox jCheckBox136;
    private javax.swing.JCheckBox jCheckBox137;
    private javax.swing.JCheckBox jCheckBox138;
    private javax.swing.JCheckBox jCheckBox139;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox140;
    private javax.swing.JCheckBox jCheckBox141;
    private javax.swing.JCheckBox jCheckBox142;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox84;
    private javax.swing.JCheckBox jCheckBox85;
    private javax.swing.JCheckBox jCheckBox86;
    private javax.swing.JCheckBox jCheckBox87;
    private javax.swing.JCheckBox jCheckBox88;
    private javax.swing.JCheckBox jCheckBox89;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JCheckBox jCheckBox90;
    private javax.swing.JCheckBox jCheckBox91;
    private javax.swing.JCheckBox jCheckBox92;
    private javax.swing.JCheckBox jCheckBox93;
    private javax.swing.JCheckBox jCheckBox94;
    private javax.swing.JCheckBox jCheckBox95;
    private javax.swing.JCheckBox jCheckBox96;
    private javax.swing.JCheckBox jCheckBox97;
    private javax.swing.JCheckBox jCheckBox98;
    private javax.swing.JCheckBox jCheckBox99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBlogsDoc;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPacientesDoc;
    private javax.swing.JPanel panelDieta;
    // End of variables declaration//GEN-END:variables
}
