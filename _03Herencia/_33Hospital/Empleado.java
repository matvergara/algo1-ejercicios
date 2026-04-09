package _03Herencia._33Hospital;

public class Empleado extends Persona {
    //Atributos
    private int codigoEmpleado;
    private int horasExtras;
    private String companiaSeguro;

    //Constructor
    public Empleado(String nom, String dir, String ciudad, int cod, int horas, String seguro){
        super(nom, dir, ciudad);
        this.codigoEmpleado = cod;
        this.horasExtras = horas;
        this.companiaSeguro = seguro;
    }

    //Getters
    public int getCodigoEmpleado(){return this.codigoEmpleado;}
    public int getHorasExtras(){return this.horasExtras;}
    public String getCompaniaSeguro(){return this.companiaSeguro;}

    //Setters
    public void setCodigoEmpleado(int cod){
        this.codigoEmpleado = cod;
    }
    public void setHorasExtras(int horas){
        this.horasExtras = horas;
    }
    public void setCompaniaSeguro(String seguro){
        this.companiaSeguro = seguro;
    }

    //Metodos
    public void enviarSalario(){}
}
