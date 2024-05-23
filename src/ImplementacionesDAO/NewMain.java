package ImplementacionesDAO;
import InterfacesDAO.DAOEntidades;
import TADEstructurasDeDatos.*;
public class NewMain {

    
    public static void main(String[] args) {
       TADListaEnlazadaInterface lista = new TADListaEnlazadaImpl();
       DAOEntidades dao  = new DAOEntidadesImpl();
       lista = dao.cargardatos();
       
        System.out.println(lista.tamaño());
        System.out.println(lista.imprimirLista());
    }
    
}
