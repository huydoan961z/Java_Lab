
package bai28;


public class hocsinh 
{
    private String ma, ten;
    private double[] diem ;

    public hocsinh(int ma, String ten, double[] diem) {
        this.ma = "HS" + String.format("%2d", ma) ;
        this.ten = ten;
        this.diem = new double[10];
        for(int i=0;i<10;i++)
        {
            this.diem[i]=diem[i]; 
            
        }
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }
    public double getAver()
    {
        double ava=0;
        for(int i=0; i<10; i++)
        {
            ava+=this.diem[i];
        }
        return ava/10 ;
    }
    public String toString()
    {
        String results ="";
        double check=this.getAver();
        if(check>=9)
            results="xuat sac" ;
        else
            if(check>=8)
                results= "gioi" ;
            else
                results=" dot" ;

        return this.ma + " " + this.ten + " " + this.getAver() + " " + results+ " " ;
    }
}
