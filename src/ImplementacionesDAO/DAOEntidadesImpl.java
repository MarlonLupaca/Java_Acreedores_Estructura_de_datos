package ImplementacionesDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import TADListaEnlazadaDoble.TADListaEnlazadaImpl;
import Clases.EntidadGubernamental;
import Clases.Usuario;
import TADListaEnlazadaDoble.Nodo;
import InterfacesDAO.*;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import TADPilaGenerica.*;

public class DAOEntidadesImpl implements DAOEntidades{

    @Override
    public TADListaEnlazadaImpl cargardatos() {
        int  indice = -1;
        TADListaEnlazadaImpl listaNueva = new TADListaEnlazadaImpl();
        String ruta = "data/ACREEDORES.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            br.readLine(); 
            while ((linea = br.readLine()) != null) {
                
                String[] campos = linea.split(",");
                linea = linea.trim();
                
                if (linea.isEmpty() ) { 
                    
                }else{
                    if (campos.length == 18) {
                        indice++;

                        EntidadGubernamental entidad = new EntidadGubernamental(
                            campos[0], // RUC
                            campos[1], // Razón Social
                            campos[2], // Remype Departamento
                            campos[3], // Remype Provincia
                            campos[4], // Remype Distrito
                            campos[5], // Domicilio Fiscal
                            campos[6], // App Informático Demandas
                            campos[7], // SIAF
                            campos[8], // Estado Deuda
                            campos[9], // Tipo Documento
                            campos[10], // Doc Deven O Senten Judi
                            Double.parseDouble(campos[11]), // Monto Deuda
                            campos[12], // Desc Nivel Gobierno
                            campos[13], // Desc Sector
                            campos[14], // Desc Pliego
                            campos[15], // Sec Ejec
                            campos[16], // Desc Ejecutora
                            campos[17] // Observacion Glosa
                        );

                        listaNueva.CrearNodo(new Nodo(entidad, indice));
                    } else {
                    }
                    
                }
                
                
            } 
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        return listaNueva;
    }
    
    @Override
    public void guardarDatos(EntidadGubernamental entidad) {
        String ruta = "data/ACREEDORES.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))) {
            String registro = entidad.getRuc() + "," +
                  entidad.getRazonSocial() + "," +
                  entidad.getRemypeDepartamento() + "," +
                  entidad.getRemypeProvincia() + "," +
                  entidad.getRemypeDistrito() + "," +
                  entidad.getDomicilioFiscal() + "," +
                  entidad.getAppInformaticoDemandas() + "," +
                  entidad.getSiaf() + "," +
                  entidad.getEstadoDeuda() + "," +
                  entidad.getTipoDocumento() + "," +
                  entidad.getDocDevenOSentenJudi() + "," +
                  entidad.getMontoDeuda() + "," +
                  entidad.getDescNivelGobierno() + "," +
                  entidad.getDescSector() + "," +
                  entidad.getDescPliego() + "," +
                  entidad.getSecEjec() + "," +
                  entidad.getDescEjecutora() + "," +
                  entidad.getObservacionGlosa();

            bw.write(registro);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
    
    @Override
    public void ExportaCSV(Component parent, TADListaEnlazadaImpl listaQueSeExportara){
        try {
            JFileChooser fileChooser = new JFileChooser("./data");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int userSelection = fileChooser.showSaveDialog(parent);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                String outputFilePath = fileToSave.getAbsolutePath();

                if (!outputFilePath.toLowerCase().endsWith(".csv")) {
                    outputFilePath += ".csv";
                }

                FileWriter csvWriter = new FileWriter(outputFilePath);

                // Escribir los encabezados
                csvWriter.append("RUC,RAZON_SOCIAL,REMYPE_DEPARTAMENTO,REMYPE_PROVINCIA,REMYPE_DISTRITO,DOMICILIO_FISCAL,APP_INFORMATICO_DEMANDAS,SIAF,ESTADO_DEUDA,TIPO_DOCUMENTO,DOC_DEVEN_O_SENTEN_JUDI,MONTO_DEUDA,DESC_NIVEL_GOBIERNO,DESC_SECTOR,DESC_PLIEGO,SEC_EJEC,DESC_EJECUTORA,OBSERVACION_GLOSA");
                csvWriter.append("\n");

                // Iterar sobre la listaQueSeExportara y escribir cada fila
                Nodo iterador = ((TADListaEnlazadaImpl) listaQueSeExportara).getCabecera();
                while (iterador != null) {
                    EntidadGubernamental entidad = iterador.getContenido();
                    csvWriter.append(entidad.getRuc() + ",");
                    csvWriter.append(entidad.getRazonSocial() + ",");
                    csvWriter.append(entidad.getRemypeDepartamento() + ",");
                    csvWriter.append(entidad.getRemypeProvincia() + ",");
                    csvWriter.append(entidad.getRemypeDistrito() + ",");
                    csvWriter.append(entidad.getDomicilioFiscal() + ",");
                    csvWriter.append(entidad.getAppInformaticoDemandas() + ",");
                    csvWriter.append(entidad.getSiaf() + ",");
                    csvWriter.append(entidad.getEstadoDeuda() + ",");
                    csvWriter.append(entidad.getTipoDocumento() + ",");
                    csvWriter.append(entidad.getDocDevenOSentenJudi() + ",");
                    csvWriter.append(entidad.getMontoDeuda() + ",");
                    csvWriter.append(entidad.getDescNivelGobierno() + ",");
                    csvWriter.append(entidad.getDescSector() + ",");
                    csvWriter.append(entidad.getDescPliego() + ",");
                    csvWriter.append(entidad.getSecEjec() + ",");
                    csvWriter.append(entidad.getDescEjecutora() + ",");
                    csvWriter.append(entidad.getObservacionGlosa());
                    csvWriter.append("\n");
                    iterador = iterador.getSiguiente();
                }


                csvWriter.flush();
                csvWriter.close();

                JOptionPane.showMessageDialog(null, "Datos exportados exitosamente");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo CSV.");
        }
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        String ruta = "data/USUARIOS.CSV";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true))) {
            String registro = usuario.getUsuario() + "," +
                  usuario.getNombre() + "," +
                  usuario.getApellido() + "," +
                  usuario.getCargo() + "," +
                  usuario.getSexo() + "," +
                  usuario.getContrasena();
            bw.write(registro);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    @Override
    public TADPilaImpl cargarUsuarios() {
        TADPilaInterface listaUsuarios = new TADPilaImpl();
        String ruta = "data/USUARIOS.CSV";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            br.readLine(); 

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                linea = linea.trim();

                if (linea.isEmpty()) {
                    continue; 
                }

                if (campos.length == 6) { 
                    Usuario usuario = new Usuario(
                        campos[0], // Usuario
                        campos[1], // Nombre
                        campos[2], // Apellido
                        campos[3], // Cargo
                        campos[4], // Sexo
                        campos[5]  // Contraseña
                    );

                    listaUsuarios.push(new NodoAux(usuario));
                } else {
                    System.out.println("Número inesperado de campos en la línea: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return (TADPilaImpl) listaUsuarios;
    }

    
}
