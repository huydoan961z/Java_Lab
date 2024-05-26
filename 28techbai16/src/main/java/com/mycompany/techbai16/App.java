
package com.mycompany.techbai16;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap vao thong tin");
        SinhVien sv1= new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        sv1.info();
    }
    
}
