/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aser
 */
public class ExpenseList 
{
    private ArrayList<Expense> expensearraylist= new ArrayList<>();

    public ExpenseList() {
    }

    public ArrayList<Expense> getExpensearraylist() {
        return expensearraylist;
    }

    public void setExpensearraylist(ArrayList<Expense> expensearraylist) 
    {
        this.expensearraylist = expensearraylist;
    }
    public void add(Expense expense)
    {
        expensearraylist.add(expense);
    }
    public boolean delete(int id)
    {
        for(Expense ex: expensearraylist)
        {
            if(ex.getId()==id)
            {
                expensearraylist.remove(ex);
                return true;
            }
            
        }
        return false;
    }

    
}
