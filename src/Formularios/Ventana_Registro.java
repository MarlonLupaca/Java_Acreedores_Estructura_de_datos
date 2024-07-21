package Formularios;

import Clases.Usuario;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ImplementacionesDAO.*;
import InterfacesDAO.*;
import javax.swing.JFrame;

public class Ventana_Registro extends javax.swing.JPanel {
    private JPanel ContenedorPadre;
    private JFrame principal;

    public Ventana_Registro(JPanel Padre, JFrame principal) {
        initComponents();
        
        this.ContenedorPadre = Padre;
        this.principal = principal;
        
        //PlaceHolder
        Usuario.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Usuario");
        Nombre.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Nombre");
        Apellido.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Apellido");
        contrasena.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Contraseña");
        
        //Limpiador
        Usuario.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        Nombre.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        Apellido.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        contrasena.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        
        //Visualizador
        contrasena.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");
    }
    
    private void visualizador(JPanel p) {
        p.setSize(500, 550);
        p.setLocation(0,0);
        
        ContenedorPadre.removeAll();
        ContenedorPadre.setLayout(new BorderLayout());
        ContenedorPadre.add(p, BorderLayout.CENTER);
        ContenedorPadre.revalidate();
        ContenedorPadre.repaint();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        padre = new javax.swing.JPanel();
        panel = new Estilos_graficos.PanelRound();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        panelRound3 = new Estilos_graficos.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        b4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();
        JC_SEXO = new javax.swing.JComboBox<>();
        JC_CARGO = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(211, 217, 228));
        setPreferredSize(new java.awt.Dimension(500, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        padre.setBackground(new java.awt.Color(211, 217, 228));
        padre.setMinimumSize(new java.awt.Dimension(500, 550));
        padre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(129, 148, 175));
        panel.setMinimumSize(new java.awt.Dimension(500, 550));
        panel.setPreferredSize(new java.awt.Dimension(500, 550));
        panel.setRoundBottomLeft(40);
        panel.setRoundBottomRight(40);
        panel.setRoundTopLeft(40);
        panel.setRoundTopRight(40);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(71, 89, 77));
        jLabel18.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Usuario:");
        panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 70, 20));

        jLabel19.setBackground(new java.awt.Color(71, 89, 77));
        jLabel19.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sexo:");
        panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 20));

        Usuario.setBackground(new java.awt.Color(255, 255, 255));
        Usuario.setFont(new java.awt.Font("Nunito", 0, 15)); // NOI18N
        Usuario.setMargin(new java.awt.Insets(2, 10, 2, 10));
        panel.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 200, 30));

        panelRound3.setBackground(new java.awt.Color(64, 78, 103));
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Nunito", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("¡Registrate!");
        panelRound3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 190, 60));

        jLabel1.setFont(new java.awt.Font("Nunito", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelRound3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 30, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img_usuario_login_2.png"))); // NOI18N
        panelRound3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, 140));

        panel.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 140));

        b4.setBackground(new java.awt.Color(64, 78, 103));
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Registrarse");
        b4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 120, 40));

        panel.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 180, 40));

        jLabel22.setBackground(new java.awt.Color(71, 89, 77));
        jLabel22.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nombre:");
        panel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 70, 20));

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Nunito", 0, 15)); // NOI18N
        Nombre.setMargin(new java.awt.Insets(2, 10, 2, 10));
        panel.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 200, 30));

        jLabel23.setBackground(new java.awt.Color(71, 89, 77));
        jLabel23.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Apellido:");
        panel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, 20));

        Apellido.setBackground(new java.awt.Color(255, 255, 255));
        Apellido.setFont(new java.awt.Font("Nunito", 0, 15)); // NOI18N
        Apellido.setMargin(new java.awt.Insets(2, 10, 2, 10));
        panel.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, 30));

        jLabel24.setBackground(new java.awt.Color(71, 89, 77));
        jLabel24.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cargo:");
        panel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 90, 20));

        jLabel25.setBackground(new java.awt.Color(71, 89, 77));
        jLabel25.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Contraseña:");
        panel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 120, 20));

        contrasena.setBackground(new java.awt.Color(255, 255, 255));
        contrasena.setFont(new java.awt.Font("Nunito", 0, 15)); // NOI18N
        panel.add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 200, 30));

        JC_SEXO.setBackground(new java.awt.Color(255, 255, 255));
        JC_SEXO.setFont(new java.awt.Font("Nunito", 0, 15)); // NOI18N
        JC_SEXO.setForeground(new java.awt.Color(0, 0, 0));
        JC_SEXO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        panel.add(JC_SEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 200, 30));

        JC_CARGO.setBackground(new java.awt.Color(255, 255, 255));
        JC_CARGO.setFont(new java.awt.Font("Nunito", 0, 15)); // NOI18N
        JC_CARGO.setForeground(new java.awt.Color(0, 0, 0));
        JC_CARGO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));
        panel.add(JC_CARGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 200, 30));

        padre.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        add(padre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
        if (Usuario.getText().trim().equals("") || Nombre.getText().trim().equals("") || Apellido.getText().trim().equals("") || contrasena.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos");
            
        }else{
            Usuario registro = new Usuario(Usuario.getText(),Nombre.getText(),Apellido.getText(),JC_CARGO.getSelectedItem().toString(),JC_SEXO.getSelectedItem().toString(),contrasena.getText());
            DAOEntidades dao = new DAOEntidadesImpl();
            dao.guardarUsuario(registro);
            JOptionPane.showMessageDialog(null, "Registrado con exito");
           
            Usuario.setText("");
            Nombre.setText("");
            Apellido.setText("");
            contrasena.setText("");
            JC_CARGO.setSelectedIndex(0); 
            JC_SEXO.setSelectedIndex(0);
        }
    }//GEN-LAST:event_b4MouseClicked

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        b4.setBackground(new Color(0x4d5f7c));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        b4.setBackground(new Color(0x404e67));
    }//GEN-LAST:event_b4MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        visualizador(new Ventana_login(ContenedorPadre,principal));
    }//GEN-LAST:event_jLabel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JComboBox<String> JC_CARGO;
    private javax.swing.JComboBox<String> JC_SEXO;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPanel b4;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel padre;
    private Estilos_graficos.PanelRound panel;
    private Estilos_graficos.PanelRound panelRound3;
    // End of variables declaration//GEN-END:variables
}
