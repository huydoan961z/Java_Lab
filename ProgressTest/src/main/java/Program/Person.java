/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

/**
 *
 * @author aser
 */
public class Person 
{
    private String fullname, address;
    private int age;
    private double salary;

    public Person(String fullname, String address, int age) {
        this.fullname = fullname;
        this.address = address;
        this.age = age;
        
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
    public String toString()
    {
        return " " + this.fullname + " " + this.address + " " + this.age;
    }
}
