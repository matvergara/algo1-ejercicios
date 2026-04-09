package _03Herencia._31Persona;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(){}

    public String getNombre(){return this.nombre;}

    public int getEdad(){return this.edad;}

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
