package _03Herencia._31Persona;

public class Estudiante extends Persona {
    private String carrera;
    private float promedio;

    public Estudiante(){}

    public String getCarrera(){
        return this.carrera;
    }

    public float getPromedio(){
        return this.promedio;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }  

    public void setPromedio(float promedio){
        this.promedio = promedio;
    }

}
