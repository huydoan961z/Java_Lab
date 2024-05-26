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
    public static String inputPhoneNumber() {
    Scanner sc = new Scanner(System.in);
    while (true) {
        String input = sc.nextLine();
        String regex1 = "^\\d{10}$";
        String regex2 = "^\\d{3}-\\d{3}-\\d{4}$";
        String regex3 = "^\\d{3}-\\d{3}-\\d{4} x\\d{4}$";
        String regex4 = "^\\d{3}-\\d{3}-\\d{4} ext\\d{4}$";
        String regex5 = "^\\d{3}\\.\\d{3}\\.\\d{4}$";
        String regex6 = "^\\d{3} \\d{3} \\d{4}$";

        if (input.matches(regex1) || input.matches(regex2) || input.matches(regex3) || input.matches(regex4) || input.matches(regex5) || input.matches(regex6)) {
            return input;
        } else {
            System.out.println("""
                               Please input Phone flow
                               \u2022 1234567890
                               \u2022 123-456-7890
                               \u2022 123-456-7890 x1234
                               \u2022 123-456-7890 ext1234
                               \u2022 123.456.7890
                               \u2022 123 456 7890""");
            System.out.print("Enter phone: ");
        }
    }
}

}
