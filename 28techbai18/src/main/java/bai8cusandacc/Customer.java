
package bai8cusandacc;


public class Customer 
{
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public String toString()
    {
        return " " + this.id + " "+ this.name + " " + this.gender ;
    }            
}
