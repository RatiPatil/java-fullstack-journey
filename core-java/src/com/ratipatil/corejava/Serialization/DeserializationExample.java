package com.ratipatil.corejava.Serialization;

import java.io.*;

/*
 * Deserialization Example
 */

class Student implements Serializable {

    String name = "Ratikant";
}

public class DeserializationExample {

    public static void main(String[] args) throws Exception {

        FileInputStream file =
                new FileInputStream("student.txt");

        ObjectInputStream in =
                new ObjectInputStream(file);

        Student s1 = (Student) in.readObject();

        in.close();

        System.out.println(s1.name);
    }
}