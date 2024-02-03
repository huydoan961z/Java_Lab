/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Contact;
import model.ContactList;

/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private ContactList contactList= new ContactList();

    public ConsoleForm() {
    }

    public ContactList getContactList() {
        return contactList;
    }

    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }
    
    public void addContactView()
    {
        System.out.println("-------- Add a Contact --------");
        System.out.print("Enter First Name: ");
        String firstName= InputInformation.inputString();
        System.out.print("Enter Last Name: ");
        String lastName= InputInformation.inputString();
        String fullname=firstName+ lastName;
        System.out.print("Enter Group: ");
        String group= InputInformation.inputString(); 
        System.out.print("Enter Address: ");
        String address= InputInformation.inputString();
        System.out.print("Enter Phone: ");
        String phoneNumber= InputInformation.inputPhoneNumber();
        
        //xu li input chuoi ko rong o inputinfomation
        
        
        //khoi tao doi tuong
        Contact contact= new Contact();
        if(contactList.getContactArrayList().isEmpty())
        {
            contact.setId(1);
        }
        else
        {
            int temp=contactList.getContactArrayList().get(contactList.getContactArrayList().size()-1).getId();
            contact.setId(temp+1);
        }
        contact.setAddress(address);
        contact.setFirstName(firstName);
        contact.setGroup(group);
       
        contact.setLastName(lastName);
        contact.setPhone(phoneNumber);
        contact.setFullName(fullname);
        
        
        //ad vaof list
        contactList.addContact(contact);
        System.out.println("Successful");
    }
    
        public void displayAll()
        {
            
            System.out.println("------------------------------------------- Display all Contact ------------------------------------");
            System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s\n", "ID", "Full Name", "Last Name", "First Name", "Group", "Address", "Phone");

            
            for(Contact contact: contactList.getContactArrayList())
            {
                //in gia tri ra day, contact.getid....
                System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s\n",contact.getId(),contact.getFullName(), contact.getFirstName(), contact.getLastName(), contact.getGroup(), contact.getAddress(), contact.getPhone()); 
            }
        }
        public void remove() 
        {
            System.out.println("Enter ID");
            int id = InputInformation.inputInt();
            Contact needRemove = null;
            for(Contact contact : contactList.getContactArrayList()) {
                if(contact.getId() == id) 
                {
                    needRemove = contact;
                    break;
                }
            }
            if(needRemove != null) 
            {
                contactList.delectContact(id);
            } else 
                System.out.println("Contact not found");
        }
    }
