/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author aser
 */
public class FoodList  
{
    private ArrayList<Food> foodArrayList= new ArrayList<>();
    private Hashtable<String, ArrayList<Food>> hashTable = new Hashtable<>();

    


    public FoodList() {
    }
    
    public ArrayList<Food> getFoodArrayList() {
        return foodArrayList;
    }

    public void setFoodArrayList(ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }
    
    public void addFood(Food food)
    {
        foodArrayList.add(food);
    }
    public Hashtable<String, ArrayList<Food>> getHashTable() {
        return hashTable;
    }

    public void setHashTable(Hashtable<String, ArrayList<Food>> hashTable) {
        this.hashTable = hashTable;
    }
}
