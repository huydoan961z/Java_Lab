/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author aser
 */
public class Menu {
    static List<String> menuList=Arrays.asList("=======Handy Expense program======", "1. Add an expense", "2. Display all expenses", "3. Delete an expense", "4. Quit");
    public static int getChoice()
    {
        menuList.forEach(System.out::println);//de sau cs vc
        System.out.print("Your choice: ");
        int choice = InputInformation.inputIntLimit(1, 4);
        return choice;
        
    }

    public static List<String> getMenuList() {
        return menuList;
    }

    public static void setMenuList(List<String> menuList) {
        Menu.menuList = menuList;
    }
    
}
