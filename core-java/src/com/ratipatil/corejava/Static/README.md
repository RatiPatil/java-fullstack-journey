# Static Keyword in Java

## Definition

The `static` keyword in Java is used for memory management.

Static members belong to the class instead of objects.

---

# Static Members in Java

| Static Member | Purpose |
|---|---|
| Static Variable | Shared among all objects |
| Static Method | Called without object |
| Static Block | Executes once during class loading |

---

# 1. Static Variable

## Definition

A static variable is shared among all objects of a class.

Only one copy exists in memory.

---

## Example

```java
static String collegeName = "ABC College";
```

---

# Simple Understanding

If 100 students belong to same college:

- No need to create college name 100 times.
- One static variable is shared.

---

# Important Points

- Shared among all objects
- Memory created only once
- Saves memory
- Belongs to class
- Accessed using class name

---

# 2. Static Method

## Definition

A static method belongs to the class and can be called without object.

---

## Example

```java
static void display() {

    System.out.println("Static Method");
}
```

---

# Calling Static Method

```java
Student.display();
```

---

# Important Points

- Called using class name
- No object required
- Can access static variables directly
- Cannot access non-static variables directly
- Faster execution

---

# 3. Static Block

## Definition

A static block executes automatically when class loads.

It executes only once.

---

## Example

```java
static {

    System.out.println("Static Block Executed");
}
```

---

# Important Points

- Executes automatically
- Runs only once
- Executes before main method
- Used for initialization
- Belongs to class

---

# Execution Order

```text
Static Block
↓
Main Method
↓
Object Creation
```

---

# Quick Revision Points

## Static Variable

- Shared memory
- One copy only
- Belongs to class

---

## Static Method

- No object needed
- Called using class name
- Access static members directly

---

## Static Block

- Executes once
- Before main method
- Automatic execution

---

# Difference Between Static and Non-Static

| Static | Non-Static |
|---|---|
| Belongs to class | Belongs to object |
| Shared memory | Separate memory |
| No object needed | Object required |

---

# Real Life Example

| Real Life | Static Concept |
|---|---|
| College Name | Same for all students |
| Company Name | Shared among employees |
| Country Name | Same for all citizens |

---

# Important Interview Points

1. Static members belong to class.
2. Static variables are shared.
3. Static methods do not require objects.
4. Static block executes once.
5. Static improves memory efficiency.

---

# Conclusion

The `static` keyword is used to create class-level members in Java.

It improves memory usage and allows shared access among objects.