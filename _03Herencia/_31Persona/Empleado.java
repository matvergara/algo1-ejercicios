package _03Herencia._31Persona;

public class Empleado extends Persona {
    private float sueldo;
    
    public Empleado(){}

    public float getSueldo(){return this.sueldo;}

    public void setSueldo(float sueldo){
        this.sueldo = sueldo;
    }
}
