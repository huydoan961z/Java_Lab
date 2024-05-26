/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nvsv;

/**
 *
 * @author aser
 */
public class Students extends Person
{
    private String program;
    private int year;
    private double fee;

    public Students(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    public String toString()
    {
        return super.toString() + "Program" + this.program + "\nYEar" + this.year +
                String.format("%.0f", this.fee)+ "$" ;
    }
}
