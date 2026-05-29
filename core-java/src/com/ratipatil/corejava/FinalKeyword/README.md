# final Keyword in Java

## Definition

The `final` keyword is used to make something **constant or unchangeable** in Java.

It can be used with:
- Variables
- Methods
- Classes

---

# 1. final Variable

## Definition

A final variable cannot be changed after initialization.

---

## Example

```java
class Demo {

    final int age = 21;

    void show() {

        System.out.println(age);
    }
}
```

---

## Simple Understanding

```text
final variable = constant value
```

Once value is set → cannot change.

---

# 2. final Method

## Definition

A final method cannot be overridden in child class.

---

## Example

```java
class Animal {

    final void sound() {

        System.out.println("Animal Sound");
    }
}
```

---

## Simple Understanding

Child class cannot change final method.

---

# 3. final Class

## Definition

A final class cannot be inherited.

---

## Example

```java
final class Vehicle {

    void run() {

        System.out.println("Vehicle is running");
    }
}
```

---

## Simple Understanding

```text
final class = no child class allowed
```

---

# Quick Revision Points

## final Keyword

- Makes value constant
- Prevents method overriding
- Prevents inheritance
- Used for security
- Improves stability

---

# Types of final

| Type | Meaning |
|---|---|
| final variable | Cannot change value |
| final method | Cannot override |
| final class | Cannot extend |

---

# Real Life Example

| Concept | Real Life |
|---|---|
| final variable | Aadhaar number |
| final method | Bank rules |
| final class | Locked system |

---

# Important Interview Points

1. final variable = constant value.
2. final method cannot be overridden.
3. final class cannot be extended.
4. Used for security and restriction.
5. Improves code stability.

---

# Conclusion

The `final` keyword is used to restrict modification in Java and make programs safer and more stable.