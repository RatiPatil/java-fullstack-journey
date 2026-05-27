# Loops in Java

## Definition

Loops in Java are used to execute a block of code repeatedly until a condition becomes false.

Loops reduce code repetition and improve program efficiency.

---

# Types of Loops in Java

| Loop Type | Purpose |
|---|---|
| `for` loop | Executes code fixed number of times |
| `while` loop | Executes while condition is true |
| `do-while` loop | Executes at least one time |
| `nested loop` | Loop inside another loop |
| `for-each` loop | Traverses arrays and collections |

---

# 1. for Loop

## Definition

The `for` loop is used when the number of iterations is known.

---

## Syntax

```java
for(initialization; condition; update) {

    // code
}
```

---

## Example

```java
for(int i = 1; i <= 5; i++) {

    System.out.println(i);
}
```

---

# 2. while Loop

## Definition

The `while` loop executes code while the condition is true.

---

## Syntax

```java
while(condition) {

    // code
}
```

---

## Example

```java
int i = 1;

while(i <= 5) {

    System.out.println(i);

    i++;
}
```

---

# 3. do-while Loop

## Definition

The `do-while` loop executes code at least one time even if condition is false.

---

## Syntax

```java
do {

    // code

} while(condition);
```

---

## Example

```java
int i = 1;

do {

    System.out.println(i);

    i++;

} while(i <= 5);
```

---

# 4. Nested Loop

## Definition

A nested loop means a loop inside another loop.

---

## Example

```java
for(int i = 1; i <= 3; i++) {

    for(int j = 1; j <= 2; j++) {

        System.out.println(i + " " + j);
    }
}
```

---

# 5. for-each Loop

## Definition

The `for-each` loop is used to traverse arrays easily.

---

## Syntax

```java
for(dataType variable : array) {

    // code
}
```

---

## Example

```java
int[] numbers = {10, 20, 30};

for(int item : numbers) {

    System.out.println(item);
}
```

---

# Loop Control Statements

| Statement | Purpose |
|---|---|
| `break` | Stops loop execution |
| `continue` | Skips current iteration |

---

# break Example

```java
for(int i = 1; i <= 5; i++) {

    if(i == 3) {

        break;
    }

    System.out.println(i);
}
```

---

# continue Example

```java
for(int i = 1; i <= 5; i++) {

    if(i == 3) {

        continue;
    }

    System.out.println(i);
}
```

---

# Important Points

1. Loops reduce code duplication.
2. `for` loop is best for fixed iterations.
3. `while` loop is condition-based.
4. `do-while` executes at least one time.
5. `break` and `continue` control loop flow.

---

# Complete Example Program

```java
public class LoopsExample {

    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++) {

            System.out.println(i);
        }
    }
}
```

---

# Conclusion

Loops are important for repetitive tasks in Java.

They help write efficient, clean, and reusable code.