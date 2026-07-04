package com.ratipatil.corejava.Serialization;

import java.io.*;

/*
 * Deserialization Example
 */



public class DeserializationExample {

    public static void main(String[] args) throws Exception {

        FileInputStream file =
                new FileInputStream("student.txt");

        ObjectInputStream in =
                new ObjectInputStream(file);

        StudentSerialization s1 = (StudentSerialization) in.readObject();

        in.close();

        System.out.println(s1.name);
    }
}
