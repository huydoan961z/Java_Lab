
package bai11;

import java.util.Scanner;


public class out {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao di");
        salary sl1= new salary("nv01", sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()),sc.nextLine());
        System.out.println(sl1);
        
    }
}
