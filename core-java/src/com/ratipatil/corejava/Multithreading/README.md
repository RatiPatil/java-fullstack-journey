# Multithreading in Java

## Definition

Multithreading is a feature of Java that allows multiple threads to run simultaneously.

A thread is a lightweight process.

Multithreading improves:
- Performance
- Responsiveness
- Resource utilization

---

# What is a Thread?

A Thread is the smallest unit of execution inside a process.

Example:

```text
Google Chrome
    |
    |-- Tab 1
    |-- Tab 2
    |-- Download
    |-- Music
```

Each task can run using different threads.

---

# Why Multithreading?

Without Multithreading:

```text
Task 1
↓
Task 2
↓
Task 3
```

With Multithreading:

```text
Task 1
Task 2
Task 3
```

All tasks can run together.

---

# Creating a Thread

## Method 1 : Extending Thread Class

```java
class MyThread extends Thread {

    public void run() {

        System.out.println("Thread Running");
    }
}
```

Start Thread:

```java
MyThread t1 = new MyThread();

t1.start();
```

---

# Important Methods

| Method | Purpose |
|----------|----------|
| start() | Starts thread |
| run() | Thread task |
| sleep() | Pause thread |
| join() | Wait for thread |
| getName() | Get thread name |
| setName() | Set thread name |
| getPriority() | Get priority |
| setPriority() | Set priority |
| getState() | Get thread state |

---

# Multiple Threads

Multiple threads can run simultaneously.

Example:

```java
Thread t1 = new Thread();

Thread t2 = new Thread();

t1.start();
t2.start();
```

---

# Thread Priority

Priority tells JVM which thread should get more CPU attention.

Priority Range:

| Constant | Value |
|----------|----------|
| MIN_PRIORITY | 1 |
| NORM_PRIORITY | 5 |
| MAX_PRIORITY | 10 |

Example:

```java
t1.setPriority(10);

t2.setPriority(1);
```

Important:

Higher priority does not guarantee execution first.

---

# Thread Sleep

Sleep pauses current thread.

Syntax:

```java
Thread.sleep(1000);
```

Meaning:

```text
1000 milliseconds = 1 second
```

Example:

```java
Thread.sleep(2000);
```

Thread pauses for 2 seconds.

---

# Runnable Interface

Runnable is another way to create threads.

Example:

```java
class MyRunnable implements Runnable {

    public void run() {

        System.out.println("Running");
    }
}
```

Creating Thread:

```java
MyRunnable task = new MyRunnable();

Thread t1 = new Thread(task);

t1.start();
```

---

# Runnable vs Thread

| Thread Class | Runnable Interface |
|-------------|-------------------|
| extends Thread | implements Runnable |
| Uses inheritance | Uses interface |
| Less flexible | More flexible |
| Cannot extend another class | Can extend another class |
| Less preferred | More preferred |

---

# Which is Better?

Runnable Interface

Reason:

- Better design
- More flexible
- Supports inheritance
- Used in real projects

---

# Race Condition

## Definition

Race Condition occurs when multiple threads access and modify shared data at the same time.

Example:

```java
count++;
```

Expected:

```text
2000
```

Actual:

```text
1987
```

Because multiple threads update same variable.

---

# Why Race Condition Happens?

```java
count++;
```

Actually performs:

```text
1. Read value
2. Increment value
3. Store value
```

If two threads do this together, data may be lost.

---

# Solution of Race Condition

Use:

```java
synchronized
```

Example:

```java
public synchronized void increment() {

    count++;
}
```

Only one thread enters method at a time.

---

# Thread States

Java Thread Life Cycle:

```text
NEW
 ↓
RUNNABLE
 ↓
RUNNING
 ↓
WAITING / TIMED_WAITING
 ↓
TERMINATED
```

---

# Thread State Details

| State | Meaning |
|---------|---------|
| NEW | Thread created |
| RUNNABLE | Ready to run |
| RUNNING | Executing |
| WAITING | Waiting indefinitely |
| TIMED_WAITING | Waiting for specific time |
| TERMINATED | Execution finished |

---

# Try-With-Resources

## Definition

Feature introduced in Java 7.

Automatically closes resources after use.

Example:

```java
try(
    BufferedReader br =
    new BufferedReader(
        new FileReader("demo.txt"))
) {

}
```

Benefits:

- Automatic resource closing
- Cleaner code
- No finally block needed

---

# Real Life Examples

## Thread

```text
Music App
↓
Play Song
Download Song
Show Lyrics
```

All tasks run simultaneously.

---

## Race Condition

```text
Bank Account
↓
ATM 1 Withdraw
ATM 2 Withdraw
```

Without synchronization balance becomes incorrect.

---

## Runnable

```text
Employee already extends Person

Employee cannot extend Thread

Use Runnable instead
```

---

# Quick Revision

## Thread

- Lightweight process
- Used for multitasking
- start() method starts thread

---

## Multiple Threads

- Multiple tasks run together
- Improves performance

---

## Thread Priority

```text
MIN_PRIORITY  = 1
NORM_PRIORITY = 5
MAX_PRIORITY  = 10
```

---

## Sleep

```java
Thread.sleep(1000);
```

Pauses thread.

---

## Runnable

```java
implements Runnable
```

Preferred over Thread class.

---

## Race Condition

- Shared data problem
- Multiple threads access same variable
- Fixed using synchronized

---

## Thread States

```text
NEW
RUNNABLE
RUNNING
WAITING
TIMED_WAITING
TERMINATED
```

---

## Try-With-Resources

- Java 7 feature
- Auto resource closing
- Cleaner code

---

# Important Interview Questions

### What is a Thread?

A lightweight process used for multitasking.

---

### Difference Between Process and Thread?

Process:
- Heavyweight
- Separate memory

Thread:
- Lightweight
- Shared memory

---

### Difference Between Runnable and Thread?

Runnable is interface-based and more flexible.

---

### What is Race Condition?

Multiple threads modifying shared data simultaneously causing incorrect results.

---

### How to Prevent Race Condition?

Using:

```java
synchronized
```

---

### What are Thread States?

NEW, RUNNABLE, RUNNING, WAITING, TIMED_WAITING, TERMINATED

---

### What is Thread.sleep()?

Pauses current thread for specified time.

---

### What is Try-With-Resources?

Automatically closes resources after use.

---

# Conclusion

Multithreading allows Java applications to execute multiple tasks simultaneously, improving performance and responsiveness. Understanding Threads, Runnable, Race Condition, Synchronization, Thread States, and Resource Management is essential for interviews, Spring Boot, and real-world Java development.