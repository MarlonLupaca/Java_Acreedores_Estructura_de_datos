package InterfacesDAO;

import Clases.EntidadGubernamental;
import TADListaEnlazadaDoble.TADListaEnlazadaImpl;

public interface DAOEntidades {
    public TADListaEnlazadaImpl cargardatos();
    public void guardarDatos(EntidadGubernamental entidad);
}
