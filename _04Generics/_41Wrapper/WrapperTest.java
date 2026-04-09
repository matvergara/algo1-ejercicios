package _04Generics._41Wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        //Creamos una referencia al objeto w1
        Wrapper<String> w1 = new Wrapper<String>("Hola Mundo!");
        w1.mostrar();
        
        //Testeamos getter
        System.out.println(w1.getAtributo());

        //Testeamos setter
        w1.setAtributo("Chau");
        w1.mostrar();
        System.out.println(w1);
    }
}
