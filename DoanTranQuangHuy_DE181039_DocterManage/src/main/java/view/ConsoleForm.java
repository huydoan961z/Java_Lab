/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Docter;
import model.DocterList;

/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private DocterList docterList= new DocterList();

    public ConsoleForm() {
    }

    public DocterList getDocterList() {
        return docterList;
    }

    public void setDocterList(DocterList docterList) {
        this.docterList = docterList;
    }
    
    public void addDocterView()
    {
        System.out.println("--------- Add Doctor ----------");
        System.out.print("Enter Code: ");
        String code= InputInformation.inputString();
        System.out.print("Enter Name: ");
        String name= InputInformation.inputString();
        
        System.out.print("Enter Specialization: ");
        String spec= InputInformation.inputString(); 
        System.out.print("Enter Availability: ");
        int availability= InputInformation.inputInt();
      

        Docter docter= new Docter();
        
        docter.setCode(code);
        docter.setName(name);
        docter.setSpecialization(spec);
        docter.setAvailability(availability);
        
        
        
        //ad vaof list
        docterList.addDocter(docter);
    }
        public void update()
        {
            System.out.print("Enter Code: ");
            String code= InputInformation.inputString();
            System.out.print("Enter Name: ");
            String name= InputInformation.inputString();

            System.out.print("Enter Specialization: ");
            String spec= InputInformation.inputString(); 
            System.out.print("Enter Availability: ");
            int availability= InputInformation.inputInt();
            
            boolean find= false;
            for(Docter x: docterList.getDocterArrayList())
            {
                if(x.getCode().equals(code))
                {
                    x.setAvailability(availability);
                    x.setCode(code);
                    x.setName(name);
                    x.setSpecialization(spec);
                    find=true;
                    break;
                }   
            }
            if(!find)
                System.out.println("Not find code mention above");    
        }
    
        public void displayAll()
        {
            
            System.out.println("-----------------------------Display all Docter ------------------------------");
            System.out.printf(" %-20s %-20s %-20s %-20s\n", "Code", "Name", "Specialization", "Availability");

            
            for(Docter docter: docterList.getDocterArrayList())
            {
                //in gia tri ra day, docter.getid....
                System.out.printf(" %-20s %-20s %-20s %-20s\n",docter.getCode(),docter.getName(), docter.getSpecialization(), docter.getAvailability()); 
            }
        }
        public void remove() 
        {
            System.out.print("Enter Code: ");
            String code = InputInformation.inputString();
            Docter needRemove = null;
            for(Docter docter : docterList.getDocterArrayList()) {
                if(docter.getCode().equals(code)) 
                {
                    needRemove = docter;
                    break;
                }
            }
            if(needRemove != null) 
            {
                docterList.delectDocter(needRemove);
            } else 
                System.out.println("Docter not found");
        }
    }
