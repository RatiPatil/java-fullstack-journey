# equals() Method in Java

## Definition

The `equals()` method is used to **compare two objects** in Java.

It checks:
- Content comparison (not reference)

---

# Simple Understanding

```text
== → compares memory address
equals() → compares values
```

---

# Example

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);        // false
System.out.println(a.equals(b));    // true
```

---

# How equals() Works

1. Compares object values
2. Used for meaningful comparison
3. Defined in Object class
4. Can be overridden

---

# Example with Class

```java
class Student {

    String name;

    Student(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        Student s = (Student) obj;

        return this.name.equals(s.name);
    }
}
```

---

# Main Class

```java
public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student("Ratikant");
        Student s2 = new Student("Ratikant");

        System.out.println(s1.equals(s2));
    }
}
```

---

# Output

```text
true
```

---

# Difference Between == and equals()

| Operator | Purpose |
|---|---|
| == | Compares memory address |
| equals() | Compares content |

---

# Quick Revision Points

## equals()

- Used for object comparison
- Compares values
- Defined in Object class
- Can be overridden
- Very important in Strings

---

# Real Life Example

| Concept | Real Life |
|---|---|
| == | Same ID card |
| equals() | Same name comparison |

---

# Important Interview Points

1. equals() compares values.
2. == compares references.
3. String class overrides equals().
4. Can be customized in user class.
5. Comes from Object class.

---

# Conclusion

The `equals()` method is used to compare object values in Java and is very important for real-world comparisons.