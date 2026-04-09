package _03Herencia._33Hospital;

public class Proveedor extends Persona {
    //Atributos
    private int codigoVendedor;
    private float saldo;
    private int fax;
    private int telefono;
    private float descuentos;

    //Constructor
    public Proveedor(String nom, String dir, String ciudad, int cod, float saldo, int fax, int tel, float desc){
        super(nom, dir, ciudad);
        this.codigoVendedor = cod;
        this.saldo = saldo;
        this.fax = fax;
        this.telefono = tel;
        this.descuentos = desc;
    }

    //Getters
    public int getCodigoVendedor(){return this.codigoVendedor;}
    public int getFax(){return this.fax;}
    public int getTelefono(){return this.telefono;}
    public float getSaldo(){return this.saldo;}
    public float getDescuentos(){return this.descuentos;}
    
    //Setters
    public void setCodigoVendedor(int cod){
        this.codigoVendedor = cod;
    }
    public void setFax(int fax){
        this.fax = fax;
    }
    public void setTelefono(int tel){
        this.telefono = tel;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void setDescuentos(float desc){
        this.descuentos = desc;
    }

    //Metodos
    public void pagarFactura(){}

}
