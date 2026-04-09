package _04Generics._44Pila;

/*
Definir la clase genérica Pila<E>, con sus operaciones elementales (push, pop, size,
etc). Utilizar una implementación utilizando un array, y otra utilizando un ArrayList.
*/

//---------------------------------------------------------------
// EL Array ES INMUTABLE (TAMAÑO FIJO) POR ESO USAMOS ArrayList
//---------------------------------------------------------------

//Importamos la clase ArrayList
import java.util.ArrayList;

public class Pila <E>{

    private ArrayList<E> datos;

    public Pila(){
        //Creamos un array generico vacio
        this.datos = new ArrayList<>(); // Este es un array generico vacio
    }

    //Apilar un elemento
    public void push(E elemento){
        datos.add(elemento);

    }

    //¿Esta vacia?
    public boolean isEmpty(){
        return datos.isEmpty();
    }

    //Desapilar
    public E pop(){
        if(datos.isEmpty()){
            return null;
        }else{
            return datos.removeLast(); //datos.remove(datos.size()-1)
        }
    }

    //Ver tope sin quitarlo
    public E peek(){
        if(datos.isEmpty()){
            return null;
        }else{
            return datos.getLast(); //datos.get(datos.size()-1)
        }
    }

    //Cantidad de elementos
    public int size(){
        return datos.size();
    }

    public String toString(){
        return("MediaPila");
    }
}
