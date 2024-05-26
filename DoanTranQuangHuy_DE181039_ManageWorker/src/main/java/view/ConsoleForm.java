/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;
import model.History;
import model.Worker;
import model.WorkerList;

/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private WorkerList workerList= new WorkerList();
    private History historyList= new History();

    public ConsoleForm() {
    }

    public WorkerList getWorkerList() {
        return workerList;
    }

    public void setWorkerList(WorkerList workerList) {
        this.workerList = workerList;
    }
    
    public void addWorkerView()
    {
        
        System.out.println("--------- Add Worker ----------");
        System.out.print("Enter Code: ");
        String code= InputInformation.inputString();
        System.out.print("Enter Name: ");
        String name= InputInformation.inputString();
        
        System.out.print("Enter Age: ");
        int age= InputInformation.inputIntLimit(18, 50); 
        System.out.print("Enter salary: ");
        int salary= InputInformation.inputIntLimited();
        System.out.print("Enter work location: ");
        String workLocate= InputInformation.inputString();
        Worker worker= new Worker(code, name, age, salary, workLocate);
        
        
        workerList.adWorker(worker);
    }
    public void upSalary()
    {
        System.out.println("------- Up Salary --------");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Code: ");
        String code= s.nextLine();
        
        System.out.println("Enter amount of salary to increase");
        int amount=InputInformation.inputIntLimited();
        int newSalary;
        boolean found = false; 
        for(Worker x: workerList.getWorkerArrayList())
        {
            if(x.getId().equals(code))
            {
                newSalary= x.getSalary()+amount;
                x.setSalary(newSalary);
                History h= new History("UP", getCurrentDate(), newSalary, code, x.getName(), x.getAge(), newSalary, x.getWorkLocate());
                historyList.addHistory(h);
                found = true; 
                break; 
            }
        }
        if (found==false) 
        {
            System.out.println("Not found worker details");
        }
    }

    public void downSalary()
    {
        System.out.println("------- Down Salary --------");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Code: ");
        String code= s.nextLine();
        System.out.println("Enter amount of salary to decrease");
        int amount=InputInformation.inputIntLimited();
        int newSalary;
        boolean found= false;
        for(Worker x: workerList.getWorkerArrayList())
        {
            
            if(x.getId().equals(code) && x.getSalary()>amount)
            {
                newSalary=x.getSalary()-amount;
                if(newSalary<0)
                {
                    System.out.println("lỗi rồi");
                    found=true;
                    break;
                }
                x.setSalary(newSalary);
                History h= new History("DOWN", getCurrentDate(), newSalary, code, x.getName(), x.getAge(), newSalary, x.getWorkLocate());
                historyList.addHistory(h);
                found= true;
                break;
                
            }    
        }
        if(found==false)
        {
            System.out.println("Not found worker details");
        }
            
    }
    public String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }
    public void displayAll()
    {

        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf(" %-10s %-10s %-10s %-10s %-10s %-10s\n", "Code", "Name", "Age", "Salary", "Status", "Date");

        Collections.sort(historyList.getHistoryArrayList());
        for(History h: historyList.getHistoryArrayList())
        {

            System.out.printf(" %-10s %-10s %-10s %-10s %-10s %-10s\n",h.getId(),h.getName(), h.getAge(), h.getSalary(), h.getStatus(), h.getDate()); 
        }
    }   
    
    }
