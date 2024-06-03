/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shoppingcart;



/**
 *
 * @author aser
 */
public class ShoppingCart 
{
    private Item head;
    private Item tail;
    private int length;
    
    private class Item
    {
        private String name;
        private int quantity;
        private Item next;
        private Item previous;
        public Item(String name, int quantity)
        {
            this.name= name;
            this.quantity= quantity;
        }
        
    }
    public ShoppingCart()
    {
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    
    public void addItem(String name, int quantity)
    {
        //create the value of new node
        Item newItem = new Item(name, quantity);
        if(head==null)
            head=tail= newItem;
        else
        {
            tail.next= newItem;
            //newItem= tail.next;
            newItem.previous=tail;
        }
        tail= newItem;
        length++;
    }
    //remove the stuff
    public void removeItem(String name) {
        Item current = head;

        while(current != null) {
            if(current.name.equals(name)) {
                if(current == head) {
                    head = current.next;
                    if(head != null) head.previous = null;
                } else if(current == tail) {
                    tail = current.previous;
                    tail.next = null;
                } else {
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                }
                return;
            }
            current = current.next;
        }
    }
    public void adjustQuantity(String name, int quantity)
    {
        Item current= head;
        boolean found = false; //check item available or not
        while(current!=null)
        {
            if(current.name.equals(name))
            {
                //update the quantity 
                current.quantity=quantity;
                found = true; 
                break; 
            }
            else{
               current=current.next; 
            }
        }  
        if(!found) //not found item
        {
            System.out.println("Item " + name + " not available"); // in ra thông báo
        }  
    }

    public void displayCart()
    {
        Item newItem= head;
        if(newItem==head)
        {
            System.out.println("not available in cart");
            
        }
        while(newItem!=null)
        {
            System.out.println("Qua: " + newItem.name + " " + "sl: " + newItem.quantity);
            newItem=newItem.next;
        }
    }  
}

