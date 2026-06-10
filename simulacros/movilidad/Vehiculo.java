package simulacros.movilidad;

public class Vehiculo {
    private double tarifaBase;
    private double costoMantenimiento;
    private String patente;
    private String marca;
    private String modelo;
    private EstadoVehiculo estado;
    
    public Vehiculo(double tarifaBase, String patente, String marca, String modelo, EstadoVehiculo estado, double costoMantenimiento) {
        this.tarifaBase = tarifaBase;
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.costoMantenimiento = costoMantenimiento;
    }


    public double costoAlquiler(int dias){
        return this.getTarifaBase() * dias;
    }

    public void setTarifaBase(double tarifa){this.tarifaBase = tarifa; }


    public double getTarifaBase(){
        return this.tarifaBase;
    }

    public double getCostoMantenimiento(){
        return this.costoMantenimiento;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }
}
