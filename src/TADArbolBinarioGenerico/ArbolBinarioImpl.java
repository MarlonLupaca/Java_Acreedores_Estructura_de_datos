package TADArbolBinarioGenerico;

import java.util.Comparator;

public class ArbolBinarioImpl<T> {
    // ATRIBUTOS
    private NodoGenericoArbol<T> raiz;
    private Comparator<T> comparador;

    // CONSTRUCTORES
    public ArbolBinarioImpl(Comparator<T> comparador) {
        this.raiz = null; // Inicializa sin raíz
        this.comparador = comparador;
    }


    public ArbolBinarioImpl(NodoGenericoArbol<T> raiz, Comparator<T> comparador) {
        this.raiz = raiz;
        this.comparador = comparador;
    }

    // METODOS GETTER & SETTER
    public NodoGenericoArbol<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoGenericoArbol<T> raiz) {
        this.raiz = raiz;
    }

    // METODOS PUBLICOS
    public void preOrden(NodoGenericoArbol<T> raiz) {
        if (raiz != null) {
            System.out.print(raiz.getValor().toString() + " => ");
            preOrden(raiz.getHojaIzquierda());    // LLAMADA RECURSIVA RAMA IZQUIERDA
            preOrden(raiz.getHojaDerecha());      // LLAMADA RECURSIVA RAMA DERECHA
        }
    }

    public void inOrden(NodoGenericoArbol<T> raiz) {
        if (raiz != null) {
            inOrden(raiz.getHojaIzquierda());
            System.out.print(raiz.getValor().toString() + " => ");
            inOrden(raiz.getHojaDerecha());
        }
    }

    public void postOrden(NodoGenericoArbol<T> raiz) {
        if (raiz != null) {
            postOrden(raiz.getHojaIzquierda());
            postOrden(raiz.getHojaDerecha());
            System.out.print(raiz.getValor().toString() + " => ");
        }
    }

    public void insertar(NodoGenericoArbol<T> nodo) {
        this.insertarNodo(nodo, this.raiz); // METODO RECURSIVO
    }

    private void insertarNodo(NodoGenericoArbol<T> nodo, NodoGenericoArbol<T> raiz) {
        if (raiz == null) { // NODO PADRE no existe
            this.setRaiz(nodo); // nodo NUEVO ingresa como NODO PADRE
        } else { // CASO GENERAL
            int comparacion = comparador.compare(nodo.getValor(), raiz.getValor());

            if (comparacion <= 0) { // Nodo nuevo < NODO PADRE => pasamos a NODO IZQUIERDA
                if (raiz.getHojaIzquierda() == null) {
                    raiz.setHojaIzquierda(nodo);
                } else {
                    insertarNodo(nodo, raiz.getHojaIzquierda()); // llamada RECURSIVA
                }
            } else { // Nodo NUEVO > NODO PADRE => pasamos a NODO DERECHA
                if (raiz.getHojaDerecha() == null) {
                    raiz.setHojaDerecha(nodo);
                } else {
                    insertarNodo(nodo, raiz.getHojaDerecha()); // llamada RECURSIVA
                }
            }
        }
    }

    public NodoGenericoArbol<T> buscar(NodoGenericoArbol<T> NodoBuscado) {
        if (raiz == null)
            return null;
        else
            return buscarNodo(this.raiz, NodoBuscado); // METODO RECURSIVO
    }

    private NodoGenericoArbol<T> buscarNodo(NodoGenericoArbol<T> raizSub, NodoGenericoArbol<T> buscado) {
        if (raizSub == null) {
            return null;
        } else {
            int comparacion = comparador.compare(buscado.getValor(), raizSub.getValor());

            if (comparacion == 0)
                return raizSub;
            else if (comparacion < 0)
                return buscarNodo(raizSub.getHojaIzquierda(), buscado); // LLAMADA RECURSIVA
            else
                return buscarNodo(raizSub.getHojaDerecha(), buscado); // LLAMADA RECURSIVA
        }
    }

    public void eliminar(NodoGenericoArbol<T> NodoEliminado) {
        this.raiz = eliminarNodo(this.raiz, NodoEliminado);
    }

    private NodoGenericoArbol<T> eliminarNodo(NodoGenericoArbol<T> raizSub, NodoGenericoArbol<T> NodoEliminar) {
        if (raizSub != null) {
            int comparacion = comparador.compare(NodoEliminar.getValor(), raizSub.getValor());

            if (comparacion < 0) {
                NodoGenericoArbol<T> nodoIzquierdo;
                nodoIzquierdo = eliminarNodo(raizSub.getHojaIzquierda(), NodoEliminar);
                raizSub.setHojaIzquierda(nodoIzquierdo);
            } else if (comparacion > 0) {
                NodoGenericoArbol<T> nodoDerecho;
                nodoDerecho = eliminarNodo(raizSub.getHojaDerecha(), NodoEliminar);
                raizSub.setHojaDerecha(nodoDerecho);
            } else {
                NodoGenericoArbol<T> nodoBorrar;
                nodoBorrar = raizSub;

                if (nodoBorrar.getHojaIzquierda() == null) {
                    raizSub = nodoBorrar.getHojaDerecha();
                } else if (nodoBorrar.getHojaDerecha() == null) {
                    raizSub = nodoBorrar.getHojaIzquierda();
                } else {
                    nodoBorrar = reemplazarNodo(nodoBorrar);
                }
                nodoBorrar = null;
            }
        }
        return raizSub;
    }

    private NodoGenericoArbol<T> reemplazarNodo(NodoGenericoArbol<T> actual) {
        NodoGenericoArbol<T> a, p;
        p = actual;
        a = actual.getHojaIzquierda();
        while (a.getHojaDerecha() != null) {
            p = a;
            a = a.getHojaDerecha();
        }

        actual.setValor(a.getValor());
        if (p == actual)
            p.setHojaIzquierda(a.getHojaIzquierda());
        else
            p.setHojaDerecha(a.getHojaIzquierda());

        return a;
    }
}
