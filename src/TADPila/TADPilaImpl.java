package TADPila;

public class TADPilaImpl<E> implements TADPilaInterface<E> {

    private NodoAux<E> cabecera;

    public TADPilaImpl() {
        this.cabecera = null;
    }

    public NodoAux<E> getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoAux<E> cabecera) {
        this.cabecera = cabecera;
    }
    
    @Override
    public int tamaño() {
        int contador = 0;
        NodoAux<E> actual = this.cabecera;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    @Override
    public void push(NodoAux<E> nuevoNodo) {
        nuevoNodo.setSiguiente(this.cabecera);
        this.cabecera = nuevoNodo;
    }
    @Override
    public E pop() {
        if (this.cabecera == null) {
            return null; // Pila vacía, devuelve null o lanza una excepción según tu preferencia
        }
        NodoAux<E> nodoPop = this.cabecera;
        this.cabecera = this.cabecera.getSiguiente();
        return nodoPop.getContenido();
    }
    
    @Override
    public boolean contiene(E nombre) {
        NodoAux<E> actual = this.cabecera;
        while (actual != null) {
            if (actual.getContenido().equals(nombre)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    
}
