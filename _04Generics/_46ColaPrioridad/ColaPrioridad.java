package _04Generics._46ColaPrioridad;

import java.util.ArrayList;
import _04Generics._45Cola.Cola;

public class ColaPrioridad<E> extends Cola<E>{
    //Esta implementación viola el LSK. 
    //La clase ColaPrioridad no podría sustituir a la clase Cola, porque implementa un tipo de enqueue y dequeue que cambia el funcionamiento del programa.
    
    public ColaPrioridad(){
        super();
    }

    //En una primera versión implemento un boolean prior que me indica si el elemento a encolar o desencolar es o no prioritario. Lo correcto sería una lógica interna que ordene la cola o compare prioridades
    //public void enqueuePriority(E elemento, boolean prior){
    //    this.getDatos().
    //}

    //public E dequeueHigh(){}

    
    
}
