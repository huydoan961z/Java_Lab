/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author aser
 */
public class NhanVat {

    private int power, blood;
    private boolean alive;

    public NhanVat(int power, int blood, boolean alive) {
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }

    public String toString() {
        String res = "";
        if (this.alive) {
            res = "ALIVE";
        } else {
            res = "DEAD";
        }
        return "POWER : " + this.power + "\nBLOOD : " + this.blood + "\n" + res + "\n--------------------\n";
    }

    public void mushroom() {
        if (this.alive) {
            this.power -= 2;
            this.blood -= 15;
            if (this.power <= 0 && this.blood <= 0) {
                this.power = 0;
                this.blood = 0;
                this.alive = false;
            }
        }
    }

    public void witch(int power) {
        if (this.alive) {
            if (power >= this.power) {
                this.power = 0;
                this.blood = 0;
                this.alive = false;
            } else {
                this.power += 5;
            }
        }
    }

    public void pea() {
        if (this.alive) {
            this.power += 2;
            this.blood += 10;
        }
    }

    public void soldier(int power) {
        if (this.alive) {
            if (power >= this.power) {
                this.power = 0;
                this.blood = 0;
                this.alive = false;
            } else {
                this.power += 7;
                this.blood += 5;
            }
        }
    }
}

        
        
        
        
//{
//    private int blood,power;
//    boolean alive;
//
//    public NhanVat(int blood, int power, boolean alive) {
//        this.blood = blood;
//        this.power = power;
//        this.alive = alive;
//    }
//
//    public int getBlood() {
//        return blood;
//    }
//
//    public void setBlood(int blood) {
//        this.blood = blood;
//    }
//
//    public int getPower() {
//        return power;
//    }
//
//    public void setPower(int power) {
//        this.power = power;
//    }
//
//    public boolean isAlive() {
//        return alive;
//    }
//
//    public void setAlive(boolean alive) {
//        this.alive = alive;
//    }
//
//    
//    
//    public String toString()
//    {
//        String res="" ;
//        
//        if(this.alive)
//            res="ALIVE";
//        else
//            res="die";
//        return "POWER : " + this.power + "\nBLOOD : " + this.blood + "\n" + res + "\n--------------------\n";            
//    }
//    public void mushroom()
//    {
//        if(this.alive)
//        {
//            this.power-=2;
//            this.blood-=15;
//            if(this.power<=0 && this.blood<=0)
//            {
//                this.blood=0;
//                this.power=0;
//                this.alive= false;
//            }
//                
//        }
//        
//    }
//    
//    public void witch(int witchpower)
//    {
//        if(this.alive)
//        {
//            if(this.power> witchpower)
//            this.power+=5 ;
//        else
//            {
//                this.alive= false ;
//                this.power=0;
//                this.blood=0;
//            }
//            
//        }
//    }
//    public void pea()
//    {
//        if(this.alive)
//        {
//            this.blood+=10;
//            this.power+=2;
//        }
//    }
//    
//    public void soldier(int soldierpower)
//    {
//        if(this.alive)
//        {
//            if(this.power> soldierpower)
//            {
//                this.power+=7 ;
//                this.blood+=5 ;
//            }    
//            else
//            {
//                this.alive= false ;
//                this.power=0;
//                this.blood=0;
//
//
//            }
//        }
//        
//    }
//}

