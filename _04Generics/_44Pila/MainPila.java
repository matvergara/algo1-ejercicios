package _04Generics._44Pila;
public class MainPila {
    public static void main(String[] args) {
        Pila p1 = new Pila<>();
        p1.push(50);
        p1.push("Hola");
        System.out.println(p1.peek());
        p1.pop();
        System.out.println(p1.peek());
        System.out.println(p1.size());
        System.out.println(p1.isEmpty());
        p1.pop();
        System.out.println(p1.isEmpty());

    }
}
