/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class InputInformation 
{
    public static String inputPrice()
    {
        Scanner s= new Scanner(System.in);
        while(true)
        {
        String input= s.nextLine();
        
        try {
            double result= Double.parseDouble(input);
           
            if(result>0)
                return input;
            else
            {
                System.out.println("Price must be greater than zero"); 
                System.out.print("Please input price:");
            }
                
        } catch (Exception e) {
            System.out.println("You must input digidt.");
            System.out.print("Please input price:");
            
        } 
        }
    }
    public static int inputInt1()
    {
        Scanner s= new Scanner(System.in);
        while(true)
        {
        String input= s.nextLine();
        
        try {
            int result= Integer.parseInt(input);
           
            if(result>0)
                return result;
            else
                System.out.println("Salary must be a positive"); 
                
        } catch (Exception e) {
            System.out.println(" Salary must be a number.");
            System.out.println("Pls input again");
        } 
        }
    }
    


    public static int inputIntLimit(int min, int max)
    {
        while(true)
        {
            int result= inputInt1();
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
    public static String checkInputDate() throws ParseException 
    {
        Scanner sc= new Scanner(System.in);
        while (true) {
            try {
                String result = sc.nextLine().trim();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                Date date = format.parse(result);
                if (result.equalsIgnoreCase(format.format(date))) {
                    return result;
                } else {
                    System.err.println("Date to correct format(dd/mm/yyyy)");
                }
            } catch (ParseException pe) {
                System.err.println("Date to correct format(dd/mm/yyyy)");
            } 
        }
    }
    
}


