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
public class History extends Worker implements Comparable<Worker>
{
    private String status, date;
    private int newSalary;
    
    public ArrayList<History> historyArrayList= new ArrayList<>();

    public History() {
    }

    public ArrayList<History> getHistoryArrayList() {
        return historyArrayList;
    }

    public void setHistoryArrayList(ArrayList<History> historyArrayList) {
        this.historyArrayList = historyArrayList;
    }
    
    
    public History(String status, String date, int newSalary) {
        this.status = status;
        this.date = date;
        this.newSalary = newSalary;
    }
    
    
    public History(String status, String date, int newSalary, String id, String name, int age, int salary, String workLocate) {
        super(id, name, age, salary, workLocate);
        this.status = status;
        this.date = date;
        this.newSalary = newSalary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(int newSalary) {
        this.newSalary = newSalary;
    }
    
    public void addHistory(History h)
    {
        historyArrayList.add(h);
    } 

    @Override
    public int compareTo(Worker o) {
        return this.getId().compareTo(o.getId());
    }
}
