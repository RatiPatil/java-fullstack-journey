# Operators in Java

## Definition

Operators in Java are special symbols used to perform operations on variables and values.

Operators help in:
- Calculations
- Comparisons
- Decision making
- Assigning values

---

# Types of Operators in Java

| Operator Type | Purpose |
|---|---|
| Arithmetic Operators | Perform mathematical calculations |
| Assignment Operators | Assign values |
| Relational Operators | Compare values |
| Logical Operators | Combine conditions |
| Unary Operators | Work on single operand |
| Ternary Operator | Shortcut for if-else |
| Bitwise Operators | Work on binary bits |
| Shift Operators | Shift bits left or right |

---

# 1. Arithmetic Operators

## Definition

Arithmetic operators are used to perform mathematical operations.

---

## Operators Table

| Operator | Meaning | Example |
|---|---|---|
| `+` | Addition | `a + b` |
| `-` | Subtraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division | `a / b` |
| `%` | Modulus | `a % b` |

---

## Example

```java
int a = 10;
int b = 5;

System.out.println(a + b);
```

---

# 2. Assignment Operators

## Definition

Assignment operators are used to assign values to variables.

---

## Operators Table

| Operator | Meaning | Example |
|---|---|---|
| `=` | Assign value | `a = 10` |
| `+=` | Add and assign | `a += 5` |
| `-=` | Subtract and assign | `a -= 5` |
| `*=` | Multiply and assign | `a *= 5` |
| `/=` | Divide and assign | `a /= 5` |

---

## Example

```java
int number = 20;

number += 10;
```

---

# 3. Relational Operators

## Definition

Relational operators compare two values and return `true` or `false`.

---

## Operators Table

| Operator | Meaning |
|---|---|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal |
| `<=` | Less than or equal |

---

## Example

```java
int a = 10;
int b = 5;

System.out.println(a > b);
```

---

# 4. Logical Operators

## Definition

Logical operators are used to combine multiple conditions.

---

## Operators Table

| Operator | Meaning |
|---|---|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

---

## Example

```java
int age = 21;

System.out.println(age > 18 && age < 30);
```

---

# 5. Unary Operators

## Definition

Unary operators work with only one operand.

---

## Operators Table

| Operator | Meaning |
|---|---|
| `++` | Increment |
| `--` | Decrement |
| `+` | Positive |
| `-` | Negative |
| `!` | Logical NOT |

---

## Example

```java
int value = 10;

value++;

System.out.println(value);
```

---

# 6. Ternary Operator

## Definition

Ternary operator is the shortcut form of if-else statement.

---

## Syntax

```java
condition ? trueValue : falseValue;
```

---

## Example

```java
int age = 20;

String result = (age >= 18)
        ? "Adult"
        : "Minor";

System.out.println(result);
```

---

# 7. Bitwise Operators

## Definition

Bitwise operators perform operations on binary bits.

---

## Operators Table

| Operator | Meaning |
|---|---|
| `&` | Bitwise AND |
| `|` | Bitwise OR |
| `^` | Bitwise XOR |
| `~` | Bitwise Complement |

---

## Example

```java
int a = 5;
int b = 3;

System.out.println(a & b);
```

---

# 8. Shift Operators

## Definition

Shift operators are used to shift bits left or right.

---

## Operators Table

| Operator | Meaning |
|---|---|
| `<<` | Left Shift |
| `>>` | Right Shift |
| `>>>` | Unsigned Right Shift |

---

## Example

```java
int number = 8;

System.out.println(number << 1);
```

---

# Important Points About Operators

1. Operators are used to perform operations on data.
2. Arithmetic operators are most commonly used.
3. Relational operators return boolean values.
4. Logical operators are mainly used in conditions.
5. Ternary operator reduces code length.

---

# Conclusion

Operators are one of the most important concepts in Java.

They are used in calculations, comparisons, conditions, loops, and decision-making throughout Java programming.