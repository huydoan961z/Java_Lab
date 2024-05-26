/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.Staff;
import Model.StaffList;
import View.Menu;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StaffManagement extends Menu<String>
{
    private final StaffList model = new StaffList();
    private static final String[] menuOp = {"Display all staffs",  "Add new book", "Search staffs", "Remove Staff", "Exit"};
    private static final String[] searchMenuOp = {"Find by staffID", "Find by full name", "Find by deparment", "Find by pass", "Find by date"};
    private Menu<String> searchMenu;
    
    public StaffManagement() 
    {
        super("Staff Management", menuOp);
    }
    private void createSearchMenu() 
    {
        searchMenu = new Menu<String>("Search staffs", searchMenuOp) 
        {
        Scanner sc = new Scanner(System.in);
        @Override       
        public void execute(int choice) 
        {
            switch(choice)
            {
                case 1:
                        System.out.print("Enter ID: ");
                        String searchId = sc.nextLine();
                        ArrayList<Staff> matchedid = model.searchByCriteria(new Predicate<Staff>()
                        {
                            public boolean test(Staff s) {
                                return s.getStaffID().equals(searchId);
                            }
                        });
                        for (Staff s : matchedid) {
                            System.out.println(s.toString());
                        }
                        break;
                case 2:
                        System.out.print("Enter name: ");
                        String searchFullName = sc.nextLine();
                        ArrayList<Staff> matched1 = model.searchByCriteria(new Predicate<Staff>()
                        {
                            public boolean test(Staff s) {
                                return s.getFullName().equals(searchFullName);
                            }
                        });
                        for (Staff b : matched1) {
                            System.out.println(b.toString());
                        }
                        break;
                case 3:
                        System.out.print("Enter deparment: ");
                        String searchDEparment = sc.nextLine();
                        ArrayList<Staff> matched2 = model.searchByCriteria(new Predicate<Staff>()
                        {
                            public boolean test(Staff s) {
                                return s.getDepartment().equals(searchDEparment);
                            }
                        });
                        for (Staff b : matched2) {
                            System.out.println(b.toString());
                        }
                        break;
                case 4:
                        System.out.print("Enter pass: ");
                        String searchPass = sc.nextLine();
                        ArrayList<Staff> matched3 = model.searchByCriteria(new Predicate<Staff>()
                        {
                            public boolean test(Staff s) {
                                return s.getPassword().equals(searchPass);
                            }
                        });
                        for (Staff s : matched3) {
                            System.out.println(s.toString());
                        }
                        break;
                case 5:
                        System.out.println("enter date");
                        String date=sc.nextLine();
                        while (!date.matches("^\\d{2}/\\d{2}/\\d{4}$")) 
                        {
                            System.out.println("date must be in the correct Date format: dd/mm/yyyy");
                            date = sc.nextLine();
                        }
                        
                        String searchDate = sc.nextLine();
                        ArrayList<Staff> matched4 = model.searchByCriteria(new Predicate<Staff>()
                        {
                            public boolean test(Staff s) {
                                return s.getPassword().equals(searchDate);
                            }
                        });
                        for (Staff s : matched4) {
                            System.out.println(s.toString());
                        }
                        break;
                default:
                        System.out.println("Out sort");
        
            }
        }
        };
    }      
    @Override
    public void execute(int choice) 
    {
        switch (choice) 
        {
            case 1:
            {
                model.showListStaff();
            }
                break;     
     
            case 2:
            {
            try {
                model.addnew();
            } catch (ParseException ex) {
                Logger.getLogger(StaffManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
                break;
            case 3:
                createSearchMenu();
                searchMenu.run();
                break;
            case 4:
            {
            try {
                model.remove();
            } catch (ParseException ex) {
                Logger.getLogger(StaffManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
                break;
            default:
                System.out.println("Exit");
                break;
        }
    }            
}
                




