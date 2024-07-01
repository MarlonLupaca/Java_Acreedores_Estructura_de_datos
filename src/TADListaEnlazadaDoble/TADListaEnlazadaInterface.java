
package TADListaEnlazadaDoble;

import Clases.EntidadGubernamental;

public interface TADListaEnlazadaInterface{
    
    public void CrearNodo(Nodo nuevoNodo);
    public String retirarInicio();
    public String retirarFinal();
    public void insertarDentro(Nodo nuevoNodo, int posicion);
    public void RetirarDentro(int ruc);
    public void imprimirLista();
    public String imprimirListaAlrevez();
    public EntidadGubernamental buscar(int valor);
    public Nodo buscarNodo(int valor);
    public int tamaño();
    public Nodo obtenerUltimoNodo();
    public Nodo obtenerNodoMedio(Nodo inicio, Nodo fin);
    public void OrdenandoIndices();
    public boolean esVacia();
    public boolean contiene(String nombre);
}
