# Core Java

## Definition

Core Java is the fundamental part of Java programming language.

It contains the basic concepts required to build Java applications and serves as the foundation for Advanced Java, JDBC, Hibernate, Spring, and Spring Boot.

---

# Why Learn Core Java?

Core Java helps us:

- Understand Java fundamentals
- Build application logic
- Learn Object-Oriented Programming (OOP)
- Prepare for interviews
- Learn Spring Boot easily

---

# Core Java Topics Covered

## Basics

- Variables
- Data Types
- Literals
- Type Casting
- Type Conversion
- Type Promotion
- Operators
- Conditional Statements
- Loops
- Arrays
- Methods

---

## Object Oriented Programming (OOP)

- Class and Object
- Constructor
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Interface

---

## Important Java Concepts

- this Keyword
- super Keyword
- Static Variable
- Static Method
- Static Block
- Anonymous Object
- Access Modifiers
- Packages

---

## Java Internals

- JVM
- JRE
- JDK
- Stack Memory
- Heap Memory

---

## Advanced OOP

- Method Overloading
- Method Overriding
- Dynamic Method Dispatch
- Upcasting
- Downcasting
- Wrapper Classes
- Autoboxing
- Unboxing
- final Keyword
- equals() Method

---

## Java Features

- Abstract Class
- Interface
- Functional Interface (SAM)
- Lambda Expression
- Enum
- Annotation

---

## Exception Handling

- try
- catch
- finally
- throw
- throws
- Custom Exception
- Try-With-Resources

---

## File Handling

- Serialization
- Deserialization

---

## Multithreading

- Thread
- Multiple Threads
- Runnable Interface
- Thread Priority
- Thread Sleep
- Race Condition
- Thread States

---

## Collections Framework

- Collection API
- ArrayList
- Set
- Map
- Comparable
- Comparator

---

# Java Editions

| Edition | Purpose |
|----------|----------|
| Java SE | Desktop Applications |
| Java EE / Jakarta EE | Enterprise Applications |
| Java ME | Mobile & Embedded Devices |

---

# Java Features

## Platform Independent

```text
Write Once Run Anywhere (WORA)
```

Java code runs on any operating system that has JVM.

---

## Object Oriented

Everything revolves around classes and objects.

---

## Simple

Easy syntax and automatic memory management.

---

## Secure

Java does not allow direct memory access.

---

## Robust

Strong exception handling and memory management.

---

## Multithreaded

Supports multiple tasks simultaneously.

---

## High Performance

JIT Compiler improves execution speed.

---

# Java Architecture

```text
Java Source Code
        |
        v
     Compiler
        |
        v
     Bytecode
        |
        v
       JVM
        |
        v
 Operating System
```

---

# JDK vs JRE vs JVM

| Component | Purpose |
|------------|----------|
| JDK | Development Kit |
| JRE | Runtime Environment |
| JVM | Executes Bytecode |

---

# Memory Areas

## Stack Memory

Stores:

- Local Variables
- Method Calls

Example:

```java
int age = 21;
```

---

## Heap Memory

Stores:

- Objects
- Instance Variables

Example:

```java
Student s1 = new Student();
```

---

# OOP Pillars

## Encapsulation

Binding data and methods together.

Example:

```java
private String name;
```

---

## Inheritance

Acquiring properties from parent class.

Example:

```java
class Child extends Parent
```

---

## Polymorphism

One action, many forms.

Example:

```java
animal.sound();
```

---

## Abstraction

Hiding implementation details.

Example:

```java
abstract class Vehicle
```

---

# Collections Overview

```text
Collection
│
├── List
│    └── ArrayList
│
├── Set
│    └── HashSet
│
└── Queue
```

Map is separate:

```text
Map
└── HashMap
```

---

# Multithreading Overview

```text
NEW
 ↓
RUNNABLE
 ↓
RUNNING
 ↓
WAITING
 ↓
TERMINATED
```

---

# Exception Handling Overview

```java
try {

}
catch(Exception e) {

}
finally {

}
```

Purpose:

- Prevent program crash
- Handle runtime errors

---

# Functional Interface

Contains only one abstract method.

Example:

```java
@FunctionalInterface
interface Demo {

    void show();
}
```

---

# Lambda Expression

Short form of functional interface implementation.

Example:

```java
Demo d = () -> {

    System.out.println("Hello");
};
```

---

# Quick Revision

## Core Java Roadmap

```text
Variables
↓
Data Types
↓
Operators
↓
Conditions
↓
Loops
↓
Arrays
↓
Methods
↓
OOP
↓
Exception Handling
↓
Collections
↓
Multithreading
↓
Java 8 Features
```

---

# Important Interview Questions

### What is Java?

Java is an object-oriented, platform-independent programming language.

---

### Why Java is Platform Independent?

Because of JVM.

---

### Difference Between JDK, JRE and JVM?

JDK → Development

JRE → Runtime

JVM → Execution

---

### What are OOP Principles?

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

### Difference Between ArrayList and HashSet?

ArrayList:
- Ordered
- Duplicates Allowed

HashSet:
- Unordered
- Duplicates Not Allowed

---

### Difference Between Thread and Runnable?

Runnable is interface-based and more flexible.

---

# Core Java Completion Summary

After learning Core Java, you should understand:

✅ Java Basics

✅ OOP Concepts

✅ Exception Handling

✅ Collections Framework

✅ Multithreading

✅ Java 8 Features

✅ JVM Architecture

✅ Memory Management

These concepts form the foundation for:

- JDBC
- Servlets
- Hibernate
- Spring Framework
- Spring Boot
- Microservices

---

# Conclusion

Core Java is the foundation of the Java ecosystem. A strong understanding of Core Java makes learning Spring Boot, Microservices, and Enterprise Application Development much easier.