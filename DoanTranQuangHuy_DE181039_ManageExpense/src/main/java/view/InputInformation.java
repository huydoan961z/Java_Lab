/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import static java.lang.System.in;
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
    
    public static String convertDate() {
    Scanner sc = new Scanner(System.in);
    String date = checkInputDate();
    String[] convertDate = date.split("-");
    String day = convertDate[0];
    String mo = convertDate[1];
    String year = convertDate[2];
    int month = Integer.parseInt(mo);
    String result = null;
    switch (month) {
        case 1:
            result = "Jan";
            break;
        case 2:
            result = "Feb";
            break;
        case 3:
            result = "Mar";
            break;
        case 4:
            result = "Apr";
            break;
        case 5:
            result = "May";
            break;
        case 6:
            result = "Jun";
            break;
        case 7:
            result = "Jul";
            break;
        case 8:
            result = "Aug";
            break;
        case 9:
            result = "Sep";
            break;
        case 10:
            result = "Oct";
            break;
        case 11:
            result = "Nov";
            break;
        case 12:
            result = "Dec";
            break;
    }
    String complete = day + "-" + result + "-" + year;
    return complete;
}

    public static String checkInputDate() 
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
                    System.err.println("Date to correct format(dd-mm-yyyy)");
                }
            } catch (ParseException pe) {
                System.err.println("Date to correct format(dd-mm-yyyy)");
            } 
        }
    }
    public static float input() 
    {
        
        Scanner s= new Scanner(System.in);
        while(true)
        {
        float input= s.nextFloat();
        
        try {
            if(input%0.5==0)
                return input;
            else
                System.out.println("Please input again with format x.0, x.5:");
        } catch (Exception e) {
            System.out.println("Pls input a number");
            System.out.println("Pls input again");
        } 
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
}


