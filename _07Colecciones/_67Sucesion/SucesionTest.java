package _07Colecciones._67Sucesion;

public class SucesionTest {
    public static void main(String[] args) {
        SucesionEstadistica sucesion = new SucesionEstadistica(5);
        sucesion.agregarElemento(5);
        sucesion.agregarElemento(2);
        sucesion.agregarElemento(2.4);
        System.out.println("Cantidad de elementos de la sucesión: " + sucesion.cantidadElementos());
        System.out.println("Media de la sucesión: " + sucesion.media());
        System.out.println("Desviación estándar: " + sucesion.devest());
    }
}
