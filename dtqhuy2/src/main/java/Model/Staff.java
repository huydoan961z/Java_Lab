/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aser
 */
public class Staff 
{
    private String staffID,fullName, department, password, DoB;

    public Staff(String staffID, String fullName, String department, String password, String DoB) {
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

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String DoB) {
        this.DoB = DoB;
    }
    public String toString()
    {
        return "Staff List{" + this.staffID + " : " + this.fullName + " : " +  this.password + " : " + this.department + " :" + this.DoB + "}" ;
    }
}
