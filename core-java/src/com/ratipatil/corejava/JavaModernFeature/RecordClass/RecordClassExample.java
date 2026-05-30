/*
 * ==========================================================
 * RecordClassExample.java
 * ==========================================================
 * Records were introduced in Java 16.
 *
 * A Record is a special type of class used to store
 * immutable data with less boilerplate code.
 *
 * Java automatically generates:
 * - Constructor
 * - Getters
 * - toString()
 * - equals()
 * - hashCode()
 * ==========================================================
 */

/*
 * Record Declaration
 *
 * Java automatically creates:
 * Student(String name, int age)
 * name()
 * age()
 * toString()
 * equals()
 * hashCode()
 */
record Student(String name, int age) {

    /*
     * Custom method inside record
     */
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age : " + age);
    }
}

public class RecordClassExample {

    public static void main(String[] args) {

        /*
         * Creating record object
         */
        Student student1 =
                new Student("Ratikant", 21);

        Student student2 =
                new Student("Rahul", 22);

        /*
         * Accessing values
         * Records use name() instead of getName()
         */
        System.out.println("Student 1 Details:");
        System.out.println(student1.name());
        System.out.println(student1.age());

        /*
         * Automatically generated toString()
         */
        System.out.println("\nUsing toString():");
        System.out.println(student1);

        /*
         * Calling custom method
         */
        System.out.println("\nCustom Method:");
        student1.display();

        /*
         * equals() demonstration
         */
        Student student3 =
                new Student("Ratikant", 21);

        System.out.println("\nEquals Example:");
        System.out.println(student1.equals(student3));

        /*
         * hashCode() demonstration
         */
        System.out.println("\nHashCode:");
        System.out.println(student1.hashCode());

        System.out.println("\nSecond Record:");
        System.out.println(student2);
    }
}