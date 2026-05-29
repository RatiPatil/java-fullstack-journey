# Upcasting and Downcasting in Java

## Definition

Upcasting and Downcasting are concepts used in **inheritance** to convert object types.

---

# 1. Upcasting

## Definition

Upcasting means:
👉 Child class object is stored in parent class reference.

---

## Syntax

```java
Parent obj = new Child();
```

---

## Example

```java
class Animal {

    void sound() {

        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println("Dog barking");
    }
}
```

---

## Main Class

```java
public class Demo {

    public static void main(String[] args) {

        Animal obj = new Dog();  // Upcasting

        obj.sound();
    }
}
```

---

## Output

```text
Animal sound
```

---

## Simple Understanding

```text
Child → Parent (safe conversion)
```

---

# 2. Downcasting

## Definition

Downcasting means:
👉 Parent reference is converted back to child class reference.

---

## Syntax

```java
Child obj = (Child) parentObject;
```

---

## Example

```java
public class Demo {

    public static void main(String[] args) {

        Animal obj = new Dog();  // Upcasting

        Dog d = (Dog) obj;       // Downcasting

        d.bark();
    }
}
```

---

## Output

```text
Dog barking
```

---

## Simple Understanding

```text
Parent → Child (needs type casting)
```

---

# Difference Between Upcasting and Downcasting

| Upcasting | Downcasting |
|---|---|
| Child → Parent | Parent → Child |
| Automatic | Manual casting required |
| Safe | Risky if wrong type |
| Used in polymorphism | Used to access child methods |

---

# Quick Revision Points

## Upcasting

- Child object as parent reference
- Automatic conversion
- Used in runtime polymorphism
- Safe operation

---

## Downcasting

- Parent reference to child
- Requires explicit casting
- Used to access child methods
- Can cause error if wrong type

---

# Real Life Example

| Concept | Real Life |
|---|---|
| Upcasting | Bike → Vehicle |
| Downcasting | Vehicle → Bike |

---

# Important Interview Points

1. Upcasting is automatic.
2. Downcasting requires explicit casting.
3. Upcasting supports polymorphism.
4. Downcasting may cause ClassCastException.
5. Both used in inheritance.

---

# Conclusion

Upcasting and Downcasting help in converting object types in inheritance and are very important for Java OOP concepts.