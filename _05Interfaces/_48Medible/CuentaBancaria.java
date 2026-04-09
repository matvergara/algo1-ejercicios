package _05Interfaces._48Medible;

public class CuentaBancaria implements Medible {
    private float saldo;

    public CuentaBancaria(){
        this.saldo = 0;
    }

    public float obtenerMedida(){
        return this.saldo;
    }

    public void incrementarMedicion(float m){
        if(m <= 0){
            throw new IllegalArgumentException("El monto a incrementar debe ser mayor a cero.");
        }
        this.saldo += m;
    }

    public void decrementarMedicion(float m){
        float aux = this.saldo - m;
        if(aux < 0){
            throw new IllegalArgumentException("Operación inválida, la cuenta no puede quedar en saldo negativo.");
        }
            
        this.saldo = aux;    
        
    }
}