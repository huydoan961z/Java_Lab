/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revision;

/**
 *
 * @author aser
 */
public class Revision 
{
    private String id,customerID, username, password ;

    public Revision(String id, String customerID, String username, String password) {
        this.id = id;
        this.customerID = customerID;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean checkLogin(String username, String password )
    {
        if(this.username.equals(username) && this.password.equals(password))
            return true;
        else
            return false ;
    }
}
