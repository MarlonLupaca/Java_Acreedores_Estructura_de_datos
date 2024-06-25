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
public class BuscarAcreedor extends javax.swing.JPanel {
    
    TADListaEnlazadaInterface listaOrdenadaGlobal = new TADListaEnlazadaImpl();
    TADListaEnlazadaInterface listaOrdenadaRsBusqueda = new TADListaEnlazadaImpl();
    DAOEntidades dao = new DAOEntidadesImpl();
    
    public BuscarAcreedor() {
        initComponents();
        cargarDatos();
    }
    private void filtrados(int opcion, String ValorBusqueda){
        if (opcionesdeordenamiento.getSelection() != null) {
            if (!txt_busqueda.getText().equals("")) {
                TADBusquedaBinariaInterface binaria = new TADBusquedaBinariaImpl();
                TADListaEnlazadaImpl listaConcurenciasFiltrado = binaria.obtenerOcurrencias((TADListaEnlazadaImpl) listaOrdenadaRsBusqueda,ValorBusqueda, opcion, 1);
                listaConcurenciasFiltrado.OrdenandoIndices();



                DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
                modeloTabla.setRowCount(0);

                // Llenado de la tabla
                Nodo iterador = listaConcurenciasFiltrado.getCabecera();
                while (iterador != null) {
                    EntidadGubernamental entidad = iterador.getContenido();
                    Object[] rowData = {
                        entidad.getRuc(),
                        entidad.getRazonSocial(),
                        entidad.getDescPliego(),
                        entidad.getRemypeDepartamento(),
                        entidad.getRemypeProvincia(),
                        entidad.getRemypeDistrito(),
                        entidad.getSecEjec(),
                        entidad.getMontoDeuda(),
                        entidad.getDescSector()
                    };
                    modeloTabla.addRow(rowData);
                    iterador = iterador.getSiguiente();
                }
                tabla_acreedores.setModel(modeloTabla);
            }else {
                JOptionPane.showMessageDialog(null, "Realice una busqueda para aplicar filtro");
                txt_busqueda.setText("");
            }
            
        }else {
            JOptionPane.showMessageDialog(null, "Escoge una opción de búsqueda");
            txt_busqueda.setText("");
        }
    }
    
    
    private void cargarDatos(){
        //creacion de lista 
        TADListaEnlazadaInterface listaEnlazada = new TADListaEnlazadaImpl();
        //llenado de datos
        listaEnlazada = dao.cargardatos();
        //modelo de tabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
        modeloTabla.setRowCount(0);
        tabla_acreedores.getTableHeader().setBackground(new Color(0x617796));
        tabla_acreedores.getTableHeader().setForeground(Color.WHITE);
        
        
        //se jala la cabecera
        Nodo iterador = ((TADListaEnlazadaImpl) listaEnlazada).getCabecera();
        //se itera la lista 
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getRazonSocial(),
                entidad.getDescPliego(),
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getSecEjec(),
                entidad.getMontoDeuda(),
                entidad.getDescSector()
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
        grupo2 = new javax.swing.ButtonGroup();
        panelfill = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_acreedores = new javax.swing.JTable();
        txt_busqueda = new javax.swing.JTextField();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        b1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dep = new javax.swing.JCheckBox();
        f_dep = new javax.swing.JTextField();
        pro = new javax.swing.JCheckBox();
        f_pro = new javax.swing.JTextField();
        dis = new javax.swing.JCheckBox();
        f_dis = new javax.swing.JTextField();
        plie = new javax.swing.JCheckBox();
        f_pli = new javax.swing.JTextField();
        ejec = new javax.swing.JCheckBox();
        f_eje = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BusquedaRUC = new javax.swing.JRadioButton();
        BusqueRS = new javax.swing.JRadioButton();
        BusquedaPli = new javax.swing.JRadioButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(244, 246, 250));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nunito", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar Acreedor");
        panelfill.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 300, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_acreedores.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        tabla_acreedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RUC", "RAZON SOCIAL", "PLIEGO", "REMYPE DEP.", "REMYPE PRO.", "REMYPE DISTRI.", "NOM. EJECUTA.", "MON. DEUDA", "NOM. SECTOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_acreedores.setAutoResizeMode(0);
        tabla_acreedores.setSelectionBackground(new java.awt.Color(97, 119, 150));
        jScrollPane1.setViewportView(tabla_acreedores);
        if (tabla_acreedores.getColumnModel().getColumnCount() > 0) {
            tabla_acreedores.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabla_acreedores.getColumnModel().getColumn(2).setPreferredWidth(200);
            tabla_acreedores.getColumnModel().getColumn(3).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(4).setPreferredWidth(100);
            tabla_acreedores.getColumnModel().getColumn(5).setPreferredWidth(150);
            tabla_acreedores.getColumnModel().getColumn(6).setPreferredWidth(200);
            tabla_acreedores.getColumnModel().getColumn(7).setPreferredWidth(80);
            tabla_acreedores.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 570, 460));

        txt_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        txt_busqueda.setFont(new java.awt.Font("Nunito", 0, 16)); // NOI18N
        txt_busqueda.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });
        jPanel1.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 510, 40));

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
        jLabel9.setText("Limpiar");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 30));

        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 100, -1));

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

        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 100, -1));

        panelRound1.setBackground(new java.awt.Color(97, 119, 150));
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopRight(30);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono4.png"))); // NOI18N
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 40));

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 60, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 78, 103)), " Filtros ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nunito", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grupo2.add(dep);
        dep.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        dep.setForeground(new java.awt.Color(0, 0, 0));
        dep.setText(" Departamento");
        jPanel2.add(dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, -1));

        f_dep.setBackground(new java.awt.Color(255, 255, 255));
        f_dep.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        f_dep.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_dep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_depKeyReleased(evt);
            }
        });
        jPanel2.add(f_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 150, 25));

        grupo2.add(pro);
        pro.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        pro.setForeground(new java.awt.Color(0, 0, 0));
        pro.setText(" Provincia");
        jPanel2.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, -1));

        f_pro.setBackground(new java.awt.Color(255, 255, 255));
        f_pro.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        f_pro.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_proKeyReleased(evt);
            }
        });
        jPanel2.add(f_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, 25));

        grupo2.add(dis);
        dis.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        dis.setForeground(new java.awt.Color(0, 0, 0));
        dis.setText(" Distrito");
        jPanel2.add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, -1));

        f_dis.setBackground(new java.awt.Color(255, 255, 255));
        f_dis.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        f_dis.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_disKeyReleased(evt);
            }
        });
        jPanel2.add(f_dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, 25));

        grupo2.add(plie);
        plie.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        plie.setForeground(new java.awt.Color(0, 0, 0));
        plie.setText(" Pliego");
        jPanel2.add(plie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));

        f_pli.setBackground(new java.awt.Color(255, 255, 255));
        f_pli.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        f_pli.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_pli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_pliKeyReleased(evt);
            }
        });
        jPanel2.add(f_pli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 150, 25));

        grupo2.add(ejec);
        ejec.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        ejec.setForeground(new java.awt.Color(0, 0, 0));
        ejec.setText(" Ejecutadora");
        jPanel2.add(ejec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, -1));

        f_eje.setBackground(new java.awt.Color(255, 255, 255));
        f_eje.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        f_eje.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_eje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_ejeKeyReleased(evt);
            }
        });
        jPanel2.add(f_eje, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 25));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 320, 240));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 78, 103)), " Ordenar ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nunito", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        opcionesdeordenamiento.add(BusquedaRUC);
        BusquedaRUC.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        BusquedaRUC.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaRUC.setText("RUC");
        BusquedaRUC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaRUCMouseClicked(evt);
            }
        });
        jPanel3.add(BusquedaRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 20));

        opcionesdeordenamiento.add(BusqueRS);
        BusqueRS.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        BusqueRS.setForeground(new java.awt.Color(0, 0, 0));
        BusqueRS.setText("Razon Social");
        BusqueRS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusqueRSMouseClicked(evt);
            }
        });
        jPanel3.add(BusqueRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 20));

        opcionesdeordenamiento.add(BusquedaPli);
        BusquedaPli.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        BusquedaPli.setForeground(new java.awt.Color(0, 0, 0));
        BusquedaPli.setText("Pliego");
        BusquedaPli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BusquedaPliMouseClicked(evt);
            }
        });
        jPanel3.add(BusquedaPli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 320, 70));

        panelfill.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 980, 580));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        grupo2.clearSelection();
        opcionesdeordenamiento.clearSelection();
        txt_busqueda.setText("");
        f_dep.setText("");
        f_dis.setText("");
        f_eje.setText("");
        f_pli.setText("");
        f_pro.setText("");
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
        
            TADListaEnlazadaImpl listaConcurencias =binaria.obtenerOcurrencias((TADListaEnlazadaImpl) listaOrdenadaGlobal,txt_busqueda.getText().toString(), opcion, 1);
            listaConcurencias.OrdenandoIndices();
            listaOrdenadaRsBusqueda = listaConcurencias;
            DefaultTableModel modeloTabla = (DefaultTableModel) tabla_acreedores.getModel();
            modeloTabla.setRowCount(0);

            // Llenado de la tabla
            Nodo iterador = listaConcurencias.getCabecera();
            while (iterador != null) {
                EntidadGubernamental entidad = iterador.getContenido();
                Object[] rowData = {
                    entidad.getRuc(),
                    entidad.getRazonSocial(),
                    entidad.getDescPliego(),
                    entidad.getRemypeDepartamento(),
                    entidad.getRemypeProvincia(),
                    entidad.getRemypeDistrito(),
                    entidad.getSecEjec(),
                    entidad.getMontoDeuda(),
                    entidad.getDescSector()
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

    private void f_ejeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_ejeKeyReleased
        if (ejec.isSelected()) {
            filtrados(8,f_eje.getText().toString());

        }
    }//GEN-LAST:event_f_ejeKeyReleased

    private void f_pliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_pliKeyReleased
        if (plie.isSelected()) {
            filtrados(7,f_pli.getText().toString());
            f_dis.setText("");
            f_eje.setText("");
            f_dep.setText("");
            f_pro.setText("");
        }
    }//GEN-LAST:event_f_pliKeyReleased

    private void f_disKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_disKeyReleased
        if (dis.isSelected()) {
            filtrados(6,f_dis.getText().toString());
            f_dep.setText("");
            f_eje.setText("");
            f_pli.setText("");
            f_pro.setText("");

        }
    }//GEN-LAST:event_f_disKeyReleased

    private void f_proKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_proKeyReleased
        if (pro.isSelected()) {
            filtrados(5,f_pro.getText().toString());
            f_dis.setText("");
            f_eje.setText("");
            f_pli.setText("");
            f_dep.setText("");
        }
    }//GEN-LAST:event_f_proKeyReleased

    private void f_depKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_depKeyReleased
        if (dep.isSelected()) {
            filtrados(4,f_dep.getText().toString());
            f_dis.setText("");
            f_eje.setText("");
            f_pli.setText("");
            f_pro.setText("");
        }
    }//GEN-LAST:event_f_depKeyReleased

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
                entidad.getDescPliego(),
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getSecEjec(),
                entidad.getMontoDeuda(),
                entidad.getDescSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
    }//GEN-LAST:event_BusquedaPliMouseClicked

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
                entidad.getDescPliego(),
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getSecEjec(),
                entidad.getMontoDeuda(),
                entidad.getDescSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
    }//GEN-LAST:event_BusqueRSMouseClicked

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
                entidad.getDescPliego(),
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getSecEjec(),
                entidad.getMontoDeuda(),
                entidad.getDescSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
    }//GEN-LAST:event_BusquedaRUCMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BusqueRS;
    private javax.swing.JRadioButton BusquedaPli;
    private javax.swing.JRadioButton BusquedaRUC;
    private javax.swing.JPanel b;
    private javax.swing.JPanel b1;
    private javax.swing.JCheckBox dep;
    private javax.swing.JCheckBox dis;
    private javax.swing.JCheckBox ejec;
    private javax.swing.JTextField f_dep;
    private javax.swing.JTextField f_dis;
    private javax.swing.JTextField f_eje;
    private javax.swing.JTextField f_pli;
    private javax.swing.JTextField f_pro;
    private javax.swing.ButtonGroup grupo2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup opcionesdeordenamiento;
    private Estilos_graficos.PanelRound panelRound1;
    private javax.swing.JPanel panelfill;
    private javax.swing.JCheckBox plie;
    private javax.swing.JCheckBox pro;
    private javax.swing.JTable tabla_acreedores;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
