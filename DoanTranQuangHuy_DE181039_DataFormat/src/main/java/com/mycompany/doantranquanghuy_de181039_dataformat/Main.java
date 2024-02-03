/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doantranquanghuy_de181039_dataformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        System.out.println("====== Validate Progaram ======");
        System.out.print("Phone number: ");
        String num=checkPhone();
        System.out.print("Email: ");
        String email=checkMail();
        
        System.out.print("Date: ");
        String date= checkInputDate();
        
    }
    public static String checkPhone()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            String phoneNum= sc.nextLine();
            String regex="^\\d{10}$";
            String regex1=".*[A-Za-z].*";
            if (phoneNum.matches(regex))
            {
                return phoneNum;
            }
            else
                if(phoneNum.matches(regex1))
                {
                    System.out.println("Phone number must is number");
                    System.out.print("Phone number: ");
                }
                    
                    
                else
                {
                    System.out.println("Phone number must be 10 digits");
                    System.out.print("Phone number: ");
                }
                    
                    
        }
    }
    public static String checkMail()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            String email=sc.nextLine();
            if(email.contains("@")&& email.contains("."))
            {
                String a=".vn";
                String b=".edu";
                String c=".com";
                int n= email.lastIndexOf(".");
                String x= email.substring(n, email.length());
                if(x.matches(a)|| x.matches(b)||x.matches(c))
                {
                    return email;
                }
                else
                    System.out.println("Email must is correct format");
                
            }
            else
                System.out.println("Email must is correct format");
            
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
                    System.err.println("Date to correct format(dd-mm-yyyy)");
                }
            } catch (ParseException pe) {
                System.err.println("Date to correct format(dd-mm-yyyy)");
            } 
        }
    }
}
