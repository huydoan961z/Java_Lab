/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

/**
 *
 * @author aser
 */
public class Officialemployee extends Person 
{
    private double bsalary, csalary;

    public Officialemployee(double bsalary, double csalary, String fullname, String address, int age) {
        super(fullname, address, age);
        this.bsalary = bsalary;
        this.csalary = csalary;
    }

    public double getBsalary() {
        return bsalary;
    }

    public void setBsalary(double bsalary) {
        this.bsalary = bsalary;
    }

    public double getCsalary() {
        return csalary;
    }

    public void setCsalary(double csalary) {
        this.csalary = csalary;
    }
    
    
    public double salary()
    {
        return this.bsalary*this.csalary;
    }
    public String toString()
    {
        return super.toString() + "  " + this.salary() ;
    }
}
