# Packages in Java

## Definition

A package in Java is a group of related classes and interfaces.

Packages help organize Java programs properly.

---

# Why Packages are Used

Packages help in:

- Organizing code
- Avoiding name conflicts
- Improving readability
- Better project structure

---

# Simple Syntax

```java
package packageName;
```

---

# Example

```java
package com.ratipatil.corejava;
```

---

# Creating a Package

## Step 1

Create folders:

```text
com/ratipatil/corejava
```

---

## Step 2

Add package statement at top:

```java
package com.ratipatil.corejava;
```

---

## Step 3

Create class inside package.

---

# Example Program

```java
package com.ratipatil.corejava;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Package Example");
    }
}
```

---

# Output

```text
Package Example
```

---

# Quick Revision Points

## Packages

- Group of classes
- Organizes code
- Avoids naming conflicts
- Better project structure
- Used in real projects

---

# Types of Packages

| Package Type | Description |
|---|---|
| Built-in Package | Provided by Java |
| User-defined Package | Created by programmer |

---

# 1. Built-in Package

## Example

```java
import java.util.Scanner;
```

Java already provides these packages.

---

# 2. User-defined Package

## Example

```java
package com.ratipatil.corejava;
```

Programmer creates these packages.

---

# Important Rules

| Rule | Description |
|---|---|
| Package statement at top | Mandatory |
| Folder structure should match package name | Important |
| Use lowercase names | Recommended |

---

# Common Package Naming Style

```text
com.companyname.projectname
```

---

# Example

```text
com.ratipatil.corejava
```

---

# Real Life Example

| Real Life | Package Concept |
|---|---|
| School Department | Package |
| Students | Classes |
| Library Sections | Packages |

---

# Important Interview Points

1. Package is collection of classes.
2. Packages organize Java programs.
3. Package statement written at top.
4. Java provides built-in packages.
5. User can create custom packages.

---

# Advantages of Packages

| Advantage | Description |
|---|---|
| Organization | Better structure |
| Security | Access protection |
| Reusability | Easy reuse |
| Maintenance | Easy management |

---

# Conclusion

Packages are used to organize Java code into proper structure.

They are very important in professional Java development.