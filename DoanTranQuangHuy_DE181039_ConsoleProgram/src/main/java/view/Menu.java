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
    static List<String> menuList=Arrays.asList("WELCOME TO STUDENT MANAGEMENT", "1. Create", "2. Find and Sort", "3. Update/Delete", "4. Report", "5. Exit");
    public static int getChoice()
    {
        menuList.forEach(System.out::println);//de sau cs vc
        System.out.println("Enter your choice");
        int choice = InputInformation.inputIntLimit(1, 5);
        return choice;
        
    }

    public static List<String> getMenuList() {
        return menuList;
    }

    public static void setMenuList(List<String> menuList) {
        Menu.menuList = menuList;
    }
    
}
