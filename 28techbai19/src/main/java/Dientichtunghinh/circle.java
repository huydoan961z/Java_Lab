
package Dientichtunghinh;


public class circle extends total
{
    protected double radius;

    public circle(double radius, String colors, boolean filled) {
        super(colors, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    public circle(String colors, boolean filled) {
        super(colors, filled);
    }
    public double getArea()
    {
        return this.radius* this.radius* 3.14 ;
    }
    
    
    public String toString()
    {
        return "---------------------" + "Radius:"  + String.format("%.2f", this.radius) + "\nColor" + this.colors + "\nFilled:" + this.filled ;
    }
    
}
