package task4.fourthQ;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    // HashMap to store student names and their corresponding grades
    private HashMap<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGrades() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student and their grade
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Added student: " + name + " with grade: " + grade);
    }

    // Method to remove a student by name
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Removed student: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Student: " + name + " has grade: " + grade);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public static void main(String[] args) {
        // Create an instance of StudentGrades
        StudentGrades sg = new StudentGrades();
        
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Adding sample students
        sg.addStudent("Narendra", 85);
        sg.addStudent("Bob", 90);
        sg.addStudent("Charlie", 78);

        // Displaying grades of sample students
        sg.displayGrade("Narendra");
        sg.displayGrade("Bob");
        sg.displayGrade("Charlie");

        // Removing a student
        sg.removeStudent("Bob");

        // Trying to display grade of removed student 
        sg.displayGrade("Bob");
        
        // Closing the scanner
        scanner.close();
    }
}