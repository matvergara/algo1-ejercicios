package _03Herencia._32Editorial;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nTest Publicacion:");
        Publicacion p = new Publicacion("El Amor Despues del Amor", 30000);
        System.out.println(p);
        System.out.println(p.getPrecio());
        System.out.println(p.getTitulo());
        p.setPrecio(50000);
        p.setTitulo("Circo Beat");
        System.out.println(p);

        System.out.println("\nTest Libro:");
        Libro l = new Libro("Clean Code", 50000, 350, 1990);
        System.out.println(l);
        System.out.println(l.getPrecio());
        System.out.println(l.getTitulo());
        System.out.println(l.getNumPaginas());
        System.out.println(l.getAnioPublicacion());
        l.setAnioPublicacion(1996);
        l.setNumPaginas(500);
        l.setTitulo("Clean Architecture");
        l.setPrecio(65000);
        System.out.println(l);
        

        System.out.println("\nTest Disco:");
        Disco d = new Disco("Piano Bar", 15000, 57);
        System.out.println(d);
        System.out.println(d.getPrecio());
        System.out.println(d.getTitulo());
        System.out.println(d.getDuracionMin());
        d.setTitulo("Clics Modernos");
        d.setPrecio(18000);
        d.setDuracionMin(34);
        System.out.println(d);


    }
}
