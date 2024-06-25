
package TADPila;

public class NodoAux<E>{
    E contenido;
    NodoAux siguiente;

    public NodoAux(E contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }

    public E getContenido() {
        return contenido;
    }

    public void setContenido(E contenido) {
        this.contenido = contenido;
    }

    public NodoAux getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAux siguiente) {
        this.siguiente = siguiente;
    }
}
