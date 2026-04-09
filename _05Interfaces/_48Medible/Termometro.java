package _05Interfaces._48Medible;

public class Termometro implements Medible {
    private float temperatura;
    private float minimo = -273;

    public Termometro(float t){
        if(t < this.minimo){
            throw new IllegalArgumentException("La temperatura incial debe ser superior a " + this.minimo);
        }
        this.temperatura = t;
    }

    public float obtenerMedida(){
        return this.temperatura;
    }

    public void incrementarMedicion(float m){
        this.temperatura += m;
    }

    public void decrementarMedicion(float m){
        float aux = this.temperatura - m;
        if(aux < minimo){
            this.temperatura = minimo;
        } else{
            this.temperatura = aux;    
        }
    }
}
