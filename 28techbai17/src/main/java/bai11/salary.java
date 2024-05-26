
package bai11;


public class salary 
{
    private String ma, name ;
    private int income, ngaycong;
    private String chucvu;

    public salary(String ma, String name, int income, int ngaycong, String chucvu ) 
    {
        this.ma = ma;
        this.name = name;
        this.income = income;
        this.ngaycong = ngaycong;
        this.chucvu = chucvu;
        
    }

   
    public int getLuong()
    {
        return this.ngaycong * this.income ;
    }
    public int getThuong()
    {
        int luong=this.getLuong();
        if(this.ngaycong>= 25)
            return (int)(0.2*luong);
        else
            if(this.ngaycong>=22 && this.ngaycong<25)
                return (int)(luong*01);
            else
                return 0;
           
    }
    public int getPhuCap()
    {
        int phucap;
        String chuc=this.chucvu;
        if(chuc.equals("GD"))
        {
            phucap=250000;
             return phucap ;
        }
           
        else 
            if(chuc.equals("PGD"))
            {
               phucap=200000;
               return phucap ;
            }
            else
                if(chuc.equals("TP"))
                {
                    phucap=180000;
                    return phucap;
                }
                else
                {
                    phucap=150000;
                    return phucap;
                }             
    }
    
    
    
    public String toString()
    {
        return this.ma + " " + this.name + " " + this.getLuong() + " " + this.getThuong() + " " + this.getPhuCap() + " " + (this.getLuong()+ this.getPhuCap()+ this.getThuong() )+" "   ;  
    }
}
