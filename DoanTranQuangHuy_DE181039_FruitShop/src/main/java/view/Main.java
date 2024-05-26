/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author aser
 */
public class Main {
    public static void main(String[] args) {
        ConsoleForm cf= new ConsoleForm();
         
        while(true)
        {
        
        int choice = Menu.getChoice();
        switch(choice)
        {
            case 1:
                cf.addFood();
                break;
            case 2:
                cf.viewOrder();
                break;
            case 3:
                cf.cusShopping();
                break; 
            case 4:
                System.exit(0);
        }
        }
        
    }
            
    
}
