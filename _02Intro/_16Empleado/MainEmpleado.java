package _02Intro._16Empleado;

public class MainEmpleado {
    public static void main(String[] args){
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();
        Empleado e3 = new Empleado();

        e1.setNumero(54);
        e1.setNombre("Lucas Lopez");
        e2.setNumero(25);
        e2.setNombre("Mario Gomez");
        e3.setNumero(82);
        e3.setNombre("Juana Perez");

        e1.verDatos();
        e2.verDatos();
        e3.verDatos();
    }
}
