package _03Herencia._36Auto;

public abstract class Automovil {
    private String color;
    private String patente;
    private String marca;
    private String modelo;
    private Permiso permiso;

    public Automovil(String clr, String pat, String marca, String model, Permiso permiso){
        this.color = clr;
        this.patente = pat;
        this.marca = marca;
        this.modelo = model;
        this.permiso = permiso;
    }

    public String getColor(){return this.color;}
    public String getPatente(){return this.patente;}
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public Permiso getPermiso(){return this.permiso;}

    protected void setPermiso(Permiso permiso){
        this.permiso = permiso;
    }

    public abstract void adquirirPermiso();
}
