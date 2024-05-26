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
public class DocterList 
{
    private ArrayList<Docter> docterArrayList= new ArrayList<>();

    public DocterList() {
    }

    public ArrayList<Docter> getDocterArrayList() {
        return docterArrayList;
    }

    public void setContactArrayList(ArrayList<Docter> docterArrayList) {
        this.docterArrayList = docterArrayList;
    }
    public void addDocter(Docter docter)
    {
        docterArrayList.add(docter);
    }
    public boolean delectDocter(Docter docter)
    {
    return docterArrayList.remove(docter);
    }

}
