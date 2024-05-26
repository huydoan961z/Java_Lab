/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;
import model.*;


/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private ToyList toylist= new ToyList();

    public ConsoleForm() {
    }

    public ToyList getMedicationList() {
        return toylist;
    }

    public void setMedicationList(ToyList toylist) {
        this.toylist = toylist;
    }
    public  void loadData() 
    {
        System.out.println(" Import toy information");
        System.out.print("Enter path:");
        Scanner sc = new Scanner(System.in);
        String filePath = InputInformation.inputString();

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            return;
        }
        String std;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {    //Try with resource
            while ((std = br.readLine()) != null) {
                String[] b = std.split(",");
                try {                   
                    toylist.getToyArrayList().add(new Toy(b[0], b[1], b[2], b[3]));
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            System.out.println("Import: Done");
        } catch (IOException ex) {
            System.out.println("IOException occur"+ex.getMessage());
        }
        
    }   
    public  void outData() throws IOException
    {
        System.out.println("--------- Export CSV ------");
        System.out.print("Enter path name:");
        Scanner sc = new Scanner(System.in);
        String fileName = InputInformation.inputString();

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("output.csv")))) {
            for (Toy t :toylist.getToyArrayList()) {
                pw.println(t.getToyId()+ "," + t.getToyName()+"," + t.getDate()+","+ t.getPrice());
            }
        }
        System.out.println("Export: Done");
        
    }

    public void addToy() throws ParseException 
    {
        System.out.println("--------- Add New Toy ----------");

        System.out.print("Enter toy ID: ");
        String id = InputInformation.inputString();

        for (Toy m : toylist.getToyArrayList()) 
        {
            if (m.getToyId().equals(id)) 
            {
                System.out.println("The id of toy must be exist");
                return;
            }
        }
        System.out.print("Enter Toy Name: ");
        String name = InputInformation.inputString();

        System.out.print("Enter Date of Storage ");
        String date = InputInformation.checkInputDate();

        System.out.print("Enter Price: ");
        String price = InputInformation.inputPrice();

        Toy newToy = new Toy(id, name, date, price);
        toylist.getToyArrayList().add(newToy);
        System.out.println("Add new Toy successful");
    } 
    public  void searchToy() 
    {
        System.out.println("--------- Search Toy Information ----------");
        System.out.print("Enter Toy Name: "); 
        String name = InputInformation.inputString();
        for (Toy t : toylist.getToyArrayList()) 
        {
            if (t.getToyName().equals(name)) 
            {
                System.out.println("Founded: " + t.getToyName());
                System.out.println("Toy id: "+t.getToyId());
                System.out.println("Toy date of storage: "+t.getDate());
                System.out.println("Toy price: "+t.getPrice());
                return;
            }
        }
        System.out.println("Not found");
    }
    public void updateToyInfo() throws ParseException 
    {
        System.out.println("--------- Update Toy Information ----------");
        System.out.print("Enter Toy Code: "); 
        String code = InputInformation.inputString();

        for (Toy t : toylist.getToyArrayList()) 
        {
            if (code.equals(t.getToyId())) 
            {
                System.out.println("Found toy with id: " + t.getToyId());

                System.out.print("Enter new Name: ");
                String name = InputInformation.inputString();
                t.setToyName(name);

                System.out.print("Enter new Date of Storage: ");
                String date = InputInformation.checkInputDate(); 
                t.setDate(date);

                System.out.print("Enter new price: ");
                String p = InputInformation.inputPrice();
                t.setPrice(p);

                System.out.println("Updated toy with ID: " + t.getToyId());
                return;
            }
        }

        System.out.println("Not found");
    }

}
