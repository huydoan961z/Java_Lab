/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aser
 */
public class Experience extends Candidate
{
    private int ExplnYear;
    private String ProSkill;

    public Experience(String id, String firstname, String lastname, String address, String phone, String email, int birth, int type) {
    }

    public Experience(int ExplnYear, String ProSkill) {
        this.ExplnYear = ExplnYear;
        this.ProSkill = ProSkill;
    }

    public Experience(int ExplnYear, String ProSkill, String id, String firstName, String lastName, String address, String phone, String email, int birthDate, int typeCandidate) {
        super(id, firstName, lastName, address, phone, email, birthDate, typeCandidate);
        this.ExplnYear = ExplnYear;
        this.ProSkill = ProSkill;
    }

    public int getExplnYear() {
        return ExplnYear;
    }

    public void setExplnYear(int ExplnYear) {
        this.ExplnYear = ExplnYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
    
}
