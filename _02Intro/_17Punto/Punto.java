package _02Intro._17Punto;
public class Punto {
    private float x;
    private float y;

    public Punto(){this.x = 0; this.y = 0;}
    public Punto(float a, float b){this.x = a; this.y = b;}
    public Punto(float z){this.x = z; this.y = z;}

    public float getX(){return this.x;}
    public float getY(){return this.y;}
    public void setX(float a){this.x = a;}
    public void setY(float b){this.y = b;}

    public Punto sumar(Punto p2){
        Punto p3 = new Punto();
        p3.x = this.x + p2.x;
        p3.y = this.y + p2.y;
        return p3;
    }

    public boolean esIgual(Punto p2){return (this.x == p2.x) && (this.y == p2.y);}
}
