package InterfacesDAO;

import Clases.EntidadGubernamental;
import TADEstructurasDeDatos.TADListaEnlazadaImpl;

public interface DAOEntidades {
    public TADListaEnlazadaImpl cargardatos();
    public void guardarDatos(EntidadGubernamental entidad);
}
