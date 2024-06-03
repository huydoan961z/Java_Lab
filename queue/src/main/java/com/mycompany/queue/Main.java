/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.queue;

/**
 *
 * @author aser
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add  job");
            System.out.println("2. Display print queue");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();  
                    System.out.print("Enter job name: ");
                    String job = sc.nextLine();
                    System.out.print("Enter job priority: ");
                    int priority = sc.nextInt();
                    queue.enqueue(job, priority);
                    System.out.println("Add succesfully");
                    break;          
                case 2:
                    queue.display();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. ");
            }
        }
    }
}
