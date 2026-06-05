# Contact Book Application

## Overview

Contact Book Application is a console-based Java project developed using Maven. The application allows users to store and manage contact information through a simple menu-driven interface.

This project demonstrates the use of Core Java concepts, Maven project structure, Lombok dependency, collections, and object-oriented programming principles.

---

## Features

- Add Contact
- View All Contacts
- Menu Driven Interface
- Exit Application

---

## Technologies Used

- Java
- Maven
- Lombok
- IntelliJ IDEA

---

## Project Structure

```text
contact-book-app
│
├── src
│   ├── main
│   │   └── java
│   │       └── com.ratikant.contactbook
│   │           ├── Contact.java
│   │           ├── ContactService.java
│   │           └── Main.java
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## Maven Dependency Used

### Lombok

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.38</version>
</dependency>
```

Lombok reduces boilerplate code by automatically generating:

- Getters
- Setters
- Constructors
- toString()
- equals()
- hashCode()

---

## Concepts Practiced

- Classes and Objects
- Encapsulation
- ArrayList
- Loops
- Switch Case
- Methods
- Object-Oriented Programming
- Maven Build Lifecycle
- Maven Dependency Management
- Lombok

---

## Commands Used

Compile Project

```bash
mvn compile
```

Package Project

```bash
mvn package
```

Run Tests

```bash
mvn test
```

---

## Learning Outcomes

- Created a Maven project from scratch
- Configured pom.xml
- Added external dependencies using Maven
- Used Lombok annotations
- Built a menu-driven console application
- Managed contacts using collections
- Generated JAR files using Maven