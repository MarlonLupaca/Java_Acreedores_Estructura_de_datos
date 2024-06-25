
package Formularios;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import Clases.*;
import InterfacesDAO.DAOEntidades;
import ImplementacionesDAO.DAOEntidadesImpl;
import javax.swing.JOptionPane;

public class RegistrarAcreedor extends javax.swing.JPanel {

    public RegistrarAcreedor() {
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
        txt_distrito.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_domicilio_fiscal.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_demandas.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_de_documento.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_numero_de_documento.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_monto_deuda.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_nombre_del_sector.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_nombre_de_pliego.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_codigo_siaf.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txt_razon_social.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        siafGrupo = new javax.swing.ButtonGroup();
        GrupoNivelGobierno = new javax.swing.ButtonGroup();
        panelfill = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_ruc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_razon_social = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JC_Departemento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JC_Provincia = new javax.swing.JComboBox<>();
        txt_distrito = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_domicilio_fiscal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_demandas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_de_documento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_numero_de_documento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_monto_deuda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_nombre_del_sector = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        SiafNo = new javax.swing.JRadioButton();
        SiafSI = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        GR = new javax.swing.JRadioButton();
        GL = new javax.swing.JRadioButton();
        GN = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txt_nombre_de_pliego = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_codigo_siaf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_numero_ejecutadora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_observacion_glosa = new javax.swing.JTextArea();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        b1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        JC_Estado = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelfill.setBackground(new java.awt.Color(244, 246, 250));
        panelfill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nunito", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registrar Acreedor");
        panelfill.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 220, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250), new java.awt.Color(250, 250, 250)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RUC:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txt_ruc.setBackground(new java.awt.Color(255, 255, 255));
        txt_ruc.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_ruc.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_ruc.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_ruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Razon social:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txt_razon_social.setBackground(new java.awt.Color(255, 255, 255));
        txt_razon_social.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_razon_social.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_razon_social.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_razon_social, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("REMYPE Departamento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        JC_Departemento.setBackground(new java.awt.Color(255, 255, 255));
        JC_Departemento.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        JC_Departemento.setForeground(new java.awt.Color(0, 0, 0));
        JC_Departemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione un departamento", "Amazonas", "Ancash", "Apurimac", "Arequipa", "Ayacucho", "Cajamarca", "Callao", "Cusco", "Huancavelica", "Huanuco", "Ica", "Junin", "La Libertad", "Lambayeque", "Lima", "Loreto", "Madre de Dios", "Moquegua", "Pasco", "Piura", "Puno", "San Martin", "Tacna", "Tumbes", "Ucayali" }));
        JC_Departemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_DepartementoActionPerformed(evt);
            }
        });
        jPanel1.add(JC_Departemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 250, 30));

        jLabel7.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("REMYPE Provincia:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        JC_Provincia.setBackground(new java.awt.Color(255, 255, 255));
        JC_Provincia.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        JC_Provincia.setForeground(new java.awt.Color(0, 0, 0));
        JC_Provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una provincia", " " }));
        JC_Provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_ProvinciaActionPerformed(evt);
            }
        });
        jPanel1.add(JC_Provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 30));

        txt_distrito.setBackground(new java.awt.Color(255, 255, 255));
        txt_distrito.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_distrito.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_distrito.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_distrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("REMYPE Distrito:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        txt_domicilio_fiscal.setBackground(new java.awt.Color(255, 255, 255));
        txt_domicilio_fiscal.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_domicilio_fiscal.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_domicilio_fiscal.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_domicilio_fiscal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Domicilio fiscal:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        txt_demandas.setBackground(new java.awt.Color(255, 255, 255));
        txt_demandas.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_demandas.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_demandas.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_demandas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel10.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Demandas:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Estado de deuda:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Tipo de documento:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        txt_de_documento.setBackground(new java.awt.Color(255, 255, 255));
        txt_de_documento.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_de_documento.setForeground(new java.awt.Color(0, 0, 0));
        txt_de_documento.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_de_documento.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_de_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Numero de documento:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        txt_numero_de_documento.setBackground(new java.awt.Color(255, 255, 255));
        txt_numero_de_documento.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_numero_de_documento.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_numero_de_documento.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_numero_de_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel15.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Monto de deuda:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        txt_monto_deuda.setBackground(new java.awt.Color(255, 255, 255));
        txt_monto_deuda.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_monto_deuda.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_monto_deuda.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_monto_deuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel17.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Nombre del sector:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        txt_nombre_del_sector.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_del_sector.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_nombre_del_sector.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txt_nombre_del_sector.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_nombre_del_sector.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_nombre_del_sector, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Siaf ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nunito", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        siafGrupo.add(SiafNo);
        SiafNo.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        SiafNo.setForeground(new java.awt.Color(0, 0, 0));
        SiafNo.setText("NO");
        jPanel4.add(SiafNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, 25));

        siafGrupo.add(SiafSI);
        SiafSI.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        SiafSI.setForeground(new java.awt.Color(0, 0, 0));
        SiafSI.setText("SI");
        jPanel4.add(SiafSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 25, -1, 25));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 250, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nivel de gobierno ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nunito", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GrupoNivelGobierno.add(GR);
        GR.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        GR.setForeground(new java.awt.Color(0, 0, 0));
        GR.setText("Gobierno regional");
        jPanel2.add(GR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 20));

        GrupoNivelGobierno.add(GL);
        GL.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        GL.setForeground(new java.awt.Color(0, 0, 0));
        GL.setText("Gobierno local");
        jPanel2.add(GL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        GrupoNivelGobierno.add(GN);
        GN.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        GN.setForeground(new java.awt.Color(0, 0, 0));
        GN.setText("Gobierno nacional");
        jPanel2.add(GN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 250, 130));

        jLabel18.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nombre del pliego:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        txt_nombre_de_pliego.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre_de_pliego.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_nombre_de_pliego.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_nombre_de_pliego.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_nombre_de_pliego, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel19.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Codigo SIAF");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        txt_codigo_siaf.setBackground(new java.awt.Color(255, 255, 255));
        txt_codigo_siaf.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_codigo_siaf.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_codigo_siaf.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_codigo_siaf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLabel20.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("N. Ejecutadora:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        txt_numero_ejecutadora.setBackground(new java.awt.Color(255, 255, 255));
        txt_numero_ejecutadora.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_numero_ejecutadora.setMargin(new java.awt.Insets(2, 10, 2, 10));
        txt_numero_ejecutadora.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel1.add(txt_numero_ejecutadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 240, -1));

        jLabel5.setFont(new java.awt.Font("Nunito", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Observacion glosa:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, -1, -1));

        txt_observacion_glosa.setBackground(new java.awt.Color(255, 255, 255));
        txt_observacion_glosa.setColumns(20);
        txt_observacion_glosa.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        txt_observacion_glosa.setForeground(new java.awt.Color(0, 0, 0));
        txt_observacion_glosa.setRows(5);
        jScrollPane1.setViewportView(txt_observacion_glosa);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 240, -1));

        jSeparator3.setBackground(new java.awt.Color(71, 89, 77));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 30, 540));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(211, 217, 228), new java.awt.Color(211, 217, 228), new java.awt.Color(211, 217, 228), new java.awt.Color(211, 217, 228)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 200, -1));

        jSeparator1.setBackground(new java.awt.Color(71, 89, 77));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 30, 540));

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

        jLabel21.setFont(new java.awt.Font("Nunito Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Registrar");
        b1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 110, -1));

        JC_Estado.setBackground(new java.awt.Color(255, 255, 255));
        JC_Estado.setFont(new java.awt.Font("Nunito", 0, 12)); // NOI18N
        JC_Estado.setForeground(new java.awt.Color(0, 0, 0));
        JC_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione estado", "SIAF", "SJ CONTINGENCIA", "SJ CUENTA POR PAGAR", "SJ PROVICION", "SJ SALDO" }));
        JC_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_EstadoActionPerformed(evt);
            }
        });
        jPanel1.add(JC_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 250, 30));

        panelfill.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 960, 570));

        add(panelfill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        b1.setBackground(new Color(0x01A9AC));
    }//GEN-LAST:event_b1MouseExited

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        b1.setBackground(new Color(0x01DBDF));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        String ruc = validarNumero(txt_ruc.getText());
        String distrito = validarTexto(txt_distrito.getText());
        String domicilioFiscal = validarTexto(txt_domicilio_fiscal.getText());
        String demandas = validarNumero(txt_demandas.getText());
        String siaf;

        if(SiafSI.isSelected()){
            siaf = "SI";
        }else if(SiafNo.isSelected()){
            siaf = "NO";
        }else
        siaf = "NO";

        String estadoDeDeuda = JC_Estado.getSelectedItem().toString();
        String deDocumento = validarNumero(txt_de_documento.getText());
        String numeroDeDocumento = validarNumero(txt_numero_de_documento.getText());
        String montoDeuda = validarNumero(txt_monto_deuda.getText());
        String nivelDeGobierno;
        if(GR.isSelected()){
            nivelDeGobierno = "GOBIERNO NACIONAL";
        }else if(GL.isSelected()){
            nivelDeGobierno = "GOBIERNO LOCAL";
        }else
        nivelDeGobierno = "GOBIERNO LOCAL";

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
        siafGrupo.clearSelection();
        txt_de_documento.setText("");
        txt_numero_de_documento.setText("");
        txt_monto_deuda.setText("");
        txt_nombre_del_sector.setText("");
        GrupoNivelGobierno.clearSelection();
        txt_nombre_de_pliego.setText("");
        txt_codigo_siaf.setText("");
        txt_numero_ejecutadora.setText("");
        txt_razon_social.setText("");
        txt_observacion_glosa.setText("");
        JC_Departemento.setSelectedIndex(0);
        JC_Provincia.setSelectedIndex(0);
        JC_Estado.setSelectedIndex(0);
    }//GEN-LAST:event_b1MouseClicked

    private void JC_ProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_ProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JC_ProvinciaActionPerformed

    private void JC_DepartementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_DepartementoActionPerformed
        String valor = JC_Departemento.getSelectedItem().toString();
        if (!valor.equals("Selecione un departamento")) {
            String [] array = Departamentos.getProvincias(valor);
            DefaultComboBoxModel<String> nuevoModelo = new DefaultComboBoxModel<>(array);
            JC_Provincia.setModel(nuevoModelo);
        }
    }//GEN-LAST:event_JC_DepartementoActionPerformed

    private void JC_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JC_EstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton GL;
    private javax.swing.JRadioButton GN;
    private javax.swing.JRadioButton GR;
    private javax.swing.ButtonGroup GrupoNivelGobierno;
    private javax.swing.JComboBox<String> JC_Departemento;
    private javax.swing.JComboBox<String> JC_Estado;
    private javax.swing.JComboBox<String> JC_Provincia;
    private javax.swing.JRadioButton SiafNo;
    private javax.swing.JRadioButton SiafSI;
    private javax.swing.JPanel b1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelfill;
    private javax.swing.ButtonGroup siafGrupo;
    private javax.swing.JTextField txt_codigo_siaf;
    private javax.swing.JTextField txt_de_documento;
    private javax.swing.JTextField txt_demandas;
    private javax.swing.JTextField txt_distrito;
    private javax.swing.JTextField txt_domicilio_fiscal;
    private javax.swing.JTextField txt_monto_deuda;
    private javax.swing.JTextField txt_nombre_de_pliego;
    private javax.swing.JTextField txt_nombre_del_sector;
    private javax.swing.JTextField txt_numero_de_documento;
    private javax.swing.JTextField txt_numero_ejecutadora;
    private javax.swing.JTextArea txt_observacion_glosa;
    private javax.swing.JTextField txt_razon_social;
    private javax.swing.JTextField txt_ruc;
    // End of variables declaration//GEN-END:variables
}
