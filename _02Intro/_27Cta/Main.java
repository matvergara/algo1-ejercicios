package _02Intro._27Cta;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cta = new CuentaCorriente(0);
        
        //Test deposito
        cta.deposito(150000);
        cta.deposito(-5000);
        cta.deposito(0);

        //Test extraccion
        cta.extraccion(500000);
        cta.extraccion(50000);
        cta.extraccion(-2000);
        cta.extraccion(0);

        //Test saldo, operaciones validas e invalidas
        System.out.printf("Saldo en cuenta: $%.2f\n", cta.saldo());
        System.out.println("Cantidad de operaciones inválidas en esta sesión: " + cta.cantidadExtraccionesInvalidas());
        System.out.println("Cantidad de operaciones válidas en esta sesión: " + cta.cantidadOperaciones());
    }
}
