package _04Generics._45Cola;

import java.util.ArrayList;

public class Cola<E> {
    private ArrayList<E> datos;

    public Cola(){
        //Creamos un array generico vacío
        this.datos = new ArrayList<>();
    }


    public ArrayList<E> getDatos(){return this.datos;}

    //Añadimos un elemento al final de la cola
    public void enqueue(E elemento){
        this.datos.add(elemento);
    }


    //Quitamos el primer elemento de la cola
    public E dequeue(){
        if(this.datos.isEmpty()){
            return null;
        } else{
            return this.datos.removeFirst();
        }
    }
    
    public boolean isEmpty(){
        return this.datos.isEmpty();
    }

    public int size(){
        return this.datos.size();
    }

    public E peek(){
        if(this.datos.isEmpty()){
            return null;
        } else{
            return this.datos.getFirst();
        }
    }

}
