package InterfacesDAO;

import Clases.EntidadGubernamental;
import Clases.Usuario;
import TADListaEnlazadaDoble.TADListaEnlazadaImpl;
import TADPilaGenerica.TADPilaImpl;
import java.awt.Component;

public interface DAOEntidades {
    public TADListaEnlazadaImpl cargardatos();
    public TADPilaImpl cargarUsuarios();
    public void guardarDatos(EntidadGubernamental entidad);
    public void guardarUsuario(Usuario usuario);
    public void ExportaCSV(Component parent, TADListaEnlazadaImpl listaQueSeExportara);
}
