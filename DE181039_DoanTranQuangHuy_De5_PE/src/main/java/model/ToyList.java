/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author aser
 */
public class ToyList {

    public final ArrayList<Toy> toyArrayList= new ArrayList<>();

    public ToyList() {
    }

    public ArrayList<Toy> getToyArrayList() {
        return toyArrayList;
    }
    public void addToy(Toy t)
    {
        toyArrayList.add(t);
    }
}
