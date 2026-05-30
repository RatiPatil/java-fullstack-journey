# Java Type Inference (var)

## What is Type Inference?

Type Inference allows the Java compiler to automatically determine the type of a variable from its assigned value.

It was introduced in Java 10.

Instead of writing:

```java
String name = "Ratikant";
```

We can write:

```java
var name = "Ratikant";
```

The compiler automatically understands that the variable type is String.

---

# Why Type Inference?

Benefits:

- Reduces code length
- Improves readability
- Useful with complex generic types
- Makes code cleaner

---

# Traditional vs var

## Traditional Way

```java
String city = "Pune";
```

## Using var

```java
var city = "Pune";
```

Both are exactly the same.

The compiler converts var into the actual type during compilation.

---

# Examples Covered

### String

```java
var name = "Ratikant";
```

Type: String

---

### Integer

```java
var age = 21;
```

Type: int

---

### Double

```java
var percentage = 85.50;
```

Type: double

---

### Boolean

```java
var active = true;
```

Type: boolean

---

### List

```java
var fruits = new ArrayList<String>();
```

Type:

```java
ArrayList<String>
```

---

### Map

```java
var studentMap = new HashMap<Integer, String>();
```

Type:

```java
HashMap<Integer, String>
```

---

# Output

```text
Traditional Variables:
Ratikant
21

Using var:
Pune
50000
85.5
true

List Example:
[Apple, Mango, Banana]

Map Example:
{101=Amit, 102=Rahul, 103=Neha}

For-Each Loop:
Apple
Mango
Banana

Message:
Hello Java
```

---

# Rules of var

## Rule 1

Variable must be initialized.

Correct:

```java
var name = "Java";
```

Wrong:

```java
var name;
```

---

## Rule 2

Can only be used for local variables.

Allowed:

```java
public static void main(String[] args) {
    var age = 21;
}
```

Not Allowed:

```java
class Student {
    var age = 21;
}
```

---

## Rule 3

Cannot be initialized with null.

Wrong:

```java
var data = null;
```

Compiler cannot determine the type.

---

# Advantages

- Cleaner code
- Less typing
- Better readability
- Useful with Generics

Example:

```java
HashMap<Integer, String> map =
        new HashMap<Integer, String>();
```

Using var:

```java
var map =
        new HashMap<Integer, String>();
```

---

# Disadvantages

- Overuse can reduce readability
- Actual type may not be obvious
- Not suitable everywhere

Bad Example:

```java
var x = getData();
```

Type is unclear.

---

# Interview Questions

## What is Type Inference?

A feature introduced in Java 10 that allows the compiler to automatically determine variable type.

---

## Is var a keyword?

No.

It is a reserved type name.

---

## Can var be used as a class variable?

No.

Only local variables are allowed.

---

## Can var be initialized with null?

No.

The compiler cannot determine the variable type.

---

## Does var make Java dynamically typed?

No.

Java remains a statically typed language.

The compiler determines the type at compile time.

---

# Quick Revision Notes

✅ Introduced in Java 10

✅ Compiler determines type automatically

✅ Used only for local variables

✅ Initialization is mandatory

✅ Cannot be assigned null

✅ Improves readability and reduces code length

✅ Java remains statically typed

---

# Learning Outcome

After completing this example, you can:

✅ Use var confidently

✅ Understand Type Inference

✅ Explain its advantages and limitations

✅ Answer Java 10 interview questions

✅ Use var with Collections and Generics