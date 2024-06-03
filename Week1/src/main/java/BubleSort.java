

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
public class BubleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;       
        do
        {
            System.out.println("Enter number of array");
            n= sc.nextInt();
        }while(n<=0);
        
        Random random= new Random();
        int[] arr= new int[n];
        for(int i=0; i<n;i++)
        {
            arr[i]= random.nextInt(100);
        }
        System.out.println("Unsorted array: "+Arrays.toString(arr));
        bublleSort(arr);
        System.out.println("Sorted array"+Arrays.toString(arr));
    }
    public static void bublleSort(int[] arr)
    {
        boolean swapped = false;
        for(int i=0; i<arr.length-1;i++)
        {
            swapped=false;
            for(int j=0; j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                    swapped= true;
                }
            }
            if(!swapped)
                break;
        }
               }
}
