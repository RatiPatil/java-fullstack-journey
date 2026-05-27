# Stack Memory and Heap Memory in Java

## Introduction

Java mainly uses two memory areas:

1. Stack Memory
2. Heap Memory

Both are important for Java program execution.

---

# 1. Stack Memory

## Definition

Stack memory stores:
- Local variables
- Method calls
- Temporary data

It is fast and temporary.

---

# Example

```java
int number = 10;
```

Here:
- `number` is stored in Stack Memory.

---

# Features of Stack Memory

| Feature | Description |
|---|---|
| Stores | Local variables |
| Speed | Fast |
| Memory Size | Small |
| Lifetime | Temporary |
| Managed By | JVM |

---

# Important Stack Points

- Stores local variables
- Works very fast
- Memory removed automatically
- Method execution uses stack
- Each thread gets separate stack

---

# 2. Heap Memory

## Definition

Heap memory stores:
- Objects
- Instance variables

Heap memory is larger than stack memory.

---

# Example

```java
Student obj = new Student();
```

Here:
- Object created using `new`
- Object stored in Heap Memory

---

# Features of Heap Memory

| Feature | Description |
|---|---|
| Stores | Objects |
| Speed | Slower than stack |
| Memory Size | Large |
| Lifetime | Longer |
| Managed By | Garbage Collector |

---

# Important Heap Points

- Stores objects
- Shared among threads
- Large memory area
- Garbage collector removes unused objects
- Objects created using `new`

---

# Very Important Concept

## Object Creation

```java
Student obj = new Student();
```

| Part | Memory |
|---|---|
| `obj` reference variable | Stack Memory |
| `new Student()` object | Heap Memory |

---

# Simple Memory Diagram

```text
STACK MEMORY                 HEAP MEMORY
----------------             ----------------
marks = 90                   Student Object
student1 -----------▶        name = "Ratikant"
                              age = 21
```

---

# Garbage Collection

## Definition

Java automatically removes unused objects from heap memory.

This process is called:
- Garbage Collection

---

# Difference Between Stack and Heap

| Feature | Stack Memory | Heap Memory |
|---|---|---|
| Stores | Local Variables | Objects |
| Speed | Fast | Slower |
| Size | Smaller | Larger |
| Lifetime | Temporary | Longer |
| Access | Direct | Using references |

---

# Quick Revision Points

## Stack Memory

- Stores local variables
- Fast execution
- Temporary memory
- Method-related memory
- Automatically removed

---

## Heap Memory

- Stores objects
- Large memory area
- Shared memory
- Managed by Garbage Collector
- Objects created using `new`

---

# Real Life Analogy

| Memory Type | Real Life Example |
|---|---|
| Stack | Rough work paper |
| Heap | Big storage room |

---

# Important Interview Points

1. Stack stores local variables.
2. Heap stores objects.
3. Object references stored in stack.
4. Actual objects stored in heap.
5. Garbage collector cleans heap memory.

---

# Conclusion

- Stack memory is used for temporary method data.
- Heap memory is used for object storage.
- Both are essential for Java memory management.