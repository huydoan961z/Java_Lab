/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nvsv;

/**
 *
 * @author aser
 */
public class Staffs extends Person
{
    private String school;
    private double pay;

    public Staffs( String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    public String toString()
    {
        return super.toString() + "\nSchool:" + this.school + "Pay" + String.format("\n%.2f", this.pay) ;
    }
}
