/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author aser
 */
public class InputInformation 
{
    public static int inputInt()
    {
        Scanner s= new Scanner(System.in);
        while(true)
        {
        String input= s.nextLine();
             
        try {
            int result= Integer.parseInt(input);
            return result;
            
        } catch (Exception e) {
            System.out.println("Pls input a number");
            System.out.println("Pls input again");
        } 
    }
    }
    public static int inputIntLimited()
    {
        while(true)
        {
            int result= inputInt();
            if (result>0)
                return result;
        else
        {
            System.out.println("Not in the range");
            System.out.println("pls type again");
            
        }
        }
    }
    public static int inputIntLimit(int min, int max)
    {
        while(true)
        {
            int result= inputInt();
            if (result>=min && result<=max)
                return result;
        else
        {
            System.out.println("no in the range");
            System.out.println("pls type again");
            
        }
        }
    }
    public static String inputString()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            String result= sc.nextLine();
            if(!result.isEmpty())
                return result;
            else
            {
                System.out.println("pls again");
            }
        
        }  
    }
    

}
