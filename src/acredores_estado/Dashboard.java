
package acredores_estado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        visualizador(new Form1());
        
        
    }
    private void visualizador(JPanel p)
    {
        p.setSize(1050, 720);
        p.setLocation(0,0);
        panelfill.removeAll();
        panelfill.add(p,BorderLayout.CENTER);
        panelfill.revalidate();
        panelfill.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        b2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        panelRound1 = new Estilos.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelfill = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(243, 237, 161));
        jPanel1.setForeground(new java.awt.Color(175, 191, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(175, 191, 144));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons2.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 5, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar_Dashboard.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 5, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 80, 40));

        jPanel2.setBackground(new java.awt.Color(243, 237, 161));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 720));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b.setBackground(new java.awt.Color(175, 191, 144));
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.setPreferredSize(new java.awt.Dimension(230, 50));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bMousePressed(evt);
            }
        });
        b.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Busqueda");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png"))); // NOI18N
        b.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel2.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, 50));

        b1.setBackground(new java.awt.Color(175, 191, 144));
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.setPreferredSize(new java.awt.Dimension(230, 50));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b1MousePressed(evt);
            }
        });
        b1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Estadistica");
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono3.png"))); // NOI18N
        b1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel2.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 230, 50));

        b2.setBackground(new java.awt.Color(175, 191, 144));
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.setPreferredSize(new java.awt.Dimension(230, 50));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b2MousePressed(evt);
            }
        });
        b2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Registro");
        jLabel11.setFocusable(false);
        b2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 50));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        b2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 230, 50));

        b3.setBackground(new java.awt.Color(175, 191, 144));
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.setPreferredSize(new java.awt.Dimension(230, 50));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b3MousePressed(evt);
            }
        });
        b3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Form 4");
        b3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 50));

        jPanel2.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 230, 50));

        panelRound1.setBackground(new java.awt.Color(175, 191, 144));
        panelRound1.setRoundBottomLeft(100);
        panelRound1.setRoundBottomRight(100);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_Dashboar.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 210));

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 220));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout panelfillLayout = new javax.swing.GroupLayout(panelfill);
        panelfill.setLayout(panelfillLayout);
        panelfillLayout.setHorizontalGroup(
            panelfillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        panelfillLayout.setVerticalGroup(
            panelfillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        jPanel1.add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1050, 680));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        visualizador(new Form2());
    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_bMouseExited

    private void bMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMousePressed

    }//GEN-LAST:event_bMousePressed

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
       visualizador(new Form3());
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_b1MouseExited

    private void b1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MousePressed

    }//GEN-LAST:event_b1MousePressed

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        visualizador(new Form1());
    }//GEN-LAST:event_b2MouseClicked

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        b2.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_b2MouseEntered

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        b2.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_b2MouseExited

    private void b2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MousePressed

    }//GEN-LAST:event_b2MousePressed

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
       visualizador(new Form4());
    }//GEN-LAST:event_b3MouseClicked

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        b3.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        b3.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_b3MouseExited

    private void b3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MousePressed

    }//GEN-LAST:event_b3MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b;
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPanel b3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private Estilos.PanelRound panelRound1;
    private javax.swing.JPanel panelfill;
    // End of variables declaration//GEN-END:variables
}
