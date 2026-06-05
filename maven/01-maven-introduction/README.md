# Maven Introduction

## What is Maven?

Maven is a build automation and dependency management tool used in Java projects. It helps developers manage project libraries, compile code, run tests, package applications, and maintain a standard project structure.

---

## Why Maven is Used?

Before Maven, developers had to manually download JAR files and configure project dependencies.

Maven automates this process by:
- Managing dependencies automatically
- Downloading required libraries from repositories
- Compiling source code
- Running tests
- Creating JAR/WAR files
- Maintaining a standard project structure

---

## Maven Architecture

```text
Developer
    ↓
 pom.xml
    ↓
 Maven
    ↓
 Dependencies + Plugins
    ↓
 Build Lifecycle
    ↓
 Output (JAR/WAR)
```

---

## Maven Repositories

Repositories are locations where Maven stores and downloads libraries.

### Local Repository

A repository stored on the developer's machine.

Location:

```text
C:\Users\<username>\.m2\repository
```

Purpose:
- Stores downloaded dependencies
- Improves build speed by reusing libraries

### Central Repository

The default online repository maintained by Maven.

Purpose:
- Provides thousands of Java libraries
- Downloads dependencies automatically when needed

---

## pom.xml

The `pom.xml` file is the most important file in a Maven project.

POM stands for:

```text
Project Object Model
```

It contains:
- Project information
- Dependencies
- Plugins
- Build configuration
- Java version details

---

## groupId

Uniquely identifies the organization or developer.

Example:

```xml
<groupId>com.ratikant.maven</groupId>
```

---

## artifactId

Represents the project name.

Example:

```xml
<artifactId>maven-introduction</artifactId>
```

---

## version

Represents the current project version.

Example:

```xml
<version>1.0-SNAPSHOT</version>
```

`SNAPSHOT` indicates that the project is still under development.

---

## Maven Lifecycle

Maven follows a predefined build lifecycle.

Common phases:

### validate

Validates project structure and configuration.

### compile

Compiles Java source files into `.class` files.

Command:

```bash
mvn compile
```

### test

Runs test cases.

Command:

```bash
mvn test
```

### package

Packages the project into a JAR or WAR file.

Command:

```bash
mvn package
```

### install

Installs the generated artifact into the local repository.

Command:

```bash
mvn install
```

---

## Maven Plugins

Plugins provide additional functionality to Maven.

Examples:

### Compiler Plugin

Compiles Java source code.

### Surefire Plugin

Executes JUnit test cases.

### Jar Plugin

Creates JAR files.

---

## Maven Dependencies

Dependencies are external libraries required by a project.

Example:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.38</version>
</dependency>
```

Maven automatically downloads the dependency and stores it in the local repository.

---

## Lombok Dependency Example

Lombok reduces boilerplate code by automatically generating:

- Getters
- Setters
- Constructors
- toString()
- equals()
- hashCode()

Example:

```java
@Data
public class Student {

    private int id;
    private String name;

}
```

---

## Commands Practiced

### Compile Project

```bash
mvn compile
```

### Package Project

```bash
mvn package
```

---

## Project Structure

```text
01-maven-introduction
│
├── src
│   ├── main
│   │   └── java
│   │
│   └── test
│       └── java
│
├── pom.xml
├── README.md
└── .gitignore
```

---

## Output

```text
Hello Maven!

Student(id=101, name=Ratikant)
```

---

## Key Learning Outcomes

- Understood Maven fundamentals
- Created a Maven project in IntelliJ IDEA
- Learned Maven project structure
- Understood pom.xml configuration
- Worked with Maven repositories
- Used Maven lifecycle commands
- Added and managed dependencies
- Implemented Lombok dependency
- Generated JAR files using Maven
- Built projects using Maven commands