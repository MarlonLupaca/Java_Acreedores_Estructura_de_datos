package TADBusquedaBinaria;

import Clases.EntidadGubernamental;
import TADEstructurasDeDatos.TADListaEnlazadaImpl;

public interface TADBusquedaBinariaInterface {
    public TADListaEnlazadaImpl obtenerOcurrencias(TADListaEnlazadaImpl lista, String valor, int opcion);
}
