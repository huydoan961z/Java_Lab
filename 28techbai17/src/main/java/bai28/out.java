
package bai28;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class out {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of student");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<hocsinh> arr = new ArrayList<>() ;
        
        double[] diem = new double[10];
        for(int i=0; i<10; i++)
        {
            System.out.println("nhap ten cua hs");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Nhap diem cac mon");
            double[] tmp= new double[10];
            for(int j=0; j<n;j++)
            {
                tmp[j] = sc.nextDouble();
            }
            hocsinh hs= new hocsinh(i+1,name, tmp);
            arr.add(hs);  
        }
        Collection.sort(arr, new Comparator<hocsinh>(){
            @Override
            public int compare(hocsinh o1, hocsinh o2) {
                ìf (o1.getAver()< o2.getAver())
                        return 1;
                else
                    return -1;
                        
            }
            
        });
        for(hocsinh x: arr)
        {
            System.out.println(x);
        }
    }
}
