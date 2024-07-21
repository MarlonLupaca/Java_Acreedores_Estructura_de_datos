package Formularios;

import TADTablaHash.TADTablashashImpl;
import TADTablaHash.TADTablahashInterface;
import Clases.EntidadGubernamental;
import Estilos_graficos.card;
import ImplementacionesDAO.DAOEntidadesImpl;
import InterfacesDAO.DAOEntidades;
import TADBusquedaBinaria.TADBusquedaBinariaImpl;
import TADBusquedaBinaria.TADBusquedaBinariaInterface;
import TADListaEnlazadaDoble.Nodo;
import TADListaEnlazadaDoble.TADListaEnlazadaImpl;
import TADListaEnlazadaDoble.TADListaEnlazadaInterface;
import TADMetodos_de_ordenamiento.TADOrdenamientoInterface;
import TADMetodos_de_ordenamiento.TADOrdenamientoMergeSortImpl;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

public class EstadisticaDPG extends javax.swing.JPanel {

    //Inicializaciones
    DAOEntidades dao = new DAOEntidadesImpl();
    TADListaEnlazadaInterface listaGlobal = new TADListaEnlazadaImpl();
    TADListaEnlazadaInterface listaQueSeExportara = new TADListaEnlazadaImpl();
    
    public EstadisticaDPG() {
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
        
        listaQueSeExportara = listaOrdenada;
        
        Nodo iterador = ((TADListaEnlazadaImpl) listaOrdenada).getCabecera();
        String fila1, fila2, fila3;
        
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            if (entidad.getDescNivelGobierno().trim().equals("GOBIERNO LOCAL")) {
                fila1 = entidad.getDescNivelGobierno().trim();
                fila2 = "-----------------------";
                fila3 = "-----------------------";
            }else if(entidad.getDescNivelGobierno().trim().equals("GOBIERNO NACIONAL")){
                fila1 = "-----------------------";
                fila2 = entidad.getDescNivelGobierno().trim();
                fila3 = "-----------------------";
            }else if(entidad.getDescNivelGobierno().trim().equals("GOBIERNO REGIONAL")){
                fila1 = "-----------------------";
                fila2 = "-----------------------";
                fila3 = entidad.getDescNivelGobierno().trim();
            }else{
                fila1 = "-----------------------";
                fila2 = "-----------------------";
                fila3 = "-----------------------";
            }
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getDescPliego(),
                fila1,
                fila2,
                fila3,
                entidad.getMontoDeuda()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
        
    }
    
