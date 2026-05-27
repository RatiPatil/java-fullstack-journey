# Method Overloading in Java

## Definition

Method Overloading means creating multiple methods with the same name but different parameters.

Java identifies overloaded methods using:
- Number of parameters
- Type of parameters

---

# Simple Syntax

```java
void display() {

}

void display(int a) {

}

void display(int a, int b) {

}
```

---

# Example

```java
class Addition {

    void add(int a, int b) {

        System.out.println(a + b);
    }

    void add(int a, int b, int c) {

        System.out.println(a + b + c);
    }
}
```

---

# How Method Overloading Works

When method is called:

```java
obj.add(10, 20);
```

Java checks:
- Method name
- Number of arguments
- Data types

and calls matching method.

---

# Output Example

```text
30
60
```

---

# Quick Revision Points

## Method Overloading

- Same method name
- Different parameters
- Happens inside same class
- Achieved at compile time
- Example of Compile Time Polymorphism

---

# Rules of Method Overloading

| Rule | Example |
|---|---|
| Method name must be same | `display()` |
| Parameters must differ | `display(int a)` |
| Return type alone cannot overload | ❌ Invalid |
| Can change number of parameters | ✔ Allowed |
| Can change data types | ✔ Allowed |

---

# Valid Overloading Examples

```java
void show()
```

```java
void show(int a)
```

```java
void show(double a)
```

```java
void show(int a, int b)
```

---

# Invalid Overloading Example

```java
int show(int a)

double show(int a)
```

Reason:
Only return type changed.

---

# Important Interview Points

1. Method overloading improves readability.
2. Overloading happens in same class.
3. Parameters must be different.
4. Return type does not matter alone.
5. It is Compile Time Polymorphism.

---

# Real Life Example

| Action | Different Inputs |
|---|---|
| Call Person | Name / Phone / Video |
| add() Method | 2 numbers / 3 numbers |

---

# Difference Between Overloading and Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same class | Different classes |
| Compile time | Runtime |
| Parameters differ | Parameters same |
| Fast execution | Slightly slower |

---

# Conclusion

Method Overloading allows methods to perform similar tasks using different inputs.

It improves flexibility, readability, and code reusability in Java.