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
public class WorkerList {
    private ArrayList<Worker> workerArrayList= new ArrayList<>();

    public ArrayList<Worker> getWorkerArrayList() {
        return workerArrayList;
    }

    public void setWorkerArrayList(ArrayList<Worker> workerArrayList) {
        this.workerArrayList = workerArrayList;
    }

    public WorkerList() {
    }
    
    public  void adWorker(Worker worker)
    {
        workerArrayList.add(worker);
    }
    
}
