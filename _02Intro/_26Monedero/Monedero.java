package _02Intro._26Monedero;
/* Ejercicio 26
Implemente una clase Monedero que permita gestionar la cantidad de dinero que una
persona dispone en un momento dado. La clase deberá tener un constructor que
permitirá crear un monedero con una cantidad de dinero inicial y deberá definir un
método para meter dinero en el monedero, otro para sacarlo y finalmente, otro para
consultar el disponible; solo podrá conocerse la cantidad de dinero del monedero a
través de este último método. Por supuesto, no se podrá sacar más dinero del que haya
en un momento dado en el monedero. 

Atributos:
 - dinero

Metodos:
 - meterDinero
 - sacarDinero
 - consultarDinero
*/

public class Monedero {
    private float dinero;

    public Monedero(float f){dinero = f;}


    public float consultarDinero(boolean info){
        if (info){System.out.printf("Su saldo actual es de $%.2f\n", this.dinero);}
        return this.dinero;
    }

    public void meterDinero(float d){this.dinero =+ d;}

    public void sacarDinero(float d){
        if (d <= this.consultarDinero(false)){this.dinero = this.dinero - d;}
        else{System.err.println("Dinero insuficiente");}
    }

}
