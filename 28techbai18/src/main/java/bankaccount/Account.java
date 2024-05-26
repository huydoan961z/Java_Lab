/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaccount;


public class Account 
{
    private String id, customerId;
    private String stk, pin;
    private int soDu;

    public Account(String id, String customerId, String stk, String pin, int soDu) {
        this.id = id;
        this.customerId = customerId;
        this.stk = stk;
        this.pin = pin;
        this.soDu = soDu;
    }
    public void deposit(int tien){
        this.soDu+= tien;
    }
    
    public void withdraw(int tien)
    {
        if(this.soDu-50000 >=  tien)
        {
            this.soDu-=tien ;
        }
    }
    public int getsoDu()
    {
        return this.soDu ;
    }
    public static int findPos(Account[] a, String stk)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i].stk.equals(stk))
                return 1;
        }
        return -1;
    }
    
    public String toString(){
 return "ID : " + this.id + "\nCusID : " + this.customerId +"\nNumber : " + this.stk + "\nPIN : " + this.pin + "\nBalance : " + this.soDu + "VND\n-------------------";
 }
    
   


    
}
