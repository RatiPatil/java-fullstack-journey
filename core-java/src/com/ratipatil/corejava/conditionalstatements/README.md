# Conditional Statements in Java

## Definition

Conditional statements in Java are used to make decisions in a program.

They execute different blocks of code based on conditions.

---

# Types of Conditional Statements

| Statement | Purpose |
|---|---|
| `if` | Executes code when condition is true |
| `if-else` | Executes one block if true and another if false |
| `if-else-if` | Checks multiple conditions |
| `nested if` | `if` inside another `if` |
| `switch` | Selects one case from multiple options |

---

# 1. if Statement

## Definition

The `if` statement executes code only when the condition is true.

---

## Syntax

```java
if(condition) {

    // code
}
```

---

## Example

```java
int age = 20;

if(age >= 18) {

    System.out.println("Eligible to Vote");
}
```

---

# 2. if-else Statement

## Definition

The `if-else` statement executes one block if the condition is true and another block if the condition is false.

---

## Syntax

```java
if(condition) {

    // true block
}
else {

    // false block
}
```

---

## Example

```java
int number = 10;

if(number % 2 == 0) {

    System.out.println("Even Number");
}
else {

    System.out.println("Odd Number");
}
```

---

# 3. if-else-if Ladder

## Definition

The `if-else-if` ladder is used to check multiple conditions one by one.

---

## Syntax

```java
if(condition1) {

}
else if(condition2) {

}
else {

}
```

---

## Example

```java
int marks = 75;

if(marks >= 90) {

    System.out.println("Grade A");
}
else if(marks >= 70) {

    System.out.println("Grade B");
}
else {

    System.out.println("Grade C");
}
```

---

# 4. Nested if Statement

## Definition

A nested `if` statement means an `if` statement inside another `if` statement.

---

## Syntax

```java
if(condition1) {

    if(condition2) {

    }
}
```

---

## Example

```java
int age = 22;
boolean hasLicense = true;

if(age >= 18) {

    if(hasLicense) {

        System.out.println("Can Drive");
    }
}
```

---

# 5. switch Statement

## Definition

The `switch` statement selects one block of code from multiple cases.

---

## Syntax

```java
switch(variable) {

    case value:
        // code
        break;

    default:
        // code
}
```

---

## Example

```java
int day = 2;

switch(day) {

    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

---

# Important Points

1. Conditional statements control program flow.
2. `if` checks a single condition.
3. `if-else-if` is used for multiple conditions.
4. `switch` improves readability when many choices exist.
5. `break` is used to stop switch execution.

---

# Complete Example Program

```java
public class ConditionalStatementsExample {

    public static void main(String[] args) {

        int age = 20;

        // if statement
        if(age >= 18) {

            System.out.println("Adult");
        }

        // if-else statement
        if(age % 2 == 0) {

            System.out.println("Even");
        }
        else {

            System.out.println("Odd");
        }

        // if-else-if ladder
        int marks = 85;

        if(marks >= 90) {

            System.out.println("Grade A");
        }
        else if(marks >= 70) {

            System.out.println("Grade B");
        }
        else {

            System.out.println("Grade C");
        }

        // switch statement
        int day = 1;

        switch(day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
```

---

# Conclusion

Conditional statements are used for decision-making in Java.

They help programs execute different code blocks based on conditions.