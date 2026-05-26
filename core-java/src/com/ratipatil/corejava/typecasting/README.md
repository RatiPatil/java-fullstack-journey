# Type Casting, Type Conversion and Type Promotion in Java

## Introduction

In Java, data types can be converted from one type to another during assignments and expressions.

Java provides:
1. Type Conversion
2. Type Casting
3. Type Promotion

These concepts are very important while performing calculations and memory management.

---

# 1. Type Conversion in Java

## Definition

Type Conversion is the automatic conversion of a smaller data type into a larger compatible data type by the Java compiler.

It is also called **Implicit Conversion** or **Automatic Conversion**.

---

## Type Conversion Flow

```text
byte → short → int → long → float → double
                 ↑
               char
```

---

## Example

```java
byte number = 100;

int result = number;

System.out.println(result);
```

---

## Output

```text
100
```

---

## Important Points

1. Conversion happens automatically.
2. Smaller data types convert into larger data types.
3. No data loss occurs.
4. Java compiler performs conversion automatically.
5. Also called Widening Conversion.

---

# 2. Type Casting in Java

## Definition

Type Casting is the manual conversion of a larger data type into a smaller data type by the programmer.

It is also called **Explicit Conversion**.

---

## Syntax

```java
dataType variable = (dataType) value;
```

---

## Example

```java
double marks = 99.99;

int result = (int) marks;

System.out.println(result);
```

---

## Output

```text
99
```

---

## Types of Type Casting

| Type | Description |
|---|---|
| Widening Casting | Small type → Large type |
| Narrowing Casting | Large type → Small type |

---

## Widening Casting Example

```java
int a = 100;

double b = a;

System.out.println(b);
```

---

## Narrowing Casting Example

```java
double value = 45.89;

int result = (int) value;

System.out.println(result);
```

---

## Important Points

1. Type casting is manual conversion.
2. Narrowing casting may cause data loss.
3. Parentheses are compulsory in explicit casting.
4. Used when programmer wants controlled conversion.
5. Large data types can be reduced into smaller types.

---

# 3. Type Promotion in Java

## Definition

Type Promotion is the automatic promotion of smaller data types into `int` during arithmetic operations and expressions.

Java automatically promotes `byte`, `short`, and `char` into `int`.

---

## Example

```java
byte a = 10;
byte b = 20;

int result = a + b;

System.out.println(result);
```

---

## Output

```text
30
```

---

## Why Type Promotion Happens?

During arithmetic operations:
- `byte`
- `short`
- `char`

are automatically converted into `int` because CPU processes integer operations more efficiently.

---

## Important Points

1. Small data types are promoted to `int`.
2. Happens during arithmetic expressions.
3. `byte + byte` gives `int`.
4. Prevents overflow during calculations.
5. Java performs promotion automatically.

---

# Difference Between Type Conversion, Type Casting and Type Promotion

| Feature | Type Conversion | Type Casting | Type Promotion |
|---|---|---|---|
| Conversion Type | Automatic | Manual | Automatic |
| Performed By | Compiler | Programmer | Compiler |
| Data Loss | No | Possible | No |
| Direction | Small → Large | Large → Small | Small → int |
| Other Name | Implicit Conversion | Explicit Conversion | Automatic Promotion |

---

# Complete Example Program

```java
public class TypeExample {

    public static void main(String[] args) {

        // Type Conversion
        byte a = 10;
        int b = a;

        // Type Casting
        double marks = 95.99;
        int result = (int) marks;

        // Type Promotion
        byte x = 5;
        byte y = 10;
        int sum = x + y;

        System.out.println("Type Conversion: " + b);
        System.out.println("Type Casting: " + result);
        System.out.println("Type Promotion: " + sum);
    }
}
```

---

# Output

```text
Type Conversion: 10
Type Casting: 95
Type Promotion: 15
```

---

# Conclusion

- Type Conversion is automatic widening conversion.
- Type Casting is manual narrowing conversion.
- Type Promotion happens during arithmetic operations.

These concepts are very important in Java memory handling and calculations.