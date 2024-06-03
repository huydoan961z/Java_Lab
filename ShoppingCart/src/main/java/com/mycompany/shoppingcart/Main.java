/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;

import java.util.Scanner;

/**
 *
 * @author aser
 */
public class Main 
{
    public static void main(String[] args) {
        System.out.println("Welcome to our business, how can I help you");
        ShoppingCart sp= new ShoppingCart();
        

        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add an item to the cart");
            System.out.println("2. Remove an item from the cart");
            System.out.println("3. Adjust the quantity of an item");
            System.out.println("4. Display the cart");
            System.out.println("5. Exit");
            System.out.println("Enter your choice (1-5):");

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the item:");
                    String name = scan.nextLine();
                    System.out.println("Enter the quantity:");
                    int quantity = scan.nextInt();
                    scan.nextLine();
                    sp.addItem(name, quantity);
                    System.out.println("Added " + name + " to the cart.");
                    break;
                case 2:
                    System.out.println("Enter the name of the item to remove:");
                    name = scan.nextLine();
                    sp.removeItem(name);
                    System.out.println("Removed " + name + " from the cart.");
                    break;
                case 3:
                    System.out.println("Enter the name of the item to adjust:");
                    name = scan.nextLine();
                    System.out.println("Enter the new quantity:");
                    quantity = scan.nextInt();
                    scan.nextLine();
                    sp.adjustQuantity(name, quantity);
                    System.out.println("Adjusted the quantity of " + name + " to " + quantity + ".");
                    break;
                case 4:
                    sp.displayCart();
                    break;
                case 5:
                    System.out.println("Thank you for using our service. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
                    break;
            }
        } while (choice != 5);
    }
    
}
