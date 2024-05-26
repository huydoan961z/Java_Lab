/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.util.Scanner;
import model.*;
/**
 *
 * @author aser
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int num = InputInfor.inputInt();
        FractionList fractionList = new FractionList(num);
        System.out.println(fractionList);
        System.out.println(fractionList.sumFrac());
    }  
}
