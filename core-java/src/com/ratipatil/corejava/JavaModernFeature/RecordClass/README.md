# Java Record Classes

## What is a Record?

A Record is a special type of class used to store immutable data.

Records reduce boilerplate code because Java automatically generates:

- Constructor
- Getters
- toString()
- equals()
- hashCode()

Introduced in Java 16.

---

# Traditional Class

```java
class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```

Lots of code is required.

---

# Record Version

```java
record Student(String name, int age) {
}
```

Same functionality with much less code.

---

# Why Use Records?

- Less boilerplate code
- Cleaner syntax
- Immutable data objects
- Better readability
- Perfect for DTOs and data models

---

# Features of Records

## Automatic Constructor

```java
Student student =
        new Student("Ratikant", 21);
```

---

## Automatic Getter Methods

```java
student.name();
student.age();
```

Note:

Records do NOT use:

```java
getName()
getAge()
```

They use:

```java
name()
age()
```

---

## Automatic toString()

```java
System.out.println(student);
```

Output:

```text
Student[name=Ratikant, age=21]
```

---

## Automatic equals()

```java
student1.equals(student2);
```

Compares values instead of object references.

---

## Automatic hashCode()

```java
student.hashCode();
```

Generated automatically.

---

# Output

```text
Student 1 Details:
Ratikant
21

Using toString():
Student[name=Ratikant, age=21]

Custom Method:
Student Name: Ratikant
Student Age : 21

Equals Example:
true

HashCode:
<generated value>

Second Record:
Student[name=Rahul, age=22]
```

---

# Important Notes

## Records are Immutable

Wrong:

```java
student.name = "Amit";
```

Compilation Error.

Values cannot be modified after creation.

---

## Records Can Have Methods

```java
public void display() {
    System.out.println(name);
}
```

---

## Records Can Implement Interfaces

```java
record Student(String name)
        implements Serializable {
}
```

Allowed.

---

## Records Cannot Extend Classes

Wrong:

```java
record Student(String name)
        extends Person {
}
```

Not allowed.

Records already extend Record internally.

---

# Record vs Normal Class

| Feature | Normal Class | Record |
|----------|-------------|---------|
| Constructor | Manual | Automatic |
| Getters | Manual | Automatic |
| toString() | Manual | Automatic |
| equals() | Manual | Automatic |
| hashCode() | Manual | Automatic |
| Boilerplate Code | More | Less |
| Immutable | Optional | Yes |

---

# Interview Questions

## When were Records introduced?

Java 16

---

## Why use Records?

To reduce boilerplate code for data-holding classes.

---

## Are Records Immutable?

Yes.

Record fields cannot be modified after object creation.

---

## Can Records Have Methods?

Yes.

Custom methods are allowed.

---

## Can Records Extend Other Classes?

No.

Records cannot extend classes.

---

## Can Records Implement Interfaces?

Yes.

Records can implement interfaces.

---

# Quick Revision Notes

✅ Introduced in Java 16

✅ Used for immutable data objects

✅ Automatically generates:
- Constructor
- Getters
- toString()
- equals()
- hashCode()

✅ Less boilerplate code

✅ Can have custom methods

✅ Can implement interfaces

✅ Cannot extend classes

---

# Learning Outcome

After completing this example, you can:

✅ Create Record Classes

✅ Understand immutability

✅ Reduce boilerplate code

✅ Explain Record features in interviews

✅ Compare Records with traditional classes