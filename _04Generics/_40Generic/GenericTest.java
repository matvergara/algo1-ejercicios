package _04Generics._40Generic;

public class GenericTest {
    public static void main(String[] args) {
        //Creamos una referencia a un objeto Generic (con su tipo asignado)
        Generic<String> g1 = new Generic<>("Hola");

        //Test del metodo getGenerico()
        System.out.println(g1.getGenerico());
        
        //Test del metodo setGenerico()
        g1.setGenerico("Chau");
        System.out.println(g1.getGenerico());

        //Creamos una referencia a un objeto Generic (sin tipo asignado)
        Generic raw = new Generic("Raw");
        raw.setGenerico(25);
        System.out.println(raw.getGenerico());

        System.out.println(g1);
    }
}
