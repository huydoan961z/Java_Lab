/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aser
 */
public class StaffList 
{
    private final ArrayList<Staff> staffs= new ArrayList<>();
    private final File file= new File("src");
    private final String path= file.getAbsolutePath();
    private final String file_name="\\main\\staff.txt";
    public StaffList()
    {
    }
    private void loadData() throws IOException 
    {
        String std;
        try (BufferedReader br = new BufferedReader(new FileReader(path + file_name))) {    
            while ((std = br.readLine()) != null) {
                String[] b = std.split(",");
                try {
                    if((b[0].matches("^NV\\d{4}$")) && b[4].matches("^\\d{2}/\\d{2}/\\d{4}$"))
                        staffs.add(new Staff(b[0], b[1], b[2], b[3], b[4]));
                } catch (Exception  ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
    private void saveData() throws IOException 
    {
        try (PrintWriter pr = new PrintWriter(path + file_name);) {
            for (Staff s : staffs ) {
                pr.println(s.getStaffID()+ ";" + s.getFullName()+ ";" + s.getDepartment()+ ";" + s.getPassword()+ ";" + s.getPassword());
            }
            pr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
    
    public void showListStaff() 
    {
         try {
             loadData();
         } catch (IOException ex) {
             Logger.getLogger(StaffList.class.getName()).log(Level.SEVERE, null, ex);
         }
        System.out.println("-----------------List of staff----------------");
        for(Staff s: staffs)
        {
            System.out.println(s.toString());
        }
    }
    public ArrayList<Staff> searchByCriteria(Predicate<Staff> criteria)
    {
        ArrayList<Staff> match = new ArrayList<>();
        for(Staff s:staffs)
        {
            if(criteria.test(s))
            {
                match.add(s);
            }
        }
        return match;
    }
    public void addnew()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter id");
        String id=sc.nextLine();
        while(!id.matches("^NV\\d{4}$"))
        {
            System.out.println("Invalid id");
            id=sc.nextLine();  
        }
        System.out.println("enter full name");
        String fullname=sc.nextLine();
        System.out.println("enter department");
        String department=sc.nextLine();
        System.out.println("enter pass");
        String pass=sc.nextLine();
        System.out.println("enter date");
        String date=sc.nextLine();
        while (!date.matches("^\\d{2}/\\d{2}/\\d{4}$")) 
        {
            System.out.println("date must be in the correct Date format: dd/mm/yyyy");
            date = sc.nextLine();
        }
        Staff s= new Staff(id, fullname, department, pass, date);
    }
    public void remove()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter id");
        String id=sc.nextLine();
        while(!id.matches("^NV\\d{4}$"))
        {
            System.out.println("Invalid id");
            id=sc.nextLine();  
        }
        System.out.println("enter full name");
        String fullname=sc.nextLine();
        System.out.println("enter department");
        String department=sc.nextLine();
        System.out.println("enter pass");
        String pass=sc.nextLine();
        System.out.println("enter date");
        String date=sc.nextLine();
        while (!date.matches("^\\d{2}/\\d{2}/\\d{4}$")) 
        {
            System.out.println("date must be in the correct Date format: dd/mm/yyyy");
            date = sc.nextLine();
        }
        Staff stest= new Staff(id, fullname, department, pass, date);
        Iterator<Staff> iterator= staffs.iterator();
        while (iterator.hasNext()) 
        {
            Staff s= iterator.next();
            if(s.equals(stest))
            {
                iterator.remove();
            }
            else
                System.out.println("kh co thong tin");
            
        }
    }
}
