
package Formularios;

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
import TADListaEnlazadaLibre.NodoAux;
import java.text.DecimalFormat;
import TADListaEnlazadaLibre.*;

/**
 *
 * @author Marlon_Mendoza
 */
public class Form3 extends javax.swing.JPanel {
    
    TADListaEnlazadaInterface listaGlobal = new TADListaEnlazadaImpl();
    
    DAOEntidades dao = new DAOEntidadesImpl();
    public Form3() {
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
        TADListaLibreInterface listaUnicos = new TADListaLibreImpl();

        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        int columnaIndex = 2;

        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            String nombre = (String) modeloDefecto.getValueAt(fila, columnaIndex);
            
            if (!listaUnicos.contiene(nombre)) {
                NodoAux nuevo = new NodoAux(nombre);
                listaUnicos.crearNodo(nuevo);
            }
        }

        resultadosProvincias.removeAll();

        NodoAux actual = ((TADListaLibreImpl) listaUnicos).getCabecera(); 

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
        TADListaLibreInterface listaUnicos = new TADListaLibreImpl();

        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        int columnaIndex = 3;

        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            String nombre = (String) modeloDefecto.getValueAt(fila, columnaIndex);
            
            if (!listaUnicos.contiene(nombre)) {
                NodoAux nuevo = new NodoAux(nombre);
                listaUnicos.crearNodo(nuevo);
            }
        }
        resultadosDistritos.removeAll();
        
        NodoAux actual = ((TADListaLibreImpl) listaUnicos).getCabecera(); 

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
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcDepa = new javax.swing.JComboBox<>();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(243, 237, 161));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(175, 191, 144));
        panelRound1.setRoundBottomRight(60);
        panelRound1.setRoundTopRight(60);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 89, 77));
        jLabel2.setText("Montos acumulados por Depto., Prov. y Distrito");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 980, 70));

        panelfill.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1030, 70));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Departamento:");
        jLabel3.setPreferredSize(new java.awt.Dimension(119, 40));
        panelfill.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jcDepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        jcDepa.setPreferredSize(new java.awt.Dimension(72, 40));
        jcDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDepaActionPerformed(evt);
            }
        });
        panelfill.add(jcDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, -1));

        b.setBackground(new java.awt.Color(175, 191, 144));
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Totalizar");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png"))); // NOI18N
        b.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        panelfill.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 180, 40));

        b1.setBackground(new java.awt.Color(175, 191, 144));
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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Exportar");
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        b1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        panelfill.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 590, 180, 40));

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
        jScrollPane1.setViewportView(tabla_acreedores);
        if (tabla_acreedores.getColumnModel().getColumnCount() > 0) {
            tabla_acreedores.getColumnModel().getColumn(0).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        panelfill.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 470, 480));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(50);
        panelRound2.setRoundBottomRight(50);
        panelRound2.setRoundTopLeft(50);
        panelRound2.setRoundTopRight(50);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_total.setBackground(new java.awt.Color(0, 0, 0));
        lb_total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_total.setForeground(new java.awt.Color(0, 0, 0));
        lb_total.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(lb_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 290, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total:");
        jLabel11.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 50, -1));

        tex.setBorder(null);

        resultadosProvincias.setBackground(new java.awt.Color(255, 255, 255));
        resultadosProvincias.setLayout(new javax.swing.BoxLayout(resultadosProvincias, javax.swing.BoxLayout.Y_AXIS));
        tex.setViewportView(resultadosProvincias);

        panelRound2.add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 270));

        tex1.setBorder(null);

        resultadosDistritos.setBackground(new java.awt.Color(255, 255, 255));
        resultadosDistritos.setLayout(new javax.swing.BoxLayout(resultadosDistritos, javax.swing.BoxLayout.Y_AXIS));
        tex1.setViewportView(resultadosDistritos);

        panelRound2.add(tex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 200, 270));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Distrito: ");
        jLabel8.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Provincias: ");
        jLabel13.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, -1));

        panelfill.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 480, 400));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Reporte: ");
        jLabel12.setPreferredSize(new java.awt.Dimension(119, 40));
        panelfill.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 80, 40));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        ExtraidoDis();
        Totalizar();
        ExtraidoDep();
    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_bMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0xAFBF90));
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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcDepa;
    private javax.swing.JLabel lb_total;
    private Estilos_graficos.PanelRound panelRound1;
    private Estilos_graficos.PanelRound panelRound2;
    private javax.swing.JPanel panelfill;
    private javax.swing.JPanel resultadosDistritos;
    private javax.swing.JPanel resultadosProvincias;
    private javax.swing.JTable tabla_acreedores;
    private javax.swing.JScrollPane tex;
    private javax.swing.JScrollPane tex1;
    // End of variables declaration//GEN-END:variables
}
