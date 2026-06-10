package simulacros.movilidad;

public class Main {
    public static void main(String[] args) {
        GestorVehiculos gestor = new GestorVehiculos();

        // Carga de vehiculos 
        gestor.cargarVehiculo(new Auto(25000, "DKU958", "Peugeot", "208", EstadoVehiculo.DISPONIBLE, 100000));
        gestor.cargarVehiculo(new Motocicleta(12000, "ABC123", "Yamaha", "Estandar", EstadoVehiculo.EN_MANTENIMIENTO, 50000));

        gestor.listarDisponibles();
        gestor.menorMantenimiento();
    }
}
