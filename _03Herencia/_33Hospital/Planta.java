package _03Herencia._33Hospital;

public class Planta extends Empleado {
    //Atributos
    private float salario;
    private int anosAntiguedad;

    //Constructor
    public Planta(String nom, String dir, String ciudad, int cod, int horas, String seguro, float salario, int anos){
        super(nom, dir, ciudad, cod, horas, seguro);
        this.salario = salario;
        this.anosAntiguedad = anos;
    }

    //Getters
    public float getSalario(){return this.salario;}
    public int getAnosAntiguedad(){return this.anosAntiguedad;}

    //Setters
    public void setSalario(float salario){
        this.salario = salario;
    }
    public void setAnosAntiguedad(int anos){
        this.anosAntiguedad = anos;
    }

    //Metodos
    public void pagarSalario(){}
}   
