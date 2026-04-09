package _04Generics._41Wrapper;

public class Wrapper<T>{
    private T atributo;

    public Wrapper(T atr){
        this.atributo = atr;
    }

    public T getAtributo() {
        return this.atributo;
    }

    public void setAtributo(T atr) {
        this.atributo = atr;
    }

    @Override
    public String toString(){
        return String.valueOf(this.atributo);
    }

    public void mostrar(){
        System.out.println(this);
    }
    
}
