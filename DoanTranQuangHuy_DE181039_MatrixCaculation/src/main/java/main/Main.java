/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;

/**
 *
 * @author aser
 */
public class Main {

    public static void main(String[] args) 
    {
        
        Scanner sc= new Scanner(System.in);
        Matrix mt= new Matrix();
        
        while (true) {
            
            
            System.out.println("============Caculator Program=========");
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = InputInformation.inputIntLimit(1, 4);
            switch (choice) 
            {
                case 1 -> mt.addMatrix();
                case 2 -> mt.subtractMatrix();
                case 3 -> mt.multiplyMatrices();
                case 4 -> {
                    return;
                }
            }
        }
    }
}
