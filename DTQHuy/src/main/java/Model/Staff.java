/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aser
 */
public class Staff 
{
    private String staffID,fullName, department, password;
    private Date DoB;

    public Staff(String staffID, String fullName, String department, String password, Date DoB) {
        this.staffID = staffID;
        this.fullName = fullName;
        this.department = department;
        this.password = password;
        this.DoB = DoB;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDoB() {
        return DoB;
    }
    
    public void setDoB(Date DoB) {
        this.DoB = DoB;
    }
    public void changePassword()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter old pass");
        String oldpass= sc.nextLine();
        if(oldpass.equals(this.password))
        {
            System.out.println("enter new pass");
            String newpass= sc.nextLine();
            
        }
    }
    public String toString()
    {
        return "Staff List{" + this.staffID + " : " + this.fullName + " : " +  this.password + " : " + this.department + " :" + this.DoB + "}" ;
    }
}
