

package com.mycompany.elecuse;

import java.util.Scanner;


public class Elecuse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numver of elec");
        int num= sc.nextInt();
        int total;
        if(num>0 && num<=50)
        {
            total= num*1000;
            System.out.println("so the total is"+total);
        }
        else
        {   
            total= 50*1000+(num-50)*1200 ;
            System.out.println("so the total is"+total);
            
        }
    }
}