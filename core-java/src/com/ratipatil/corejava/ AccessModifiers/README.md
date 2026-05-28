# Access Modifiers in Java

## Definition

Access modifiers in Java control:
- Visibility
- Accessibility
- Security of classes, variables, methods, and constructors.

They decide where members can be accessed.

---

# Types of Access Modifiers

| Access Modifier | Accessible Within Class | Same Package | Subclass | Other Package |
|---|---|---|---|---|
| private | ✔ | ✘ | ✘ | ✘ |
| default | ✔ | ✔ | ✘ | ✘ |
| protected | ✔ | ✔ | ✔ | ✘* |
| public | ✔ | ✔ | ✔ | ✔ |

> `protected` can be accessed in other packages only through inheritance.

---

# 1. private Access Modifier

## Definition

`private` members can be accessed only inside the same class.

---

# Example

```java
private int age;
```

---

# Simple Understanding

Only the same class can use private members.

---

# Quick Revision

## private

- Same class only
- Most secure
- Used for data hiding

---

# Important Points

1. Accessible only inside class.
2. Cannot access outside class.
3. Used in encapsulation.
4. Provides maximum security.
5. Commonly used with variables.

---

# 2. default Access Modifier

## Definition

When no access modifier is written, it becomes default access modifier.

---

# Example

```java
int marks;
```

---

# Simple Understanding

Accessible only inside same package.

---

# Quick Revision

## default

- Same package only
- No keyword required
- Package-level access

---

# Important Points

1. No keyword used.
2. Accessible in same package.
3. Not accessible outside package.
4. Also called package-private.
5. Less secure than private.

---

# 3. protected Access Modifier

## Definition

`protected` members are accessible:
- Inside same package
- In child classes from other packages

---

# Example

```java
protected String name;
```

---

# Simple Understanding

Child classes can access protected members.

---

# Quick Revision

## protected

- Same package access
- Accessible in subclasses
- Used in inheritance

---

# Important Points

1. Supports inheritance.
2. Accessible in subclasses.
3. Accessible in same package.
4. More flexible than default.
5. Commonly used in OOPs.

---

# 4. public Access Modifier

## Definition

`public` members can be accessed from anywhere.

---

# Example

```java
public void display() {

}
```

---

# Simple Understanding

Accessible from any class and package.

---

# Quick Revision

## public

- Accessible everywhere
- No restrictions
- Most flexible

---

# Important Points

1. Accessible globally.
2. Used for public APIs.
3. No access restriction.
4. Least secure.
5. Commonly used for methods.

---

# Easy Memory Trick

| Modifier | Remember As |
|---|---|
| private | Only Me |
| default | Same Package |
| protected | Family + Child |
| public | Everyone |

---

# Real Life Example

| Access Modifier | Real Life Example |
|---|---|
| private | Personal diary |
| default | School classroom |
| protected | Family property |
| public | Public park |

---

# Important Interview Points

1. Access modifiers control visibility.
2. `private` gives maximum security.
3. `default` works inside package.
4. `protected` supports inheritance.
5. `public` accessible everywhere.

---

# Conclusion

Access modifiers are used to secure and control access to Java program members.

They are very important for:
- Security
- Encapsulation
- OOP design
- Professional coding