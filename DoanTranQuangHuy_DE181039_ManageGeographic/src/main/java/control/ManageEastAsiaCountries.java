/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.Collections;

import java.util.Scanner;
import model.Country;
import model.EastAsiaCountries;
import view.Main;
/**
 *
 * @author aser
 */

public class ManageEastAsiaCountries extends Main 
{

    private static final EastAsiaCountries model = new EastAsiaCountries();
    private static final String MENU_TITLE = "Menu";
    private static final String[] MENU_OPTIONS = {"Input the information of countries in East Asia", "Display the information of country you've just input", "Search the information of country by user-entered name", "Display the information of countries sorted name in ascending order ", "Exit"};
    
    public ManageEastAsiaCountries() {
        super(MENU_TITLE, MENU_OPTIONS);
        
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                inputCountryInfo();
                break;    
            case 2: model.showlist();
                break;               
            case 3:  
                searchName();
                break;
            case 4:
                displayCountriesSortedByName();
                break;
            default :
                System.out.println("Exiting...");
        }
    }
    public void inputCountryInfo()
    {
        Scanner sc= new Scanner(System.in);
        String countryCode, countryName, countryTerrain ;
        float totalArea;
        System.out.println("Enter code of country:");
        countryCode = sc.nextLine();
        System.out.println("Enter name of country:");
        countryName = sc.nextLine();     
        while (true) 
        {
            System.out.println("Enter total Area: ");
            totalArea = sc.nextFloat();
            sc.nextLine(); 
            if (totalArea <= 0) {
                System.out.println("Total area must be greater than 0.");
            } else 
                break; 
            
        }
        System.out.println("Enter terrain of country:");
        countryTerrain = sc.nextLine();
        EastAsiaCountries es= new EastAsiaCountries(countryTerrain, countryCode, countryName, totalArea);
        model.country.add(es);
    }
    
    public void searchName()
    {
        Scanner x= new Scanner(System.in);
        System.out.println("Enter the name you want to search for:");
        String countryName = x.nextLine();  
        
        for (Country c : model.country) 
        {
        if (c.getCountryName().equalsIgnoreCase(countryName)) 
        {
            System.out.println(c.toString());
            return;
        }
        }
    }
    public void displayCountriesSortedByName() 
    {
    Collections.sort(model.country);
    for (Country c : model.country) 
    {
        System.out.println(c.toString());
    }
    }

    public static void main(String[] args) 
    {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        manager.run();
        Scanner sc= new Scanner(System.in);
    }   
}
