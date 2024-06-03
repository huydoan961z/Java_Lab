

package com.mycompany.studentgrader;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
public class StudentGrader {

    
    public static void initializeArrays(String[] names, double[] grades) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt(); // The number of students
        // Resize the arrays to match the number of students
        names = Arrays.copyOf(names, n);
        grades = Arrays.copyOf(grades, n);
        // Input the names of the students
        System.out.println("Enter the names of the students:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        // Randomly initialize the grades of the students
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            grades[i] = 1 + rand.nextDouble() * 9; // A random value between 1 and 10
        }
    }

    // A function to export 2 arrays of students' names and grades
    public static void exportArrays(String[] names, double[] grades) {
        System.out.println("The names and grades of the students are:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + grades[i]);
        }
    }

    // A function to classify the students by their academic ability
    public static void classifyStudents(double[] grades) {
        System.out.println("The academic ability of the students are:");
        for (int i = 0; i < grades.length; i++) {
            String ability = ""; // The ability of the student
            if (grades[i] < 5) {
                ability = "Weak";
            } else if (grades[i] >= 5 && grades[i] < 6.5) {
                ability = "Average";
            } else if (grades[i] >= 6.5 && grades[i] < 7.5) {
                ability = "Good";
            } else if (grades[i] >= 7.5 && grades[i] < 9) {
                ability = "Excellent";
            } else if (grades[i] >= 9) {
                ability = "Outstanding";
            }
            System.out.println(grades[i] + ": " + ability);
        }
    }

    // A function to sort the list of students in descending order by grade
    public static void sortStudents(String[] names, double[] grades) {
        // Create an array of Student objects
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], grades[i]);
        }
        // Sort the array using a custom comparator that compares the grades in descending order
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGrade(), s1.getGrade());
            }
        });
        // Update the original arrays with the sorted values
        for (int i = 0; i < names.length; i++) {
            names[i] = students[i].getName();
            grades[i] = students[i].getGrade();
        }
    }

    // A function to print out the information of the student with the highest grade
    public static void printHighestStudent(String[] names, double[] grades) {
        System.out.println("The student with the highest grade is:");
        System.out.println(names[0] + ": " + grades[0]); // The first element in the sorted arrays
    }

    // A function to calculate the average grade of the students
    public static double calculateAverage(double[] grades) {
        double sum = 0; // The sum of the grades
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = sum / grades.length; // The average of the grades
        return average;
    }

    // A function to normalize the names of the students with the first letter in uppercase
    public static void normalizeNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String name = names[i]; // The original name
            name = name.toLowerCase(); // Convert to lowercase
            name = name.substring(0, 1).toUpperCase() + name.substring(1); // Capitalize the first letter
            names[i] = name; // Update the array with the normalized name
        }
    }

    public static void main(String[] args) {
        // Declare 2 arrays of students' names and grades
        String[] names = new String[0];
        double[] grades = new double[0];
        // Initialize the arrays
        initializeArrays(names, grades);
        // Export the arrays
        exportArrays(names, grades);
        // Classify the students by their academic ability
        classifyStudents(grades);
        // Sort the students in descending order by grade
        sortStudents(names, grades);
        // Print the student with the highest grade
        printHighestStudent(names, grades);
        // Calculate the average grade of the students
        double average = calculateAverage(grades);
        System.out.println("The average grade of the students is: " + average);
        // Normalize the names of the students
        normalizeNames(names);
        System.out.println("The normalized names of the students are: " + Arrays.toString(names));
    }
}

// A class to represent a student with a name and a grade
class Student {
    private String name; // The name of the student
    private double grade; // The grade of the student

    // A constructor to initialize the name and grade of the student
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    // A getter method to return the name of the student
    public String getName() {
        return name;
    }

    // A getter method to return the grade of the student
    public double getGrade() {
        return grade;
    }
}