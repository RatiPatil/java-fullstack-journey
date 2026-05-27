# JDK, JRE and JVM in Java

## Introduction

Java programs run with the help of:
1. JVM
2. JRE
3. JDK

These are the core parts of Java technology.

---

# 1. JVM (Java Virtual Machine)

## Definition

JVM is a virtual machine that runs Java programs.

It converts Java bytecode into machine code so the computer can understand it.

---

# How JVM Works

```text
Java Program (.java)
        ↓
Compiled by javac
        ↓
Bytecode (.class)
        ↓
JVM
        ↓
Machine Code
        ↓
Output
```

---

# Responsibilities of JVM

- Runs Java programs
- Converts bytecode into machine code
- Manages memory
- Provides platform independence
- Performs garbage collection

---

# Important Points About JVM

1. JVM stands for Java Virtual Machine.
2. JVM executes Java bytecode.
3. JVM makes Java platform independent.
4. JVM manages memory automatically.
5. JVM is part of JRE.

---

# Real Life Example

Think JVM like a translator.

- Java language → Bytecode
- JVM translates bytecode into computer language.

---

# 2. JRE (Java Runtime Environment)

## Definition

JRE provides the environment required to run Java programs.

It contains:
- JVM
- Libraries
- Supporting files

---

# Components of JRE

```text
JRE
│
├── JVM
├── Java Libraries
└── Runtime Files
```

---

# Responsibilities of JRE

- Provides runtime environment
- Runs Java applications
- Contains JVM and libraries

---

# Important Points About JRE

1. JRE stands for Java Runtime Environment.
2. JRE is used to run Java programs.
3. JRE contains JVM.
4. JRE does not contain compiler.
5. End users mainly install JRE.

---

# Real Life Example

Think JRE like a playground.

- JVM is the player.
- Libraries are tools.
- Together they run the game.

---

# 3. JDK (Java Development Kit)

## Definition

JDK is a complete package used to develop and run Java programs.

It contains:
- JRE
- Compiler
- Development tools

---

# Components of JDK

```text
JDK
│
├── JRE
│   └── JVM
│
├── Compiler (javac)
├── Debugger
└── Development Tools
```

---

# Responsibilities of JDK

- Develop Java programs
- Compile Java code
- Run Java applications

---

# Important Points About JDK

1. JDK stands for Java Development Kit.
2. JDK is used by Java developers.
3. JDK contains JRE.
4. JDK contains compiler (`javac`).
5. JDK is required for Java development.

---

# Difference Between JVM, JRE and JDK

| Feature | JVM | JRE | JDK |
|---|---|---|---|
| Full Form | Java Virtual Machine | Java Runtime Environment | Java Development Kit |
| Purpose | Runs bytecode | Runs Java programs | Develops Java programs |
| Contains | Execution engine | JVM + Libraries | JRE + Development tools |
| Compiler Available | No | No | Yes |
| Used By | JVM internally | End users | Developers |

---

# Simple Relationship

```text
JDK > JRE > JVM
```

Meaning:

- JDK contains JRE
- JRE contains JVM

---

# Very Simple Analogy

| Component | Real Life Example |
|---|---|
| JVM | Engine |
| JRE | Car |
| JDK | Car Factory |

---

# Conclusion

- JVM runs Java bytecode.
- JRE provides runtime environment.
- JDK provides tools for Java development.

All three are very important in Java programming.