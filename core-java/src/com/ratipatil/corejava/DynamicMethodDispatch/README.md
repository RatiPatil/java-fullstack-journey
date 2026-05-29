# Dynamic Method Dispatch in Java

## Definition

Dynamic Method Dispatch means:
👉 A parent class reference is used to refer to a child class object  
👉 Method is decided at runtime

It is also called:
- Runtime Polymorphism
- Late Binding

---

# Simple Understanding

```text
Parent reference → Child object
Method call → decided at runtime
```

---

# Syntax

```java
Parent obj = new Child();
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

        Animal obj = new Dog();  // Dynamic Method Dispatch

        obj.sound();  // Dog method will run
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

1. Reference type = Parent class
2. Object type = Child class
3. Method call is resolved at runtime
4. Child class method executes

---

# Quick Revision Points

## Dynamic Method Dispatch

- Parent reference + Child object
- Runtime decision
- Supports polymorphism
- Uses method overriding
- Important OOP concept

---

# Real Life Example

| Situation | Example |
|---|---|
| Remote control | Same button, different TV response |
| Payment system | UPI/Card/Cash same interface |

---

# Important Interview Points

1. Works only with inheritance.
2. Requires method overriding.
3. Achieves runtime polymorphism.
4. Object type decides method execution.
5. Parent reference is used.

---

# Conclusion

Dynamic Method Dispatch allows Java to decide method execution at runtime, making programs flexible and powerful.