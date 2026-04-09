package _03Herencia._32Editorial;

public class Libro extends Publicacion {
    //Atributos
    private int numPaginas;
    private int anioPublicacion;

    //Constructores
    public Libro(String titulo, float precio, int numPaginas, int anio){
        super(titulo, precio);
        this.numPaginas = numPaginas;
        this.anioPublicacion = anio;
    }

    //Setters
    public void setNumPaginas(int num){
        this.numPaginas = num;
    }
    public void setAnioPublicacion(int anio){
        this.anioPublicacion = anio;
    }

    //Getters
    public int getNumPaginas(){return this.numPaginas;}
    public int getAnioPublicacion(){return this.anioPublicacion;}

    //Sobreescritura de toString
    @Override
    public String toString(){
        return super.toString() + (" | Paginas: " + this.numPaginas + " | Año: " + this.anioPublicacion);
    }    

}
