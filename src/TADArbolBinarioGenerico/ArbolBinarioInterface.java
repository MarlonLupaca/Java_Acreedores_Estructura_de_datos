package TADArbolBinarioGenerico;

public interface ArbolBinarioInterface<T> {
    
    // Métodos para obtener y establecer la raíz del árbol
    NodoGenericoArbol<T> getRaiz();
    void setRaiz(NodoGenericoArbol<T> raiz);
    
    // Métodos para insertar, buscar y eliminar nodos en el árbol
    void insertar(NodoGenericoArbol<T> nodo);
    NodoGenericoArbol<T> buscar(NodoGenericoArbol<T> nodoBuscado);
    void eliminar(NodoGenericoArbol<T> nodoEliminar);

    // Métodos para recorrer el árbol
    void preOrden(NodoGenericoArbol<T> raiz);
    void inOrden(NodoGenericoArbol<T> raiz);
    void postOrden(NodoGenericoArbol<T> raiz);
}
