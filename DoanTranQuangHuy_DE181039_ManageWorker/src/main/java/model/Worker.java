/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aser
 */
public class Worker  
{
    private String id;
    private String  name,  workLocate;
    private int age, salary;
    

    public Worker() {
    }

    public Worker(String id, String name, int age, int  salary, String workLocate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocate = workLocate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getWorkLocate() {
        return workLocate;
    }

    public void setWorkLocate(String workLocate) {
        this.workLocate = workLocate;
    }
}
