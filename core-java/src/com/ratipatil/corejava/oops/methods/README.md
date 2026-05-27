# Methods in Java

## Definition

A method in Java is a block of code used to perform a specific task.

Methods improve:
- Code reusability
- Readability
- Program organization

---

# Simple Syntax

```java
returnType methodName() {

    // code
}
```

---

# Example

```java
void display() {

    System.out.println("Hello Java");
}
```

---

# Types of Methods in Java

| Method Type | Purpose |
|---|---|
| Method without parameters | Performs simple task |
| Method with parameters | Accepts values |
| Method with return type | Returns value |
| Static method | Called without object |

---

# 1. Method Without Parameters

## Definition

This method does not accept any values.

---

## Example

```java
void display() {

    System.out.println("Welcome");
}
```

---

# 2. Method With Parameters

## Definition

This method accepts values during method call.

---

## Example

```java
void add(int a, int b) {

    System.out.println(a + b);
}
```

---

# 3. Method With Return Type

## Definition

This method returns a value to the caller.

---

## Example

```java
int square(int number) {

    return number * number;
}
```

---

# 4. Static Method

## Definition

Static methods belong to class and can be called without object.

---

## Example

```java
static void show() {

    System.out.println("Static Method");
}
```

---

# How Methods Work

1. Method is created inside class.
2. Method is called using object or class name.
3. JVM executes method code.
4. Control returns back after execution.

---

# Quick Revision Points

## Methods

- Reusable block of code
- Performs specific task
- Reduces code duplication
- Improves readability
- Can accept parameters

---

# Important Method Components

| Component | Purpose |
|---|---|
| Return Type | Type of value returned |
| Method Name | Name of method |
| Parameters | Input values |
| Method Body | Logic of method |

---

# Important Interview Points

1. Methods improve code reusability.
2. `void` means no return value.
3. `return` keyword sends value back.
4. Static methods belong to class.
5. Methods can be called multiple times.

---

# Real Life Example

| Real Life | Java Method |
|---|---|
| Calculator Addition | `add()` |
| Alarm Ring | `ringAlarm()` |
| Mobile Call | `callPerson()` |

---

# Difference Between Method and Function

| Method | Function |
|---|---|
| Belongs to class | Independent |
| Used in Java | Common in C |

---

# Complete Example

```java
public class Demo {

    void display() {

        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();
    }
}
```

---

# Conclusion

Methods are one of the most important concepts in Java.

They help create clean, reusable, and organized programs.