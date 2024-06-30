package TADListaEnlazadaDoble;

import Clases.*;

public class TADListaEnlazadaImpl implements TADListaEnlazadaInterface{

    private Nodo cabecera;

    public Nodo getCabecera() {
        return cabecera;
    }

    public void setCabecera(Nodo cabecera) {
        this.cabecera = cabecera;
    }
    
    public TADListaEnlazadaImpl(){
        this.cabecera = null;
    }
    @Override
    public int tamaño() {
        int contador = -1;
        Nodo actual = this.cabecera;
        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }
    
    

    @Override
    public void CrearNodo(Nodo nuevoNodo) {
        if (nuevoNodo != null) {
            if (this.cabecera == null) {
                
                this.cabecera = nuevoNodo;
            } else {
                
                Nodo ultimo = obtenerUltimoNodo();
                
                nuevoNodo.setAnterior(ultimo);
                ultimo.setSiguiente(nuevoNodo);

            }
        }
    }



    @Override
    public String retirarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String retirarFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insertarDentro(Nodo nuevoNodo, int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void RetirarDentro(int ruc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String imprimirLista() {
        StringBuilder cadena = new StringBuilder();
        Nodo iterador = cabecera; // Comenzamos desde la cabecera
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.contenido;
            cadena.append("Indice: ").append(iterador.indice).append("\n");
            if (iterador.siguiente != null) {
                cadena.append("Indice siguiente: ").append(iterador.siguiente.indice).append("\n");
            } else {
                cadena.append("Indice siguiente: ").append("Nulo").append("\n");
            }
            if (iterador.anterior != null) {
                cadena.append("Indice anterior: ").append(iterador.anterior.indice).append("\n");
            } else {
                cadena.append("Indice anterior: ").append("Nulo").append("\n");
            }
            cadena.append("Ruc: ").append(entidad.getRuc()).append("\n");
            iterador = iterador.siguiente; // Avanzamos al siguiente nodo
        }
        return cadena.toString();
    }


    @Override
    public EntidadGubernamental buscar(int valor) {
        Nodo iterador = this.cabecera;

        while (iterador != null && iterador.indice != valor) {
            iterador = iterador.siguiente;
        }
        if (iterador != null) {
            return iterador.contenido;
        } else {
            return null;
        }
    }


    @Override
    public Nodo buscarNodo(int valor) {
        //metodo lineal
        Nodo iterador = this.cabecera;

        while (iterador != null && iterador.indice != valor) {
            iterador = iterador.siguiente;
        }
        return iterador; 
    }
    
    @Override
    public Nodo obtenerUltimoNodo() {
        Nodo actual = this.cabecera;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        return actual;
    }
    
    @Override
    public Nodo obtenerNodoMedio(Nodo inicio, Nodo fin) {
        Nodo rapido = inicio;
        Nodo lento = inicio;
        while (rapido != null && rapido != fin) {
            rapido = rapido.getSiguiente();
            if (rapido != null && rapido != fin) {
                rapido = rapido.getSiguiente();
                lento = lento.getSiguiente();
            }
        }
        return lento;
    }

    @Override
    public void OrdenandoIndices() {
        int contador = -1;
        Nodo actual = this.cabecera;
        while (actual != null) {
            contador++;
            actual.setIndice(contador);
            actual = actual.getSiguiente();
            
        }   
    }

    @Override
    public boolean esVacia() {
        return this.cabecera == null;
    }

    @Override
    public String imprimirListaAlrevez() {
        StringBuilder cadena = new StringBuilder();
        Nodo iterador = obtenerUltimoNodo();
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.contenido;
            cadena.append("Indice: ").append(iterador.indice).append("\n");
            cadena.append("Ruc: ").append(entidad.getRuc()).append("\n");
            iterador = iterador.anterior;
        }
        return cadena.toString();
    }

    @Override
    public boolean contiene(String nombre) {
        Nodo iterador = cabecera;
        while (iterador != null) {
            EntidadGubernamental entidad = iterador.contenido;
            if (entidad.getRemypeDepartamento().equals(nombre)) {
                return true;
            }
            iterador = iterador.siguiente;
        }
        return false;
    }

}
