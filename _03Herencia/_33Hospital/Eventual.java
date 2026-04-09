package _03Herencia._33Hospital;

public class Eventual extends Empleado {
    //Atributos
    private float honorariosPorHora;

    //Constructor
    public Eventual(String nom, String dir, String ciudad, int cod, int horas, String seguro, float honorarios){
        super(nom, dir, ciudad, cod, horas, seguro);
        this.honorariosPorHora = honorarios;
    }

    //Getters
    public float getHonorarios(){return this.honorariosPorHora;}

    //Setters
    public void setHonorarios(float honorarios){
        this.honorariosPorHora = honorarios;
    }

    //Metodos
    public void pagarSalario(){}


}
