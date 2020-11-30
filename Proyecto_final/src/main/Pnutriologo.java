
package main;
    
import javax.swing.JLabel;
import javax.swing.JTable;


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
        lblNombreNutriologo = new javax.swing.JLabel();
        lblBlogsDoc = new javax.swing.JLabel();
        lblNumPacientes = new javax.swing.JLabel();
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
        Frutas18 = new javax.swing.JCheckBox();
        Verduras18 = new javax.swing.JCheckBox();
        Granos18 = new javax.swing.JCheckBox();
        Carne18 = new javax.swing.JCheckBox();
        Hierbas18 = new javax.swing.JCheckBox();
        Sodio18 = new javax.swing.JCheckBox();
        Azucar18 = new javax.swing.JCheckBox();
        Grasas18 = new javax.swing.JCheckBox();
        Alcohol18 = new javax.swing.JCheckBox();
        Agua18 = new javax.swing.JCheckBox();
        Frituras18 = new javax.swing.JCheckBox();
        Embutidos18 = new javax.swing.JCheckBox();
        Trotar18 = new javax.swing.JCheckBox();
        Sentadillas18 = new javax.swing.JCheckBox();
        Abdominales18 = new javax.swing.JCheckBox();
        Pesas18 = new javax.swing.JCheckBox();
        Flexiones18 = new javax.swing.JCheckBox();
        CrossFit18 = new javax.swing.JCheckBox();
        Parado18 = new javax.swing.JCheckBox();
        Sentado18 = new javax.swing.JCheckBox();
        Dormido18 = new javax.swing.JCheckBox();
        NoDormido = new javax.swing.JCheckBox();
        Pan18 = new javax.swing.JCheckBox();
        Yoga18 = new javax.swing.JCheckBox();
        Nadar18 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        Sodio20 = new javax.swing.JCheckBox();
        Hierba20 = new javax.swing.JCheckBox();
        Carne20 = new javax.swing.JCheckBox();
        Granos20 = new javax.swing.JCheckBox();
        Verduras20 = new javax.swing.JCheckBox();
        Frutas20 = new javax.swing.JCheckBox();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        Embutidos20 = new javax.swing.JCheckBox();
        Fritura20 = new javax.swing.JCheckBox();
        Agua20 = new javax.swing.JCheckBox();
        Alcohol20 = new javax.swing.JCheckBox();
        Grasas20 = new javax.swing.JCheckBox();
        Azucar20 = new javax.swing.JCheckBox();
        Abdominales20 = new javax.swing.JCheckBox();
        Sentadillas20 = new javax.swing.JCheckBox();
        Trotar20 = new javax.swing.JCheckBox();
        Parado20 = new javax.swing.JCheckBox();
        CrossFit20 = new javax.swing.JCheckBox();
        Flexiones20 = new javax.swing.JCheckBox();
        Pesas20 = new javax.swing.JCheckBox();
        NoDormido20 = new javax.swing.JCheckBox();
        Dormido20 = new javax.swing.JCheckBox();
        Sentado20 = new javax.swing.JCheckBox();
        jLabel52 = new javax.swing.JLabel();
        Nadar20 = new javax.swing.JCheckBox();
        Yoga20 = new javax.swing.JCheckBox();
        Pan20 = new javax.swing.JCheckBox();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        Granos25 = new javax.swing.JCheckBox();
        Carne25 = new javax.swing.JCheckBox();
        Hierbas25 = new javax.swing.JCheckBox();
        Sodio25 = new javax.swing.JCheckBox();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        Fruta25 = new javax.swing.JCheckBox();
        Verduras25 = new javax.swing.JCheckBox();
        Alcohol25 = new javax.swing.JCheckBox();
        Agua25 = new javax.swing.JCheckBox();
        Fritura25 = new javax.swing.JCheckBox();
        Embutidos25 = new javax.swing.JCheckBox();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        Trotar25 = new javax.swing.JCheckBox();
        Sentadillas25 = new javax.swing.JCheckBox();
        Abdominales25 = new javax.swing.JCheckBox();
        Azucar25 = new javax.swing.JCheckBox();
        Grasas25 = new javax.swing.JCheckBox();
        NoDormido25 = new javax.swing.JCheckBox();
        Pesas25 = new javax.swing.JCheckBox();
        Flexiones25 = new javax.swing.JCheckBox();
        CrossFit25 = new javax.swing.JCheckBox();
        Parado25 = new javax.swing.JCheckBox();
        Pan25 = new javax.swing.JCheckBox();
        Yoga25 = new javax.swing.JCheckBox();
        Nadar25 = new javax.swing.JCheckBox();
        jLabel81 = new javax.swing.JLabel();
        Sentado25 = new javax.swing.JCheckBox();
        Dormido25 = new javax.swing.JCheckBox();
        jLabel82 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        btnConsejos = new javax.swing.JToggleButton();
        btnBlog = new javax.swing.JToggleButton();
        btnPacientes = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(30, 130, 28));

        jPanel1.setBackground(new java.awt.Color(30, 130, 28));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/doctor1.png"))); // NOI18N

        lblNombreNutriologo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lblNombreNutriologo.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreNutriologo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreNutriologo.setText("Nutriologo");

        lblBlogsDoc.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblBlogsDoc.setForeground(new java.awt.Color(255, 255, 255));
        lblBlogsDoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBlogsDoc.setText("Blogs:");

        lblNumPacientes.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblNumPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lblNumPacientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumPacientes.setText("Pacientes:");

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
                .addComponent(lblNumPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreNutriologo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(lblNombreNutriologo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lblBlogsDoc)
                .addGap(43, 43, 43)
                .addComponent(lblNumPacientes)
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

        Frutas18.setBackground(new java.awt.Color(239, 255, 232));
        Frutas18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Frutas18.setText("Frutas");
        Frutas18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Frutas18ActionPerformed(evt);
            }
        });

        Verduras18.setBackground(new java.awt.Color(239, 255, 232));
        Verduras18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Verduras18.setText("Verduras");
        Verduras18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verduras18ActionPerformed(evt);
            }
        });

        Granos18.setBackground(new java.awt.Color(239, 255, 232));
        Granos18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Granos18.setText("Granos");
        Granos18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Granos18ActionPerformed(evt);
            }
        });

        Carne18.setBackground(new java.awt.Color(239, 255, 232));
        Carne18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Carne18.setText("Carne");
        Carne18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carne18ActionPerformed(evt);
            }
        });

        Hierbas18.setBackground(new java.awt.Color(239, 255, 232));
        Hierbas18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hierbas18.setText("Hierbas");
        Hierbas18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hierbas18ActionPerformed(evt);
            }
        });

        Sodio18.setBackground(new java.awt.Color(239, 255, 232));
        Sodio18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sodio18.setText("Sodio");
        Sodio18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sodio18ActionPerformed(evt);
            }
        });

        Azucar18.setBackground(new java.awt.Color(239, 255, 232));
        Azucar18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Azucar18.setText("Azucar");
        Azucar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Azucar18ActionPerformed(evt);
            }
        });

        Grasas18.setBackground(new java.awt.Color(239, 255, 232));
        Grasas18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Grasas18.setText("Grasas");
        Grasas18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grasas18ActionPerformed(evt);
            }
        });

        Alcohol18.setBackground(new java.awt.Color(239, 255, 232));
        Alcohol18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Alcohol18.setText("Alcohol");
        Alcohol18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alcohol18ActionPerformed(evt);
            }
        });

        Agua18.setBackground(new java.awt.Color(239, 255, 232));
        Agua18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Agua18.setText("Agua");
        Agua18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agua18ActionPerformed(evt);
            }
        });

        Frituras18.setBackground(new java.awt.Color(239, 255, 232));
        Frituras18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Frituras18.setText("Fritura");
        Frituras18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Frituras18ActionPerformed(evt);
            }
        });

        Embutidos18.setBackground(new java.awt.Color(239, 255, 232));
        Embutidos18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Embutidos18.setText("Embutidos");
        Embutidos18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Embutidos18ActionPerformed(evt);
            }
        });

        Trotar18.setBackground(new java.awt.Color(239, 255, 232));
        Trotar18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Trotar18.setText("Trotar");
        Trotar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trotar18ActionPerformed(evt);
            }
        });

        Sentadillas18.setBackground(new java.awt.Color(239, 255, 232));
        Sentadillas18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sentadillas18.setText("Sentadillas");
        Sentadillas18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sentadillas18ActionPerformed(evt);
            }
        });

        Abdominales18.setBackground(new java.awt.Color(239, 255, 232));
        Abdominales18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Abdominales18.setText("Abdominales");
        Abdominales18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abdominales18ActionPerformed(evt);
            }
        });

        Pesas18.setBackground(new java.awt.Color(239, 255, 232));
        Pesas18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pesas18.setText("Pesas");
        Pesas18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesas18ActionPerformed(evt);
            }
        });

        Flexiones18.setBackground(new java.awt.Color(239, 255, 232));
        Flexiones18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Flexiones18.setText("Flexiones");
        Flexiones18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flexiones18ActionPerformed(evt);
            }
        });

        CrossFit18.setBackground(new java.awt.Color(239, 255, 232));
        CrossFit18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CrossFit18.setText("Crossfit");
        CrossFit18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossFit18ActionPerformed(evt);
            }
        });

        Parado18.setBackground(new java.awt.Color(239, 255, 232));
        Parado18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Parado18.setText("Estar parado");
        Parado18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parado18ActionPerformed(evt);
            }
        });

        Sentado18.setBackground(new java.awt.Color(239, 255, 232));
        Sentado18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sentado18.setText("Estar sentado");
        Sentado18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sentado18ActionPerformed(evt);
            }
        });

        Dormido18.setBackground(new java.awt.Color(239, 255, 232));
        Dormido18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dormido18.setText("Dormir mucho");
        Dormido18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dormido18ActionPerformed(evt);
            }
        });

        NoDormido.setBackground(new java.awt.Color(239, 255, 232));
        NoDormido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NoDormido.setText("Dormir poco");
        NoDormido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDormidoActionPerformed(evt);
            }
        });

        Pan18.setBackground(new java.awt.Color(239, 255, 232));
        Pan18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pan18.setText("Pan");
        Pan18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pan18ActionPerformed(evt);
            }
        });

        Yoga18.setBackground(new java.awt.Color(239, 255, 232));
        Yoga18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Yoga18.setText("Yoga");
        Yoga18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yoga18ActionPerformed(evt);
            }
        });

        Nadar18.setBackground(new java.awt.Color(239, 255, 232));
        Nadar18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nadar18.setText("Nadar");
        Nadar18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nadar18ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        jLabel12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        jLabel15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/egg-free_icon-icons.com_49231.png"))); // NOI18N
        jLabel25.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/sausage-1_icon-icons.com_63232.png"))); // NOI18N
        jLabel26.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Drinks-33_icon-icons.com_61965.png"))); // NOI18N
        jLabel27.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2_116664.png"))); // NOI18N
        jLabel35.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11_116668.png"))); // NOI18N
        jLabel36.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/swimgirl_119533.png"))); // NOI18N
        jLabel44.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel47.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel47.setText("Debes evitar ingerir:");

        Sodio20.setBackground(new java.awt.Color(239, 255, 232));
        Sodio20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sodio20.setText("Sodio");
        Sodio20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sodio20ActionPerformed(evt);
            }
        });

        Hierba20.setBackground(new java.awt.Color(239, 255, 232));
        Hierba20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hierba20.setText("Hierbas");
        Hierba20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hierba20ActionPerformed(evt);
            }
        });

        Carne20.setBackground(new java.awt.Color(239, 255, 232));
        Carne20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Carne20.setText("Carne");
        Carne20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carne20ActionPerformed(evt);
            }
        });

        Granos20.setBackground(new java.awt.Color(239, 255, 232));
        Granos20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Granos20.setText("Granos");
        Granos20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Granos20ActionPerformed(evt);
            }
        });

        Verduras20.setBackground(new java.awt.Color(239, 255, 232));
        Verduras20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Verduras20.setText("Verduras");
        Verduras20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verduras20ActionPerformed(evt);
            }
        });

        Frutas20.setBackground(new java.awt.Color(239, 255, 232));
        Frutas20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Frutas20.setText("Frutas");
        Frutas20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Frutas20ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c240-2427880_85675.png"))); // NOI18N
        jLabel48.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel49.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel49.setText("Debes evitar:");

        jLabel50.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel50.setText("Se recomienda que realices: ");

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel51.setText("Se recomienda que consumas:");

        Embutidos20.setBackground(new java.awt.Color(239, 255, 232));
        Embutidos20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Embutidos20.setText("Embutidos");
        Embutidos20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Embutidos20ActionPerformed(evt);
            }
        });

        Fritura20.setBackground(new java.awt.Color(239, 255, 232));
        Fritura20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fritura20.setText("Fritura");
        Fritura20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fritura20ActionPerformed(evt);
            }
        });

        Agua20.setBackground(new java.awt.Color(239, 255, 232));
        Agua20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Agua20.setText("Agua");
        Agua20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agua20ActionPerformed(evt);
            }
        });

        Alcohol20.setBackground(new java.awt.Color(239, 255, 232));
        Alcohol20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Alcohol20.setText("Alcohol");
        Alcohol20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alcohol20ActionPerformed(evt);
            }
        });

        Grasas20.setBackground(new java.awt.Color(239, 255, 232));
        Grasas20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Grasas20.setText("Grasas");
        Grasas20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grasas20ActionPerformed(evt);
            }
        });

        Azucar20.setBackground(new java.awt.Color(239, 255, 232));
        Azucar20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Azucar20.setText("Azucar");
        Azucar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Azucar20ActionPerformed(evt);
            }
        });

        Abdominales20.setBackground(new java.awt.Color(239, 255, 232));
        Abdominales20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Abdominales20.setText("Abdominales");
        Abdominales20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abdominales20ActionPerformed(evt);
            }
        });

        Sentadillas20.setBackground(new java.awt.Color(239, 255, 232));
        Sentadillas20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sentadillas20.setText("Sentadillas");
        Sentadillas20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sentadillas20ActionPerformed(evt);
            }
        });

        Trotar20.setBackground(new java.awt.Color(239, 255, 232));
        Trotar20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Trotar20.setText("Trotar");
        Trotar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trotar20ActionPerformed(evt);
            }
        });

        Parado20.setBackground(new java.awt.Color(239, 255, 232));
        Parado20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Parado20.setText("Estar parado");
        Parado20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parado20ActionPerformed(evt);
            }
        });

        CrossFit20.setBackground(new java.awt.Color(239, 255, 232));
        CrossFit20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CrossFit20.setText("Crossfit");
        CrossFit20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossFit20ActionPerformed(evt);
            }
        });

        Flexiones20.setBackground(new java.awt.Color(239, 255, 232));
        Flexiones20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Flexiones20.setText("Flexiones");
        Flexiones20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flexiones20ActionPerformed(evt);
            }
        });

        Pesas20.setBackground(new java.awt.Color(239, 255, 232));
        Pesas20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pesas20.setText("Pesas");
        Pesas20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesas20ActionPerformed(evt);
            }
        });

        NoDormido20.setBackground(new java.awt.Color(239, 255, 232));
        NoDormido20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NoDormido20.setText("Dormir poco");
        NoDormido20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDormido20ActionPerformed(evt);
            }
        });

        Dormido20.setBackground(new java.awt.Color(239, 255, 232));
        Dormido20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dormido20.setText("Dormir mucho");
        Dormido20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dormido20ActionPerformed(evt);
            }
        });

        Sentado20.setBackground(new java.awt.Color(239, 255, 232));
        Sentado20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sentado20.setText("Estar sentado");
        Sentado20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sentado20ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        jLabel52.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Nadar20.setBackground(new java.awt.Color(239, 255, 232));
        Nadar20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nadar20.setText("Nadar");
        Nadar20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nadar20ActionPerformed(evt);
            }
        });

        Yoga20.setBackground(new java.awt.Color(239, 255, 232));
        Yoga20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Yoga20.setText("Yoga");
        Yoga20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yoga20ActionPerformed(evt);
            }
        });

        Pan20.setBackground(new java.awt.Color(239, 255, 232));
        Pan20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pan20.setText("Pan");
        Pan20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pan20ActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        jLabel53.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        jLabel54.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        jLabel55.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/iconfinder-food-and-restaurantnot-allowedsignalingfast-foodprohibitionforbidden-4394756_119512.png"))); // NOI18N
        jLabel56.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel57.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/christmas_pan_47215.png"))); // NOI18N
        jLabel58.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/water_drink_bottle_icon-icons.com_51087.png"))); // NOI18N
        jLabel59.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        jLabel60.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/egg-free_icon-icons.com_49231.png"))); // NOI18N
        jLabel61.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11_116668.png"))); // NOI18N
        jLabel62.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_fitness_sport_icon_133372.png"))); // NOI18N
        jLabel63.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_pushups_sport_icon_133368.png"))); // NOI18N
        jLabel64.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_abs_sport_icon_133367.png"))); // NOI18N
        jLabel65.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_sport_fitness_icon_133373.png"))); // NOI18N
        jLabel66.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/8_116658.png"))); // NOI18N
        jLabel67.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Drinks-33_icon-icons.com_61965.png"))); // NOI18N
        jLabel68.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/sausage-1_icon-icons.com_63232.png"))); // NOI18N
        jLabel69.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2_116664.png"))); // NOI18N
        jLabel70.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/swimgirl_119533.png"))); // NOI18N
        jLabel71.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Smiley-17_256_icon-icons.com_62517.png"))); // NOI18N
        jLabel72.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3561857-bedroom-emoji-emoticon-rest-sleep-sleeping_107895.png"))); // NOI18N
        jLabel73.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492638-basicman01_81729.png"))); // NOI18N
        jLabel74.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492636-basicman09_81758.png"))); // NOI18N
        jLabel75.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Granos25.setBackground(new java.awt.Color(239, 255, 232));
        Granos25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Granos25.setText("Granos");
        Granos25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Granos25ActionPerformed(evt);
            }
        });

        Carne25.setBackground(new java.awt.Color(239, 255, 232));
        Carne25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Carne25.setText("Carne");
        Carne25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Carne25ActionPerformed(evt);
            }
        });

        Hierbas25.setBackground(new java.awt.Color(239, 255, 232));
        Hierbas25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hierbas25.setText("Hierbas");
        Hierbas25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hierbas25ActionPerformed(evt);
            }
        });

        Sodio25.setBackground(new java.awt.Color(239, 255, 232));
        Sodio25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sodio25.setText("Sodio");
        Sodio25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sodio25ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel76.setText("Debes evitar ingerir:");

        jLabel77.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel77.setText("Debes evitar:");

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c240-2427880_85675.png"))); // NOI18N
        jLabel78.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Fruta25.setBackground(new java.awt.Color(239, 255, 232));
        Fruta25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fruta25.setText("Frutas");
        Fruta25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fruta25ActionPerformed(evt);
            }
        });

        Verduras25.setBackground(new java.awt.Color(239, 255, 232));
        Verduras25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Verduras25.setText("Verduras");
        Verduras25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verduras25ActionPerformed(evt);
            }
        });

        Alcohol25.setBackground(new java.awt.Color(239, 255, 232));
        Alcohol25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Alcohol25.setText("Alcohol");
        Alcohol25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Alcohol25ActionPerformed(evt);
            }
        });

        Agua25.setBackground(new java.awt.Color(239, 255, 232));
        Agua25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Agua25.setText("Agua");
        Agua25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agua25ActionPerformed(evt);
            }
        });

        Fritura25.setBackground(new java.awt.Color(239, 255, 232));
        Fritura25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Fritura25.setText("Fritura");
        Fritura25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fritura25ActionPerformed(evt);
            }
        });

        Embutidos25.setBackground(new java.awt.Color(239, 255, 232));
        Embutidos25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Embutidos25.setText("Embutidos");
        Embutidos25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Embutidos25ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel79.setText("Se recomienda que consumas:");

        jLabel80.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel80.setText("Se recomienda que realices: ");

        Trotar25.setBackground(new java.awt.Color(239, 255, 232));
        Trotar25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Trotar25.setText("Trotar");
        Trotar25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Trotar25ActionPerformed(evt);
            }
        });

        Sentadillas25.setBackground(new java.awt.Color(239, 255, 232));
        Sentadillas25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sentadillas25.setText("Sentadillas");
        Sentadillas25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sentadillas25ActionPerformed(evt);
            }
        });

        Abdominales25.setBackground(new java.awt.Color(239, 255, 232));
        Abdominales25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Abdominales25.setText("Abdominales");
        Abdominales25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abdominales25ActionPerformed(evt);
            }
        });

        Azucar25.setBackground(new java.awt.Color(239, 255, 232));
        Azucar25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Azucar25.setText("Azucar");
        Azucar25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Azucar25ActionPerformed(evt);
            }
        });

        Grasas25.setBackground(new java.awt.Color(239, 255, 232));
        Grasas25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Grasas25.setText("Grasas");
        Grasas25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Grasas25ActionPerformed(evt);
            }
        });

        NoDormido25.setBackground(new java.awt.Color(239, 255, 232));
        NoDormido25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NoDormido25.setText("Dormir poco");
        NoDormido25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoDormido25ActionPerformed(evt);
            }
        });

        Pesas25.setBackground(new java.awt.Color(239, 255, 232));
        Pesas25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pesas25.setText("Pesas");
        Pesas25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesas25ActionPerformed(evt);
            }
        });

        Flexiones25.setBackground(new java.awt.Color(239, 255, 232));
        Flexiones25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Flexiones25.setText("Flexiones");
        Flexiones25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Flexiones25ActionPerformed(evt);
            }
        });

        CrossFit25.setBackground(new java.awt.Color(239, 255, 232));
        CrossFit25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CrossFit25.setText("Crossfit");
        CrossFit25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossFit25ActionPerformed(evt);
            }
        });

        Parado25.setBackground(new java.awt.Color(239, 255, 232));
        Parado25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Parado25.setText("Estar parado");
        Parado25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parado25ActionPerformed(evt);
            }
        });

        Pan25.setBackground(new java.awt.Color(239, 255, 232));
        Pan25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pan25.setText("Pan");
        Pan25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pan25ActionPerformed(evt);
            }
        });

        Yoga25.setBackground(new java.awt.Color(239, 255, 232));
        Yoga25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Yoga25.setText("Yoga");
        Yoga25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yoga25ActionPerformed(evt);
            }
        });

        Nadar25.setBackground(new java.awt.Color(239, 255, 232));
        Nadar25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nadar25.setText("Nadar");
        Nadar25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nadar25ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/kitchen-salt-pot_108629.png"))); // NOI18N
        jLabel81.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        Sentado25.setBackground(new java.awt.Color(239, 255, 232));
        Sentado25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Sentado25.setText("Estar sentado");
        Sentado25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sentado25ActionPerformed(evt);
            }
        });

        Dormido25.setBackground(new java.awt.Color(239, 255, 232));
        Dormido25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dormido25.setText("Dormir mucho");
        Dormido25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dormido25ActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/iconfinder-food-and-restaurantnot-allowedsignalingfast-foodprohibitionforbidden-4394756_119512.png"))); // NOI18N
        jLabel82.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel162.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/vegetablesfood_122724.png"))); // NOI18N
        jLabel162.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel163.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Rice_Bowl_icon-icons.com_68695.png"))); // NOI18N
        jLabel163.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel164.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2998122-ecology-green-leaf-plant-spring_99858.png"))); // NOI18N
        jLabel164.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel165.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_fitness_sport_icon_133372.png"))); // NOI18N
        jLabel165.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel166.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/11_116668.png"))); // NOI18N
        jLabel166.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel167.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/egg-free_icon-icons.com_49231.png"))); // NOI18N
        jLabel167.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel168.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/if-food-c225-2427885_85692.png"))); // NOI18N
        jLabel168.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel169.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/water_drink_bottle_icon-icons.com_51087.png"))); // NOI18N
        jLabel169.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel170.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/christmas_pan_47215.png"))); // NOI18N
        jLabel170.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel171.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3943420-candy-christmas-dessert-lollies-restaurant-sugar-sweet_111597.png"))); // NOI18N
        jLabel171.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_sport_fitness_icon_133373.png"))); // NOI18N
        jLabel172.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel173.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_abs_sport_icon_133367.png"))); // NOI18N
        jLabel173.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel174.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/exercise_pushups_sport_icon_133368.png"))); // NOI18N
        jLabel174.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel175.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492638-basicman01_81729.png"))); // NOI18N
        jLabel175.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel176.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/3561857-bedroom-emoji-emoticon-rest-sleep-sleeping_107895.png"))); // NOI18N
        jLabel176.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel177.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Smiley-17_256_icon-icons.com_62517.png"))); // NOI18N
        jLabel177.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel178.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/swimgirl_119533.png"))); // NOI18N
        jLabel178.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel179.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/2_116664.png"))); // NOI18N
        jLabel179.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel180.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/sausage-1_icon-icons.com_63232.png"))); // NOI18N
        jLabel180.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel181.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel181.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/Drinks-33_icon-icons.com_61965.png"))); // NOI18N
        jLabel181.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel182.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel182.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/8_116658.png"))); // NOI18N
        jLabel182.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel183.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/1488492636-basicman09_81758.png"))); // NOI18N
        jLabel183.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sentado20)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Sodio20)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Frutas20)
                                        .addComponent(jLabel67)
                                        .addComponent(jLabel52)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(Azucar20))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Sodio18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(Frutas18)
                                .addComponent(jLabel29)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(Azucar18)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel35)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel36)
                                .addGap(114, 114, 114))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Agua18)
                                .addGap(41, 41, 41)
                                .addComponent(Pan18)
                                .addGap(110, 110, 110))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel179)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel166)
                                        .addComponent(Yoga25))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nadar25)
                                            .addComponent(jLabel178))
                                        .addGap(9, 9, 9)))
                                .addGap(93, 93, 93))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CrossFit20)
                                    .addComponent(jLabel70))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel62)
                                    .addComponent(Yoga20)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Nadar20)
                                    .addComponent(jLabel71))
                                .addGap(9, 9, 9))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel51)
                                    .addComponent(Fritura20))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel61)
                                    .addComponent(Grasas20))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel69)
                                    .addComponent(Embutidos20))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(Alcohol20)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel81)
                                        .addComponent(Sodio25))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel183)
                                        .addGap(112, 112, 112)
                                        .addComponent(jLabel175)
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel176))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel172)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(Trotar25)
                                                .addGap(18, 18, 18)
                                                .addComponent(Sentadillas25)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Abdominales25)
                                        .addGap(18, 18, 18)
                                        .addComponent(Flexiones25)
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NoDormido25)
                                            .addComponent(Pesas25)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel80)
                                            .addComponent(Fritura25)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel77))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Azucar25)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                            .addComponent(jLabel171)
                                                            .addGap(52, 52, 52)
                                                            .addComponent(jLabel82)))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(Fruta25)
                                                            .addComponent(jLabel78))
                                                        .addGap(37, 37, 37)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel162)
                                                            .addComponent(Verduras25))
                                                        .addGap(39, 39, 39)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(Granos25)
                                                            .addComponent(jLabel163))))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel167)
                                                        .addComponent(Hierbas25)
                                                        .addComponent(jLabel164))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(Grasas25)
                                                        .addGap(8, 8, 8)))
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel180))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(Sentado18)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Parado18)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(Dormido18))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(38, 38, 38)
                                                                .addComponent(jLabel38)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel39)
                                                                .addGap(83, 83, 83)
                                                                .addComponent(jLabel40)
                                                                .addGap(16, 16, 16)))
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addComponent(NoDormido))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(84, 84, 84)
                                                                .addComponent(jLabel41))))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel75)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(jLabel74)
                                                                    .addComponent(jLabel49))))
                                                        .addGap(99, 99, 99)
                                                        .addComponent(jLabel73)
                                                        .addGap(102, 102, 102)
                                                        .addComponent(jLabel72))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(89, 89, 89)
                                                        .addComponent(jLabel66)
                                                        .addGap(39, 39, 39)
                                                        .addComponent(jLabel65)
                                                        .addGap(133, 133, 133))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(Parado20)
                                                        .addGap(38, 38, 38)
                                                        .addComponent(Dormido20)
                                                        .addGap(73, 73, 73)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Pesas20)
                                                    .addComponent(NoDormido20, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel168, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(Carne25, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel63)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel11)))
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel170)
                                            .addComponent(Pan25)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(210, 210, 210)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Agua25)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel173)
                                                    .addGap(51, 51, 51)
                                                    .addComponent(jLabel174)
                                                    .addGap(39, 39, 39)
                                                    .addComponent(jLabel165)
                                                    .addGap(24, 24, 24)
                                                    .addComponent(CrossFit25)))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(321, 321, 321)
                                                .addComponent(jLabel169))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel182))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Sentado25)
                                        .addGap(36, 36, 36)
                                        .addComponent(Parado25)
                                        .addGap(55, 55, 55)
                                        .addComponent(Dormido25)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel177))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel50))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel47))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(486, 486, 486)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel181)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Embutidos25)
                                        .addGap(58, 58, 58)
                                        .addComponent(Alcohol25))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(jLabel4)
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Verduras18)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(8, 8, 8)))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel15))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Granos18)
                                            .addGap(18, 18, 18)
                                            .addComponent(Hierbas18)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(35, 35, 35)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel22)
                                                    .addComponent(jLabel3))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(209, 209, 209)
                                                    .addComponent(Frituras18))))))))
                        .addGap(78, 78, 78)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel30)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel32)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel33)
                        .addGap(158, 158, 158))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel48)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Verduras20)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addGap(8, 8, 8)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Granos20)
                            .addComponent(jLabel54))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Hierba20)
                            .addComponent(jLabel53))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Carne20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(CrossFit18)
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Agua20)
                                            .addComponent(jLabel59))
                                        .addGap(37, 37, 37))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel79))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel76))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel64)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(Trotar20)
                                            .addGap(18, 18, 18)
                                            .addComponent(Sentadillas20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Abdominales20)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Flexiones20))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pan20)
                    .addComponent(jLabel58))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(Grasas18))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Carne18)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel19)))
                                .addGap(183, 183, 183))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(80, 80, 80))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Embutidos18)
                                        .addGap(68, 68, 68)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Alcohol18)
                                    .addComponent(jLabel27))
                                .addGap(95, 95, 95))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Trotar18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Sentadillas18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Abdominales18)
                                .addGap(18, 18, 18)
                                .addComponent(Flexiones18)
                                .addGap(18, 18, 18)
                                .addComponent(Pesas18)
                                .addGap(158, 158, 158)
                                .addComponent(Yoga18))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nadar18)
                                .addComponent(jLabel44)))
                        .addGap(114, 114, 114))))
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
                        .addComponent(jLabel15)
                        .addComponent(jLabel17)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Granos18)
                        .addComponent(Hierbas18))
                    .addComponent(Verduras18)
                    .addComponent(Carne18)
                    .addComponent(Agua18)
                    .addComponent(Pan18)
                    .addComponent(Frutas18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Azucar18)
                    .addComponent(Sodio18)
                    .addComponent(Frituras18)
                    .addComponent(Grasas18)
                    .addComponent(Embutidos18)
                    .addComponent(Alcohol18))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Trotar18)
                            .addComponent(Flexiones18)
                            .addComponent(Sentadillas18)
                            .addComponent(CrossFit18)
                            .addComponent(Abdominales18)
                            .addComponent(Yoga18)
                            .addComponent(Pesas18)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel29)
                                .addComponent(jLabel33)
                                .addComponent(jLabel30))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel36)
                                .addComponent(jLabel35)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel38)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dormido18)
                    .addComponent(NoDormido)
                    .addComponent(Nadar18)
                    .addComponent(Parado18)
                    .addComponent(Sentado18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel48)
                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel54)
                        .addComponent(jLabel53)
                        .addComponent(jLabel60)
                        .addComponent(jLabel59)
                        .addComponent(jLabel58)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Granos20)
                    .addComponent(Verduras20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Carne20)
                        .addComponent(Hierba20))
                    .addComponent(Agua20)
                    .addComponent(Pan20)
                    .addComponent(Frutas20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56)
                    .addComponent(jLabel61)
                    .addComponent(jLabel69)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Embutidos20)
                    .addComponent(Grasas20)
                    .addComponent(Alcohol20)
                    .addComponent(Fritura20)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Azucar20)
                        .addComponent(Sodio20)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel67)
                                .addComponent(jLabel63)
                                .addComponent(jLabel66)
                                .addComponent(jLabel65))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel62))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CrossFit20)
                                    .addComponent(Yoga20)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Trotar20)
                            .addComponent(Flexiones20)
                            .addComponent(Sentadillas20)
                            .addComponent(Pesas20)
                            .addComponent(Abdominales20))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sentado20)
                    .addComponent(Parado20)
                    .addComponent(Dormido20)
                    .addComponent(NoDormido20)
                    .addComponent(Nadar20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel78)
                        .addComponent(jLabel162, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel163)
                        .addComponent(jLabel164)
                        .addComponent(jLabel168)
                        .addComponent(jLabel169)
                        .addComponent(jLabel170)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Granos25)
                    .addComponent(Verduras25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Agua25)
                        .addComponent(Pan25))
                    .addComponent(Fruta25)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hierbas25)
                        .addComponent(Carne25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81)
                    .addComponent(jLabel171)
                    .addComponent(jLabel82)
                    .addComponent(jLabel167)
                    .addComponent(jLabel180)
                    .addComponent(jLabel181))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Embutidos25)
                    .addComponent(Grasas25)
                    .addComponent(Alcohol25)
                    .addComponent(Fritura25)
                    .addComponent(Azucar25)
                    .addComponent(Sodio25))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel182)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel165)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel166)
                                        .addGap(6, 6, 6))
                                    .addComponent(jLabel179))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pesas25)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Yoga25)
                                        .addComponent(CrossFit25))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel174)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel172)
                                    .addComponent(jLabel173))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Trotar25)
                            .addComponent(Flexiones25)
                            .addComponent(Sentadillas25)
                            .addComponent(Abdominales25))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel183)
                    .addComponent(jLabel178)
                    .addComponent(jLabel177)
                    .addComponent(jLabel176)
                    .addComponent(jLabel175))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sentado25)
                        .addComponent(NoDormido25)
                        .addComponent(Nadar25))
                    .addComponent(Parado25)
                    .addComponent(Dormido25)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE))
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
        
        JTable tablaAux = new JTable();
        tablaAux = panelUsuarios.getjTable1();
        panelUsuarios.setjTable1( Ventana_principal.getRegistro().ActualizaTabla(tablaAux));     
        
    }//GEN-LAST:event_btnPacientesActionPerformed

    private void Verduras18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verduras18ActionPerformed
       Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblVerduras());
    }//GEN-LAST:event_Verduras18ActionPerformed

    private void Granos18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Granos18ActionPerformed
      Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblGranos());
    }//GEN-LAST:event_Granos18ActionPerformed

    private void Carne18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carne18ActionPerformed
       Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblCarne());
    }//GEN-LAST:event_Carne18ActionPerformed

    private void Hierbas18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hierbas18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblHierba());
    }//GEN-LAST:event_Hierbas18ActionPerformed

    private void Sodio18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sodio18ActionPerformed
       Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblSodio());
    }//GEN-LAST:event_Sodio18ActionPerformed

    private void Frutas18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Frutas18ActionPerformed
        
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblFrutas());
        
       
    }//GEN-LAST:event_Frutas18ActionPerformed

    private void Agua18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agua18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblAgua());
    }//GEN-LAST:event_Agua18ActionPerformed

    private void Pan18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pan18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblPan());
    }//GEN-LAST:event_Pan18ActionPerformed

    private void Azucar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Azucar18ActionPerformed
       Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblDulceE());
    }//GEN-LAST:event_Azucar18ActionPerformed

    private void Frituras18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Frituras18ActionPerformed
       Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblFritura());
    }//GEN-LAST:event_Frituras18ActionPerformed

    private void Grasas18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grasas18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblGrasas());
    }//GEN-LAST:event_Grasas18ActionPerformed

    private void Embutidos18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Embutidos18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblEmbutidos());
    }//GEN-LAST:event_Embutidos18ActionPerformed

    private void Alcohol18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alcohol18ActionPerformed
       Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getLblAlcohol());
    }//GEN-LAST:event_Alcohol18ActionPerformed

    private void Trotar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trotar18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblTrotar());
    }//GEN-LAST:event_Trotar18ActionPerformed

    private void Sentadillas18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sentadillas18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblSentadillas());
    }//GEN-LAST:event_Sentadillas18ActionPerformed

    private void Abdominales18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abdominales18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblAbdominales());
    }//GEN-LAST:event_Abdominales18ActionPerformed

    private void Flexiones18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flexiones18ActionPerformed
       Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblFlexiones());
    }//GEN-LAST:event_Flexiones18ActionPerformed

    private void Pesas18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesas18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblPesas());
    }//GEN-LAST:event_Pesas18ActionPerformed

    private void CrossFit18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossFit18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblCrossFit());
    }//GEN-LAST:event_CrossFit18ActionPerformed

    private void Yoga18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yoga18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblYoga());
    }//GEN-LAST:event_Yoga18ActionPerformed

    private void Sentado18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sentado18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblSentado());
    }//GEN-LAST:event_Sentado18ActionPerformed

    private void Parado18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parado18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblParado());
    }//GEN-LAST:event_Parado18ActionPerformed

    private void Dormido18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dormido18ActionPerformed
        Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblDormido());
    }//GEN-LAST:event_Dormido18ActionPerformed

    private void NoDormidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDormidoActionPerformed
                Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblNoDormido());
    }//GEN-LAST:event_NoDormidoActionPerformed

    private void Nadar18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nadar18ActionPerformed
                Ventana_principal.getRegistro().validar_Recomendacion(0, 18, Ventana_principal.getPanelUsuario().getPanelEjercicio().getLblNadar());
    }//GEN-LAST:event_Nadar18ActionPerformed

    private void Sodio20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sodio20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sodio20ActionPerformed

    private void Hierba20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hierba20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hierba20ActionPerformed

    private void Carne20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carne20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Carne20ActionPerformed

    private void Granos20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Granos20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Granos20ActionPerformed

    private void Verduras20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verduras20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Verduras20ActionPerformed

    private void Frutas20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Frutas20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Frutas20ActionPerformed

    private void Embutidos20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Embutidos20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Embutidos20ActionPerformed

    private void Fritura20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fritura20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fritura20ActionPerformed

    private void Agua20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agua20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Agua20ActionPerformed

    private void Alcohol20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alcohol20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alcohol20ActionPerformed

    private void Grasas20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grasas20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grasas20ActionPerformed

    private void Azucar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Azucar20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Azucar20ActionPerformed

    private void Abdominales20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abdominales20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Abdominales20ActionPerformed

    private void Sentadillas20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sentadillas20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sentadillas20ActionPerformed

    private void Trotar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trotar20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Trotar20ActionPerformed

    private void Parado20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parado20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Parado20ActionPerformed

    private void CrossFit20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossFit20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrossFit20ActionPerformed

    private void Flexiones20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flexiones20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Flexiones20ActionPerformed

    private void Pesas20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesas20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pesas20ActionPerformed

    private void NoDormido20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDormido20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoDormido20ActionPerformed

    private void Dormido20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dormido20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dormido20ActionPerformed

    private void Sentado20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sentado20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sentado20ActionPerformed

    private void Nadar20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nadar20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nadar20ActionPerformed

    private void Yoga20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yoga20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Yoga20ActionPerformed

    private void Pan20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pan20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pan20ActionPerformed

    private void Granos25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Granos25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Granos25ActionPerformed

    private void Carne25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Carne25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Carne25ActionPerformed

    private void Hierbas25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hierbas25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Hierbas25ActionPerformed

    private void Sodio25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sodio25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sodio25ActionPerformed

    private void Fruta25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fruta25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fruta25ActionPerformed

    private void Verduras25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verduras25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Verduras25ActionPerformed

    private void Alcohol25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alcohol25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Alcohol25ActionPerformed

    private void Agua25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agua25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Agua25ActionPerformed

    private void Fritura25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fritura25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fritura25ActionPerformed

    private void Embutidos25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Embutidos25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Embutidos25ActionPerformed

    private void Trotar25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Trotar25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Trotar25ActionPerformed

    private void Sentadillas25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sentadillas25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sentadillas25ActionPerformed

    private void Abdominales25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abdominales25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Abdominales25ActionPerformed

    private void Azucar25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Azucar25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Azucar25ActionPerformed

    private void Grasas25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Grasas25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Grasas25ActionPerformed

    private void NoDormido25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoDormido25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoDormido25ActionPerformed

    private void Pesas25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesas25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pesas25ActionPerformed

    private void Flexiones25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Flexiones25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Flexiones25ActionPerformed

    private void CrossFit25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossFit25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrossFit25ActionPerformed

    private void Parado25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parado25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Parado25ActionPerformed

    private void Pan25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pan25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pan25ActionPerformed

    private void Yoga25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yoga25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Yoga25ActionPerformed

    private void Nadar25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nadar25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nadar25ActionPerformed

    private void Sentado25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sentado25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Sentado25ActionPerformed

    private void Dormido25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dormido25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Dormido25ActionPerformed

    public static Blog getPanelBlog() {
        return panelBlog;
    }

    public JLabel getLblBlogsDoc() {
        return lblBlogsDoc;
    }

    public JLabel getLblNombreNutriologo() {
        return lblNombreNutriologo;
    }

    public JLabel getLblNumPacientes() {
        return lblNumPacientes;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Abdominales18;
    private javax.swing.JCheckBox Abdominales20;
    private javax.swing.JCheckBox Abdominales25;
    private javax.swing.JCheckBox Agua18;
    private javax.swing.JCheckBox Agua20;
    private javax.swing.JCheckBox Agua25;
    private javax.swing.JCheckBox Alcohol18;
    private javax.swing.JCheckBox Alcohol20;
    private javax.swing.JCheckBox Alcohol25;
    private javax.swing.JCheckBox Azucar18;
    private javax.swing.JCheckBox Azucar20;
    private javax.swing.JCheckBox Azucar25;
    private javax.swing.JCheckBox Carne18;
    private javax.swing.JCheckBox Carne20;
    private javax.swing.JCheckBox Carne25;
    private javax.swing.JCheckBox CrossFit18;
    private javax.swing.JCheckBox CrossFit20;
    private javax.swing.JCheckBox CrossFit25;
    private javax.swing.JCheckBox Dormido18;
    private javax.swing.JCheckBox Dormido20;
    private javax.swing.JCheckBox Dormido25;
    private javax.swing.JCheckBox Embutidos18;
    private javax.swing.JCheckBox Embutidos20;
    private javax.swing.JCheckBox Embutidos25;
    private javax.swing.JCheckBox Flexiones18;
    private javax.swing.JCheckBox Flexiones20;
    private javax.swing.JCheckBox Flexiones25;
    private javax.swing.JCheckBox Fritura20;
    private javax.swing.JCheckBox Fritura25;
    private javax.swing.JCheckBox Frituras18;
    private javax.swing.JCheckBox Fruta25;
    private javax.swing.JCheckBox Frutas18;
    private javax.swing.JCheckBox Frutas20;
    private javax.swing.JCheckBox Granos18;
    private javax.swing.JCheckBox Granos20;
    private javax.swing.JCheckBox Granos25;
    private javax.swing.JCheckBox Grasas18;
    private javax.swing.JCheckBox Grasas20;
    private javax.swing.JCheckBox Grasas25;
    private javax.swing.JCheckBox Hierba20;
    private javax.swing.JCheckBox Hierbas18;
    private javax.swing.JCheckBox Hierbas25;
    private javax.swing.JCheckBox Nadar18;
    private javax.swing.JCheckBox Nadar20;
    private javax.swing.JCheckBox Nadar25;
    private javax.swing.JCheckBox NoDormido;
    private javax.swing.JCheckBox NoDormido20;
    private javax.swing.JCheckBox NoDormido25;
    private javax.swing.JCheckBox Pan18;
    private javax.swing.JCheckBox Pan20;
    private javax.swing.JCheckBox Pan25;
    private javax.swing.JCheckBox Parado18;
    private javax.swing.JCheckBox Parado20;
    private javax.swing.JCheckBox Parado25;
    private javax.swing.JCheckBox Pesas18;
    private javax.swing.JCheckBox Pesas20;
    private javax.swing.JCheckBox Pesas25;
    private javax.swing.JCheckBox Sentadillas18;
    private javax.swing.JCheckBox Sentadillas20;
    private javax.swing.JCheckBox Sentadillas25;
    private javax.swing.JCheckBox Sentado18;
    private javax.swing.JCheckBox Sentado20;
    private javax.swing.JCheckBox Sentado25;
    private javax.swing.JCheckBox Sodio18;
    private javax.swing.JCheckBox Sodio20;
    private javax.swing.JCheckBox Sodio25;
    private javax.swing.JCheckBox Trotar18;
    private javax.swing.JCheckBox Trotar20;
    private javax.swing.JCheckBox Trotar25;
    private javax.swing.JCheckBox Verduras18;
    private javax.swing.JCheckBox Verduras20;
    private javax.swing.JCheckBox Verduras25;
    private javax.swing.JCheckBox Yoga18;
    private javax.swing.JCheckBox Yoga20;
    private javax.swing.JCheckBox Yoga25;
    private javax.swing.JToggleButton btnBlog;
    private javax.swing.JToggleButton btnConsejos;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JToggleButton btnPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBlogsDoc;
    private javax.swing.JLabel lblNombreNutriologo;
    private javax.swing.JLabel lblNumPacientes;
    private javax.swing.JPanel panelDieta;
    // End of variables declaration//GEN-END:variables
}
