package simulacros.movilidad;

import java.util.ArrayList;
import java.util.Comparator;

public class GestorVehiculos {
    private ArrayList<Vehiculo> flotaVehiculos = new ArrayList<>();


    public void cargarVehiculo(Vehiculo vehiculo){
        flotaVehiculos.add(vehiculo);
    }

    public void listarDisponibles(){
        flotaVehiculos.sort(Comparator.comparingDouble(Vehiculo::getTarifaBase));
        int cont = 0;
        for(Vehiculo v: this.flotaVehiculos){
            if (v.getEstado() == EstadoVehiculo.DISPONIBLE){
                System.out.printf("%d. %s %s %s | %s\n", cont, v.getMarca(), v.getModelo(), v.getPatente(), v.getEstado());
            }
            cont++;
        }
    }

    public void menorMantenimiento(){
        flotaVehiculos.sort(Comparator.comparingDouble(Vehiculo::getCostoMantenimiento));
        Vehiculo v = flotaVehiculos.getFirst();
        System.out.printf("Vehiculo con menor costo de mantenimiento: %s %s %s - $%f", v.getMarca(), v.getModelo(), v.getPatente(), v.getCostoMantenimiento());
    }
}
