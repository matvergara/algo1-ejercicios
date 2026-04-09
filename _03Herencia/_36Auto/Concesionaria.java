package _03Herencia._36Auto;

public class Concesionaria {
    private boolean camionVerificado;


    public boolean isCamionVerificado(){return this.camionVerificado;}

    public void verificarCaracteristicas(Camion c){
        if(c.isBalance() && c.isFrenos() && c.isSeguridad()){
            this.camionVerificado = true;
        }else {
        this.camionVerificado = false;
        }
    }
}
