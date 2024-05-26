/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nvsv;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class out 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao m va n");
        int n= sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Students> arr1= new ArrayList <>();
        ArrayList<Staffs> arr2= new ArrayList <>();
        sc.nextLine();
        sc.nextLine();
        for(int i=0; i<n; i++)
        {
            arr1.add(new Students(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextDouble()));
            sc.nextLine();
            sc.nextLine();
        }
        for(int i=0; i<m; i++)
        {
            arr2.add(new Staffs(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
            sc.nextLine();
            sc.nextLine();
        }
        
        Collections.sort(arr1, new Comparator<Students>()
                {
            @Override
            public int compare(Students o1, Students o2) 
            {
                if(o1.getFee()!= o2.getFee())
                {
                    if(o1.getFee()> o2.getFee())
                        return -1;
                    return 1;
                }
                else
                {
                    return o1.getName().compareTo(o2.getName());
                }
            }
                    
                });
        Collections.sort(arr2, new Comparator<Staffs>()
        {   
            @Override
            public int compare(Staffs o1, Staffs o2) 
            {
                if(o1.getPay() != o2.getPay())
                {
                    if(o1.getPay() > o2.getPay())
                        return -1;
                    return 1;
                }
                else
                {
                    return o1.getName().compareTo(o2.getName());
                }
            }        
                        });
        
        System.out.println("Student list");
        System.out.println("_______________");
        for(Students x: arr1)
        {
            System.out.print(x);
        }
        System.out.println("Staff list");
        System.out.println("_______________");
        for(Staffs y: arr2)
        {
            System.out.print(y);
        }

                
}}
