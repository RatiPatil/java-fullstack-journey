import java.util.*;

/*
 * This class demonstrates Comparator in Java
 * Comparator is used for CUSTOM sorting logic
 * It allows multiple sorting ways without modifying the original class
 */

/*
 * Student class (no Comparable implemented here)
 * We will use external Comparator classes for sorting
 */
class Student {

    int id;
    String name;

    /*
     * Constructor to initialize Student object
     */
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
     * toString() method to print object in readable format
     */
    @Override
    public String toString() {
        return id + " " + name;
    }
}

/*
 * Comparator 1: Sort by ID (Ascending order)
 */
class SortById implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}

/*
 * Comparator 2: Sort by Name (Alphabetical order)
 */
class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

/*
 * Main class to test Comparator examples
 */
public class ComparatorExample {

    public static void main(String[] args) {

        // Creating list of students
        List<Student> students = new ArrayList<>();

        students.add(new Student(3, "Rahul"));
        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "Zoya"));
        students.add(new Student(5, "Vikas"));
        students.add(new Student(4, "Neha"));

        /*
         * Original list
         */
        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        /*
         * Sorting by ID using Comparator
         */
        Collections.sort(students, new SortById());

        System.out.println("\nSorted by ID:");
        for (Student s : students) {
            System.out.println(s);
        }

        /*
         * Sorting by Name using Comparator
         */
        Collections.sort(students, new SortByName());

        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        /*
         * Lambda expression version (modern Java way)
         * Sorting by ID descending
         */
        students.sort((s1, s2) -> s2.id - s1.id);

        System.out.println("\nSorted by ID (Descending - Lambda):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}