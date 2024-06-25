package TADEstructurasDeDatos;

import Clases.EntidadGubernamental;

public class Nodo {
    int indice;
    EntidadGubernamental contenido;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(EntidadGubernamental contenido, int IndiceNodo) {
        this.contenido = contenido;
        this.siguiente = null;
        this.anterior = null;
        this.indice = IndiceNodo;
    }
    
    

    public Nodo(EntidadGubernamental contenido, Nodo siguiente, Nodo anterior) {
        this.contenido = contenido;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public EntidadGubernamental getContenido() {
        return contenido;
    }

    public void setContenido(EntidadGubernamental contenido) {
        this.contenido = contenido;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
