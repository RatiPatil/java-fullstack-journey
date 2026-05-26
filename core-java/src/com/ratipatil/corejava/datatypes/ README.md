# Data Types in Java

## Introduction

Data types in Java define the type of data a variable can store.

Java data types help in:
- Memory allocation
- Data management
- Performing operations safely

---

# Types of Data Types in Java

Java data types are divided into two categories:

1. Primitive Data Types
2. Non-Primitive Data Types

---

# 1. Primitive Data Types

Primitive data types store actual values directly in memory.

Java provides 8 primitive data types.

---

# Primitive Data Types Table

| Data Type | Size | Range | Example |
|---|---|---|---|
| byte | 1 byte | -128 to 127 | `byte a = 10;` |
| short | 2 bytes | -32,768 to 32,767 | `short b = 100;` |
| int | 4 bytes | -2,147,483,648 to 2,147,483,647 | `int c = 1000;` |
| long | 8 bytes | Very Large Integer Values | `long d = 99999L;` |
| float | 4 bytes | Decimal values up to 6-7 digits | `float e = 10.5f;` |
| double | 8 bytes | Decimal values up to 15 digits | `double f = 99.99;` |
| char | 2 bytes | Single Character | `char g = 'A';` |
| boolean | 1 bit | true or false | `boolean h = true;` |

---

# byte Data Type

## Definition

`byte` is used to store small integer values.

It is memory efficient and mainly used in arrays and file handling.

---

## Example

```java
byte number = 100;

System.out.println(number);
```

---

# short Data Type

## Definition

`short` stores medium-sized integer values.

It uses less memory than `int`.

---

## Example

```java
short value = 30000;

System.out.println(value);
```

---

# int Data Type

## Definition

`int` is the most commonly used integer data type in Java.

It stores whole numbers.

---

## Example

```java
int marks = 95;

System.out.println(marks);
```

---

# long Data Type

## Definition

`long` stores very large integer values.

`L` suffix is required at the end.

---

## Example

```java
long population = 1400000000L;

System.out.println(population);
```

---

# float Data Type

## Definition

`float` stores decimal values with single precision.

`f` suffix is required.

---

## Example

```java
float percentage = 85.5f;

System.out.println(percentage);
```

---

# double Data Type

## Definition

`double` stores decimal values with high precision.

It is more accurate than `float`.

---

## Example

```java
double pi = 3.14159;

System.out.println(pi);
```

---

# char Data Type

## Definition

`char` stores a single character.

Characters are written inside single quotes.

---

## Example

```java
char grade = 'A';

System.out.println(grade);
```

---

# boolean Data Type

## Definition

`boolean` stores only two values:
- true
- false

It is mainly used in conditions and decision-making.

---

## Example

```java
boolean isJavaEasy = true;

System.out.println(isJavaEasy);
```

---

# 2. Non-Primitive Data Types

Non-primitive data types store references instead of actual values.

They are created by programmers or provided by Java.

---

# Types of Non-Primitive Data Types

| Data Type | Description |
|---|---|
| String | Stores text |
| Array | Stores multiple values |
| Class | Blueprint of object |
| Interface | Contains abstract methods |

---

# String Example

```java
String name = "Ratikant";

System.out.println(name);
```

---

# Array Example

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[0]);
```

---

# Important Points About Data Types

1. Java has 8 primitive data types.
2. Primitive types store actual values.
3. Non-primitive types store references.
4. `float` requires `f` suffix.
5. `long` requires `L` suffix.

---

# Complete Example Program

```java
public class DataTypesExample {

    public static void main(String[] args) {

        byte a = 10;
        short b = 100;
        int c = 1000;
        long d = 999999L;

        float e = 10.5f;
        double f = 99.99;

        char g = 'R';

        boolean h = true;

        String name = "Java";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println(e);
        System.out.println(f);

        System.out.println(g);

        System.out.println(h);

        System.out.println(name);
    }
}
```

---

# Output

```text
10
100
1000
999999
10.5
99.99
R
true
Java
```

---

# Conclusion

Data types are the foundation of Java programming.

They help Java manage memory efficiently and store different kinds of data safely.