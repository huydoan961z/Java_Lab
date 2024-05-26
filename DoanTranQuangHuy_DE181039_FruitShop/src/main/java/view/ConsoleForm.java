/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.util.ArrayList;
import java.util.Scanner;
import model.*;

/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private FoodList foodlist= new FoodList();

    public ConsoleForm() {
    }

    public FoodList getFoodlist() {
        return foodlist;
    }

    public void setFoodlist(FoodList foodlist) {
        this.foodlist = foodlist;
    }
    

    public void addFood()
    {
        
        String ans;
        do
        {
            Food food= new Food();

            Scanner sc= new Scanner(System.in);
            System.out.print("Enter fruit ID: " );
            int id= InputInformation.inputInt();
            System.out.print("Enter fruit name: ");
            String name = sc.nextLine();
            System.out.print("Enter price : ");
            int price = InputInformation.inputInt();
            System.out.print("Enter quantity: ");
            int quantity = InputInformation.inputInt();
            System.out.print("Enter origin: ");
            String origin= sc.nextLine();
            food.setId(id); food.setName(name); food.setOrigin(origin); food.setPrice(price); food.setQuantity(quantity);
            foodlist.addFood(food);
            System.out.println("Do you want to continue");
            ans= sc.nextLine();
            
        }while(ans.equalsIgnoreCase("Y"));
        displayFruit();
        
    }
    
     
    public void displayFruit() {
        System.out.println("List of Fruit:");
        System.out.printf("%-10s%-20s%-20s%-15s\n", "Item", "Fruit Name", "Origin", "Price");
        for(Food h: foodlist.getFoodArrayList()) 
        {
            System.out.printf("%-10s%-20s%-20s%-15s\n", h.getId(),h.getName(), h.getPrice(), h.getQuantity(), h.getOrigin());
        }
    }
    
    public void cusShopping() 
    {
        ArrayList<Food> listFood = new ArrayList<>();
        displayFruit();
        while (true) {
            System.out.print("To order, customer selects Item: ");
            int choice = InputInformation.inputInt();

            Food foodChoice = null;
            for (Food h : foodlist.getFoodArrayList()) {
                if (h.getId() == choice) {
                    foodChoice = h;
                    System.out.println("Your selected: " + h.getName());
                    break;
                }
            }
            if (foodChoice != null) {
                System.out.print("Please input the quantity: ");
                int quantity = InputInformation.inputInt();
                foodChoice.setQuantity(quantity);
                listFood.add(foodChoice);
            }
            System.out.print("Do you want to continue (Y/N)? ");
            String ans = InputInformation.inputString();
            if (ans.equalsIgnoreCase("N")) {
                break;
            }
        }
        if (!listFood.isEmpty()) 
        {
            System.out.printf("%15s%15s%15s%15s| \n", "Product", "Quantity", "Price", "Amount");
            double total = 0;
            for (Food food : listFood) 
            {
                double amount = food.getQuantity() * food.getPrice();
                System.out.printf("%15s%15s%15s%15s \n", food.getName(), food.getQuantity(), food.getPrice() + "$", amount + "$");
                total += amount;
            }
            System.out.println("Total: " + total + "$");
            System.out.print("Enter your name: ");
            String nameCustomer = InputInformation.inputString();
            foodlist.getHashTable().put(nameCustomer, listFood);
            System.out.println();
            System.out.println("Input successful");
        }
    }
    public void viewOrder() 
    {
        for (String nameCustomer : foodlist.getHashTable().keySet()) 
        {
            System.out.println("Customer: " + nameCustomer);
            System.out.printf("%15s%15s%15s%15s\n", "Product", "Quantity", "Price", "Amount");
            double total = 0;
            for (Food food : foodlist.getHashTable().get(nameCustomer)) 
            {
                double amount = food.getQuantity() * food.getPrice();
                System.out.printf("%15s%15d%15d%15.2f\n", food.getName(), food.getQuantity(), food.getPrice(), amount);
                total += amount;
            }
            System.out.println("Total: " + total + "$");
        }
    }
   

             
    
}
    
