/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.*;


/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private final PersonList personlist= new PersonList();

    public ConsoleForm() {
    }

    public PersonList getPersonlist() {
        return personlist;
    }
    
    
    public void addContactView()
    {
        
        System.out.println("=====Management Person programer=====");
        for(int i=0; i< personlist.getArr().length; i++)
        {
            System.out.println("Input Information of Person");
            System.out.print("Please input name: ");
            String name= InputInformation.inputString();
            System.out.print("Please input address: ");
            String address= InputInformation.inputString();
            System.out.print("Please input salary:");
            String salary= InputInformation.inputInt();      


            Person ps= new Person(name, address, salary);
            personlist.getArr()[i]=ps;
        }
    }
    public void displayAcesing()
    {
        bubleSort();
        for(Person ps: personlist.getArr())
        {

            System.out.println("Information of Person you have entered:");
            System.out.println("Name:"+ps.getName());
            System.out.println("Address: "+ps.getAddress());
            System.out.println("Salary: "+ps.getsSalary());
        }
    }
    public void bubleSort()
    {
        int n= personlist.getArr().length;
        for(int i=0; i<n;i++)
        {
            boolean swap;
            for(int j=0; j<n-i-1;j++)
            {
                swap =false;
                int salary1= Integer.parseInt(personlist.getArr()[j].getsSalary());
                int salary2= Integer.parseInt(personlist.getArr()[j+1].getsSalary());
                if(salary1>salary2)
                {
                    Person temp= personlist.getArr()[j];
                    personlist.getArr()[j]=personlist.getArr()[j+1];
                    personlist.getArr()[j+1]=temp;
                    swap=true;
                }

            }
            if(swap=true)
                break;
        }
            
    }
    
        
    }
