# Lambda Expression in Java

## Definition

Lambda Expression is a short way to write anonymous functions in Java.

Introduced in:
- Java 8

Used mainly with:
- Functional Interface (SAM)

---

# Syntax

```java
(parameters) -> {

    // code
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

            System.out.println("Hello");
        };

        d.show();
    }
}
```

---

# Output

```text
Hello
```

---

# Functional Interface

A Functional Interface contains:
- Only one abstract method

SAM = Single Abstract Method

---

# Important Points

1. Introduced in Java 8.
2. Reduces code size.
3. Improves readability.
4. Used with Functional Interface.
5. Uses `->` operator.

---

# Quick Revision

- Java 8 feature
- Short function syntax
- Uses `->`
- Works with SAM interface

---

# Real Life Example

| Normal Way | Lambda Way |
|---|---|
| Large code | Short code |
| Traditional method | Functional programming |

---

# Important Interview Points

1. Lambda Expression works with Functional Interface.
2. SAM means Single Abstract Method.
3. Lambda reduces boilerplate code.
4. Introduced in Java 8.
5. Uses arrow operator `->`.

---

# Conclusion

Lambda Expressions provide a cleaner and shorter way to implement methods in Java.