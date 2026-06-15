package module6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        // Create ArrayList to hold 10 students
        ArrayList<Student> students = new ArrayList<>();

        // TODO: Add 10 Student objects with varied data
        // Example:
        // students.add(new Student(105, "Alice", "123 Main St"));
        // students.add(new Student(102, "Bob", "456 Oak Ave"));
        // ... add 8 more

        System.out.println("Original List:");
        printStudents(students);

        // Sort by Roll Number using Selection Sort
        SelectionSort.sort(students, new SortByRoll());
        System.out.println("\nSorted by Roll Number:");
        printStudents(students);

        // Sort by Name using Selection Sort
        SelectionSort.sort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        printStudents(students);
    }

    // Helper method to print the list
    private static void printStudents(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}