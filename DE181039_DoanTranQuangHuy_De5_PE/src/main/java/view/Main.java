/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.IOException;
import java.text.ParseException;

/**
C:\Users\aser\Documents\NetBeansProjects\DE181039_DoanTranQuangHuy_De5_PE\input.csv
 * @author aser
 */
public class Main {
    public static void main(String[] args) throws IOException, ParseException 
    {
        ConsoleForm ps= new ConsoleForm();
         
        while(true)
        {
        
            int choice = Menu.getChoice();
            switch(choice)
            {
                case 1:
                    ps.loadData();
                    break;
                case 2:
                    ps.addToy();
                    break;
                case 3:
                    ps.searchToy();
                    break;
                case 4:
                    ps.updateToyInfo();
                    break;
                case 5:
                    ps.outData();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Exit");     
            }
        }
        
    }
            
    
}
