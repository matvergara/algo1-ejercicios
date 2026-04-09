package _02Intro._16Empleado;

public class Empleado {
    private int numero;
    private String nombre;

    public Empleado(){}

    public Empleado(int num, String nombre){
        this.numero = num;
        this.nombre = nombre;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNumero(int num){
        this.numero = num;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void verDatos(){
        System.out.println("Numero del empleado: " + this.numero + "\nNombre del empleado: " + this.nombre);
    }
}
