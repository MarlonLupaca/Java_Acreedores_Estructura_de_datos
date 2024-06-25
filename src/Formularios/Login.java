
package Formularios;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;


public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        txt_contraseña.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "contraseña");
        txt_usuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "usuario");
        //
        txt_contraseña.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_usuario.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_contraseña.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        b1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        panelRound2 = new Estilos_graficos.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MINIMIZAR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(211, 217, 228));
        jPanel1.setForeground(new java.awt.Color(175, 191, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(129, 148, 175));
        panelRound1.setPreferredSize(new java.awt.Dimension(500, 550));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_usuario_login_2.png"))); // NOI18N
        panelRound1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 110));

        jLabel12.setBackground(new java.awt.Color(71, 89, 77));
        jLabel12.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Usuario:");
        panelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 20));

        jLabel13.setBackground(new java.awt.Color(71, 89, 77));
        jLabel13.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contraseña:");
        panelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, 20));

        txt_usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_usuario.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        txt_usuario.setMargin(new java.awt.Insets(2, 10, 2, 10));
        panelRound1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 400, 40));

        b1.setBackground(new java.awt.Color(64, 78, 103));
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b1MousePressed(evt);
            }
        });
        b1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Iniciar sesion");
        b1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        panelRound1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 435, 400, 40));

        txt_contraseña.setBackground(new java.awt.Color(255, 255, 255));
        txt_contraseña.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        panelRound1.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 400, 40));

        panelRound2.setBackground(new java.awt.Color(64, 78, 103));
        panelRound2.setPreferredSize(new java.awt.Dimension(450, 140));
        panelRound2.setRoundTopLeft(40);
        panelRound2.setRoundTopRight(40);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Nunito", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¡Bienvenido!");
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 250, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_logo_login.png"))); // NOI18N
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 140));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

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
        jPanel1.add(MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 0, 40, 30));

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        Dashboard newframe = new Dashboard();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0x4d5f7c));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0x404e67));
    }//GEN-LAST:event_b1MouseExited

    private void b1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1MousePressed

    private void MINIMIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MINIMIZARMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JPanel b1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private Estilos_graficos.PanelRound panelRound1;
    private Estilos_graficos.PanelRound panelRound2;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
