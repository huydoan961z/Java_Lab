/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

/**
 *
 * @author aser
 */
public class Salesstaff extends Person 
{
    private double allow,sale,conmiss;

    public Salesstaff(double allow, double sale, double conmiss, String fullname, String address, int age) {
        super(fullname, address, age);
        this.allow = allow;
        this.sale = sale;
        this.conmiss = conmiss;
    }

    
    public double getAllow() {
        return allow;
    }

    public void setAllow(double allow) {
        this.allow = allow;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getConmiss() {
        return conmiss;
    }

    public void setConmiss(double conmiss) {
        this.conmiss = conmiss;
    }
    public double salary()
    {
        return this.allow+ this.conmiss*this.sale ;
    }
    public String toString()
    {
        return super.toString() + " " + this.salary() ;
    }
}
