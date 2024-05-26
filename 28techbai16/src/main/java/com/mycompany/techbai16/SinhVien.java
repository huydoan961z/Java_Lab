
package com.mycompany.techbai16;

import java.util.Scanner;


public class SinhVien {
    private String name;
    private String birth;
    private double diem1,diem2,diem3;
    
    SinhVien(String ten, String ngaySinh, double d1, double d2, double d3)
    {
       name= ten;
       birth= ngaySinh;
       diem1= d1;
       diem2=d2;
       diem3=d3;
    }
    public void info()
    {
        System.out.println(name+""+ birth+" ");
        double total=diem1+diem2+diem3 ;
        System.out.println("diem tong"+total);
        
    }
           
}
