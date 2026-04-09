package _03Herencia._36Auto;

public class Permiso {
    private boolean habilitado;
    private String fechaHabilitacion;

    public Permiso(boolean habilitado, String fecha){
        this.habilitado = habilitado;
        this.fechaHabilitacion = fecha;
    }

    public boolean isHabilitado(){return this.habilitado;}
    public String getFechaHabilitacion(){return this.fechaHabilitacion;}
}
