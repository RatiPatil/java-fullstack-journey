# Interface and Functional Interface (SAM) in Java

---

# 1. Interface in Java

## Definition

An interface is used to achieve abstraction in Java.

It contains:
- Abstract methods
- Constants

---

# Syntax

```java
interface Animal {

    void sound();
}
```

---

# Example

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    public void sound() {

        System.out.println("Dog Barks");
    }
}
```

---

# Important Points

1. Uses `interface` keyword.
2. Class uses `implements`.
3. Supports multiple inheritance.
4. Methods are public and abstract by default.
5. Cannot create object of interface.

---

# Power of Interfaces

- Loose coupling
- Flexibility
- Multiple inheritance
- Better design
- Standardization

---

# Quick Revision

- Abstraction
- implements keyword
- Multiple inheritance
- No object creation

---

# 2. Functional Interface (SAM)

## Definition

A Functional Interface contains only:
- One abstract method

SAM = Single Abstract Method

---

# Syntax

```java
@FunctionalInterface
interface Demo {

    void show();
}
```

---

# Example

```java
@FunctionalInterface
interface Demo {

    void show();
}

public class Test {

    public static void main(String[] args) {

        Demo d = () -> {

            System.out.println("SAM Interface");
        };

        d.show();
    }
}
```

---

# Important Points

1. Contains only one abstract method.
2. Uses `@FunctionalInterface`.
3. Supports lambda expressions.
4. SAM = Single Abstract Method.
5. Used in modern Java.

---

# Lambda Expression

```java
() -> {

    System.out.println("Hello");
}
```

---

# Quick Revision

- One abstract method
- Lambda support
- Modern Java feature
- SAM Interface

---

# Difference Between Interface and Functional Interface

| Interface | Functional Interface |
|---|---|
| Multiple abstract methods allowed | Only one abstract method |
| General abstraction | Used for lambda |
| Normal interface | SAM interface |

---

# Important Interview Points

1. Interface supports abstraction.
2. Functional interface contains one abstract method.
3. `implements` keyword used with interface.
4. Functional interface supports lambda expression.
5. SAM stands for Single Abstract Method.

---

# Conclusion

- Interface is used for abstraction and multiple inheritance.
- Functional Interface is a special interface used with lambda expressions in modern Java.