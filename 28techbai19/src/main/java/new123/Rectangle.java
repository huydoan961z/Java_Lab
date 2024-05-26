/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package new123;

/**
 *
 * @author aser
 */
public class Rectangle extends GeometricObject {
    private double width, length;

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length) ;
    }
    
}
