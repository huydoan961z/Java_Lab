
package Dientichtunghinh;

import java.util.Scanner;


public class out 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so hinh");
        int n= sc.nextInt();
        sc.nextLine();
        
        total[] a= new total[n];
        for(int i=0;i<n;i++)
        {
            String s;
            s= sc.nextLine();
            if(s.equals("C"))
            {
                System.out.println("ttin hinh c");
                double r= sc.nextDouble();
                sc.nextLine();
                String color= sc.nextLine();
                boolean f=sc.nextBoolean();
                a[i]=new circle(r, color, f);
                sc.nextLine();
            }
            else
                if(s.equals("R"))
                {
                    System.out.println("ttin hinh r");
                    double w= sc.nextDouble();
                    double l= sc.nextDouble();
                    sc.nextLine();
                    String color= sc.nextLine();
                    boolean f=sc.nextBoolean();
                    a[i]=new rectangle(w, l, color, f);
                    sc.nextLine();
                    
                }
                else
                    if(s.equals("S"))
                    {
                        System.out.println("ttin hinh s");
                        double c= sc.nextDouble();
                        sc.nextLine();
                        String color= sc.nextLine();
                        boolean f=sc.nextBoolean();
                        a[i]= new square(c, color, f);
                        sc.nextLine();
                    }
                    
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
            
    }
}
