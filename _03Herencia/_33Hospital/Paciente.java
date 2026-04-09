package _03Herencia._33Hospital;

public class Paciente extends Persona {
    //Atributos
    private int codigoDiagnostico;
    private int telefono;
    private String fechaNacimiento;

    //Constructor
    public Paciente(String nom, String dir, String ciudad, int cod, int tel, String fecha){
        super(nom, dir, ciudad);
        this.codigoDiagnostico = cod;
        this.telefono = tel;
        this.fechaNacimiento = fecha;
    }

    //Getters
    public int getCodigoDiagnostico(){return this.codigoDiagnostico;}
    public int getTelefono(){return this.telefono;}
    public String getFechaNacimiento(){return this.fechaNacimiento;}

    //Setters
    public void setCodigoDiagnostico(int cod){
        this.codigoDiagnostico = cod;
    }
    public void setTelefono(int tel){
        this.telefono = tel;
    }
    public void setFechaNacimiento(String fecha){
        this.fechaNacimiento = fecha;
    }

    //Metodos
    public void enviarFactura(){}
}
