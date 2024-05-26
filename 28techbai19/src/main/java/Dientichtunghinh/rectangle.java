/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dientichtunghinh;

/**
 *
 * @author aser
 */
public class rectangle extends total
{
    protected double width, length;
    public rectangle(String colors, boolean filled) {
        super(colors, filled);
    }

    public rectangle(double width, double length, String colors, boolean filled) {
        super(colors, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea()
    {
        return this.length*this.width ;
    }
    
    public String toString()
    {
        return "---------------------" + "Width:"  + String.format("%.2f", this.width) 
                + "\nlength:" + this.length 
                + "\nColor" + this.colors  
                + "\nFilled:" + this.filled ;
    }
}
