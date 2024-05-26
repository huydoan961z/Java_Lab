/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package linearsearch;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter number of array:");
            n= sc.nextInt();
        }while(n<=0);
        
        int[] arr= createArr(n);
        System.out.println("The array:"+ Arrays.toString(arr));
        System.out.println("Enter search value");
        int m= sc.nextInt();
        
        int x= searchValue(arr, m);
        if(x==-1)
            System.out.println("Khong tim thay");
        else
        {
            System.out.println("Found "+m+ " at index "+x);
                    
        }
                
        
    }
    
    public static int[] createArr(int n)
    {
        Random random= new Random();
        int[] arr= new int[n];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]= random.nextInt(100);
        }
        return arr;
    }
    public static int searchValue(int[] arr, int m)
    {
        for(int i=0; i< arr.length;i++)
        {
            if(arr[i]==m)
                return i;
        }
        return -1;
    }
    
    
}
