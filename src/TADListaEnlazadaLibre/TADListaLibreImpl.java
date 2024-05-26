package TADListaEnlazadaLibre;

import TADEstructurasDeDatos.Nodo;

public class TADListaLibreImpl implements TADListaLibreInterface {

    private NodoAux cabecera;

    public TADListaLibreImpl() {
        this.cabecera = null;
    }

    public NodoAux getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoAux cabecera) {
        this.cabecera = cabecera;
    }
    
   
    @Override
    public int tamaño() {
        int contador = -1;
        NodoAux actual = this.cabecera;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    @Override
    public void crearNodo(NodoAux nuevoNodo) {
        if (this.cabecera == null) {
            this.cabecera = nuevoNodo;
        } else {
            NodoAux actual = this.cabecera;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    @Override
    public boolean contiene(String nombre) {
        NodoAux actual = this.cabecera;
        while (actual != null) {

            if (actual.getContenido().equals(nombre)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
}
