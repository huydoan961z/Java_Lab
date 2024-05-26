
package bai21;

public class matHang 
{
    private String ma, dv, name ;
    private double giaMua, giaBan;

    public matHang(int ma, String dv, String name, double giaMua, double giaBan) {
        this.ma ="MH" + String.format("%04d", ma);
        this.dv = dv;
        this.name = name;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(double giaMua) {
        this.giaMua = giaMua;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    
    
    public double loinhuan()
    {
        double loiNhuan= this.giaBan-this.giaMua ;
        return loiNhuan ;
    }
    
    public String getMa(){
        return this.ma ;
        
    }
    public String tostring(){
        return this.ma + " " + this.name + " " + this.dv + " " + this.giaMua + " " + this.giaBan + " "  + this.loinhuan()+ " ";
        
    }
    
    
    
    
}
