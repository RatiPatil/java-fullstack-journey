# Java Sealed Classes

## What is a Sealed Class?

A Sealed Class restricts which classes can inherit from it.

Introduced in Java 17.

Example:

```java
sealed class Vehicle permits Car, Bike
```

Only Car and Bike can extend Vehicle.

---

# Why Use Sealed Classes?

- Better control over inheritance
- Improves security
- Makes code easier to maintain
- Useful in large applications

---

# Output

Vehicle Started
This is a Car

Vehicle Started
This is a Bike

---

# Keywords Used

### sealed

Restricts inheritance.

### permits

Specifies allowed subclasses.

### final

Stops further inheritance.

---

# Interview Questions

### When were Sealed Classes introduced?

Java 17

### Purpose of Sealed Classes?

To control inheritance.

### Which keyword lists allowed subclasses?

permits