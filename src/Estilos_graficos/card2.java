
package Estilos_graficos;


public class card2 extends javax.swing.JPanel {

    
    public card2(String nombre, String deuda) {
        initComponents();
        
        this.name.setText(nombre);
        this.deuda.setText(deuda);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        deuda = new javax.swing.JLabel();
        name = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(170, 110));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(170, 110));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(97, 119, 150));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 10));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Deuda");
        jLabel13.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 240, 20));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Nombre: ");
        jLabel14.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 20));

        deuda.setBackground(new java.awt.Color(0, 0, 0));
        deuda.setForeground(new java.awt.Color(0, 0, 0));
        deuda.setText("Nombre");
        deuda.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 20));

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Nombre");
        name.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 290, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deuda;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
