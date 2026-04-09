package _02Intro._15Hora;

public class MainHora {
    public static void main(String[] args){
        Hora h1 = new Hora(10, 25, 40);
        Hora h2 = new Hora(15, 45, 38);
        Hora h3;

        h3 = Hora.sumar(h1,h2);
        h3.visualizar();
    }
}
