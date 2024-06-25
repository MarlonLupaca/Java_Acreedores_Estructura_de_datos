
package Formularios;

import TADPila.TADPilaInterface;
import TADPila.TADPilaImpl;
import Clases.EntidadGubernamental;
import Estilos_graficos.card;
import ImplementacionesDAO.DAOEntidadesImpl;
import InterfacesDAO.DAOEntidades;
import TADEstructurasDeDatos.Nodo;
import TADEstructurasDeDatos.TADListaEnlazadaImpl;
import TADEstructurasDeDatos.TADListaEnlazadaInterface;
import TADMetodos_de_ordenamiento.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import TADBusquedaBinaria.*;
import TADPila.NodoAux;
import java.text.DecimalFormat;

public class EstadisticaDPD extends javax.swing.JPanel {
    
    TADListaEnlazadaInterface listaGlobal = new TADListaEnlazadaImpl();
    
    DAOEntidades dao = new DAOEntidadesImpl();
    public EstadisticaDPD() {
        initComponents();
        cargarDatos();
    }

    private void cargarDatos(){
        
        TADListaEnlazadaInterface listaEnlazada = new TADListaEnlazadaImpl();

        listaEnlazada = dao.cargardatos();
        
        TADOrdenamientoInterface ordenamiento = new TADOrdenamientoMergeSortImpl();
        TADListaEnlazadaImpl listaOrdenada = ordenamiento.OrdenarPorTexto((TADListaEnlazadaImpl) listaEnlazada, 0, listaEnlazada.tamaño(), 4);
        listaOrdenada.OrdenandoIndices();
        listaGlobal = listaOrdenada;
   
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
        tabla_acreedores.getTableHeader().setBackground(new Color(0x617796));
        tabla_acreedores.getTableHeader().setForeground(Color.WHITE);
        modeloTabla.setRowCount(0);
        
        Nodo iterador = ((TADListaEnlazadaImpl) listaOrdenada).getCabecera();
        //se itera la lista 
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getMontoDeuda(),
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
        
    }
    private void ExtraidoDep(){
        TADPilaInterface<String> listaUnicos = new TADPilaImpl<String>();
        
        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        int columnaIndex = 2;

        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            String nombre = (String) modeloDefecto.getValueAt(fila, columnaIndex);
            
            if (!listaUnicos.contiene(nombre)) {
                NodoAux nuevo = new NodoAux(nombre);
                listaUnicos.push(nuevo);
            }
        }

        resultadosProvincias.removeAll();

        NodoAux actual = ((TADPilaImpl) listaUnicos).getCabecera(); 

            while (actual != null) {
            String nombre = (String) actual.getContenido();
            String deuda = totalizarCategorizado(nombre, 2);

            DecimalFormat formatoSoles = new DecimalFormat("###,###,##0.00");
            String totalFormateado = "S/ " + formatoSoles.format((Double.parseDouble(deuda)));

            
            card cardPanel = new card(nombre, totalFormateado);

            resultadosProvincias.add(cardPanel);


            actual = actual.getSiguiente();
        }

