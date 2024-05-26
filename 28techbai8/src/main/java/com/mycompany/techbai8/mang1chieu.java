

package com.mycompany.techbai8;

import java.util.Scanner;


public class mang1chieu {

    public static boolean checksnt(int n)
    {
        if(n<2)
        {
            return false ;
        }
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
                return false;
        }
        return true ;
    }
    
    //nhap mang vaoa va cong cac so ngto trong mang 
    public static void tongsnt(int n, int a[])
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(checksnt(a[i]))
                sum+=a[i];
            
        }
        System.out.println(""+sum);
    }
    
    public static boolean checkscp(int n)
    {
        for(int i=0; i<=Math.sqrt(n); i++)
        {
            if(i*i==n)
                return true;
        }
        return false ;
    }
    
    // tim 2 so trong mang + lai bang gia tri ss
    public static void dem(int n, int a[])
    {
        int k=10 ,dem=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
                {
                     if(a[i]+a[j]==k )
                         dem+=1 ;
                }       
        }
        System.out.println("tong so cap la "+dem);
    }
    
    public static void insoxuathien1lan(int n, int a[])
    {
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-1;j++)
                {
                     if(a[i]!= a[j])
                         System.out.print(" "+a[i]);
                         continue ;
                }       
        } 
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of array");
        int n= sc.nextInt();
        int i=0;
        int[] a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        //tongsnt(n, a);
        //dem(n, a);
        insoxuathien1lan(n, a);
                
        
    }
}