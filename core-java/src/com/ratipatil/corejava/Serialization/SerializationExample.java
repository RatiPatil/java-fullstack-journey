package com.ratipatil.corejava.Serialization;

import java.io.*;

/*
 * Serialization Example
 */

class Student implements Serializable {

    String name = "Ratikant";
}

public class SerializationExample {

    public static void main(String[] args) throws Exception {

        Student s1 = new Student();

        FileOutputStream file =
                new FileOutputStream("student.txt");

        ObjectOutputStream out =
                new ObjectOutputStream(file);

        out.writeObject(s1);

        out.close();

        System.out.println("Object Serialized");
    }
}