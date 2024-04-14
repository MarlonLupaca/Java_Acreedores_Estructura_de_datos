
package Estilos_graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Marlon_Mendoza
 */
public class MenuItem extends javax.swing.JPanel {

    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }
    
    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    private ActionListener act;
    private boolean slayer;
    
    public MenuItem(Icon icon,boolean bo,boolean slayer, Icon iconsub, String menuName, ActionListener act, MenuItem... subMenu) {
        initComponents();
        lb_icon.setIcon(icon);
        lb_menu.setText(menuName);
        lb_subicon.setIcon(iconsub);
        lb_subicon.setVisible(bo);
        this.slayer = slayer;
        
        if (act != null) {
            this.act = act;
        }
        
        this.setSize(new Dimension(Integer.MAX_VALUE,50));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE,50));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE,50));
        
        for (int i = 0; i < subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_menu = new javax.swing.JLabel();
        lb_subicon = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(175, 191, 144));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_menu.setForeground(new java.awt.Color(0, 0, 0));
        lb_menu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_menu.setText("Registro");
        lb_menu.setFocusable(false);
        add(lb_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 380, 50));

        lb_subicon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_subicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        add(lb_subicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 50));

        lb_icon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        add(lb_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if(slayer){
            if (showing) {
                hideMenu();
                lb_icon.setIcon(new ImageIcon(getClass().getResource("/imagenes/flecha_derecha.png")));
            } else {
                showMenu();
                lb_icon.setIcon(new ImageIcon(getClass().getResource("/imagenes/flecha_abajo.png")));
            }
            if (act != null) {
                act.actionPerformed(null);
            }
        } else {
            if (showing) {
                hideMenu(); 
            } else {
                showMenu();
            }
            if (act != null) {
                act.actionPerformed(null);
            }
            
        }
        
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_formMouseExited
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lb_icon;
    private javax.swing.JLabel lb_menu;
    private javax.swing.JLabel lb_subicon;
    // End of variables declaration//GEN-END:variables

    public void hideMenu()
    {
        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = subMenu.size()-1; i >= 0; i--) {
                    sleep();
                    subMenu.get(i).setVisible(false);
                    subMenu.get(i).hideMenu();  
                }
                getParent().repaint();
                getParent().revalidate();
                showing = false;
            }
        }).start();
    }
    public void showMenu()
    {
        new Thread(new Runnable() {
            @Override
            public void run(){
                for (int i = 0; i < subMenu.size(); i++) {
                    sleep();
                    subMenu.get(i).setVisible(true);  
                }
                showing = true;
                getParent().repaint();
                getParent().revalidate();
                
            }
        }).start();
    }
    private void sleep(){
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
    

}
