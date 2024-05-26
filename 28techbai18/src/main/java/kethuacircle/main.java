/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethuacircle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class main {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("in vao so hinh");
        int n=sc.nextInt();
        ArrayList<Cylinder> arr= new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String color= sc.nextLine();
            double radius= sc.nextDouble();
            double height= sc.nextDouble();
            arr.add(new Cylinder(height, radius, color));
        }
        Collections.sort(arr, new Comparator<Cylinder>(){
            @Override
            public int compare(Cylinder o1, Cylinder o2) 
            {
                if(o1.getVolume()!= o2.getVolume())
                {
                    if(o1.getVolume()> o2.getVolume())
                        return -1;               
                }
                return o1.getColor().compareTo(o2.getColor());
            }
            
        });
        
            
    }
        
    
       
    
}
