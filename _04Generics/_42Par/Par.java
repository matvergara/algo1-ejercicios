package _04Generics._42Par;
/* Ejercicio 41 (42):
Definir la clase genérica Par<A,B> que permita armar pares de elementos de las clases
A y B. Definir getters y setters sobre sus elementos.
*/

public class Par<A, B> {
    private A primero;
    private B segundo;

    public Par(A prim, B segu){
        this.primero = prim;
        this.segundo = segu;
    }

    public A getPrimero(){return this.primero;}
    public B getSegundo(){return this.segundo;}

    public void setPrimero(A prim){
        this.primero = prim;
    }
    public void setSegundo(B segu){
        this.segundo = segu;
    }
}
