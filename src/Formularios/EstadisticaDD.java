package Formularios;

import Clases.EntidadGubernamental;
import Estilos_graficos.card2;
import ImplementacionesDAO.DAOEntidadesImpl;
import InterfacesDAO.DAOEntidades;
import TADArbolBinarioGenerico.ArbolBinarioImpl;
import TADArbolBinarioGenerico.NodoGenericoArbol;
import TADBusquedaBinaria.TADBusquedaBinariaImpl;
import TADBusquedaBinaria.TADBusquedaBinariaInterface;
import TADListaEnlazadaDoble.Nodo;
import TADListaEnlazadaDoble.TADListaEnlazadaImpl;
import TADListaEnlazadaDoble.TADListaEnlazadaInterface;
import TADMetodos_de_ordenamiento.TADOrdenamientoInterface;
import TADMetodos_de_ordenamiento.TADOrdenamientoMergeSortImpl;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

public class EstadisticaDD extends javax.swing.JPanel {
    
    TADListaEnlazadaInterface listaGlobal = new TADListaEnlazadaImpl();
    TADListaEnlazadaInterface listaQueSeExportara = new TADListaEnlazadaImpl();
    DAOEntidades dao = new DAOEntidadesImpl();

    public EstadisticaDD() {
        initComponents();
        cargarDatos();
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
    
    private void recorrer(NodoGenericoArbol<String> raiz) {
        if (raiz != null) {
            recorrer(raiz.getHojaIzquierda());
            
            String nombre = (String) raiz.getValor();
            String deuda = totalizarCategorizado(nombre, 3);

            DecimalFormat formatoSoles = new DecimalFormat("###,###,##0.00");
            String totalFormateado = "S/ " + formatoSoles.format((Double.parseDouble(deuda)));

            card2 cardPanel = new card2(nombre, totalFormateado);

            resultadosDistritos.add(cardPanel);
            recorrer(raiz.getHojaDerecha());
        }
    }
    
    private String totalizarCategorizado(String dato, int columna)
    {
        DefaultTableModel modeloDefecto = ( DefaultTableModel) tabla_acreedores.getModel();
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
    
    private void extraidoDocumentos(){
        // Crear un comparador para cadenas (orden natural)
        Comparator<String> comparadorStrings = Comparator.naturalOrder();

        // Crear un árbol binario de cadenas
        ArbolBinarioImpl<String> arbolStrings = new ArbolBinarioImpl<>(comparadorStrings);
        
        
        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        int columnaIndex = 3;

        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            String nombre = (String) modeloDefecto.getValueAt(fila, columnaIndex);
            
            NodoGenericoArbol<String> nodoBuscar = new NodoGenericoArbol<>(nombre);
            NodoGenericoArbol<String> nodoEncontrado = arbolStrings.buscar(nodoBuscar);
            
            
            
            if (nodoEncontrado == null) {
                arbolStrings.insertar(new NodoGenericoArbol<>(nombre));
            }
        }
        resultadosDistritos.removeAll();
        
        recorrer(arbolStrings.getRaiz());

        resultadosDistritos.revalidate();
        resultadosDistritos.repaint();
        
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
        
        listaQueSeExportara = listaOrdenada;
        
        Nodo iterador = ((TADListaEnlazadaImpl) listaOrdenada).getCabecera();
        //se itera la lista 
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getTipoDocumento(),
                entidad.getMontoDeuda(),
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_acreedores = new javax.swing.JTable();
        jcDepa = new javax.swing.JComboBox<>();
        panelRound2 = new Estilos_graficos.PanelRound();
        lb_total = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tex1 = new javax.swing.JScrollPane();
        resultadosDistritos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(244, 246, 250));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nunito", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Montos acumulados por Depto. y Tipo de Doc");
        panelfill.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 750, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Nunito", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Departamento:");
        jLabel3.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 40));

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
        jLabel10.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Exportar");
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 110, 30));

        b.setBackground(new java.awt.Color(1, 169, 172));
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel9.setFont(new java.awt.Font("Nunito Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Totalizar");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 110, -1));

        tabla_acreedores.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        tabla_acreedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RUC", "REMYPE DEP.", "REMYPE PRO.", "DOCUMENTO", "MON. DEUDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_acreedores.setGridColor(new java.awt.Color(240, 240, 240));
        tabla_acreedores.setRowHeight(25);
        tabla_acreedores.setSelectionBackground(new java.awt.Color(97, 119, 150));
        tabla_acreedores.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tabla_acreedores);

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane1.getVerticalScrollBar().setBlockIncrement(50);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 560, 480));

        jcDepa.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jcDepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        jcDepa.setPreferredSize(new java.awt.Dimension(72, 40));
        jcDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDepaActionPerformed(evt);
            }
        });
        jPanel1.add(jcDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 160, -1));

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
        panelRound2.add(lb_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 250, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Total:");
        jLabel11.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 50, 30));

        tex1.setBorder(null);

        resultadosDistritos.setBackground(new java.awt.Color(255, 255, 255));
        resultadosDistritos.setLayout(new javax.swing.BoxLayout(resultadosDistritos, javax.swing.BoxLayout.Y_AXIS));
        tex1.setViewportView(resultadosDistritos);

        tex1.getVerticalScrollBar().setUnitIncrement(16);
        tex1.getVerticalScrollBar().setBlockIncrement(50);

        panelRound2.add(tex1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 300, 330));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Documento:");
        jLabel8.setPreferredSize(new java.awt.Dimension(119, 40));
        panelRound2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 20));

        jPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 360, 470));

        panelfill.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1000, 600));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        extraidoDocumentos();
        Totalizar();
    }//GEN-LAST:event_bMouseClicked

    private void bMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseEntered
        b.setBackground(new Color(0x01DBDF));
    }//GEN-LAST:event_bMouseEntered

    private void bMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseExited
        b.setBackground(new Color(0x01A9AC));
    }//GEN-LAST:event_bMouseExited

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        dao.ExportaCSV(panelfill, (TADListaEnlazadaImpl) listaQueSeExportara);
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
        
        listaQueSeExportara = listaOrdenadaProvincias;
        
        Nodo iterador = ((TADListaEnlazadaImpl) listaOrdenadaProvincias).getCabecera();
        
        //se itera la lista
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),

                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getTipoDocumento(),
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
    private javax.swing.JTable tabla_acreedores;
    private javax.swing.JScrollPane tex1;
    // End of variables declaration//GEN-END:variables
}
