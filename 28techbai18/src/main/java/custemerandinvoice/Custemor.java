
package custemerandinvoice;


public class Custemor 
{
    private int id, discount;
    private String name;

    public Custemor(int id, int discount, String name) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString()
    {
        return "Customer ID : "+this.id+"\n"+"Full Name : "+this.name;
    }
}
