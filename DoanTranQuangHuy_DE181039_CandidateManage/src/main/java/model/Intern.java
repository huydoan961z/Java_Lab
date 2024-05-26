/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aser
 */
public class Intern extends Candidate
{
    private String majors, semes, uniName;

    public Intern(String id, String firstname, String lastname, String address, String phone, String email, int birth, int type) {
    }

    public Intern(String majors, String semes, String uniName) {
        this.majors = majors;
        this.semes = semes;
        this.uniName = uniName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemes() {
        return semes;
    }

    public void setSemes(String semes) {
        this.semes = semes;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }
    
    
}
