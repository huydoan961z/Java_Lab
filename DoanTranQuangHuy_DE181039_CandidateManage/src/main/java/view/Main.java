/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.text.ParseException;

/**
 *
 * @author aser
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        ConsoleForm cf= new ConsoleForm();
         
        while(true)
        {
        int choice = Menu.getChoice();
        switch(choice)
        {
            case 1:
                cf.addCandidate();
                break;
            case 2:
                cf.addCandidate();
                break;
            case 3:
                cf.addCandidate();
                        
                break;
            case 4:
                cf.printListNameCandidate();
            default:
                System.out.println("Exit");     
        }
        }
        
    }
            
    
}
