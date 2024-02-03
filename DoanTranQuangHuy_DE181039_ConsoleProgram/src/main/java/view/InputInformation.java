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
    
    public  static String checkInputTaskTypeId() {
        while (true) {
            int n = InputInformation.inputIntLimit(1, 4);
            String result = null;
            switch (n) {
                case 1:
                    result = "code";
                    break;
                case 2:
                    result = "test";
                    break;
                case 3:
                    result = "manager";
                    break;
                case 4:
                    result = "learn";
            }
            return result;
        }
    }
    public static String checkCourse()
    {
        while(true)
        {
            String result= inputString();
            if((result.equals("Java")|| result.equals(".Net")|| result.equals("C/C++")))
            {
                return result;
                
            }
            else
                System.out.println("There are only three courses: Java, .Net, C/C++");
                System.out.print("Course name: ");
            
        }
    }
    
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
    public static String checkInputDate() throws ParseException 
    {
        Scanner sc= new Scanner(System.in);
        while (true) {
            try {
                String result = sc.nextLine().trim();
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date date = format.parse(result);
                if (result.equalsIgnoreCase(format.format(date))) {
                    return result;
                } else {
                    System.err.println("Date must be valid in the format dd-MM-yyyy.");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Date must be valid in the format dd-MM-yyyy.");
            } 
        }
    }
}


