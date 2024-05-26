/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package new123;

/**
 *
 * @author aser
 */
public class Circle extends GeometricObject {
    private double radius ;

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius ;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    
}
