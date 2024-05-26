
package custemerandinvoice;


public class Invoice 
{
    private Custemor customer;
    private int idInvoice;
    private double amount;

    public Invoice(Custemor customer, int idInvoice, double amount) {
        this.customer = customer;
        this.idInvoice = idInvoice;
        this.amount = amount;
    }

    public Custemor getCustomer() {
        return customer;
    }

    public void setCustomer(Custemor customer) {
        this.customer = customer;
    }

    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = this.amount -
        this.amount*customer.getDiscount()/100;
    }
    public String toString(){
        return customer.toString()+"\n"+ "Amount : "+String.format("%.2f", this.amount)+" $" +"\n"+"--------------------";
 }
        
        

    }
    
    

