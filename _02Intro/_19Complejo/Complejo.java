package _02Intro._19Complejo;
public class Complejo {
    private float re, im;

    public Complejo(){re = 0; im = 0;}
    public Complejo(float x){re = x; im = 0;}
    public Complejo(float x, float y){re = x; im = y;}

    public Complejo multiplicar(Complejo n2){
        Complejo c3 = new Complejo();

        c3.re = (this.re * n2.re) - (this.im * n2.im);
        c3.im = (this.im * n2.re) - (this.re * n2.im);
        
        return c3;
    }

    public static Complejo suma(int a, int b){
        Complejo c = new Complejo();
        c.re = a + b;
        return c;
    }

    public static Complejo suma(float a, float b){
        Complejo c = new Complejo();
        c.re = a + b;
        return c;
    }

    public static Complejo suma(Complejo c1, Complejo c2){
        Complejo c = new Complejo();
        c.re = c1.re + c2.re;
        c.im = c1.im + c2.im;
        return c;
    }
    
}
