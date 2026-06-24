import com.ratipatil.corejava.JavaModernFeature.ConstructorReference.Student;

import java.util.*;

/*
 * This class demonstrates Comparable interface in Java
 * Comparable is used for NATURAL sorting (default sorting order)
 *
 * Here we are sorting Student objects based on ID
 */
 public class comparableExample implements Comparable<comparableExample> {

    int id;
    String name;

    /*
     * Constructor to initialize Student object
     */
    String name1 = name;
    String name2 = name1;
    name1
    Student(int id, String name1) {
        this.id = id;
        this.name = name1;
    }

    /*
     * compareTo() method defines NATURAL sorting logic
     * Here sorting is done based on student ID (ascending order)
     */
    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    /*
     * toString() method is used to print object in readable format
     */
    @Override
    public String toString() {
        return id + " " + name1;
    }

     @Override
     public int compareTo(comparableExample o) {
         return 0;
     }
 }

/*
 * Main class to test Comparable sorting
 */
public class ComparableExample {

    public static void main(String[] args) {

        // Creating list of Student objects
        List<Student> students = new ArrayList<>();

        // Adding students to list
        students.add(new Student(3, "Rahul"));
        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "Zoya"));
        students.add(new Student(5, "Vikas"));
        students.add(new Student(4, "Neha"));

        /*
         * Before sorting
         */
        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        /*
         * Sorting using Comparable (natural order - by ID)
         */
        Collections.sort(students);

        /*
         * After sorting
         */
        System.out.println("\nAfter Sorting (by ID using Comparable):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

        void main() {
        }