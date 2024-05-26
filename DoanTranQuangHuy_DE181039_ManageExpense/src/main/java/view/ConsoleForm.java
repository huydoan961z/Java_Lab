/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.text.ParseException;

import java.util.Scanner;
import model.Expense;
import model.ExpenseList;

/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private final ExpenseList expenselist = new ExpenseList();

    public ConsoleForm() {
    }

    public ExpenseList getExpenselist() {
        return expenselist;
    }
    public void add() throws ParseException
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("-------- Add an expense--------");
        System.out.print("Enter Date: ");
        String date = InputInformation.convertDate();
        System.out.print("Enter Amount: ");
        double amou= sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Content: ");
        String con= sc.nextLine();
        Expense expense= new Expense();
        if(expenselist.getExpensearraylist().isEmpty())
        {
           expense.setId(1);
        }
        else
        {
            int temp=expenselist.getExpensearraylist().get(expenselist.getExpensearraylist().size()-1).getId();
            expense.setId(temp+1);
        }
        
        expense.setContent(con);
        expense.setDate(date);
        expense.setAmount(amou);
        expenselist.add(expense);
       
        
    }
    
        public void displayAll()
        {
            
            System.out.println("---------Display all expenses------------");
            System.out.printf("%-15s %-15s %-15s %-15s \n", "ID", "Date", "Amount", "Content");

            
            for(Expense ex: expenselist.getExpensearraylist())
            {
                //in gia tri ra day, contact.getid....
                System.out.printf("%-15s %-15s %-15s %-15s \n",ex.getId(), ex.getDate(), (int)ex.getAmount(), ex.getContent()); 
                
            }
            System.out.println("\t\tTotal:        " + (int)total());
        }
        
        public double total()
        {
            double total=0;
            for(Expense ex: expenselist.getExpensearraylist())
            {
                total= total+ex.getAmount();
            }
            return total;
        }
        public void remove() 
        {
            System.out.println("--------Delete an expense------");
            System.out.println("Enter ID:  ");
            int id = InputInformation.inputInt();
            if(expenselist.delete(id)) 
            {
                System.out.println("Delete an expense successful");
            } else 
            {
                System.out.println("Delete an expense fail");
            }
        }

    }
