/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class cuucongchua 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine().substring(8));
        int blood = Integer.parseInt(sc.nextLine().substring(8));
        String tmp= sc.nextLine();
        boolean alive= false;
        if(tmp.equals("ALIVE"))
        {
            alive=true;
        }
        NhanVat ps= new NhanVat(blood, power, alive);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            
            String t= sc.nextLine();
            
            
            if(t.charAt(0)=='w')
            {
                int power1=Integer.parseInt(t.substring(6));
                ps.witch(power1);
            }
            else
            
                if((t.charAt(0)=='m'))
                {
                    ps.mushroom();
                }
                else
                    if(t.charAt(0)=='s')
                    {
                        
                        int power1 = Integer.parseInt(t.substring(8));
                        ps.soldier(power1);
                    }
                    else
                        if(t.charAt(0)=='p')
                            ps.pea();
            
            System.out.println(ps.toString());
        }
    }
}
