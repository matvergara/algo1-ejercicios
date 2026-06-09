package _02Intro._15Hora;

public class Hora {
    private int hora;
    private int seg;
    private int min;

    public Hora(){hora = 0; min = 0; seg = 0;}
    public Hora(int a, int b, int c){hora = a; min = b; seg = c;}

    public void visualizar(){
        System.out.printf("Hora actual - %02d:%02d:%02d%n", this.hora, this.min, this.seg);
    }

    public static Hora sumaValida(int s1, int s2, int s3){
        if((s3) >= 60){
            s3 = s3 - 60;
            s2 += 1;
        }

        if(s2 >= 60){
            s2 = s2 - 60;
            s1 +=1;
        }

        if(s1 > 24){
            s1 = s1 - 24;
        }
        return new Hora(s1, s2, s3);
    }

    public static Hora sumar(Hora h1, Hora h2){
        
        int seg_sum = h1.seg + h2.seg;
        int min_sum = h1.min + h2.min;
        int hr_sum = h1.hora + h2.hora;

        return Hora.sumaValida(hr_sum, min_sum, seg_sum);
    }

    public void sumar(Hora h2){

        int seg_sum = this.seg + h2.seg;
        int min_sum = this.min + h2.min;
        int hr_sum = this.hora + h2.hora;
        
        Hora aux = Hora.sumaValida(hr_sum, min_sum, seg_sum);

        this.hora = aux.hora;
        this.min = aux.min;
        this.seg = aux.seg;
    }

}
