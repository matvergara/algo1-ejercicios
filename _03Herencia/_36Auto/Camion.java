package _03Herencia._36Auto;

public class Camion extends Automovil {
    private boolean balance;
    private boolean frenos;
    private boolean seguridad;
    private Concesionaria concesionaria;
    private String fechaHabilitacion;

    public Camion(String clr, String pat, String marca, String model, Permiso permiso, boolean balance, boolean frenos, boolean seg, Concesionaria c, String fecha){
        super(clr, pat, marca, model, permiso);
        this.balance = balance;
        this.frenos = frenos;
        this.seguridad = seg;
        this.concesionaria = c;
        this.fechaHabilitacion = fecha;
    }

    public boolean isBalance(){return this.balance;}
    public boolean isFrenos(){return this.frenos;}
    public boolean isSeguridad(){return this.seguridad;}

    @Override
    public void adquirirPermiso(){
        this.concesionaria.verificarCaracteristicas(this);
        if(this.concesionaria.isCamionVerificado()){
            Permiso permiso = new Permiso(true, fechaHabilitacion);
            this.setPermiso(permiso);
        }

    }

}
