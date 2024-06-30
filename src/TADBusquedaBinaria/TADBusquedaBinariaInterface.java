package TADBusquedaBinaria;

import Clases.EntidadGubernamental;
import TADListaEnlazadaDoble.TADListaEnlazadaImpl;

public interface TADBusquedaBinariaInterface {
    public TADListaEnlazadaImpl obtenerOcurrencias(TADListaEnlazadaImpl lista, String valor, int opcion, int ValorExacto);
}
