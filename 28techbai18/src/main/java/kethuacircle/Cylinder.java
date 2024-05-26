
package kethuacircle;

import javax.print.DocFlavor;

public class Cylinder extends circle 
{
    private double height;

    public Cylinder(double height ,double radius, String color) {
        super(radius, color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume()
    {
        return super.getArea()*height;
    }
    public String toString()
    {
        return "color :"+ super.getColor() + " \nHeight"  + String.format(".2f", this.height) + "\nRadius" + String.format(".2f", getRadius()) + "\n Volume" + String.format(%.2f, getVolume()) ;
    }
}
