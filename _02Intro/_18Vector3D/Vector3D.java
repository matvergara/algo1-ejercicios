package _02Intro._18Vector3D;
import _02Intro._17Punto.Punto;

public class Vector3D extends Punto{
    private float z;

    public Vector3D(float x, float y, float z){
        super(x, y); //Llama al constructor de la clase Punto
        this.z = z;
    }

    public Vector3D(float k){
        super(k);
        this.z = k;
    }

    public Vector3D(){
        super();
        this.z = 0;
    }
    
    public float getZ(){
        return this.z;
    }

    public void setZ(float c){
        this.z = c;
    }

    public Vector3D sumar(Vector3D v2){
        
        Vector3D v3 = new Vector3D();
        float a, b, c;
        
        a = this.getX() + v2.getX();
        b = this.getY() + v2.getY();
        c = this.getZ() + v2.getZ();
        
        v3.setX(a);
        v3.setY(b);
        v3.setZ(c);
        
        return v3;
    }
    
    public boolean esIgual(Vector3D v2){ 
        return (this.getX() == v2.getX()) && (this.getY() == v2.getY()) &&(this.getZ() == v2.getZ()); 
    }
}
