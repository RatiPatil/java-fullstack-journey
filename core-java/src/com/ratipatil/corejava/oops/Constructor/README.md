# Constructor in Java

## Definition

A constructor is a special method used to initialize objects in Java.

Constructor is automatically called when object is created.

---

# Simple Understanding

When object is created:

```java
Student s1 = new Student();
```

Java automatically calls constructor.

---

# Important Point

## Constructor Name

Constructor name must be same as class name.

---

# Syntax

```java
class Student {

    Student() {

        // constructor code
    }
}
```

---

# Types of Constructors

| Constructor Type | Description |
|---|---|
| Default Constructor | Constructor without parameters |
| Parameterized Constructor | Constructor with parameters |

---

# 1. Default Constructor

## Definition

A constructor without parameters is called default constructor.

---

## Example

```java
Student() {

    System.out.println("Constructor Called");
}
```

---

# 2. Parameterized Constructor

## Definition

A constructor with parameters is called parameterized constructor.

---

## Example

```java
Student(String name, int age) {

    this.name = name;
    this.age = age;
}
```

---

# How Constructor Works

1. Object is created using `new`
2. Constructor automatically executes
3. Object variables get initialized

---

# Example Program

```java
class Student {

    String name;

    Student() {

        name = "Ratikant";
    }

    void display() {

        System.out.println(name);
    }
}
```

---

# Output

```text
Ratikant
```

---

# Quick Revision Points

## Constructor

- Special method
- Same name as class
- No return type
- Automatically called
- Initializes object

---

# Important Rules

| Rule | Description |
|---|---|
| Constructor name = Class name | Mandatory |
| No return type | Not even `void` |
| Called automatically | During object creation |
| Can be overloaded | Yes |

---

# Difference Between Method and Constructor

| Method | Constructor |
|---|---|
| Performs task | Initializes object |
| Has return type | No return type |
| Called manually | Called automatically |

---

# Real Life Example

| Real Life | Constructor |
|---|---|
| New mobile setup | Object initialization |
| New student admission | Initial data setup |

---

# Important Interview Points

1. Constructor initializes object.
2. Constructor has same name as class.
3. Constructor has no return type.
4. Constructor executes automatically.
5. Constructors can be overloaded.

---

# Conclusion

Constructors are used to initialize objects in Java.

They make object creation simple, organized, and efficient.