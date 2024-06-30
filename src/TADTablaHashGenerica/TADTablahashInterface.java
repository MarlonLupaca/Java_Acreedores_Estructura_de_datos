package TADTablaHashGenerica;

import Clases.EntidadGubernamental;

public interface TADTablahashInterface {

    public int buscar(String cadena);
    public void imprimir();
    public void insertar(EntidadGubernamental entidad, String valor);
}
