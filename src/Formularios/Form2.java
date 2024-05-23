package Formularios;
import Clases.EntidadGubernamental;
import ImplementacionesDAO.*;
import InterfacesDAO.*;
import TADEstructurasDeDatos.*;
import TADMetodos_de_ordenamiento.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import TADBusquedaBinaria.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Marlon_Mendoza
 */
public class Form2 extends javax.swing.JPanel {
    
    TADListaEnlazadaInterface listaOrdenadaGlobal = new TADListaEnlazadaImpl();
    DAOEntidades dao = new DAOEntidadesImpl();
    
    public Form2() {
        initComponents();
        cargarDatos();
    }
    
    private void cargarDatos(){
        //creacion de lista 
        TADListaEnlazadaInterface listaEnlazada = new TADListaEnlazadaImpl();
        //llenado de datos
        listaEnlazada = dao.cargardatos();
        //modelo de tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
        modeloTabla.setRowCount(0);
        
        //se jala la cabecera
        Nodo iterador = ((TADListaEnlazadaImpl) listaEnlazada).getCabecera();
        //se itera la lista 
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getRazonSocial(),
                entidad.getRemypeDepartamento(),
                entidad.getNombrePliego(),
                entidad.getMontoDeuda(),
                entidad.getNombreSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionesdeordenamiento = new javax.swing.ButtonGroup();
        panelfill = new javax.swing.JPanel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_acreedores = new javax.swing.JTable();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRound2 = new Estilos_graficos.PanelRound();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        panelRound3 = new Estilos_graficos.PanelRound();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelRound4 = new Estilos_graficos.PanelRound();
        panelRound5 = new Estilos_graficos.PanelRound();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        BusquedaPli = new javax.swing.JRadioButton();
        BusqueRS = new javax.swing.JRadioButton();
        BusquedaRUC = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(243, 237, 161));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(175, 191, 144));
        panelRound1.setRoundBottomRight(60);
        panelRound1.setRoundTopRight(60);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 89, 77));
        jLabel2.setText("Buscar Acreedor");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 70));

        panelfill.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 70));

        txt_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        txt_busqueda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_busqueda.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });
        panelfill.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 440, 40));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono4.png"))); // NOI18N
        panelfill.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 40));

        tabla_acreedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RUC", "RAZON SOCIAL", "REMYPE DEP.", "PLIEGO", "MON. DEUDA", "NOM. SECTOR"
            }
        ));
        jScrollPane1.setViewportView(tabla_acreedores);

        panelfill.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 770, 490));

        b.setBackground(new java.awt.Color(175, 191, 144));
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

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Busqueda");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png"))); // NOI18N
        b.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        panelfill.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 530, 180, 50));

        panelRound2.setBackground(new java.awt.Color(175, 191, 144));
        panelRound2.setRoundBottomLeft(40);
        panelRound2.setRoundBottomRight(40);
        panelRound2.setRoundTopLeft(40);
        panelRound2.setRoundTopRight(40);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setText(" Ejecutadora");
        panelRound2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jCheckBox6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setText(" Pliego");
        panelRound2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jCheckBox4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText(" Distrito");
        panelRound2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText(" Provincia");
        panelRound2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText(" Departamento");
        panelRound2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelRound3.setBackground(new java.awt.Color(175, 191, 144));
        panelRound3.setRoundBottomLeft(40);
        panelRound3.setRoundBottomRight(40);
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox7.setText(" Ejecutadora");
        panelRound3.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox8.setText(" Pliego");
        panelRound3.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jCheckBox9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox9.setText(" Distrito");
        panelRound3.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCheckBox10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox10.setText(" Provincia");
        panelRound3.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jCheckBox11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox11.setText(" Departamento");
        panelRound3.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelRound2.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 180, 230));

        panelfill.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 180, 230));

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
        b1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 50));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        b1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        panelfill.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 600, 180, 50));

        panelRound4.setBackground(new java.awt.Color(175, 191, 144));
        panelRound4.setRoundBottomLeft(40);
        panelRound4.setRoundBottomRight(40);
        panelRound4.setRoundTopLeft(40);
        panelRound4.setRoundTopRight(40);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound5.setBackground(new java.awt.Color(175, 191, 144));
        panelRound5.setRoundBottomLeft(40);
        panelRound5.setRoundBottomRight(40);
        panelRound5.setRoundTopLeft(40);
        panelRound5.setRoundTopRight(40);
        panelRound5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox17.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox17.setText(" Ejecutadora");
        panelRound5.add(jCheckBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jCheckBox18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox18.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox18.setText(" Pliego");
        panelRound5.add(jCheckBox18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jCheckBox19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox19.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox19.setText(" Distrito");
        panelRound5.add(jCheckBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCheckBox20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox20.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox20.setText(" Provincia");
        panelRound5.add(jCheckBox20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jCheckBox21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jCheckBox21.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox21.setText(" Departamento");
        panelRound5.add(jCheckBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        panelRound4.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 180, 230));

        opcionesdeordenamiento.add(BusquedaPli);
        BusquedaPli.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BusquedaPli.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaPli.setText("Pliego");
        BusquedaPli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaPliMouseClicked(evt);
            }
        });
        panelRound4.add(BusquedaPli, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, 50));

        opcionesdeordenamiento.add(BusqueRS);
        BusqueRS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BusqueRS.setForeground(new java.awt.Color(0, 0, 0));
        BusqueRS.setText("Razon Social");
        BusqueRS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusqueRSMouseClicked(evt);
            }
        });
        panelRound4.add(BusqueRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 50));

        opcionesdeordenamiento.add(BusquedaRUC);
        BusquedaRUC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BusquedaRUC.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaRUC.setText("RUC");
        BusquedaRUC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaRUCMouseClicked(evt);
            }
        });
        panelRound4.add(BusquedaRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Busqueda por:");
        panelRound4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

        panelfill.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 470, 50));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        
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

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
        if (opcionesdeordenamiento.getSelection() != null) {
            TADBusquedaBinariaInterface binaria = new TADBusquedaBinariaImpl();
            int opcion = 0;
            if (BusquedaRUC.isSelected()) {
                opcion = 1;
            } else if (BusqueRS.isSelected()) {
                opcion = 2;
            } else if (BusquedaPli.isSelected()) {
                opcion = 3;
            } 
        
            TADListaEnlazadaImpl listaConcurencias =binaria.obtenerOcurrencias((TADListaEnlazadaImpl) listaOrdenadaGlobal,txt_busqueda.getText().toString(), opcion);

            DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
            modeloTabla.setRowCount(0);

            // Llenado de la tabla
            Nodo iterador = listaConcurencias.getCabecera();
            while (iterador != null) {
                EntidadGubernamental entidad = iterador.getContenido();
                Object[] rowData = {
                    entidad.getRuc(),
                    entidad.getRazonSocial(),
                    entidad.getRemypeDepartamento(),
                    entidad.getNombrePliego(),
                    entidad.getMontoDeuda(),
                    entidad.getNombreSector()
                };
                modeloTabla.addRow(rowData);
                iterador = iterador.getSiguiente();
            }
            tabla_acreedores.setModel(modeloTabla);
        }else{
            JOptionPane.showMessageDialog(null, "Escoge una opción de búsqueda");
            txt_busqueda.setText("");
        }
        
        
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void BusquedaRUCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaRUCMouseClicked
        // Creación y llenado de la lista
        TADListaEnlazadaImpl listaEnlazada = (TADListaEnlazadaImpl) dao.cargardatos();

        // Ordenamiento de la lista
        TADOrdenamientoInterface ordenamiento = new TADOrdenamientoMergeSortImpl();
        
        
        TADListaEnlazadaImpl listaOrdenada = ordenamiento.OrdenarPorTexto(listaEnlazada, 0, listaEnlazada.tamaño(),1);
        listaOrdenada.OrdenandoIndices();
        
        
        listaOrdenadaGlobal = listaOrdenada;
        
        
        // Modelo de tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
        modeloTabla.setRowCount(0);

        // Llenado de la tabla
        Nodo iterador = listaOrdenada.getCabecera();
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getRazonSocial(),
                entidad.getRemypeDepartamento(),
                entidad.getNombrePliego(),
                entidad.getMontoDeuda(),
                entidad.getNombreSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
    }//GEN-LAST:event_BusquedaRUCMouseClicked

    private void BusqueRSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusqueRSMouseClicked
        // Creación y llenado de la lista
        TADListaEnlazadaImpl listaEnlazada = (TADListaEnlazadaImpl) dao.cargardatos();

        // Ordenamiento de la lista
        TADOrdenamientoInterface ordenamiento = new TADOrdenamientoMergeSortImpl();
        
        TADListaEnlazadaImpl listaOrdenada = ordenamiento.OrdenarPorTexto(listaEnlazada, 0, listaEnlazada.tamaño(),2);
        listaOrdenada.OrdenandoIndices();
        
        
        listaOrdenadaGlobal = listaOrdenada;
        
        // Modelo de tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
        modeloTabla.setRowCount(0);

        // Llenado de la tabla
        Nodo iterador = listaOrdenada.getCabecera();
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getRazonSocial(),
                entidad.getRemypeDepartamento(),
                entidad.getNombrePliego(),
                entidad.getMontoDeuda(),
                entidad.getNombreSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
    }//GEN-LAST:event_BusqueRSMouseClicked

    private void BusquedaPliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaPliMouseClicked
        // Creación y llenado de la lista
        TADListaEnlazadaImpl listaEnlazada = (TADListaEnlazadaImpl) dao.cargardatos();

        // Ordenamiento de la lista
        TADOrdenamientoInterface ordenamiento = new TADOrdenamientoMergeSortImpl();
        
        TADListaEnlazadaImpl listaOrdenada = ordenamiento.OrdenarPorTexto(listaEnlazada, 0, listaEnlazada.tamaño(),3);
        listaOrdenada.OrdenandoIndices();
        listaOrdenadaGlobal = listaOrdenada;
        
        // Modelo de tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
        modeloTabla.setRowCount(0);

        // Llenado de la tabla
        Nodo iterador = listaOrdenada.getCabecera();
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getRazonSocial(),
                entidad.getRemypeDepartamento(),
                entidad.getNombrePliego(),
                entidad.getMontoDeuda(),
                entidad.getNombreSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
    }//GEN-LAST:event_BusquedaPliMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BusqueRS;
    private javax.swing.JRadioButton BusquedaPli;
    private javax.swing.JRadioButton BusquedaRUC;
    private javax.swing.JPanel b;
    private javax.swing.JPanel b1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup opcionesdeordenamiento;
    private Estilos_graficos.PanelRound panelRound1;
    private Estilos_graficos.PanelRound panelRound2;
    private Estilos_graficos.PanelRound panelRound3;
    private Estilos_graficos.PanelRound panelRound4;
    private Estilos_graficos.PanelRound panelRound5;
    private javax.swing.JPanel panelfill;
    private javax.swing.JTable tabla_acreedores;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
