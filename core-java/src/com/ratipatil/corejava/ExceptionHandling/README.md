# Exception Handling in Java

## Definition

Exception Handling is a mechanism used to handle runtime errors and prevent program crash.

It helps the program continue execution safely.

---

# Why Exception Handling?

- Prevents program crash
- Handles runtime errors
- Improves stability
- Improves user experience
- Makes program safe

---

# What is Exception?

An Exception is an unwanted event that occurs during program execution.

---

# Example

```java
int result = 10 / 0;
```

Output:

```text
ArithmeticException
```

---

# Exception Handling Syntax

```java
try {

    // risky code
}
catch(Exception e) {

    // handling code
}
```

---

# Important Keywords

| Keyword | Purpose |
|---|---|
| try | Contains risky code |
| catch | Handles exception |
| finally | Always executes |
| throw | Manually throws exception |
| throws | Delegates exception |

---

# 1. try Block

## Definition

The `try` block contains risky code that may generate exception.

---

# Example

```java
try {

    int result = 10 / 0;
}
```

---

# Important Points

1. Risky code written inside try.
2. Must be followed by catch or finally.
3. Multiple catch blocks allowed.
4. Cannot use try alone.
5. Helps monitor exceptions.

---

# 2. catch Block

## Definition

The `catch` block handles exception generated in try block.

---

# Example

```java
catch(ArithmeticException e) {

    System.out.println("Error");
}
```

---

# Important Points

1. Handles exception.
2. Prevents program crash.
3. Multiple catch blocks possible.
4. Specific exception handling.
5. Executes only when exception occurs.

---

# 3. finally Block

## Definition

The `finally` block always executes whether exception occurs or not.

---

# Example

```java
finally {

    System.out.println("Always Executes");
}
```

---

# Important Points

1. Always executes.
2. Used for cleanup code.
3. Mostly used with files/database.
4. Executes after try-catch.
5. Optional block.

---

# Example of finally

```java
try {

    int result = 10 / 2;
}
catch(Exception e) {

    System.out.println("Error");
}
finally {

    System.out.println("Program Finished");
}
```

---

# 4. Multiple Catch

## Definition

Multiple catch blocks handle different exceptions separately.

---

# Example

```java
try {

}
catch(ArithmeticException e) {

}
catch(ArrayIndexOutOfBoundsException e) {

}
```

---

# Important Points

1. One try can have many catches.
2. Specific exception first.
3. General Exception last.
4. Better error handling.
5. Improves readability.

---

# 5. Exception Hierarchy

## Hierarchy Structure

```text
Object
   ↓
Throwable
   ↓
--------------------------------
|                              |
Exception                     Error
   ↓
RuntimeException
   ↓
ArithmeticException
NullPointerException
ArrayIndexOutOfBoundsException
```

---

# Important Points

1. Throwable is parent class.
2. Exception and Error inherit Throwable.
3. RuntimeException occurs during runtime.
4. Errors are serious problems.
5. Exceptions follow inheritance.

---

# 6. throw Keyword

## Definition

The `throw` keyword is used to manually throw exception.

---

# Syntax

```java
throw new ArithmeticException();
```

---

# Example

```java
if(age < 18) {

    throw new ArithmeticException("Not Eligible");
}
```

---

# Important Points

1. Manually throws exception.
2. Stops normal execution.
3. Used in validations.
4. Creates custom error situations.
5. Used with exception object.

---

# 7. throws Keyword

## Definition

The `throws` keyword delegates exception handling to caller method.

---

# Syntax

```java
void show() throws Exception {

}
```

---

# Example

```java
static void readFile() throws Exception {

}
```

---

# Important Points

1. Declares exception.
2. Used in method declaration.
3. Delegates responsibility.
4. Mostly used with checked exceptions.
5. Improves code organization.

---

# 8. Custom Exception

## Definition

User-defined exception created by programmer.

---

# Example

```java
class MyException extends Exception {

}
```

---

# Important Points

1. Created by programmer.
2. Extends Exception class.
3. Used for custom validation.
4. Improves flexibility.
5. Real-world project usage.

---

# Checked vs Unchecked Exception

| Checked Exception | Unchecked Exception |
|---|---|
| Checked at compile time | Checked at runtime |
| IOException | ArithmeticException |
| SQLException | NullPointerException |

---

# Common Exceptions in Java

| Exception | Cause |
|---|---|
| ArithmeticException | Divide by zero |
| NullPointerException | Null object access |
| ArrayIndexOutOfBoundsException | Invalid array index |
| NumberFormatException | Wrong number format |

---

# Real Life Example

| Situation | Exception |
|---|---|
| ATM wrong PIN | Error handling |
| Wrong password | Validation exception |
| Invalid input | Exception |

---

# Quick Revision

## Exception Handling

- Runtime error handling
- Prevents crash
- try and catch
- Safe execution

---

## try

- Risky code
- Monitors exception

---

## catch

- Handles exception
- Prevents crash

---

## finally

- Always executes
- Cleanup block

---

## throw

- Manual exception

---

## throws

- Delegates exception

---

# Important Interview Points

1. Exception handling prevents program crash.
2. try block contains risky code.
3. catch block handles exceptions.
4. finally block always executes.
5. throw manually throws exception.
6. throws delegates exception.
7. Custom exceptions are user-defined.
8. Exceptions follow hierarchy.
9. Throwable is root class.
10. Checked and unchecked exceptions exist.

---

# Conclusion

Exception Handling is one of the most important concepts in Java.

It helps programs:
- Handle runtime errors
- Continue execution safely
- Improve reliability and stability