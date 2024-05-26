
package bai21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class out 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao mat hang");
        int n= sc.nextInt();
        ArrayList<matHang> arr= new ArrayList<>() ;
        for(int i=0; i<n; i++)
        {
            sc.nextLine();
            matHang mh = new matHang((i+1), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            arr.add(mh);
        }
        Collection.sort(arr, new Comparator<matHang>() {
            @Override
            public int compare(matHang o1, matHang o2) {
                
            }
        }
                
        
    }
}
