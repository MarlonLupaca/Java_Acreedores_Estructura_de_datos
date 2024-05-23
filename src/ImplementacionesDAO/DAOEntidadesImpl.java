package ImplementacionesDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import TADEstructurasDeDatos.TADListaEnlazadaImpl;
import Clases.EntidadGubernamental;
import TADEstructurasDeDatos.Nodo;
import InterfacesDAO.*;

public class DAOEntidadesImpl implements DAOEntidades{
    
    
    @Override
    public TADListaEnlazadaImpl cargardatos() {
        int  indice = -1;
        TADListaEnlazadaImpl listaNueva = new TADListaEnlazadaImpl();
        String ruta = "data/ACREEDORES.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            br.readLine(); 
            int contadorSaltosDeLinea = 0; 
            while ((linea = br.readLine()) != null) {
                
                String[] campos = linea.split(",");
                linea = linea.trim();
                
                if (linea.isEmpty() ) { 
                    
                }else{
                    if (campos.length == 18) {
                        indice++;

                        EntidadGubernamental entidad = new EntidadGubernamental(
                                campos[2], 
                                campos[16], 
                                campos[3], 
                                campos[17], 
                                campos[4], 
                                campos[0], 
                                campos[7], 
                                campos[14], 
                                campos[1], 
                                campos[8],
                                campos[10], 
                                campos[9], 
                                campos[2], 
                                Double.parseDouble(campos[11]),
                                campos[5], 
                                campos[12], 
                                campos[15], 
                                campos[13]);
                        listaNueva.CrearNodo(new Nodo(entidad, indice));
                    }
                }
                
                
            } 
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        return listaNueva;
    }

    
    
}
