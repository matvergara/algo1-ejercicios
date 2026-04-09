package _02Intro._26Monedero;
public class MainMonedero {
    public static void main(String[] args){
        Monedero m = new Monedero(0);
        m.consultarDinero(true);
        m.meterDinero(500);
        m.consultarDinero(true);
        m.sacarDinero(200);
        m.consultarDinero(true);
        m.sacarDinero(600);
        m.consultarDinero(true);
    }
}
