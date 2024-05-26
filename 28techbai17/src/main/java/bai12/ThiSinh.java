
package bai12;


public class ThiSinh {
    private String id;
    private String name;
    private double toan,ly,hoa ; 

    public ThiSinh(String id, String name, double toan, double ly, double hoa) {
        this.id = id;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public double gettotal()
    {
        double tongdiem= this.hoa+this.ly+this.toan ;
        String khuVuc= this.id.substring(0, 3);
        if(khuVuc.charAt(2)== 1)
            return tongdiem+0.5;
        else
            if(khuVuc.charAt(2)== 2)
            
                return tongdiem+1 ;
            
            else
                return tongdiem+2 ;
                
    }
    
    public String check()
    {
        if(this.gettotal() >=24)
            return "do";
        else
            return "truot";
    }
    public String toString()
    {
        return this.id + " " + this.name + " " + this.gettotal() + "" + this.check() + ""  ;
    }
    
    
}
