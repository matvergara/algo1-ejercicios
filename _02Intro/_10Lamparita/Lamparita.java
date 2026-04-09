package _02Intro._10Lamparita;

public class Lamparita {
    private boolean estado;

    //Inicialmente está apagado. Todos nuestros objetos que instanciemos con Lamparita() tendran ese estado inicial.
    public Lamparita(){
        this.estado = false;
    }

    public void encender(){
        this.estado = true;
    }

    public void apagar(){
        this.estado = false;
    }

    public boolean isEstado(){
        return this.estado;
    }
}
