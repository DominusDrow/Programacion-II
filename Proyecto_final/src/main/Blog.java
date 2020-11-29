
package main;

import javax.swing.JButton;

public class Blog extends javax.swing.JPanel {

    public Blog() {
        initComponents();
        
        jTable2.setDefaultRenderer(Object.class, new ImgTabla());
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnNuevaEntrada = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 255, 232));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setBackground(new java.awt.Color(239, 255, 232));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "ENTRADAS"
            }
        ));
        jTable2.setToolTipText("");
        jTable2.setCellSelectionEnabled(true);
        jTable2.setName(""); // NOI18N
        jTable2.setOpaque(false);
        jTable2.setRowHeight(85);
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 29)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("BLOG:");

        btnNuevaEntrada.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        btnNuevaEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/img/escribir1.png"))); // NOI18N
        btnNuevaEntrada.setText("Nueva entrada");
        btnNuevaEntrada.setBorderPainted(false);
        btnNuevaEntrada.setContentAreaFilled(false);
        btnNuevaEntrada.setFocusPainted(false);
        btnNuevaEntrada.setFocusable(false);
        btnNuevaEntrada.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevaEntrada)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnNuevaEntrada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnNuevaEntrada() {
        return btnNuevaEntrada;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}


