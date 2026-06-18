package module6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        // Create ArrayList to hold 10 students
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 Student objects with varied data that is not in order by name or rollno
        students.add(new Student(108, "Eric", "123 Main St"));
        students.add(new Student(103, "Ryan", "456 Oak Ln"));
        students.add(new Student(102, "Sam", "826 Uravan St"));
        students.add(new Student(122, "Olga", "364 Peoria Ave"));
        students.add(new Student(142, "Irina", "9569 Tower Rd"));
        students.add(new Student(101, "Noah", "2483 Arapahoe Rd"));
        students.add(new Student(120, "Ana", "8445 Hampden Ave"));
        students.add(new Student(111, "Ben", "2336 Chambers St"));
        students.add(new Student(118, "Justin", "275 Duval St"));
        students.add(new Student(105, "Denny", "35 Ocean Ave"));

        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by Roll Number using Selection Sort
        SelectionSort.sort(students, new SortByRoll());
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by Name using Selection Sort
        SelectionSort.sort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}