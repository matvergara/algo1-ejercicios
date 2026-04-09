package _03Herencia._36Auto;

public class AutoMediano extends Automovil {
    private String fechaHabilitacion;

    public AutoMediano(String col, String pat, String marca, String model, Permiso permiso, String fecha){
        super(col, pat, marca, model, permiso);
        this.fechaHabilitacion = fecha;
    }

    @Override
    public void adquirirPermiso(){
        Permiso permiso = new Permiso(true, this.fechaHabilitacion);
        this.setPermiso(permiso);
    }
}
