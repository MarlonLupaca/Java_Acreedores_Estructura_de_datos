
package Formularios;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import Clases.*;
import InterfacesDAO.DAOEntidades;
import ImplementacionesDAO.DAOEntidadesImpl;
import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JPanel {

    public Form1() {
        initComponents();
        clear();
    }
    
    private String validarNumero(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "0";
        }
        for (char c : texto.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "0";
            }
        }
        return texto;
    }

    private String validarTexto(String texto) {
        if (texto == null || texto.isEmpty()) {
            return "Sin datos";
        }
        return texto;
    }
    
    
    private void clear()
    {
        txt_ruc.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        //txt_usuario2.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        //txt_usuario3.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_distrito.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_domicilio_fiscal.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_demandas.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_siaf.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_estado_de_deuda.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_de_documento.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_numero_de_documento.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_monto_deuda.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_nivel_de_gobierno.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_nombre_del_sector.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_nombre_de_pliego.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_codigo_siaf.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_numero_ejecutadora.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        //txt_usuario17.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_razon_social.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfill = new javax.swing.JPanel();
        panelRound1 = new Estilos_graficos.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_ruc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_distrito = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_domicilio_fiscal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_demandas = new javax.swing.JTextField();
        txt_siaf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_estado_de_deuda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_de_documento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_numero_de_documento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_monto_deuda = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_nivel_de_gobierno = new javax.swing.JTextField();
        txt_nombre_del_sector = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_nombre_de_pliego = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_codigo_siaf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_numero_ejecutadora = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_razon_social = new javax.swing.JTextField();
        b1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        JC_Departemento = new javax.swing.JComboBox<>();
        JC_Provincia = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observacion_glosa = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(243, 237, 161));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(175, 191, 144));
        panelRound1.setRoundBottomRight(60);
        panelRound1.setRoundTopRight(60);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 89, 77));
        jLabel2.setText("Registrar Acreedor");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 310, 70));

        panelfill.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 430, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(71, 89, 77));
        jLabel3.setText("RUC:");
        panelfill.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(71, 89, 77));
        jSeparator1.setForeground(new java.awt.Color(71, 89, 77));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelfill.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 30, 540));

        txt_ruc.setBackground(new java.awt.Color(255, 255, 255));
        txt_ruc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_ruc.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(71, 89, 77));
        jLabel4.setText("Razon social:");
        panelfill.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(71, 89, 77));
        jLabel5.setText("Observacion glosa:");
        panelfill.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(71, 89, 77));
        jLabel6.setText("REMYPE Departamento:");
        panelfill.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(71, 89, 77));
        jLabel7.setText("REMYPE Provincia:");
        panelfill.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        txt_distrito.setBackground(new java.awt.Color(255, 255, 255));
        txt_distrito.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_distrito.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_distrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 250, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(71, 89, 77));
        jLabel8.setText("REMYPE Distrito:");
        panelfill.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        txt_domicilio_fiscal.setBackground(new java.awt.Color(255, 255, 255));
        txt_domicilio_fiscal.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_domicilio_fiscal.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_domicilio_fiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 250, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(71, 89, 77));
        jLabel9.setText("Domicilio fiscal:");
        panelfill.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txt_demandas.setBackground(new java.awt.Color(255, 255, 255));
        txt_demandas.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_demandas.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_demandas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 250, 30));

        txt_siaf.setBackground(new java.awt.Color(255, 255, 255));
        txt_siaf.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_siaf.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_siaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 250, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(71, 89, 77));
        jLabel10.setText("Demandas:");
        panelfill.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        txt_estado_de_deuda.setBackground(new java.awt.Color(255, 255, 255));
        txt_estado_de_deuda.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_estado_de_deuda.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_estado_de_deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 250, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 89, 77));
        jLabel11.setText("SIAF:");
        panelfill.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        txt_de_documento.setBackground(new java.awt.Color(255, 255, 255));
        txt_de_documento.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_de_documento.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_de_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 250, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(71, 89, 77));
        jLabel12.setText("Estado de deuda:");
        panelfill.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        txt_numero_de_documento.setBackground(new java.awt.Color(255, 255, 255));
        txt_numero_de_documento.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_numero_de_documento.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_numero_de_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 250, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(71, 89, 77));
        jLabel13.setText("Tipo de documento:");
        panelfill.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(71, 89, 77));
        jLabel14.setText("Numero de documento:");
        panelfill.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        txt_monto_deuda.setBackground(new java.awt.Color(255, 255, 255));
        txt_monto_deuda.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_monto_deuda.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_monto_deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 250, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(71, 89, 77));
        jLabel15.setText("Monto de deuda:");
        panelfill.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, -1, -1));

        txt_nivel_de_gobierno.setBackground(new java.awt.Color(255, 255, 255));
        txt_nivel_de_gobierno.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_nivel_de_gobierno.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_nivel_de_gobierno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 250, 30));

        txt_nombre_del_sector.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_del_sector.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_nombre_del_sector.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_nombre_del_sector, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 250, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(71, 89, 77));
        jLabel16.setText("Nivel de gobierno");
        panelfill.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(71, 89, 77));
        jLabel17.setText("Nombre del sector:");
        panelfill.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));

        txt_nombre_de_pliego.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_de_pliego.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_nombre_de_pliego.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_nombre_de_pliego, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 250, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(71, 89, 77));
        jLabel18.setText("Nombre del pliego:");
        panelfill.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, -1, -1));

        txt_codigo_siaf.setBackground(new java.awt.Color(255, 255, 255));
        txt_codigo_siaf.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_codigo_siaf.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_codigo_siaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 250, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(71, 89, 77));
        jLabel19.setText("Codigo SIAF");
        panelfill.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        txt_numero_ejecutadora.setBackground(new java.awt.Color(255, 255, 255));
        txt_numero_ejecutadora.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_numero_ejecutadora.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_numero_ejecutadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 250, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(71, 89, 77));
        jLabel20.setText("N. Ejecutadora:");
        panelfill.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(71, 89, 77));
        jSeparator3.setForeground(new java.awt.Color(71, 89, 77));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelfill.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, 540));

        txt_razon_social.setBackground(new java.awt.Color(255, 255, 255));
        txt_razon_social.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_razon_social.setPreferredSize(new java.awt.Dimension(250, 30));
        panelfill.add(txt_razon_social, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 250, 30));

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

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Registrar");
        b1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 40));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono1.png"))); // NOI18N
        b1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        panelfill.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, 180, 40));

        JC_Departemento.setBackground(new java.awt.Color(255, 255, 255));
        JC_Departemento.setForeground(new java.awt.Color(0, 0, 0));
        JC_Departemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione un departamento", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        JC_Departemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_DepartementoActionPerformed(evt);
            }
        });
        panelfill.add(JC_Departemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 250, 30));

        JC_Provincia.setBackground(new java.awt.Color(255, 255, 255));
        JC_Provincia.setForeground(new java.awt.Color(0, 0, 0));
        JC_Provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una provincia", " " }));
        JC_Provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_ProvinciaActionPerformed(evt);
            }
        });
        panelfill.add(JC_Provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 250, 30));

        txt_observacion_glosa.setBackground(new java.awt.Color(255, 255, 255));
        txt_observacion_glosa.setColumns(20);
        txt_observacion_glosa.setRows(5);
        jScrollPane1.setViewportView(txt_observacion_glosa);

        panelfill.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 250, 90));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        String ruc = validarNumero(txt_ruc.getText());
        String distrito = validarTexto(txt_distrito.getText());
        String domicilioFiscal = validarTexto(txt_domicilio_fiscal.getText());
        String demandas = validarNumero(txt_demandas.getText());
        String siaf = validarNumero(txt_siaf.getText());
        String estadoDeDeuda = validarNumero(txt_estado_de_deuda.getText());
        String deDocumento = validarNumero(txt_de_documento.getText());
        String numeroDeDocumento = validarNumero(txt_numero_de_documento.getText());
        String montoDeuda = validarNumero(txt_monto_deuda.getText());
        String nivelDeGobierno = validarTexto(txt_nivel_de_gobierno.getText());
        String nombreDelSector = validarTexto(txt_nombre_del_sector.getText());
        String nombreDePliego = validarTexto(txt_nombre_de_pliego.getText());
        String codigoSiaf = validarNumero(txt_codigo_siaf.getText());
        String numeroEjecutadora = validarNumero(txt_numero_ejecutadora.getText());
        String razonSocial = validarTexto(txt_razon_social.getText());
        String glosa = validarTexto(txt_observacion_glosa.getText());
        String departemento = JC_Departemento.getSelectedItem().toString();
        String provincia = JC_Provincia.getSelectedItem().toString();

        EntidadGubernamental entidadGubernamental = new EntidadGubernamental(
            ruc,
            razonSocial,
            departemento,
            provincia,
            distrito,
            domicilioFiscal,
            demandas,
            siaf,
            estadoDeDeuda,
            deDocumento,
            numeroDeDocumento,
            Double.parseDouble(montoDeuda),
            nivelDeGobierno,
            nombreDelSector,
            nombreDePliego,
            numeroEjecutadora,
            codigoSiaf,
            glosa
        );



        DAOEntidades dao = new DAOEntidadesImpl();

        dao.guardarDatos(entidadGubernamental);
        JOptionPane.showMessageDialog(null, "Registrado con éxito");
        
        txt_ruc.setText("");
        txt_distrito.setText("");
        txt_domicilio_fiscal.setText("");
        txt_demandas.setText("");
        txt_siaf.setText("");
        txt_estado_de_deuda.setText("");
        txt_de_documento.setText("");
        txt_numero_de_documento.setText("");
        txt_monto_deuda.setText("");
        txt_nivel_de_gobierno.setText("");
        txt_nombre_del_sector.setText("");
        txt_nombre_de_pliego.setText("");
        txt_codigo_siaf.setText("");
        txt_numero_ejecutadora.setText("");
        txt_razon_social.setText("");
        txt_observacion_glosa.setText("");
        JC_Departemento.setSelectedIndex(0);
        JC_Provincia.setSelectedIndex(0);
    }//GEN-LAST:event_b1MouseClicked

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0xDFD98D));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0xAFBF90));
    }//GEN-LAST:event_b1MouseExited

    private void JC_DepartementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_DepartementoActionPerformed
        String valor = JC_Departemento.getSelectedItem().toString();
        if (!valor.equals("Selecione un departamento")) {
            String [] array = Departamentos.getProvincias(valor);
            DefaultComboBoxModel<String> nuevoModelo = new DefaultComboBoxModel<>(array);
            JC_Provincia.setModel(nuevoModelo);
        }
    }//GEN-LAST:event_JC_DepartementoActionPerformed

    private void JC_ProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_ProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JC_ProvinciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JC_Departemento;
    private javax.swing.JComboBox<String> JC_Provincia;
    private javax.swing.JPanel b1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private Estilos_graficos.PanelRound panelRound1;
    private javax.swing.JPanel panelfill;
    private javax.swing.JTextField txt_codigo_siaf;
    private javax.swing.JTextField txt_de_documento;
    private javax.swing.JTextField txt_demandas;
    private javax.swing.JTextField txt_distrito;
    private javax.swing.JTextField txt_domicilio_fiscal;
    private javax.swing.JTextField txt_estado_de_deuda;
    private javax.swing.JTextField txt_monto_deuda;
    private javax.swing.JTextField txt_nivel_de_gobierno;
    private javax.swing.JTextField txt_nombre_de_pliego;
    private javax.swing.JTextField txt_nombre_del_sector;
    private javax.swing.JTextField txt_numero_de_documento;
    private javax.swing.JTextField txt_numero_ejecutadora;
    private javax.swing.JTextArea txt_observacion_glosa;
    private javax.swing.JTextField txt_razon_social;
    private javax.swing.JTextField txt_ruc;
    private javax.swing.JTextField txt_siaf;
    // End of variables declaration//GEN-END:variables
}
