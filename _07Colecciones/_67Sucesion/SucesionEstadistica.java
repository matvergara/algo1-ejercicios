package _07Colecciones._67Sucesion;

import java.lang.Math;

public class SucesionEstadistica {
    //Atributos
    private double[] datos;
    private int cantidad;

    //Constructor
    public SucesionEstadistica(int largo){
        this.datos = new double[largo];
        this.cantidad = 0;
    }


    public void agregarElemento(double elemento){
        if(this.cantidad < this.datos.length){
            this.datos[cantidad] = elemento;
            this.cantidad = this.cantidad + 1;
        } else{
            System.out.println("La sucesión no admite más números;");
        }
    }

    public int cantidadElementos(){
        return this.cantidad;
    }

    public double media(){
        double sum = 0;
        int n = this.cantidadElementos();
        for(int i = 0; i < n; i++){
            sum += this.datos[i];
        }
        return Math.round((sum/n) * 100.0)/100.0;
    }

    public double devest(){
        
        double media = this.media();
        int n = this.cantidadElementos();
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += Math.pow((this.datos[i]- media), 2);
        }

        return Math.round(Math.sqrt(sum/n) * 100.0)/100.0;
    }
}
