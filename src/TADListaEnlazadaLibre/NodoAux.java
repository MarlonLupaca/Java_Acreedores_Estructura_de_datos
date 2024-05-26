
package TADListaEnlazadaLibre;

public class NodoAux {
    Object contenido;
    NodoAux siguiente;

    public NodoAux(Object contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public NodoAux getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAux siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
