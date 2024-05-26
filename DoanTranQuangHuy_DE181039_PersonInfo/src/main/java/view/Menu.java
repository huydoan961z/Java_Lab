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
    static List<String> menuList=Arrays.asList("=====Management Person programer=====", "1. Input person information", "2. Show 3 persons information by ascending of salary", "3. Exit");
    public static int getChoice()
    {
        menuList.forEach(System.out::println);//de sau cs vc
        System.out.println("Enter your choice");
        int choice = InputInformation.inputIntLimit(1, 3);
        return choice;
        
    }

    public static List<String> getMenuList() {
        return menuList;
    }

    public static void setMenuList(List<String> menuList) {
        Menu.menuList = menuList;
    }
    
}
