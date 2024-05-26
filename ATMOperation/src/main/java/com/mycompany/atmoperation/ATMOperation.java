/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atmoperation;

import java.util.Scanner;

/**
 *
 * @author aser
 */
public class ATMOperation {

    public static void main(String[] args) {
        int[] denominations= {500,200,100,50};
        int amount;
            
            System.out.println("Enter the amount(the amount should be always a multiple of 50 ");
            Scanner sc= new Scanner(System.in);
            amount= sc.nextInt();    
            
            
        for(int i=0; i< denominations.length;i++)
        {
            if(amount>= denominations[i])
            {
                int withdraw=amount/denominations[i];
                System.out.println(""+denominations[i]+": " +withdraw);
                amount= amount%denominations[i];
            }
        }
        System.out.println("Balance: "+amount+": is not enought to cashout withdraw");
        
        
        
            
        
        
        
    }
}
