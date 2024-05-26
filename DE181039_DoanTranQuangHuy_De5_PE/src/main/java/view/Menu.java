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
    static List<String> menuList=Arrays.asList("====== Children's Toy Management ======", "1. Import Toy information.", "2. Add Toy", "3. Search toy", "4. Update toy", "5. Export to csv file","6. Exit");
    public static int getChoice()
    {
        menuList.forEach(System.out::println);//de sau cs vc
        System.out.println("Please choice one option");
        int choice = InputInformation.inputIntLimit(1, 6);
        return choice;
        
    }

    public static List<String> getMenuList() {
        return menuList;
    }

    public static void setMenuList(List<String> menuList) {
        Menu.menuList = menuList;
    }
    
}
