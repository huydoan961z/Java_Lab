 
package bai4;

import java.util.Scanner;

public class out {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap vao nv");
        nhanvien nv1= new nhanvien("0001", sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine())  ;
        nv1.chuanHoaBirth();
        System.out.println(nv1);
    }
}