/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aser
 */
public class Person 
{
    private String name, address, sSalary;

    public Person() {
    }

    public Person(String name, String address, String sSalary) {
        this.name = name;
        this.address = address;
        this.sSalary = sSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getsSalary() {
        return sSalary;
    }

    public void setsSalary(String sSalary) {
        this.sSalary = sSalary;
    }
}
