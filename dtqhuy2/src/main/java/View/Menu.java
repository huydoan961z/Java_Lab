/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;
import java.util.Scanner;
public abstract class Menu <mn>
{
    protected String title;
    protected ArrayList<mn> options ;
    public Menu()
    { 
    }
    
    public Menu(String title,String[] option)
    {
        this.title= title;
        this.options= new ArrayList<>();
        for(String x:option)
        {
            options.add((mn) x);
        }
    }
    public void displayMenu() 
    {
        System.out.println(title);
        System.out.println("-------------------------------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i+1) + ". " + options.get(i));
        }
        System.out.println("-------------------------------------");
    }
    public int getChoice() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
    public abstract void execute(int n);
    public void run()
    {
        Scanner sc = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = getChoice();
            execute(choice);
            if (choice <= 0 || choice > options.size()) {
                System.out.println("Invalid choice!!!");
            }} }}
    
