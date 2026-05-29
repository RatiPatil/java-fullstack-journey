# Wrapper Classes in Java

## Definition

Wrapper classes are used to convert **primitive data types into objects**.

Java provides wrapper classes for all primitives.

---

# Primitive vs Wrapper

| Primitive | Wrapper Class |
|---|---|
| int | Integer |
| char | Character |
| float | Float |
| double | Double |
| boolean | Boolean |

---

# Why Wrapper Classes?

- To use primitives as objects
- Required in Collections (ArrayList, etc.)
- Provides useful methods
- Helps in data conversion

---

# Example

```java
int a = 10;
Integer obj = Integer.valueOf(a);
```

---

# Simple Understanding

```text
Primitive → Object
```

---

# Autoboxing

## Definition

Autoboxing means:
👉 Automatically converting primitive into wrapper object

---

## Example

```java
int a = 10;

Integer obj = a;  // Autoboxing
```

---

# Unboxing

## Definition

Unboxing means:
👉 Automatically converting wrapper object into primitive

---

## Example

```java
Integer obj = 20;

int a = obj;  // Unboxing
```

---

# Full Example

```java
public class Demo {

    public static void main(String[] args) {

        // Autoboxing
        int a = 10;
        Integer obj = a;

        // Unboxing
        Integer num = 20;
        int b = num;

        System.out.println(obj);
        System.out.println(b);
    }
}
```

---

# Output

```text
10
20
```

---

# Quick Revision Points

## Wrapper Classes

- Convert primitive → object
- Used in collections
- Provide utility methods

---

## Autoboxing

- Primitive → Object
- Done automatically
- Example: int → Integer

---

## Unboxing

- Object → Primitive
- Done automatically
- Example: Integer → int

---

# Real Life Example

| Concept | Real Life |
|---|---|
| Primitive | Simple number |
| Wrapper | Box containing number |
| Autoboxing | Packing |
| Unboxing | Unpacking |

---

# Important Interview Points

1. Wrapper classes convert primitives into objects.
2. Autoboxing is automatic conversion.
3. Unboxing is reverse conversion.
4. Used in collections framework.
5. Improves flexibility of Java.

---

# Conclusion

Wrapper classes help Java treat primitive data as objects, and autoboxing/unboxing makes conversion automatic and easy.