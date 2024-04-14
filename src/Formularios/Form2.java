
package Formularios;

import java.awt.Color;

/**
 *
 * @author Marlon_Mendoza
 */
public class Form2 extends javax.swing.JPanel {

    public Form2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        txt_usuario1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRound2 = new Estilos_graficos.PanelRound();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(243, 237, 161));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(175, 191, 144));
        panelRound1.setRoundBottomRight(60);
        panelRound1.setRoundTopRight(60);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 89, 77));
        jLabel2.setText("Buscar Acreedor");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 70));

        panelfill.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 70));

        txt_usuario1.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_usuario1.setMargin(new java.awt.Insets(2, 10, 2, 10));
        panelfill.add(txt_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 720, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono4.png"))); // NOI18N
        panelfill.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 40));

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

        panelfill.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 770, 490));

        b.setBackground(new java.awt.Color(175, 191, 144));
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Busqueda");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png"))); // NOI18N
        b.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        panelfill.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 180, 50));

        panelRound2.setBackground(new java.awt.Color(175, 191, 144));
        panelRound2.setRoundBottomLeft(40);
        panelRound2.setRoundBottomRight(40);
        panelRound2.setRoundTopLeft(40);
        panelRound2.setRoundTopRight(40);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setText(" Ejecutadora");
        panelRound2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setText(" Pliego");
        panelRound2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText(" Distrito");
        panelRound2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText(" Provincia");
        panelRound2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText(" Departamento");
        panelRound2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelfill.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 180, 230));

        b1.setBackground(new java.awt.Color(175, 191, 144));
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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Exportar");
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 50));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        b1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        panelfill.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, 180, 50));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        
    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_bMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_b1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b;
    private javax.swing.JPanel b1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private Estilos_graficos.PanelRound panelRound1;
    private Estilos_graficos.PanelRound panelRound2;
    private javax.swing.JPanel panelfill;
    private javax.swing.JTextField txt_usuario1;
    // End of variables declaration//GEN-END:variables
}
