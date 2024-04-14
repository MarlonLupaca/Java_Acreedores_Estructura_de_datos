
package Formularios;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;


public class Form1 extends javax.swing.JPanel {

    public Form1() {
        initComponents();
        clear();
    }
    
    private void clear()
    {
        txt_usuario1.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario2.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario3.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario4.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario5.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario6.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario7.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario8.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario9.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario10.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario11.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario12.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario13.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario14.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario15.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario16.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario17.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario18.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_usuario1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_usuario2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_usuario3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_usuario4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_usuario5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_usuario6 = new javax.swing.JTextField();
        txt_usuario7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_usuario8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_usuario9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_usuario10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_usuario11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_usuario12 = new javax.swing.JTextField();
        txt_usuario13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_usuario14 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_usuario15 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_usuario16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_usuario17 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_usuario18 = new javax.swing.JTextField();
        b1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(243, 237, 161));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(175, 191, 144));
        panelRound1.setRoundBottomRight(60);
        panelRound1.setRoundTopRight(60);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 89, 77));
        jLabel2.setText("Registrar Acreedor");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 70));

        panelfill.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 89, 77));
        jLabel3.setText("RUC:");
        panelfill.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(71, 89, 77));
        jSeparator1.setForeground(new java.awt.Color(71, 89, 77));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelfill.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 30, 540));

        txt_usuario1.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario1.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario1.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 89, 77));
        jLabel4.setText("Razon social:");
        panelfill.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 89, 77));
        jLabel5.setText("Observacion glosa:");
        panelfill.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        txt_usuario2.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario2.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario2.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 250, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 89, 77));
        jLabel6.setText("REMYPE Departamento:");
        panelfill.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txt_usuario3.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario3.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario3.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 250, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 89, 77));
        jLabel7.setText("REMYPE Provincia:");
        panelfill.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txt_usuario4.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario4.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario4.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 250, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 89, 77));
        jLabel8.setText("REMYPE Distrito:");
        panelfill.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        txt_usuario5.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario5.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario5.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 250, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 89, 77));
        jLabel9.setText("Domicilio fiscal:");
        panelfill.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txt_usuario6.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario6.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario6.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 250, 30));

        txt_usuario7.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario7.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario7.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 250, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 89, 77));
        jLabel10.setText("Demandas:");
        panelfill.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        txt_usuario8.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario8.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario8.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 250, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 89, 77));
        jLabel11.setText("SIAF:");
        panelfill.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        txt_usuario9.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario9.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario9.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 250, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 89, 77));
        jLabel12.setText("Estado de deuda:");
        panelfill.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        txt_usuario10.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario10.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario10.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 250, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(71, 89, 77));
        jLabel13.setText("Tipo de documento:");
        panelfill.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 89, 77));
        jLabel14.setText("Numero de documento:");
        panelfill.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        txt_usuario11.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario11.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario11.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 250, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(71, 89, 77));
        jLabel15.setText("Monto de deuda:");
        panelfill.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        txt_usuario12.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario12.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario12.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 250, 30));

        txt_usuario13.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario13.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario13.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 250, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(71, 89, 77));
        jLabel16.setText("Nivel de gobierno");
        panelfill.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(71, 89, 77));
        jLabel17.setText("Nombre del sector:");
        panelfill.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        txt_usuario14.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario14.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario14.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 250, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(71, 89, 77));
        jLabel18.setText("Nombre del pliego:");
        panelfill.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        txt_usuario15.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario15.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario15.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 250, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(71, 89, 77));
        jLabel19.setText("Codigo SIAF");
        panelfill.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        txt_usuario16.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario16.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario16.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 250, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(71, 89, 77));
        jLabel20.setText("N. Ejecutadora:");
        panelfill.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        txt_usuario17.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario17.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario17.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 250, 30));

        jSeparator3.setBackground(new java.awt.Color(71, 89, 77));
        jSeparator3.setForeground(new java.awt.Color(71, 89, 77));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelfill.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, 540));

        txt_usuario18.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario18.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_usuario18.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_usuario18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 250, 30));

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

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Exportar");
        b1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 40));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        b1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        panelfill.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 180, 40));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel b1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private Estilos_graficos.PanelRound panelRound1;
    private javax.swing.JPanel panelfill;
    private javax.swing.JTextField txt_usuario1;
    private javax.swing.JTextField txt_usuario10;
    private javax.swing.JTextField txt_usuario11;
    private javax.swing.JTextField txt_usuario12;
    private javax.swing.JTextField txt_usuario13;
    private javax.swing.JTextField txt_usuario14;
    private javax.swing.JTextField txt_usuario15;
    private javax.swing.JTextField txt_usuario16;
    private javax.swing.JTextField txt_usuario17;
    private javax.swing.JTextField txt_usuario18;
    private javax.swing.JTextField txt_usuario2;
    private javax.swing.JTextField txt_usuario3;
    private javax.swing.JTextField txt_usuario4;
    private javax.swing.JTextField txt_usuario5;
    private javax.swing.JTextField txt_usuario6;
    private javax.swing.JTextField txt_usuario7;
    private javax.swing.JTextField txt_usuario8;
    private javax.swing.JTextField txt_usuario9;
    // End of variables declaration//GEN-END:variables
}
