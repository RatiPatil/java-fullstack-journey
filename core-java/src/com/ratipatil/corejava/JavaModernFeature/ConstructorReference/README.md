# Java Constructor Reference

## What is Constructor Reference?

Constructor Reference is used to create objects using method reference syntax.

Syntax:

```java
ClassName::new
```

Example:

```java
StudentFactory factory = Student::new;
```

---

# Why Use Constructor Reference?

- Cleaner code
- Less boilerplate
- Works well with Functional Interfaces

---

# Output

Student Created: Ratikant

---

# Constructor Reference vs Object Creation

Traditional:

```java
Student student =
        new Student("Ratikant");
```

Constructor Reference:

```java
StudentFactory factory =
        Student::new;
```

---

# Interview Questions

### Syntax of Constructor Reference?

```java
ClassName::new
```

### Is Constructor Reference a type of Method Reference?

Yes.

### Why use Constructor Reference?

To simplify object creation when using Functional Interfaces.