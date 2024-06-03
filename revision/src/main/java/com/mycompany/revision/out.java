/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

import java.util.Scanner;


public class out 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        Revision[] acc= new Revision[n];
        for(int i=0;i<n;i++)
        {
            acc[i]= new Revision(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        
        int q= sc.nextInt();
        
        
        sc.nextLine();
        for(int i=0;i<q;i++)
        {
            String username=sc.nextLine();
            String password=sc.nextLine();
            boolean check= false;
            
            for(int j=0;j<=n;j++)
            {
                
                if(acc[j].checkLogin(username, password))
                {
                    check=true;
                    break;
                }
            }
            if(check)
                System.out.println("sucess");
            else
                System.out.println("mo");
            
           
            
        }
        
            
       
    }
}
