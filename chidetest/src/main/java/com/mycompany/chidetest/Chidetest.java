
package com.mycompany.chidetest;

import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;


public class Chidetest 
{   
    
    
    public static void main(String[] args) {
        int[] a= {1,3,2,5,2,7,6,9};
        int loca=0;
        for(int i=0; i< a.length; i++)
        {
            if(a[i]%2==0)
            {
                loca=a[i];
            }
        }
        System.out.println(loca);
    }
    
            
            
            


    
    
}

    