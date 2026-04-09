package _04Generics._40Generic;

public class Generic<T> {
    private T datoGenerico;

    public Generic(T generico){
        this.datoGenerico = generico;
    }

    public void setGenerico(T generico){
        this.datoGenerico = generico;
    }

    public T getGenerico(){
        return this.datoGenerico;
    }

    @Override
    public String toString(){
        return ("Este es un elemento genérico." );
    }
}
