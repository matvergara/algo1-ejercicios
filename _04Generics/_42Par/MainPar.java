package _04Generics._42Par;
public class MainPar {
    public static void main(String[] args){

        Par<String, Integer> p1 = new Par<>("Edad", 25);

        System.out.println(p1.getPrimero());
        System.out.println(p1.getSegundo());

        Par<Double, Double> p2 = new Par<>(2.5, 8.2);

        System.out.println(p2.getPrimero());
        System.out.println(p2.getSegundo());
    
        p2.setPrimero(57.6);
        p2.setSegundo(5.74);

        System.out.println(p2.getPrimero());
        System.out.println(p2.getSegundo());    
    }

}
