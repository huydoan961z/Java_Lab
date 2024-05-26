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
public class CandidateList 
{
    private ArrayList<Candidate> candidatearrList= new ArrayList<>();

    public CandidateList() {
    }

    public ArrayList<Candidate> getCandidateList() {
        return candidatearrList;
    }

    public void setCandidateList(ArrayList<Candidate> candidateList) {
        this.candidatearrList = candidateList;
    }
    public void add(Candidate candidate)
    {
        candidatearrList.add(candidate);
        
    }
    
    
}
