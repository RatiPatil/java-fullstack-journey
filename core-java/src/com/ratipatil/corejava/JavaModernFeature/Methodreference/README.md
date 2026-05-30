# Java Method Reference

## What is Method Reference?

Method Reference is a shorthand version of Lambda Expression.

Lambda:

```java
name -> System.out.println(name)
```

Method Reference:

```java
System.out::println
```

---

# Syntax

```java
ClassName::methodName
```

---

# Types of Method References

### Static Method Reference

```java
Math::abs
```

### Instance Method Reference

```java
System.out::println
```

### Constructor Reference

```java
Student::new
```

---

# Output

Using Lambda:
Amit
Rahul
Neha

Using Method Reference:
Amit
Rahul
Neha

---

# Interview Questions

### Why use Method References?

Cleaner and shorter code.

### Is Method Reference a replacement for Lambda?

No.

It is used when a lambda only calls an existing method.