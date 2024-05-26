
package Dientichtunghinh;

public class square extends total
{
    private double canh;
    
    public square(String colors, boolean filled) {
        super(colors, filled);
    }

    public square(double canh, String colors, boolean filled) {
        super(colors, filled);
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double getArea()
    {
        return this.canh*this.canh;
    }
    public String toString()
    {
        return "---------------------" + "canh:"  + String.format("%.2f", this.canh) + "\nColor" + this.colors + "\nFilled:" + this.filled ;
    }
    
}
