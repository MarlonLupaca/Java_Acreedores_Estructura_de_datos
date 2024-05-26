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
    TADListaEnlazadaInterface listaOrdenadaRsBusqueda = new TADListaEnlazadaImpl();
    DAOEntidades dao = new DAOEntidadesImpl();
    
    public Form2() {
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
                        entidad.getNombrePliego(),
                        entidad.getRemypeDepartamento(),
                        entidad.getRemypeProvincia(),
                        entidad.getRemypeDistrito(),
                        entidad.getNumeroEjecutadora(),
                        entidad.getMontoDeuda(),
                        entidad.getNombreSector()
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
        
        //se jala la cabecera
        Nodo iterador = ((TADListaEnlazadaImpl) listaEnlazada).getCabecera();
        //se itera la lista 
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.getContenido();
            Object[] rowData = {
                entidad.getRuc(),
                entidad.getRazonSocial(),
                entidad.getNombrePliego(),
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getNumeroEjecutadora(),
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
        grupo2 = new javax.swing.ButtonGroup();
        panelfill = new javax.swing.JPanel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_acreedores = new javax.swing.JTable();
        b = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRound2 = new Estilos_graficos.PanelRound();
        ejec = new javax.swing.JCheckBox();
        plie = new javax.swing.JCheckBox();
        dis = new javax.swing.JCheckBox();
        pro = new javax.swing.JCheckBox();
        dep = new javax.swing.JCheckBox();
        panelRound3 = new Estilos_graficos.PanelRound();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        f_eje = new javax.swing.JTextField();
        f_dep = new javax.swing.JTextField();
        f_pro = new javax.swing.JTextField();
        f_dis = new javax.swing.JTextField();
        f_pli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();

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

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono4.png"))); // NOI18N
        panelfill.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 50, 40));

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
        jLabel9.setText("Limpiar");
        b.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 50));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.png"))); // NOI18N
        b.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        panelfill.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 180, 50));

        panelRound2.setBackground(new java.awt.Color(175, 191, 144));
        panelRound2.setRoundBottomLeft(40);
        panelRound2.setRoundBottomRight(40);
        panelRound2.setRoundTopLeft(40);
        panelRound2.setRoundTopRight(40);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grupo2.add(ejec);
        ejec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ejec.setForeground(new java.awt.Color(0, 0, 0));
        ejec.setText(" Ejecutadora");
        panelRound2.add(ejec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        grupo2.add(plie);
        plie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        plie.setForeground(new java.awt.Color(0, 0, 0));
        plie.setText(" Pliego");
        panelRound2.add(plie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        grupo2.add(dis);
        dis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dis.setForeground(new java.awt.Color(0, 0, 0));
        dis.setText(" Distrito");
        panelRound2.add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 20));

        grupo2.add(pro);
        pro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pro.setForeground(new java.awt.Color(0, 0, 0));
        pro.setText(" Provincia");
        panelRound2.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 20));

        grupo2.add(dep);
        dep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dep.setForeground(new java.awt.Color(0, 0, 0));
        dep.setText(" Departamento");
        panelRound2.add(dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 20));

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

        f_eje.setBackground(new java.awt.Color(255, 255, 255));
        f_eje.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        f_eje.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_eje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_ejeKeyReleased(evt);
            }
        });
        panelRound2.add(f_eje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 25));

        f_dep.setBackground(new java.awt.Color(255, 255, 255));
        f_dep.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        f_dep.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_dep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_depKeyReleased(evt);
            }
        });
        panelRound2.add(f_dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 25));

        f_pro.setBackground(new java.awt.Color(255, 255, 255));
        f_pro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        f_pro.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_proKeyReleased(evt);
            }
        });
        panelRound2.add(f_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 25));

        f_dis.setBackground(new java.awt.Color(255, 255, 255));
        f_dis.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        f_dis.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_disKeyReleased(evt);
            }
        });
        panelRound2.add(f_dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 25));

        f_pli.setBackground(new java.awt.Color(255, 255, 255));
        f_pli.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        f_pli.setMargin(new java.awt.Insets(2, 10, 2, 10));
        f_pli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                f_pliKeyReleased(evt);
            }
        });
        panelRound2.add(f_pli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 25));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Filtrar por:");
        panelRound2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 50));

        panelfill.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 180, 360));

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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Busqueda por:");
        panelRound4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 50));

        panelfill.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 470, 50));

        txt_busqueda.setBackground(new java.awt.Color(255, 255, 255));
        txt_busqueda.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_busqueda.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });
        panelfill.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 440, 40));

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
                    entidad.getNombrePliego(),
                    entidad.getRemypeDepartamento(),
                    entidad.getRemypeProvincia(),
                    entidad.getRemypeDistrito(),
                    entidad.getNumeroEjecutadora(),
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
                entidad.getNombrePliego(),  
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getNumeroEjecutadora(),
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
                entidad.getNombrePliego(),
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getNumeroEjecutadora(),
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
                entidad.getNombrePliego(),
                entidad.getRemypeDepartamento(),
                entidad.getRemypeProvincia(),
                entidad.getRemypeDistrito(),
                entidad.getNumeroEjecutadora(),
                entidad.getMontoDeuda(),
                entidad.getNombreSector()
            };
            modeloTabla.addRow(rowData);
            iterador = iterador.getSiguiente();
        }
        tabla_acreedores.setModel(modeloTabla);
    }//GEN-LAST:event_BusquedaPliMouseClicked

    private void f_ejeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_ejeKeyReleased
        if (ejec.isSelected()) {
            filtrados(8,f_eje.getText().toString());
            
        }
    }//GEN-LAST:event_f_ejeKeyReleased

    private void f_depKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_depKeyReleased
        if (dep.isSelected()) {
            filtrados(4,f_dep.getText().toString());
            f_dis.setText("");
            f_eje.setText("");
            f_pli.setText("");
            f_pro.setText("");
        }
    }//GEN-LAST:event_f_depKeyReleased

    private void f_proKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_proKeyReleased
        if (pro.isSelected()) {
            filtrados(5,f_pro.getText().toString());
            f_dis.setText("");
            f_eje.setText("");
            f_pli.setText("");
            f_dep.setText("");
        }
    }//GEN-LAST:event_f_proKeyReleased

    private void f_disKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_disKeyReleased
        if (dis.isSelected()) {
            filtrados(6,f_dis.getText().toString());
            f_dep.setText("");
            f_eje.setText("");
            f_pli.setText("");
            f_pro.setText("");
            
        }
    }//GEN-LAST:event_f_disKeyReleased

    private void f_pliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f_pliKeyReleased
        if (plie.isSelected()) {
            filtrados(7,f_pli.getText().toString());
            f_dis.setText("");
            f_eje.setText("");
            f_dep.setText("");
            f_pro.setText("");
        }
    }//GEN-LAST:event_f_pliKeyReleased


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
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JCheckBox plie;
    private javax.swing.JCheckBox pro;
    private javax.swing.JTable tabla_acreedores;
    private javax.swing.JTextField txt_busqueda;
    // End of variables declaration//GEN-END:variables
}
