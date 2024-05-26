/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aser
 */
public class Fresher extends Candidate
{
    private int graDate;
    private String graRank, uniEdu;

    public Fresher(String id, String firstname, String lastname, String address, String phone, String email, int birth, int type) {
    }

    public Fresher(int graDate, String graRank, String uniEdu) {
        this.graDate = graDate;
        this.graRank = graRank;
        this.uniEdu = uniEdu;
    }

    public Fresher(int graDate, String graRank, String uniEdu, String id, String firstName, String lastName, String address, String phone, String email, int birthDate, int typeCandidate) {
        super(id, firstName, lastName, address, phone, email, birthDate, typeCandidate);
        this.graDate = graDate;
        this.graRank = graRank;
        this.uniEdu = uniEdu;
    }

    public int getGraDate() {
        return graDate;
    }

    public void setGraDate(int graDate) {
        this.graDate = graDate;
    }

    public String getGraRank() {
        return graRank;
    }

    public void setGraRank(String graRank) {
        this.graRank = graRank;
    }

    public String getUniEdu() {
        return uniEdu;
    }

    public void setUniEdu(String uniEdu) {
        this.uniEdu = uniEdu;
    }
    
    
}
