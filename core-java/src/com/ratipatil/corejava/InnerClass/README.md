# Inner Class in Java

## Definition

An inner class is a class defined inside another class.

It is used to logically group classes and improve code readability.

---

# Types of Inner Classes

| Type | Description |
|---|---|
| 1. Member Inner Class | Class inside class |
| 2. Static Inner Class | Static class inside class |

---

# 1. Member Inner Class

## Definition

A non-static class inside another class.

---

## Example

```java
class Outer {

    void showOuter() {

        System.out.println("Outer Class Method");
    }

    // Inner Class
    class Inner {

        void showInner() {

            System.out.println("Inner Class Method");
        }
    }
}
```

---

## Main Class

```java
public class Demo {

    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        inner.showInner();
    }
}
```

---

## Output

```text
Inner Class Method
```

---

# Simple Understanding

```text
Outer class → main class
Inner class → inside class
```

---

# 2. Static Inner Class

## Definition

A static class inside another class.

---

## Example

```java
class Outer {

    static class Inner {

        void show() {

            System.out.println("Static Inner Class Method");
        }
    }
}
```

---

## Main Class

```java
public class Demo {

    public static void main(String[] args) {

        Outer.Inner obj = new Outer.Inner();

        obj.show();
    }
}
```

---

## Output

```text
Static Inner Class Method
```

---

# Quick Revision Points

## Inner Class

- Class inside class
- Improves organization
- Used for grouping logic

---

## Member Inner Class

- Non-static
- Needs outer object
- More common

---

## Static Inner Class

- Static keyword used
- No outer object needed
- Can be accessed directly

---

# Real Life Example

| Concept | Real Life |
|---|---|
| Outer Class | Car |
| Inner Class | Engine |

---

# Important Interview Points

1. Inner class is inside another class.
2. Member inner class needs outer object.
3. Static inner class does not need object.
4. Used for better code organization.
5. Helps in encapsulation.

---

# Conclusion

Inner classes help in logically grouping classes and making code more structured and readable.