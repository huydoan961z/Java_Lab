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
    private ArrayList<Docter> docter= new ArrayList<>();

    public DocterList() {
    }

    public ArrayList<Docter> getDocter() {
        return docter;
    }

    public void setDocter(ArrayList<Docter> docter) {
        this.docter = docter;
    }
    public void addDocter(Docter doc)
    {
        docter.add(doc);
    }
    public void deleteDocter(int id)
    {
        for(Docter x:docter)
        {
            if(x.getCode().equals(id))
            {
                docter.remove(x);
            }
        }
    }
}
