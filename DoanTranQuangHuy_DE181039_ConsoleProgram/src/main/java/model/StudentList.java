/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
    private final ArrayList<Student> studentlist = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudentlist() {
        return studentlist;
    }

    public void addStudent(Student student) {
        studentlist.add(student);
    }

    public ArrayList<Student> findAndSort(String name) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student x : studentlist) {
            if (x.getStudentName().contains(name)) {
                result.add(x);
            }
        }
        Collections.sort(result, Comparator.comparing(Student::getStudentName));
        return result;
    }
    public boolean deleteTask(String id)
    {
        for(Student x: studentlist)
        {
            if(x.getId().equals(id))
            {
                studentlist.remove(x);
                return true;
            } 
        }
        return false;
    }
}
