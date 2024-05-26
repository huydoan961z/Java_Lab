
package bai333;

import java.util.ArrayList;
import java.util.Scanner;


public class Out 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("so lg sv");
        int n= sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien>arr = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            
            SinhVien s= new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            sc.nextLine();
            s.chuanhoaten();
            s.chuanhoabirth();
            arr.add(s);
        }
        
//        //tim ra may ong cung lp
//        for(SinhVien x: arr)
//        {
//            if(x.getClassr().equals("cntt1"))
//                System.out.println(x);
//        }
        
//        //tim ong cao diem nhat   
//        double maxgpa=0 ;
//        for(SinhVien x:arr)
//        {
//            maxgpa=Math.max(maxgpa, x.getGpa());
//        }
//         for(SinhVien x:arr)
//        {
//            if(x.getGpa()==maxgpa)
//                System.out.println(x);
//        }
        for(SinhVien x:arr)
        {
            System.out.println(x);
        }
    }
}
