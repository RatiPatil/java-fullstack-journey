package com.ratikant.contactbook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContactService contactService = new ContactService();

        while (true) {

            System.out.println("\n===== Contact Book =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Contact ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Contact contact =
                            new Contact(id, name, phone, email);

                    contactService.addContact(contact);

                    break;

                case 2:

                    contactService.viewContacts();

                    break;

                case 3:

                    System.out.println("Thank You For Using Contact Book!");
                    scanner.close();
                    return;

                default:

                    System.out.println("Invalid Choice!");

            }
        }
    }
}