package InterfacesGraficas;


import java.io.Serializable;
import java.util.ArrayList;

public class TablaVehiculos extends javax.swing.JPanel{
    
	ArrayList <Renta> rentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    
    
    public TablaVehiculos() {
        initComponents();
        
        
    }
    
    public void Actualizar(ArrayList <Renta > e){
        
        rentas=e;
        
        String [][] matriz = new String[rentas.size()][3];
        int j;
        for(int i=0;i<rentas.size();i++){
        	j=0;
        	matriz[i][j]= rentas.get(i).getCliente().getNombre();
        	j++;
        	matriz[i][j]= rentas.get(i).getCliente().getCelular();
        	j++;
        	matriz[i][j]=(String) rentas.get(i).getNomVehiculo();
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String [] {
                    "Cliente", "Telefono", "Vehiculo"
                }
            ));
        
    }
    
    
    
                            
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(440, 340));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel1.setText("Vehiculos rentados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Telefono", "Vehiculo"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(96, 96, 96))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }                      
    
    
                    
 
                 
}
