package TADTablaHashGenerica;

import Clases.EntidadGubernamental;
import TADListaEnlazadaDoble.*;

public class TADTablashashImpl implements TADTablahashInterface{
    //ATRIBUTOS
    private  int size = 13;
    private  TADListaEnlazadaImpl [] tabla = new TADListaEnlazadaImpl[size];

    //CONSTRUCTOR
    public TADTablashashImpl(int tamaño)
    {   for(int i=0; i < tabla.length; i++)
            tabla[i] = new TADListaEnlazadaImpl(); //INICIALIZAMOS LISTAS ENLAZADAS
        this.size = tamaño;
    }
    //METODOS PRIVADOS
    //FUNCION HASH
    private int hash(String cadena){   
        int hash = 0;
        for (int i = 0; i < cadena.length(); i++) {
            hash = 31 * hash + cadena.charAt(i);
        }
        return Math.abs(hash % 101);
    }
    //METODOS PUBLICOS
    @Override
    public void insertar(EntidadGubernamental entidad, String valor)
    {  
        int key = hash(valor.toString()); //FUNCION HASH
        System.out.println("Key : " + key + " -> Value " + valor.toString());
        tabla[key].CrearNodo(new Nodo(entidad, 0));
        
    }
    
    @Override
    public int buscar(String cadena)
    {   int key = hash(cadena);    //FUNCION HASH
        System.out.println("Key : "+ key + " Value : " + tabla[key].imprimirLista());
        return key;
    }
    
    @Override
    public void imprimir()
    {   for(int i=0; i<tabla.length; i++)
            System.out.println("Key : " + i + " -> Value : " + tabla[i].imprimirLista());
    }
}
