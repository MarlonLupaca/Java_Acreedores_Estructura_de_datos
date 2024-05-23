package TADMetodos_de_ordenamiento;

import TADEstructurasDeDatos.*;

public class TADOrdenamientoMergeSortImpl implements TADOrdenamientoInterface {

    @Override
    public TADListaEnlazadaImpl OrdenarPorTexto(TADListaEnlazadaImpl listaRecibida, int inicio, int fin, int valor) {
        if (listaRecibida != null) {
            listaRecibida.setCabecera(mergeSort(listaRecibida.getCabecera(), valor));
        }
        return listaRecibida;
    }

    private Nodo mergeSort(Nodo head, int valor) {
        if (head == null || head.getSiguiente() == null) {
            return head;
        }

        Nodo medio = obtenerMedio(head);
        Nodo siguienteMedio = medio.getSiguiente();
        medio.setSiguiente(null);
        siguienteMedio.setAnterior(null);

        Nodo izquierda = mergeSort(head, valor);
        Nodo derecha = mergeSort(siguienteMedio, valor);

        return merge(izquierda, derecha, valor);
    }

    private Nodo obtenerMedio(Nodo head) {
        if (head == null) {
            return head;
        }
        Nodo lento = head, rapido = head.getSiguiente();
        while (rapido != null && rapido.getSiguiente() != null) {
            lento = lento.getSiguiente();
            rapido = rapido.getSiguiente().getSiguiente();
        }
        return lento;
    }

    private Nodo merge(Nodo izquierda, Nodo derecha, int valor) {
        if (izquierda == null) {
            return derecha;
        }
        if (derecha == null) {
            return izquierda;
        }
        switch(valor)
        {
            case 1:
                if (izquierda.getContenido().getRuc().compareTo(derecha.getContenido().getRuc()) <= 0) {
                    izquierda.setSiguiente(merge(izquierda.getSiguiente(), derecha, valor));
                    izquierda.getSiguiente().setAnterior(izquierda);
                    return izquierda;
                } else {
                    derecha.setSiguiente(merge(izquierda, derecha.getSiguiente(), valor));
                    derecha.getSiguiente().setAnterior(derecha);
                    return derecha;
                }

            case 2:
                if (izquierda.getContenido().getRazonSocial().compareTo(derecha.getContenido().getRazonSocial()) <= 0) {
                    izquierda.setSiguiente(merge(izquierda.getSiguiente(), derecha, valor));
                    izquierda.getSiguiente().setAnterior(izquierda);
                    return izquierda;
                } else {
                    derecha.setSiguiente(merge(izquierda, derecha.getSiguiente(), valor));
                    derecha.getSiguiente().setAnterior(derecha);
                    return derecha;
                }

            case 3:
                if (izquierda.getContenido().getNombrePliego().compareTo(derecha.getContenido().getNombrePliego()) <= 0) {
                    izquierda.setSiguiente(merge(izquierda.getSiguiente(), derecha, valor));
                    izquierda.getSiguiente().setAnterior(izquierda);
                    return izquierda;
                } else {
                    derecha.setSiguiente(merge(izquierda, derecha.getSiguiente(), valor));
                    derecha.getSiguiente().setAnterior(derecha);
                    return derecha;
                }
            case 4:
                if (izquierda.getContenido().getRemypeDepartamento().compareTo(derecha.getContenido().getRemypeDepartamento()) <= 0) {
                    izquierda.setSiguiente(merge(izquierda.getSiguiente(), derecha, valor));
                    izquierda.getSiguiente().setAnterior(izquierda);
                    return izquierda;
                } else {
                    derecha.setSiguiente(merge(izquierda, derecha.getSiguiente(), valor));
                    derecha.getSiguiente().setAnterior(derecha);
                    return derecha;
                } 
             case 5:
                if (izquierda.getContenido().getRemypeProvincia().compareTo(derecha.getContenido().getRemypeProvincia()) <= 0) {
                    izquierda.setSiguiente(merge(izquierda.getSiguiente(), derecha, valor));
                    izquierda.getSiguiente().setAnterior(izquierda);
                    return izquierda;
                } else {
                    derecha.setSiguiente(merge(izquierda, derecha.getSiguiente(), valor));
                    derecha.getSiguiente().setAnterior(derecha);
                    return derecha;
                }  
                
            default:
                throw new IllegalArgumentException("Valor de comparación no válido: " + valor);

        }

    }
}
