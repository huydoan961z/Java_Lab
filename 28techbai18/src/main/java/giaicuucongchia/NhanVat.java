/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaicuucongchia;

/**
 *
 * @author aser
 */
public class NhanVat 
{
    private int power, blood;
    private boolean alive;
 
    public NhanVat(int power, int blood, boolean alive) {
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }
    
    public void mushRoom()
    {
        if(alive)
        {
            this.power -=2 ;
        this.blood -=15;
        if(this.power==0 || this.blood==0)
        {
            System.out.println("die");
            this.alive= false;
        }
        }
            
    }
    
    public void witch(int powerWitch)
    {
        if(alive)
        {
            if(powerWitch>= this.power)
        {
            System.out.println("chet");
            this.alive= false;
        }

        else
            this.power+=5 ;
        }
        
    }
    
    public void pea()
    {
        if(alive)
        {
            if(this.alive)
        {
            this.power +=2 ;
            this.blood +=10;
        }
        }
        
    }
    
    public void soldier(int powerSoldier)
    {
        if(alive)
        {
            if(powerSoldier>= this.power)
        {
            System.out.println("chet");
            this.alive= false;
        }
        else
        {
            this.power+=7 ;
            this.blood+=5;
        } 
        }
           
            
    }
    public String toString()
    {
        String res = " ";
        if(this.alive)
            res = " alive";
        else
            res=" die";
        return "power: " + this.power + "\nblood " + this.blood + "\nStatus:" + res ;
    }
    
}
