/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class Out 
{
    public static void main(String[] args) 
    {
        ArrayList<Officialemployee> arr1= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao so off");
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++ )
        {
            System.out.println("Nhap vao ttin cua off");
            String fullname= sc.nextLine();
            
            String Address= sc.nextLine();
            sc.nextLine();
            int age= sc.nextInt(); 
            
            double bs= 1000000 ;
            
            double cs= sc.nextDouble();
            
            Officialemployee of= new Officialemployee(bs,cs,fullname,Address,age);
            double salary= of.salary();
            arr1.add(of);
            
            
        }
        
        ArrayList<Salesstaff> arr2= new ArrayList<>();
        
        System.out.println("Nhap vao so lg sale");
        int m= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<m;i++ )
        {
            System.out.println("Nhap vao ttin cua sale");
            String fullname= sc.nextLine();
            String Address= sc.nextLine();
            
            int age= sc.nextInt();        
            double allow= 5000;
            
            double sale= sc.nextDouble();
            
            double comic= sc.nextDouble();
            
          Salesstaff sa= new Salesstaff(allow, sale, comic, fullname, Address, age);
          double salary= sa.salary();
          arr2.add(sa);
            
            
        }
        

        
        System.out.println("danh sach");
        for(Officialemployee x: arr1)
        {
            System.out.println(x.toString());
        }
        for(Salesstaff x: arr2)
        {
            System.out.println(x.toString());
        }
        
        
        System.out.println("Enter the address you want to check:");
    String address = sc.nextLine(); // Add this line to get the address from user input

    System.out.println("Employees with the same address:");
    for (Officialemployee x : arr1) {
    if (x.getAddress().equals(address)) {
        System.out.println(x.toString());
    }
}
for (Salesstaff x : arr2) {
    if (x.getAddress().equals(address)) {
        System.out.println(x.toString());
    }
}
    
}
}