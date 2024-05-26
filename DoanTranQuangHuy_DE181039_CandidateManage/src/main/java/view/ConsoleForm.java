/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.text.ParseException;

import java.util.Scanner;
import model.*;


/**
 *
 * @author aser
 */
public class ConsoleForm 
{
    private final CandidateList candidateList = new CandidateList();

    public ConsoleForm() {
    }

    public CandidateList getCandidateList() {
        return candidateList;
    }

    
    public void addCandidate() throws ParseException
    {
        
        Scanner sc= new Scanner(System.in);
        String ques= "Y";
        while(ques.equals("Y"))
        {
            
        
        System.out.println("Enter id");
        String id= sc.nextLine();
        System.out.println("Enter firstname");
        String firstname= sc.nextLine();
        System.out.println("Enter lastname");
        String lastname= sc.nextLine();
        System.out.println("Enter address");
        String address= sc.nextLine();
        System.out.println("Enter email");
        String email= Validation.checkInputEmail();
        System.out.println("Enter phone");
        String phone= Validation.checkInputPhone();
        
        System.out.println("Birthday");
        int birth= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter type of candidate");
        int type= sc.nextInt();
        sc.nextLine();
        Candidate candidate= new Candidate(id, firstname, lastname, address, phone, email, birth, type);
        
        switch (type) 
        {
            case 0:
                Experience experience = new Experience(id, firstname, lastname, address, phone, email, birth, type);
                experience = addExperience(experience);
                candidateList.add(experience);
                break;
            case 1:
                Fresher fresher = new Fresher(id, firstname, lastname, address, phone, email, birth, type);
                fresher = addFresher(fresher);
                candidateList.add(fresher);
                break;
            case 2:
                Intern intern = new Intern(id, firstname, lastname, address, phone, email, birth, type);
                intern = addIntern(intern);
                candidateList.add(intern);
                break;
        }
            System.out.println("Do you want to continue (Y/N)");
            ques=sc.nextLine();
        }
        
    }
    public Experience addExperience(Experience experience) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ex year");
        int year= Validation.checkInputExprience(experience.getBirthDate());
        sc.nextLine();  
        System.out.println("Enter pro skill");
        String skill= sc.nextLine();
        experience.setExplnYear(year);
        experience.setProSkill(skill);
        return experience;
    }

    public Intern addIntern(Intern intern) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter major");
        String major= sc.nextLine();
        System.out.println("Enter semester");
        String semester= sc.nextLine();
        System.out.println("Enter name of education");
        String name= sc.nextLine();
        intern.setMajors(major);
        intern.setSemes(semester);
        intern.setUniName(name);
        return intern;
    }

    public Fresher addFresher(Fresher fresher) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter graduation year");
        int year= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter rank of education");
        String rank= Validation.checkInputGraduationRank();
        System.out.println("Enter name of education");
        String name= sc.nextLine();
        fresher.setGraDate(year);
        fresher.setGraRank(rank);
        fresher.setUniEdu(name);
        return fresher;
    }
    public  void printListNameCandidate() {
            System.out.println("List of candidate:");
            System.out.println("===========EXPERIENCE CANDIDATE============");
            for (Candidate candidate : candidateList.getCandidateList()) {
                if (candidate instanceof Experience) {
                    System.out.println(candidate.getFirstName() + " "
                            + candidate.getLastName());
                }
            }
            System.out.println("==========FRESHER CANDIDATE==============");
            for (Candidate candidate : candidateList.getCandidateList()) {
                if (candidate instanceof Fresher) {
                    System.out.println(candidate.getFirstName() + " "
                            + candidate.getLastName());
                }
            }
            System.out.println("===========INTERN CANDIDATE==============");
            for (Candidate candidate : candidateList.getCandidateList()) {
                if (candidate instanceof Intern) {
                    System.out.println(candidate.getFirstName() + " "
                            + candidate.getLastName());
                }
            }
        }

}

