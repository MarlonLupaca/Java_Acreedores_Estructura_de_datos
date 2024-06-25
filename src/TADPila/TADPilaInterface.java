
package TADPila;

public interface TADPilaInterface<E>{
    public int tamaño();
    public void push(NodoAux<E> nuevoNodo);
    public E pop();
    public boolean contiene(E nombre);
    
    
}
