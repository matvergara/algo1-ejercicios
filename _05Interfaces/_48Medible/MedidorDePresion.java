package _05Interfaces._48Medible;

public class MedidorDePresion implements Medible {
    private float unidades;
    private int incrementos;
    private boolean lastDecremento;

    public MedidorDePresion(){
        this.unidades = 0;
        this.incrementos = 0;
        this.lastDecremento = false;
    }

    public float obtenerMedida(){
        return this.unidades;
    }

    public void incrementarMedicion(float m){
        this.unidades += m;
        this.incrementos += 1;
        this.lastDecremento = false;
    }

    public void decrementarMedicion(float m){
        if(this.lastDecremento){
            System.out.println("Decremento no aplicado: no pueden existir dos decrementos consecutivos.");
        } else{
            this.unidades += m / (float) incrementos;
            this.incrementos = 0;
            this.lastDecremento = true;
        }
    }
}