package _03Herencia._32Editorial;

public class Disco extends Publicacion {
    //Atributos
    private int duracionMin;

    //Constructores
    public Disco(String nombre, float precio, int duracion){
        super(nombre, precio);
        this.duracionMin = duracion;

    }

    //Getters
    public int getDuracionMin(){return this.duracionMin;}

    //Setters
    public void setDuracionMin(int duracion){
        this.duracionMin = duracion;
    }

    //Sobreescritura del toString
    @Override
    public String toString(){
        return super.toString() + (" | Duracion (min): " + this.duracionMin);
    }
}
