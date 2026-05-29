# Scanner Class in Java

## Definition

Scanner class is used to take user input from keyboard.

Package:
```java
java.util.Scanner
```

---

# Why Scanner?

- Easy user input
- Reads different data types
- Commonly used in Java programs

---

# Syntax

```java
Scanner sc = new Scanner(System.in);
```

---

# Example

```java
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();
```

---

# Common Scanner Methods

| Method | Purpose |
|---|---|
| nextInt() | Reads integer |
| nextDouble() | Reads double |
| next() | Reads single word |
| nextLine() | Reads full line |
| nextBoolean() | Reads boolean |

---

# Example Program

```java
Scanner sc = new Scanner(System.in);

System.out.println("Enter Name:");

String name = sc.nextLine();

System.out.println(name);
```

---

# Output

```text
Enter Name:
Ratikant
Ratikant
```

---

# Important Points

1. Scanner class belongs to `java.util` package.
2. Used for user input.
3. Reads multiple data types.
4. Object creation required.
5. Scanner should be closed after use.

---

# Quick Revision

## Scanner

- User input class
- java.util package
- Reads keyboard input
- Uses Scanner object

---

# Real Life Example

| Situation | Scanner Use |
|---|---|
| Login form | User enters data |
| ATM machine | User enters PIN |

---

# Important Interview Points

1. Scanner is used for keyboard input.
2. Belongs to java.util package.
3. nextLine() reads full line.
4. nextInt() reads integer.
5. close() method releases resources.

---

# Conclusion

Scanner class makes taking user input simple and easy in Java programs.