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
    static List<String> menuList=Arrays.asList("CANDIDATE MANAGEMENT SYSTEM", "1. Experience", "2. Fresher", "3. Internship", "4. Searching", "5. Exit");
    public static int getChoice()
    {
        menuList.forEach(System.out::println);//de sau cs vc
        System.out.print("Your choice: ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
        
    }

    public static List<String> getMenuList() {
        return menuList;
    }

    public static void setMenuList(List<String> menuList) {
        Menu.menuList = menuList;
    }
    
}
