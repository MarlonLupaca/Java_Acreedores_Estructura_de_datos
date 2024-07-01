package TADTablaHash;

import Clases.EntidadGubernamental;
import TADListaEnlazadaDoble.*;

public interface TADTablahashInterface {

    public TADListaEnlazadaImpl buscar(String cadena);
    public void imprimir();
    public void insertar(EntidadGubernamental entidad, String valor);
    public double totalizador(String clave);
}
