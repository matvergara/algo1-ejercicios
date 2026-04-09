package _03Herencia._32Editorial;

public class Publicacion {
    //Atributos
    private String titulo;
    private float precio;

    //Constructores
    public Publicacion(String titulo, float precio){
        this.titulo = titulo;
        this.precio = precio;
    }

    //Getters
    public String getTitulo(){return this.titulo;}
    public float getPrecio(){return this.precio;}

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }

    //Sobreescritura del toString
    @Override
    public String toString(){
        return ("Titulo: " + this.titulo + " | Precio: " + this.precio);
    }

}

