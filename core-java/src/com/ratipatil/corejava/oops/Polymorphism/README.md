# Polymorphism in Java

## Definition

Polymorphism means **one name, many forms**.

In Java, it allows a single method or object to behave in different ways.

---

# Types of Polymorphism

| Type | Description |
|---|---|
| Compile-time Polymorphism | Method Overloading |
| Runtime Polymorphism | Method Overriding |

---

# 1. Compile-time Polymorphism (Method Overloading)

## Definition

Same method name but different parameters.

---

## Example

```java
class Math {

    void add(int a, int b) {

        System.out.println(a + b);
    }

    void add(int a, int b, int c) {

        System.out.println(a + b + c);
    }
}
```

---

# 2. Runtime Polymorphism (Method Overriding)

## Definition

Child class changes parent class method.

---

## Example

```java
class Animal {

    void sound() {

        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    void sound() {

        System.out.println("Dog Bark");
    }
}
```

---

# Quick Revision Points

## Polymorphism

- Same action, different behavior
- Two types:
    - Compile time (Overloading)
    - Runtime (Overriding)
- Improves flexibility
- Core OOP concept
- Used in real-world applications

---

# Real Life Example

| Action | Different Forms |
|---|---|
| Payment | UPI, Card, Cash |
| Animal Sound | Dog bark, Cat meow |

---

# Important Interview Points

1. Polymorphism means many forms.
2. Achieved using overloading and overriding.
3. Increases code flexibility.
4. Reduces code complexity.
5. Very important OOP concept.

---

# Conclusion

Polymorphism allows the same method to behave differently depending on input or object.