
package bai2;

import java.util.Scanner;


public class app {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao");
        SinhVien sv1= new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        sv1.info();
    }
    
}
