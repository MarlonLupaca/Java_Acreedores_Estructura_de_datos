
package Formularios;

import Estilos_graficos.MenuItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        visualizador(new Form1());
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
        ImageIcon img_flecha_derecha = new ImageIcon(getClass().getResource("/imagenes/flecha_derecha.png")); 
        ImageIcon img_subIcon = new ImageIcon(getClass().getResource("/imagenes/subIcon.png")); 
        
        //menu1
        ImageIcon img_registro = new ImageIcon(getClass().getResource("/imagenes/icono1.png")); 
        MenuItem menuRegistro = new MenuItem(img_flecha_derecha,true,false,img_registro,"Registro",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               visualizador(new Form1());
            }
        });
        //menu2
        ImageIcon img_busqueda = new ImageIcon(getClass().getResource("/imagenes/icono2.png")); 
        MenuItem menuBusqueda = new MenuItem(img_flecha_derecha,true,false,img_busqueda,"Busqueda",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new Form2());
            }
        });
        //menu3
        ImageIcon img_estadistica = new ImageIcon(getClass().getResource("/imagenes/icono3.png")); 
        MenuItem menuEstadistica1 = new MenuItem(img_subIcon,true,false,img_flecha_derecha,"Dept. Prov. Dist.",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new Form3());
            }
        });
        MenuItem menuEstadistica2 = new MenuItem(img_subIcon,true,false,img_flecha_derecha,"Dept. y Pliego",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new Form4());
            }
        });
        MenuItem menuEstadistica3 = new MenuItem(img_subIcon,true,false,img_flecha_derecha,"Dept. y Doc.",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizador(new Form5());

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
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jp_menu = new javax.swing.JPanel();
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

        panelRound1.setBackground(new java.awt.Color(175, 191, 144));
        panelRound1.setRoundBottomLeft(100);
        panelRound1.setRoundBottomRight(100);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_Dashboar.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 160, 210));

        jPanel2.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 220));

        jScrollPane1.setBackground(new java.awt.Color(243, 237, 161));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jp_menu.setBackground(new java.awt.Color(243, 237, 161));
        jp_menu.setLayout(new javax.swing.BoxLayout(jp_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jp_menu);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 230, 390));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_menu;
    private Estilos_graficos.PanelRound panelRound1;
    private javax.swing.JPanel panelfill;
    // End of variables declaration//GEN-END:variables
}
