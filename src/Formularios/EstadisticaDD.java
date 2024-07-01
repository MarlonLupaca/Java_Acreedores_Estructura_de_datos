package Formularios;

import java.awt.Color;

public class EstadisticaDD extends javax.swing.JPanel {

    public EstadisticaDD() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_usuario1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(244, 246, 250));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nunito", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Montos acumulados por Depto. y Tipo de Doc");
        panelfill.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 750, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_usuario1.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario1.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_usuario1.setMargin(new java.awt.Insets(2, 10, 2, 10));
        jPanel1.add(txt_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, 40));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("DNI:");
        jLabel4.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 40, -1));

        jComboBox1.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Áncash", "Apurímac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huánuco", "Ica", "Junín", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martín", "Tacna", "Tumbes", "Ucayali" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(72, 40));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 160, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Departamento:");
        jLabel3.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

        b1.setBackground(new java.awt.Color(1, 169, 172));
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Exportar");
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 110, 30));

        b.setBackground(new java.awt.Color(1, 169, 172));
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMouseExited(evt);
            }
        });
        b.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Busqueda");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 110, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 910, 440));

        panelfill.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 970, 580));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked

    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(new Color(0x01DBDF));
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(0x01A9AC));
    }//GEN-LAST:event_bMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0x01DBDF));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0x01A9AC));
    }//GEN-LAST:event_b1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b;
    private javax.swing.JPanel b1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelfill;
    private javax.swing.JTextField txt_usuario1;
    // End of variables declaration//GEN-END:variables
}