    private void TotalizarTablaHash() {
        // JaladorTabla
        DefaultTableModel modeloDefecto = (DefaultTableModel) tabla_acreedores.getModel();
        // tablaHash
        TADTablahashInterface tabla = new TADTablashashImpl();

        for (int fila = 0; fila < modeloDefecto.getRowCount(); fila++) {
            String nivel_gobierno = "";

            String ruc = String.valueOf(modeloDefecto.getValueAt(fila, 0));
            String pliego = String.valueOf(modeloDefecto.getValueAt(fila, 1));
            String valorLocal = String.valueOf(modeloDefecto.getValueAt(fila, 2));
            String valorNacional = String.valueOf(modeloDefecto.getValueAt(fila, 3));
            String valorRegional = String.valueOf(modeloDefecto.getValueAt(fila, 4));

            if (!valorLocal.trim().equals("-----------------------")) {
                nivel_gobierno = "GOBIERNO LOCAL";
            } else if (!valorNacional.trim().equals("-----------------------")) {
                nivel_gobierno = "GOBIERNO NACIONAL";
            } else if (!valorRegional.trim().equals("-----------------------")) {
                nivel_gobierno = "GOBIERNO REGIONAL";
            }

            double deuda =  Double.parseDouble(String.valueOf(modeloDefecto.getValueAt(fila, 5)));

            EntidadGubernamental entidad = new EntidadGubernamental(ruc, deuda, nivel_gobierno, pliego);

            String clave = nivel_gobierno;
            tabla.insertar(entidad, clave);
        }
        
        
        double totalLocal = tabla.totalizador("GOBIERNO LOCAL");
        double totalNacional = tabla.totalizador("GOBIERNO NACIONAL");
        double totalRegional = tabla.totalizador("GOBIERNO REGIONAL");
        
        double DeudaTotal = totalLocal + totalNacional + totalRegional;

        DecimalFormat formatoSoles = new DecimalFormat("###,###,##0.00");
        
        String totalFormateadolocal = "S/ " + formatoSoles.format(totalLocal);
        String totalFormateadonacional = "S/ " + formatoSoles.format(totalNacional);
        String totalFormateadoregional = "S/ " + formatoSoles.format(totalRegional);
        String totalFormateado = "S/ " + formatoSoles.format(DeudaTotal);

        resultadosProvincias.removeAll();

        card cardPanel1 = new card("TOTAL GENERAL", totalFormateado);
        card cardPanel2 = new card("GOBIERNO LOCAL", totalFormateadolocal);
        card cardPanel3 = new card("GOBIERNO NACIONAL", totalFormateadonacional);
        card cardPanel4 = new card("GOBIERNO REGIONAL", totalFormateadoregional);
        resultadosProvincias.add(cardPanel1);
        resultadosProvincias.add(cardPanel2);
        resultadosProvincias.add(cardPanel3);
        resultadosProvincias.add(cardPanel4);
        
        resultadosProvincias.revalidate();
        resultadosProvincias.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcDepa = new javax.swing.JComboBox<>();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_acreedores = new javax.swing.JTable();
        tex = new javax.swing.JScrollPane();
        resultadosProvincias = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(244, 246, 250));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Nunito", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Montos acumulados por Depto. y Pliego según Nivel de Gobierno");
        panelfill.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Departamento:");
        jLabel3.setPreferredSize(new java.awt.Dimension(119, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, -1));

        jcDepa.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jcDepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        jcDepa.setPreferredSize(new java.awt.Dimension(72, 40));
        jcDepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcDepaActionPerformed(evt);
            }
        });
        jPanel1.add(jcDepa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 160, -1));

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

        jLabel9.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Totalizar");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 100, -1));

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

        jLabel10.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Exportar");
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 100, -1));

        tabla_acreedores.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        tabla_acreedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RUC", "PLIEGO", "GOBIERNO LOCAL", "GOBIERNO NACIONAL", "GOBIERNO REGIONAL", "DEUDA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        if (tabla_acreedores.getColumnModel().getColumnCount() > 0) {
            tabla_acreedores.getColumnModel().getColumn(0).setPreferredWidth(30);
            tabla_acreedores.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        jScrollPane1.getVerticalScrollBar().setUnitIncrement(16);
        jScrollPane1.getVerticalScrollBar().setBlockIncrement(50);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 710, 490));

        tex.setBorder(null);

        resultadosProvincias.setBackground(new java.awt.Color(255, 255, 255));
        resultadosProvincias.setLayout(new javax.swing.BoxLayout(resultadosProvincias, javax.swing.BoxLayout.Y_AXIS));
        tex.setViewportView(resultadosProvincias);

        tex.getVerticalScrollBar().setUnitIncrement(16);
        tex.getVerticalScrollBar().setBlockIncrement(50);

        jPanel1.add(tex, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 180, 440));

        panelfill.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1000, 600));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        TotalizarTablaHash();
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
        String fila1, fila2,fila3;

        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            if (entidad.getDescNivelGobierno().trim().equals("GOBIERNO LOCAL")) {
                fila1 = entidad.getDescNivelGobierno().trim();
                fila2 = "-----------------------";
                fila3 = "-----------------------";
            }else if(entidad.getDescNivelGobierno().trim().equals("GOBIERNO NACIONAL")){
                fila1 = "-----------------------";
                fila2 = entidad.getDescNivelGobierno().trim();
                fila3 = "-----------------------";
            }else if(entidad.getDescNivelGobierno().trim().equals("GOBIERNO REGIONAL")){
                fila1 = "-----------------------";
                fila2 = "-----------------------";
                fila3 = entidad.getDescNivelGobierno().trim();
            }else{
                fila1 = "-----------------------";
                fila2 = "-----------------------";
                fila3 = "-----------------------";
            }
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getDescPliego(),
                fila1,
                fila2,
                fila3,
                entidad.getMontoDeuda()
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcDepa;
    private javax.swing.JPanel panelfill;
    private javax.swing.JPanel resultadosProvincias;
    private javax.swing.JTable tabla_acreedores;
    private javax.swing.JScrollPane tex;
    // End of variables declaration//GEN-END:variables
}
