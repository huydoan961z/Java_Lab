/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package quicksort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class QuickSort {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter number of array:");
            n= sc.nextInt();
        }while(n<=0);
        
        int[] arr= createArr(n);
        System.out.println("Unsorted array"+ Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted array"+ Arrays.toString(arr));

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
    
    public static int partition(int []arr,int left, int right)
    {
        int i= left;
        int j=right;
        int pivot=arr[(left+right)/2];
        while(i<=j)
        {
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            
            if(i<=j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            
        }
        return i;
    }
    public static void quickSort(int []arr, int left, int right)
    {
        int m=partition(arr, left, right);
        
        if(left< m-1)
            quickSort(arr, left, m-1);
        if(m<right)
            quickSort(arr, m, right);
    }
}
