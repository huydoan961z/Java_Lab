

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aser
 */
public class BinarySearch {
    
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter number of array");
            n=sc.nextInt();
        }while(n<=0);
        int [] array=createArray(n);
        System.out.println("Sort array: "+Arrays.toString(array)+ "");
        System.out.println("Enter search value");
        int m=sc.nextInt();
        
        
        int res= binarySearch(array, m, 0, array.length-1);
        if(res!=-1)
            System.out.println("Found "+m +" at index "+res);
        else
            System.out.println("not found"+m);
    }
    public static int []createArray(int n)
    {
        Random random= new Random();
        int [] array= new int[n];
        for(int i=0;i<array.length; i++)
        {
            array[i]=1+random.nextInt(100);
        }
        Arrays.sort(array);
        return array;
    }
    public static int binarySearch(int[] array, int key, int left, int right)
    {
        
        while(left<=right)
        {
            int middle =(left+right)/2;
            
            if(key<array[middle])
            {
                return binarySearch(array, key, 0, middle-1);
            }
            else
                if(key>array[middle])
                {
                    return binarySearch(array, key, middle+1, array.length-1);
                }
                else
                    return middle;
        }
        return -1;
    }
    
}
