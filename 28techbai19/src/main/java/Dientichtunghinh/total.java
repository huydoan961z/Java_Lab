
package Dientichtunghinh;


public abstract class total 
{
    protected String colors="red";
    protected boolean filled= true;

    public total(String colors, boolean filled) {
        this.colors = colors;
        this.filled = filled;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    
    
}
