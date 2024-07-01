package TADTablaHash;

import Clases.EntidadGubernamental;
import TADListaEnlazadaDoble.*;

public class TADTablashashImpl implements TADTablahashInterface{
    //ATRIBUTOS
    private  int size = 7;
    private  TADListaEnlazadaImpl [] tabla = new TADListaEnlazadaImpl[size];

    //CONSTRUCTOR
    public TADTablashashImpl()
    {   for(int i=0; i < tabla.length; i++)
            tabla[i] = new TADListaEnlazadaImpl(); //INICIALIZAMOS LISTAS ENLAZADAS
    }
    //METODOS PRIVADOS
    //FUNCION HASH
    private int hash(String cadena) {
        int hash = 0;
        for (int i = 0; i < cadena.length(); i++) {
            hash = hash + cadena.charAt(i);
        }
        return Math.abs(hash % 7);
    }

    //METODOS PUBLICOS
    @Override
    public void insertar(EntidadGubernamental entidad, String valor)
    {  
        int key = hash(valor); //FUNCION HASH
        tabla[key].CrearNodo(new Nodo(entidad,0));
        
    }
    
    @Override
    public TADListaEnlazadaImpl buscar(String cadena)
    {   int key = hash(cadena);    //FUNCION HASH
        System.out.println("Key : "+ key + " Value : ");
        tabla[key].imprimirLista();
        return tabla[key];
    }
    
    @Override
    public void imprimir()
    {   
        for(int i=0; i < tabla.length; i++){
            System.err.println("Clave : " + i + " -> Value : ");
            tabla[i].imprimirLista();
        }
    }

    @Override
    public double totalizador(String clave) {
        int key = hash(clave);
        double deuda = 0;
        Nodo cabecera = tabla[key].getCabecera();
        while (cabecera != null) {            
            deuda += cabecera.getContenido().getMontoDeuda();
            cabecera = cabecera.getSiguiente();
        }
        return deuda;
    }
}
