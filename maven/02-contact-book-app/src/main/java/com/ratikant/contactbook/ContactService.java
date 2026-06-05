package com.ratikant.contactbook;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added Successfully!");
    }

    public void viewContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No Contacts Found!");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}