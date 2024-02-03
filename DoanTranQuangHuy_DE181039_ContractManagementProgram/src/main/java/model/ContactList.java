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
public class ContactList 
{
    private ArrayList<Contact> contactArrayList= new ArrayList<>();

    public ContactList() {
    }

    public ArrayList<Contact> getContactArrayList() {
        return contactArrayList;
    }

    public void setContactArrayList(ArrayList<Contact> contactArrayList) {
        this.contactArrayList = contactArrayList;
    }
    public void addContact(Contact contact)
    {
        contactArrayList.add(contact);
    }
    public boolean delectContact(int id)
    {
//         contactArrayList.remove(id);
//         return true;
        
        for(Contact contact: contactArrayList)
        {
            if(contact.getId() == id)
            {
                contactArrayList.remove(contact);
                return true;
            }
        }
        return false;   
    }   
//    public boolean delectContactx(Contact needRemove )
//    {
//        return contactArrayList.remove(needRemove);
//    }
}

