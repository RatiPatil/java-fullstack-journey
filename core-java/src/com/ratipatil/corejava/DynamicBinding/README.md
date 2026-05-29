# Dynamic Binding in Java

## Definition

Dynamic Binding means:
👉 Method call is decided at **runtime**, not compile time.

It is also called:
- Runtime Binding
- Late Binding

---

# Simple Understanding

```text
Parent reference → Child object
Method execution decided at runtime
```

---

# Example

```java
class Animal {

    void sound() {

        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void sound() {

        System.out.println("Dog barks");
    }
}
```

---

# Main Class

```java
public class Demo {

    public static void main(String[] args) {

        Animal obj = new Dog();  // Dynamic Binding

        obj.sound();  // Dog method runs
    }
}
```

---

# Output

```text
Dog barks
```

---

# How It Works

1. Reference type = Parent
2. Object type = Child
3. Method call resolved at runtime
4. Child method executes

---

# Difference: Static vs Dynamic Binding

| Static Binding | Dynamic Binding |
|---|---|
| Compile time | Runtime |
| Method overloading | Method overriding |
| Faster | Slightly slower |
| Fixed decision | Dynamic decision |

---

# Real Life Example

| Concept | Real Life |
|---|---|
| TV Remote | Same button, different TV behavior |
| Payment system | UPI/Card/Cash behavior changes |

---

# Important Interview Points

1. Works with method overriding.
2. Uses inheritance.
3. Supports polymorphism.
4. Decided at runtime.
5. Very important OOP concept.

---

# Conclusion

Dynamic Binding allows Java to decide method execution at runtime, making programs flexible and powerful.