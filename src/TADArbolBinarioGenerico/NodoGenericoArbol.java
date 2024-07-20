package TADArbolBinarioGenerico;

public class NodoGenericoArbol<T> {
    private T valor;
    private NodoGenericoArbol<T> hojaIzquierda, hojaDerecha;

    public NodoGenericoArbol(T valor) {
        this.valor = valor;
        this.hojaIzquierda = null;
        this.hojaDerecha = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public NodoGenericoArbol<T> getHojaIzquierda() {
        return hojaIzquierda;
    }

    public void setHojaIzquierda(NodoGenericoArbol<T> hojaIzquierda) {
        this.hojaIzquierda = hojaIzquierda;
    }

    public NodoGenericoArbol<T> getHojaDerecha() {
        return hojaDerecha;
    }

    public void setHojaDerecha(NodoGenericoArbol<T> hojaDerecha) {
        this.hojaDerecha = hojaDerecha;
    }
}
