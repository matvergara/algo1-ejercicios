package _03Herencia._33Hospital;

public class Persona {
    //Atributos
    private String nombre;
    private String direccion;
    private String ciudad;

    //Constructor
    public Persona(String nom, String dir, String ciudad){
        this.nombre = nom;
        this.direccion = dir;
        this.ciudad = ciudad;
    }

    //Getters
    public String getNombre(){return this.nombre;}
    public String getDireccion(){return this.direccion;}
    public String getCiudad(){return this.ciudad;}

    //Setters
    public void setNombre(String nom){
        this.nombre = nom;
    }
    public void setDireccion(String dir){
        this.direccion = dir;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    //Metodos
    public void leer(){}
    public void mostrar(){}
}
