/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author aser
 */
public class InputInfor {
    public static int inputInt() {
    Scanner s = new Scanner(System.in);
    while (true) {
        String input = s.nextLine();

        try {
            int result = Integer.parseInt(input);
            if (result <0 || result ==0) {
                System.out.println("Please enter a positive number.( except 0)");
                System.out.print("Please input again: ");
            } else {
                return result;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a  digit.");
            System.out.print("Please input again: ");
        }
    }
}

    
}
