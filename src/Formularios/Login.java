
package Formularios;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        visualizador(new Ventana_login(panel,this));
    }
    
    private void visualizador(JPanel p) {
        p.setSize(500, 550);
        p.setLocation(0,0);
        panel.removeAll();
        panel.setLayout(new BorderLayout());
        panel.add(p, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        padre = new javax.swing.JPanel();
        panel = new Estilos_graficos.PanelRound();
        MINIMIZAR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        padre.setBackground(new java.awt.Color(211, 217, 228));
        padre.setForeground(new java.awt.Color(175, 191, 144));
        padre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(129, 148, 175));
        panel.setPreferredSize(new java.awt.Dimension(500, 550));
        panel.setRoundBottomLeft(40);
        panel.setRoundBottomRight(40);
        panel.setRoundTopLeft(40);
        panel.setRoundTopRight(40);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        padre.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        MINIMIZAR.setFont(new java.awt.Font("Nunito Black", 1, 36)); // NOI18N
        MINIMIZAR.setForeground(new java.awt.Color(102, 102, 102));
        MINIMIZAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MINIMIZAR.setText("_");
        MINIMIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MINIMIZAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MINIMIZARMouseClicked(evt);
            }
        });
        padre.add(MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 40, 30));

        jLabel2.setFont(new java.awt.Font("Nunito Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        padre.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 45));

        getContentPane().add(padre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MINIMIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MINIMIZARMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            UIManager.put("Component.focusColor", Color.decode("#404e67"));
            UIManager.put("Component.focusWidth", 1);

           
        } catch (Exception e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MINIMIZAR;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel padre;
    private Estilos_graficos.PanelRound panel;
    // End of variables declaration//GEN-END:variables
}
