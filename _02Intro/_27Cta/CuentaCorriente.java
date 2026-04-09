package _02Intro._27Cta;

public class CuentaCorriente {
    //Atributos
    private float saldo;
    private int numValidas;
    private int numInvalidas;
    
    //Constructor
    public CuentaCorriente(float saldo){
        this.saldo = saldo;
    }

    //Getters
    public float getSaldo(){return this.saldo;}
    public int getNumValidas(){return this.numValidas;}
    public int getNumInvalidas(){return this.numInvalidas;}

    //Setters
    public void setSaldo(float saldo){
        this.saldo = saldo;
        this.numInvalidas = 0;
        this.numValidas = 0;
    }

    //Metodos
    public float saldo(){return this.getSaldo();}
    
    public void deposito(float imp){
        if (imp > 0) {
            this.saldo = this.saldo + imp;
            this.numValidas = this.numValidas + 1;
            System.out.printf("Se añadieron $%.2f a su cuenta corriente.\n", imp);
        }
        else{
            this.numInvalidas = this.numInvalidas + 1;
            System.out.println("Transaccion inválida, debe ingresar un monto mayor a cero.");
        }
    }

    public void extraccion(float imp){
        if (imp > 0 && (this.saldo - imp) >= 0){
            this.saldo = this.saldo - imp;
            this.numValidas = this.numValidas + 1;
            System.out.printf("Se extrajeron $%.2f de su cuenta corriente.\n", imp);    
        }
        else{
            this.numInvalidas = this.numInvalidas + 1;
            System.out.println("Transacción inválida.");
        }
        
    }

    public int cantidadOperaciones(){
        return this.getNumValidas();
    }

    public int cantidadExtraccionesInvalidas(){
        return this.getNumInvalidas();
    }


}
