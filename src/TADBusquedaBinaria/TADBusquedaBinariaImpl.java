package TADBusquedaBinaria;

import TADEstructurasDeDatos.*;

public class TADBusquedaBinariaImpl  implements TADBusquedaBinariaInterface{

    private int encontrarPrimeraOcurrencia(TADListaEnlazadaImpl lista, String valor, int Opcion) {
        Nodo PrimerNodo = lista.getCabecera();

        while (PrimerNodo != null) {
            //
            switch (Opcion) {
                case 1:
                    if (PrimerNodo.getContenido().getRuc().toUpperCase().contains(valor.toUpperCase())) {
                        return PrimerNodo.getIndice();
                    }
                    break;
                case 2:
                    if (PrimerNodo.getContenido().getRazonSocial().toUpperCase().contains(valor.toUpperCase())) {
                        return PrimerNodo.getIndice();
                    }
                    break;
                case 3:
                    if (PrimerNodo.getContenido().getNombrePliego().toUpperCase().contains(valor.toUpperCase())) {
                        return PrimerNodo.getIndice();
                    }
                    break;
                case 4:
                    if (PrimerNodo.getContenido().getRemypeDepartamento().toUpperCase().contains(valor.toUpperCase())) {
                        System.err.println(PrimerNodo.getIndice());
                        System.err.println(PrimerNodo.getContenido().getRemypeDepartamento());
                        return PrimerNodo.getIndice();
                    }
                    break;
                case 5:
                    if (PrimerNodo.getContenido().getRemypeProvincia().toUpperCase().contains(valor.toUpperCase())) {
                        return PrimerNodo.getIndice();
                    }
                    break;    
                case 6:
                    if (PrimerNodo.getContenido().getRemypeDistrito().toUpperCase().contains(valor.toUpperCase())) {
                        return PrimerNodo.getIndice();
                    }
                    break;    
                case 7:
                    if (PrimerNodo.getContenido().getNombrePliego().toUpperCase().contains(valor.toUpperCase())) {
                        return PrimerNodo.getIndice();
                    }
                    break;
                case 8:
                    if (PrimerNodo.getContenido().getNumeroEjecutadora().toUpperCase().contains(valor.toUpperCase())) {
                        return PrimerNodo.getIndice();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            //
            PrimerNodo = PrimerNodo.getSiguiente();
        }
        return -1;
    }

    private int encontrarUltimaOcurrencia(TADListaEnlazadaImpl lista, String valor, int opcion) {
        Nodo UltimoNodo = lista.obtenerUltimoNodo();
        while (UltimoNodo != null) {
            switch (opcion) {
                case 1:
                    if (UltimoNodo.getContenido().getRuc().toUpperCase().contains(valor.toUpperCase())) {
                        return UltimoNodo.getIndice();
                    }
                    break;
                case 2:
                    if (UltimoNodo.getContenido().getRazonSocial().toUpperCase().contains(valor.toUpperCase())) {
                        return UltimoNodo.getIndice();
                    }   
                    break;
                case 3:
                    if (UltimoNodo.getContenido().getNombrePliego().toUpperCase().contains(valor.toUpperCase())) {
                        return UltimoNodo.getIndice();
                    }                    
                    break;
                case 4:
                    if (UltimoNodo.getContenido().getRemypeDepartamento().toUpperCase().contains(valor.toUpperCase())) {
                        System.err.println(UltimoNodo.getIndice());
                        System.err.println(UltimoNodo.getContenido().getRemypeDepartamento());
                        return UltimoNodo.getIndice();
                    } 
                    break;
                case 5:
                    if (UltimoNodo.getContenido().getRemypeProvincia().toUpperCase().contains(valor.toUpperCase())) {
                        return UltimoNodo.getIndice();
                    } 
                    break;    
                case 6:
                    if (UltimoNodo.getContenido().getRemypeDistrito().toUpperCase().contains(valor.toUpperCase())) {
                        return UltimoNodo.getIndice();
                    } 
                    break;    
                case 7:
                    if (UltimoNodo.getContenido().getNombrePliego().toUpperCase().contains(valor.toUpperCase())) {
                        return UltimoNodo.getIndice();
                    } 
                    break;
                case 8:
                    if (UltimoNodo.getContenido().getNumeroEjecutadora().toUpperCase().contains(valor.toUpperCase())) {
                        return UltimoNodo.getIndice();
                    } 
                    break; 
                default:
                    throw new AssertionError();
            }
            
            UltimoNodo = UltimoNodo.getAnterior();
        }
        return -1;
    }
    
    @Override
    public TADListaEnlazadaImpl obtenerOcurrencias(TADListaEnlazadaImpl lista, String valor, int opcion) {
        
        
        TADListaEnlazadaImpl listaConcurrencia = new TADListaEnlazadaImpl();
        int indice = -1;
        int primera = encontrarPrimeraOcurrencia(lista, valor, opcion);
        int ultima = encontrarUltimaOcurrencia(lista, valor, opcion);

        Nodo iterador = lista.getCabecera();

        while (iterador != null) {
            switch (opcion) {
                case 1:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getRuc().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break;
                case 2:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getRazonSocial().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break;
                case 3:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getNombrePliego().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break;
                case 4:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getRemypeDepartamento().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break;
                case 5:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getRemypeProvincia().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break;    
                case 6:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getRemypeDistrito().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break;    
                case 7:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getNombrePliego().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break;
                case 8:
                    if (iterador.getIndice() >= primera && iterador.getIndice() <= ultima && iterador.getContenido().getNumeroEjecutadora().toUpperCase().contains(valor.toUpperCase())) {
                        indice++;
                        listaConcurrencia.CrearNodo(new Nodo(iterador.getContenido(),indice));
                    }
                    break; 
                default:
                    throw new AssertionError();
            }
            
            iterador = iterador.getSiguiente();
        }
 
        return listaConcurrencia;
    }

}