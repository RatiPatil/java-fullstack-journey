# Encapsulation in Java

## Definition

Encapsulation means wrapping data and methods into a single unit.

It is achieved using:
- Private variables
- Getter methods
- Setter methods

---

# Simple Understanding

Encapsulation is also called:
- Data Hiding

Direct access to variables is restricted.

---

# Main Idea

```text
Data + Methods = Encapsulation
```

---

# How Encapsulation Works

1. Variables are declared `private`
2. Data cannot be accessed directly
3. Getter methods return values
4. Setter methods set values

---

# Example

```java
class Student {

    private String name;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
```

---

# Getter and Setter

| Method | Purpose |
|---|---|
| Getter | Returns value |
| Setter | Sets value |

---

# Simple Syntax

## Private Variable

```java
private int age;
```

---

## Setter Method

```java
public void setAge(int age) {

    this.age = age;
}
```

---

## Getter Method

```java
public int getAge() {

    return age;
}
```

---

# Output Example

```text
Student Name : Ratikant
Student Age : 21
```

---

# Quick Revision Points

## Encapsulation

- Data hiding
- Private variables
- Getter returns value
- Setter sets value
- Improves security

---

# Important Points

1. Encapsulation protects data.
2. Variables should be private.
3. Getter methods access data.
4. Setter methods modify data.
5. Improves code maintainability.

---

# Real Life Example

| Real Life | Encapsulation |
|---|---|
| ATM Machine | Hidden internal process |
| Mobile Phone | Internal parts hidden |
| Car Engine | User cannot access directly |

---

# Advantages of Encapsulation

| Advantage | Description |
|---|---|
| Security | Protects data |
| Flexibility | Easy modification |
| Reusability | Better code reuse |
| Maintainability | Easy to manage code |

---

# Important Interview Points

1. Encapsulation = Data Hiding.
2. Achieved using private variables.
3. Getter and Setter methods are used.
4. Improves security and flexibility.
5. One of the core OOP concepts.

---

# Conclusion

Encapsulation is used to protect object data from direct access.

It improves security, maintainability, and flexibility in Java programs.