        resultadosProvincias.revalidate();
        resultadosProvincias.repaint();
    }
    private void ExtraidoDis(){
        TADPilaInterface<String> listaUnicos = new TADPilaImpl<String>();
        
        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        int columnaIndex = 3;

        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            String nombre = (String) modeloDefecto.getValueAt(fila, columnaIndex);
            
            if (!listaUnicos.contiene(nombre)) {
                NodoAux nuevo = new NodoAux(nombre);
                listaUnicos.push(nuevo);
            }
        }
        resultadosDistritos.removeAll();
        
        NodoAux actual = ((TADPilaImpl) listaUnicos).getCabecera(); 

        while (actual != null) {
            String nombre = (String) actual.getContenido();
            String deuda = totalizarCategorizado(nombre, 3);

            DecimalFormat formatoSoles = new DecimalFormat("###,###,##0.00");
            String totalFormateado = "S/ " + formatoSoles.format((Double.parseDouble(deuda)));

            card cardPanel = new card(nombre, totalFormateado);

            resultadosDistritos.add(cardPanel);

            actual = actual.getSiguiente();
        }

        resultadosDistritos.revalidate();
        resultadosDistritos.repaint();
        }
    
    private String totalizarCategorizado(String dato, int columna)
    {
        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        int columnaIndex = columna;
        double totalDeuda = 0.0;
        
        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            
            String valor = String.valueOf(modeloDefecto.getValueAt(fila, columnaIndex));
            if (valor.equals(dato)) {
                double valorPrecio = (double) modeloDefecto.getValueAt(fila, 4);
                totalDeuda += valorPrecio;
            }
        }
        return String.valueOf(totalDeuda);
        
    }
    
    private void Totalizar(){
        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        int columnaIndex = 4;
        double totalDeuda = 0.0;

        
        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            double valor = (double) modeloDefecto.getValueAt(fila, columnaIndex);
            totalDeuda += valor;
        }

        
        DecimalFormat formatoSoles = new DecimalFormat("###,###,##0.00");
        String totalFormateado = "S/ " + formatoSoles.format(totalDeuda);

        
        lb_total.setText(totalFormateado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcDepa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_acreedores = new javax.swing.JTable();
        panelRound2 = new Estilos_graficos.PanelRound();
        lb_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tex = new javax.swing.JScrollPane();
        resultadosProvincias = new javax.swing.JPanel();
        tex1 = new javax.swing.JScrollPane();
        resultadosDistritos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(244, 246, 250));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nunito", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Montos acumulados por Depto., Prov. y Distrito");
        panelfill.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 980, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250)));
        jPanel1.setForeground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Departamento:");
        jLabel3.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, -1));

        jcDepa.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jcDepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        jcDepa.setPreferredSize(new java.awt.Dimension(72, 40));
        jcDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDepaActionPerformed(evt);
            }
        });
        jPanel1.add(jcDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 160, -1));

        tabla_acreedores.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        tabla_acreedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RUC", "REMYPE DEP.", "REMYPE PRO.", "REMYPE DISTRI.", "MON. DEUDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_acreedores.setSelectionBackground(new java.awt.Color(97, 119, 150));
        jScrollPane1.setViewportView(tabla_acreedores);
        if (tabla_acreedores.getColumnModel().getColumnCount() > 0) {
            tabla_acreedores.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 420, 480));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 78, 103)), " Reporte ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nunito", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_total.setBackground(new java.awt.Color(0, 0, 0));
        lb_total.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        lb_total.setForeground(new java.awt.Color(0, 0, 0));
        lb_total.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(lb_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 360, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total:");
        jLabel11.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 50, 30));

        tex.setBorder(null);

        resultadosProvincias.setBackground(new java.awt.Color(255, 255, 255));
        resultadosProvincias.setLayout(new javax.swing.BoxLayout(resultadosProvincias, javax.swing.BoxLayout.Y_AXIS));
        tex.setViewportView(resultadosProvincias);

        panelRound2.add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 330));

        tex1.setBorder(null);

        resultadosDistritos.setBackground(new java.awt.Color(255, 255, 255));
        resultadosDistritos.setLayout(new javax.swing.BoxLayout(resultadosDistritos, javax.swing.BoxLayout.Y_AXIS));
        tex1.setViewportView(resultadosDistritos);

        panelRound2.add(tex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 200, 330));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Distrito: ");
        jLabel8.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 100, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Provincias: ");
        jLabel13.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 20));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 480, 470));

        b1.setBackground(new java.awt.Color(1, 169, 172));
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

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Exportar");
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 30));

        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 530, 120, -1));

        b.setBackground(new java.awt.Color(1, 169, 172));
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b.setPreferredSize(new java.awt.Dimension(160, 40));
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
        });
        b.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Totalizar");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 110, 30));

        panelfill.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 980, 590));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        ExtraidoDis();
        Totalizar();
        ExtraidoDep();
    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(new Color(0x01DBDF));
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(0x01A9AC));
    }//GEN-LAST:event_bMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0x01DBDF));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0x01A9AC));
    }//GEN-LAST:event_b1MouseExited

    private void jcDepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcDepaActionPerformed
        TADListaEnlazadaInterface listaFiltrada = new TADListaEnlazadaImpl();
        TADListaEnlazadaInterface listaOrdenadaProvincias = new TADListaEnlazadaImpl();
        TADOrdenamientoInterface ordenamiento = new TADOrdenamientoMergeSortImpl();

        TADBusquedaBinariaInterface binaria =  new TADBusquedaBinariaImpl();
        
        listaFiltrada = binaria.obtenerOcurrencias((TADListaEnlazadaImpl) listaGlobal, jcDepa.getSelectedItem().toString(), 4, 2);
        listaFiltrada.OrdenandoIndices();
        
        listaOrdenadaProvincias = ordenamiento.OrdenarPorTexto((TADListaEnlazadaImpl) listaFiltrada, 0, listaFiltrada.tamaño(), 5);
        listaOrdenadaProvincias.OrdenandoIndices();
        
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
        modeloTabla.setRowCount(0);
        Nodo iterador = ((TADListaEnlazadaImpl) listaOrdenadaProvincias).getCabecera();
        //se itera la lista 
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getMontoDeuda(),
                
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
        
    }//GEN-LAST:event_jcDepaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel b;
    private javax.swing.JPanel b1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcDepa;
    private javax.swing.JLabel lb_total;
    private Estilos_graficos.PanelRound panelRound2;
    private javax.swing.JPanel panelfill;
    private javax.swing.JPanel resultadosDistritos;
    private javax.swing.JPanel resultadosProvincias;
    private javax.swing.JTable tabla_acreedores;
    private javax.swing.JScrollPane tex;
    private javax.swing.JScrollPane tex1;
    // End of variables declaration//GEN-END:variables
}
