package ImplementacionesDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import TADListaEnlazadaDoble.TADListaEnlazadaImpl;
import Clases.EntidadGubernamental;
import TADListaEnlazadaDoble.Nodo;
import InterfacesDAO.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

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



    
    
}
