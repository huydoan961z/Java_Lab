/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import model.Student;
import model.StudentList;

/**
 *
 * @author aser
 */
    public class ConsoleForm 
    {
        private StudentList studentlist= new StudentList();

        public ConsoleForm() {
        }

        public StudentList getStudentlist() {
            return studentlist;
        }

        public void setStudentlist(StudentList studentlist) {
            this.studentlist = studentlist;
        }


        public void addStudent() throws ParseException 
        {
            int count = 0;
            Scanner sc = new Scanner(System.in);
            if(studentlist.getStudentlist().isEmpty())
            {
                while (true) 
                {


                    System.out.println("------------Add Student---------------");
                    System.out.print("ID: ");
                    String id = sc.nextLine();
                    System.out.print("Student Name: ");
                    String name = sc.nextLine();
                    while(!checkDublicate(id, name))
                    {
                        System.out.println("This name not the same as the previous id");
                        System.out.println("Pls enter again");
                        System.out.print("Student Name: ");
                        name = sc.nextLine();
                    }

                    System.out.print("Semester: ");
                    String semester = sc.nextLine();
                    System.out.print("Course name: ");
                    String course =InputInformation.checkCourse();
                    
                    Student student = new Student(id, name, semester, course);
                    studentlist.addStudent(student);
                    count++;
                    if (count >= 3) 
                    {
                        System.out.print("Do you want to continue (Y/N)? ");
                        String ans = sc.nextLine();
                        if (!ans.equalsIgnoreCase("Y")) 
                        {
                            break;
                        }
                    }
                }
            }
            else
            {
                System.out.println("------------Add Student---------------");
                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.print("Student Name: ");
                String name = sc.nextLine();
                while(!checkDublicate(id, name))
                {
                    System.out.println("This name not the same as the previous id");
                    System.out.println("Pls enter again");
                    System.out.print("Student Name: ");
                    name = sc.nextLine();
                }

                System.out.print("Semester: ");
                String semester = sc.nextLine();
                System.out.print("Course name: ");
                String course =InputInformation.checkCourse();
                        
                    
                Student student = new Student(id, name, semester, course);
                studentlist.addStudent(student);
            }
        }
        public void displayFindAndSort() 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name that you want to find: ");
            String name = sc.nextLine();
            ArrayList<Student> sortedStudents = studentlist.findAndSort(name);

            System.out.println("------------------------------------------- Display Sorted Students ------------------------------------");
            System.out.printf("%-15s %-15s %-15s %-15s \n", "ID", "Student Name", "Semester", "Course Name");

            for(Student t: sortedStudents) 
            {
                System.out.printf("%-15s %-15s %-15s %-15s \n",t.getId(), t.getStudentName(), t.getSemester(), t.getCourseName()); 
            }
        }

        public boolean checkDublicate(String id, String name)
        {
            for(Student x: studentlist.getStudentlist())
            {
                if(x.getId().equals(id) && !x.getStudentName().equals(name))
                    return false;
            }
            return true;
        }
        public void upOrDe() 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter ID to update or delete");
            String check = sc.nextLine();
            Student toRemove = null;
            for (Student x : studentlist.getStudentlist()) {
                if (x.getId().equals(check)) {
                    System.out.println("You want to update or delete");
                    String choice = sc.nextLine();
                    if (choice.equalsIgnoreCase("update")) {
                        System.out.print("Student Name: ");
                        String name = sc.nextLine();
                        System.out.print("Semester: ");
                        String semester = sc.nextLine();
                        System.out.print("Course name: ");
                        String course = InputInformation.checkCourse();
                        x.setCourseName(course);
                        x.setSemester(semester);
                        x.setStudentName(name);
                    } else {
                        toRemove = x;
                    }
                }
            }
            if (toRemove != null) {
                studentlist.getStudentlist().remove(toRemove);
                System.out.println("remove successfully");
            } else {
                System.out.println("Fail");
            }
        }
  
        public void displayReport()
        {
            HashMap<String, Integer> courseCount= new HashMap<>();
            HashSet<String> processStudent= new HashSet<>();
            for(Student t: studentlist.getStudentlist() )
            {
                String key= t.getId()+"-"+ t.getCourseName();
                courseCount.put(key, courseCount.getOrDefault(key, 0)+1);
            }
            System.out.printf("%-15s %-15s %-15s %-15s \n", "ID", "Student Name", "Course Name", "Total");
            for(Student t: studentlist.getStudentlist())
            {
                String key= t.getId()+"-"+ t.getCourseName();
                if(!processStudent.contains(key))
                {
                    System.out.printf("%-15s|%-15s|%-15s|%-15s \n",t.getId(), t.getStudentName(), t.getCourseName(), courseCount.get(key)); 
                    processStudent.add(key);

                }           
            }
        }
    }
