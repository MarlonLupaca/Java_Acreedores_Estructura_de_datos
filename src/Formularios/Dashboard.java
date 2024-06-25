
package Formularios;

import Estilos_graficos.MenuItem;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        visualizador(new RegistrarAcreedor());
        execute();
        
        
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
    
    private void addMenu(MenuItem... menu){
        for (int i = 0; i < menu.length; i++) {
            jp_menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }           
        }
        
        jp_menu.revalidate();
    }
    
    
    private void execute() {
        ImageIcon img_flecha_derecha = new ImageIcon(getClass().getResource("/imagenes/flecha_derecha_blanca2.png")); 
        ImageIcon img_subIcon = new ImageIcon(getClass().getResource("/imagenes/subIcon.png")); 
        
        //menu1
        ImageIcon img_registro = new ImageIcon(getClass().getResource("/imagenes/icono1.png")); 
        MenuItem menuRegistro = new MenuItem(img_flecha_derecha,true,false,img_registro,"Registro",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               visualizador(new RegistrarAcreedor());
            }
        });
        //menu2
        ImageIcon img_busqueda = new ImageIcon(getClass().getResource("/imagenes/icono2.png")); 
        MenuItem menuBusqueda = new MenuItem(img_flecha_derecha,true,false,img_busqueda,"Busqueda",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new BuscarAcreedor());
            }
        });
        //menu3
        ImageIcon img_estadistica = new ImageIcon(getClass().getResource("/imagenes/icono3.png")); 
        MenuItem menuEstadistica1 = new MenuItem(null,true,false,img_flecha_derecha,"Dept. Prov. Dist.",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new EstadisticaDPD());
            }
        });
        MenuItem menuEstadistica2 = new MenuItem(null,true,false,img_flecha_derecha,"Dept. y Pliego",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new EstadisticaDPG());
            }
        });
        MenuItem menuEstadistica3 = new MenuItem(null,true,false,img_flecha_derecha,"Dept. y Doc.",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new EstadisticaDD());

            }
        });
        MenuItem menuEstadistica = new MenuItem(img_flecha_derecha,true,true,img_estadistica,"Estadistica",null,menuEstadistica1,menuEstadistica2,menuEstadistica3);
        //menu4
       
        MenuItem menuForm4 = new MenuItem(img_flecha_derecha,true,false,img_busqueda,"Form 4",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new Form6());
            }
        });
        
        
        addMenu(menuRegistro,menuBusqueda,menuEstadistica,menuForm4);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jp_menu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelfill = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MINIMIZAR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(175, 191, 144));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(64, 78, 103));
        jPanel2.setPreferredSize(new java.awt.Dimension(230, 720));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(243, 237, 161));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jp_menu.setBackground(new java.awt.Color(64, 78, 103));
        jp_menu.setLayout(new javax.swing.BoxLayout(jp_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jp_menu);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 390));

        jPanel5.setBackground(new java.awt.Color(64, 78, 103));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(244, 246, 250)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Nunito", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 152, 108));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_das3.png"))); // NOI18N
        jLabel1.setIconTextGap(20);
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 70));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 70));

        jLabel2.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(235, 238, 243));
        jLabel2.setText("Navegacion");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelfill.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Nunito", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 143, 70));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("conectado");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 9, -1, 20));

        jLabel3.setFont(new java.awt.Font("Nunito Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 40, 45));

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
        jPanel3.add(MINIMIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 40, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/conectado.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 0, -1, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1050, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MINIMIZARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MINIMIZARMouseClicked
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) evt.getSource());
        frame.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_MINIMIZARMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MINIMIZAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_menu;
    private javax.swing.JPanel panelfill;
    // End of variables declaration//GEN-END:variables
}
