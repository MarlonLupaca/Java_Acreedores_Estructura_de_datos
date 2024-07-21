
package Formularios;

import Clases.Usuario;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import ImplementacionesDAO.*;
import InterfacesDAO.*;
import TADPilaGenerica.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana_login extends javax.swing.JPanel {
    
    private JPanel padreContenedor;
    private JFrame principal;

    public Ventana_login(JPanel padre, JFrame principal) {
        initComponents(); 
        padreContenedor = padre;
        this.principal = principal;
        contrasena_login.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "contraseña");
        usuario_login.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "usuario");
        //
        contrasena_login.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        usuario_login.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        contrasena_login.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
        
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

        panel = new Estilos_graficos.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        usuario_login = new javax.swing.JTextField();
        b1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        contrasena_login = new javax.swing.JPasswordField();
        panelRound2 = new Estilos_graficos.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(211, 217, 228));

        panel.setBackground(new java.awt.Color(129, 148, 175));
        panel.setPreferredSize(new java.awt.Dimension(500, 550));
        panel.setRoundBottomLeft(40);
        panel.setRoundBottomRight(40);
        panel.setRoundTopLeft(40);
        panel.setRoundTopRight(40);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_usuario_login_2.png"))); // NOI18N
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 110));

        jLabel12.setBackground(new java.awt.Color(71, 89, 77));
        jLabel12.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Usuario:");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 20));

        jLabel13.setBackground(new java.awt.Color(71, 89, 77));
        jLabel13.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Contraseña:");
        panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, 20));

        usuario_login.setBackground(new java.awt.Color(255, 255, 255));
        usuario_login.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        usuario_login.setMargin(new java.awt.Insets(2, 10, 2, 10));
        panel.add(usuario_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 400, 40));

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
        b1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        panel.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 180, 40));

        contrasena_login.setBackground(new java.awt.Color(255, 255, 255));
        contrasena_login.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        panel.add(contrasena_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 400, 40));

        panelRound2.setBackground(new java.awt.Color(64, 78, 103));
        panelRound2.setRoundTopLeft(40);
        panelRound2.setRoundTopRight(40);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Nunito", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¡Bienvenido!");
        panelRound2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 250, 60));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_logo_login.png"))); // NOI18N
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 140));

        panel.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        b2.setBackground(new java.awt.Color(64, 78, 103));
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        });
        b2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Registrate");
        b2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 40));

        panel.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        
        DAOEntidades dao = new DAOEntidadesImpl();
        TADPilaImpl listaDeUsuarios = dao.cargarUsuarios();
        
        NodoAux cabecera = listaDeUsuarios.getCabecera();
        while (cabecera != null) {            
            Usuario usuario = (Usuario) cabecera.getContenido();
            if (usuario.getUsuario().equals(usuario_login.getText()) && usuario.getContrasena().equals(contrasena_login.getText())) {
                System.err.println("Encontrado");
                Dashboard newframe = new Dashboard(usuario.getNombre(),usuario.getApellido());
                newframe.setVisible(true);
                principal.dispose();
                return;
            }
            cabecera = cabecera.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        
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

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        visualizador(new Ventana_Registro(padreContenedor,principal));
        

    }//GEN-LAST:event_b2MouseClicked

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        b2.setBackground(new Color(0x4d5f7c));
    }//GEN-LAST:event_b2MouseEntered

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited

        b2.setBackground(new Color(0x404e67));
    }//GEN-LAST:event_b2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b1;
    private javax.swing.JPanel b2;
    private javax.swing.JPasswordField contrasena_login;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private Estilos_graficos.PanelRound panel;
    private Estilos_graficos.PanelRound panelRound2;
    private javax.swing.JTextField usuario_login;
    // End of variables declaration//GEN-END:variables
}
