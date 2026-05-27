# Class and Object in Java

## Class

### Definition

A class is a blueprint or template used to create objects.

It contains:
- Variables
- Methods
- Constructors

---

## Syntax

```java
class ClassName {

    // variables

    // methods
}
```

---

## Example

```java
class Student {

    String name;
    int age;
}
```

---

# Object

## Definition

An object is a real-world entity created from a class.

Objects are used to access variables and methods of a class.

---

## Syntax

```java
ClassName objectName = new ClassName();
```

---

## Example

```java
Student student1 = new Student();
```

---

# How Class and Object Work

1. Class acts as blueprint.
2. Object is created using `new` keyword.
3. Memory for object is allocated in heap memory.
4. Object accesses class variables and methods.
5. Multiple objects can be created from one class.

---

# Example Program

```java
public class Student {

    String name = "Ratikant";

    void display() {

        System.out.println(name);
    }

    public static void main(String[] args) {

        Student obj = new Student();

        obj.display();
    }
}
```

---

# Output

```text
Ratikant
```

---

# Important Points

1. Class is a blueprint of object.
2. Object is an instance of class.
3. `new` keyword creates object.
4. Objects use dot (`.`) operator to access members.
5. One class can create many objects.

---

# Real Life Example

| Class | Object |
|---|---|
| Car | BMW |
| Student | Ratikant |
| Mobile | Samsung |
| Animal | Dog |

---

# Difference Between Class and Object

| Class | Object |
|---|---|
| Blueprint | Real entity |
| Logical | Physical |
| No memory allocated | Memory allocated |
| Defines properties | Uses properties |

---

# Conclusion

Class and Object are the foundation of Object-Oriented Programming in Java.

Classes define structure and objects use that structure to perform actions.