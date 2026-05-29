# Abstract Keyword in Java

## Definition

The `abstract` keyword is used to create:
- Abstract classes
- Abstract methods

It is used when we want to define **rule but not full implementation**.

---

# 1. Abstract Class

## Definition

An abstract class:
- Cannot create object
- Can have abstract and normal methods

---

## Example

```java
abstract class Animal {

    void eat() {

        System.out.println("Animal is eating");
    }

    abstract void sound();
}
```

---

# 2. Abstract Method

## Definition

An abstract method:
- Has no body
- Must be implemented in child class

---

## Syntax

```java
abstract void sound();
```

---

# Child Class Example

```java
class Dog extends Animal {

    void sound() {

        System.out.println("Dog barks");
    }
}
```

---

# Main Class

```java
public class Demo {

    public static void main(String[] args) {

        Animal obj = new Dog();

        obj.eat();

        obj.sound();
    }
}
```

---

# Output

```text
Animal is eating
Dog barks
```

---

# Simple Understanding

```text
Abstract class = incomplete class
Abstract method = method without body
```

---

# Why Abstract Class?

- To achieve partial abstraction
- To force child class implementation
- To provide common structure

---

# Quick Revision Points

## Abstract Class

- Cannot create object
- Can have normal + abstract methods
- Used in inheritance

---

## Abstract Method

- No body
- Must be overridden
- Used for rule creation

---

# Real Life Example

| Concept | Real Life |
|---|---|
| Abstract Class | Blueprint of building |
| Abstract Method | Design rule |
| Child Class | Actual building |

---

# Important Interview Points

1. Abstract class cannot be instantiated.
2. Abstract method has no body.
3. Child class must implement abstract methods.
4. Used for partial abstraction.
5. Supports inheritance.

---

# Conclusion

Abstract keyword is used to define incomplete classes and methods that must be completed by child classes.