# Maven

## Overview

Maven is a build automation and dependency management tool used for Java projects. It helps developers manage project dependencies, compile source code, run tests, package applications, and maintain a standard project structure.

Maven follows the Project Object Model (POM) concept and uses the `pom.xml` file to manage project configuration.

---

## Why Maven?

Before Maven, developers had to manually:

- Download JAR files
- Add libraries to the project
- Manage versions
- Configure build processes

Maven automates all these tasks.

Benefits:

- Dependency Management
- Standard Project Structure
- Build Automation
- Easy Project Maintenance
- Faster Development

---

## Maven Architecture

```text
Developer
    │
    ▼
 pom.xml
    │
    ▼
 Maven
    │
 ┌──┴─────────────┐
 ▼                ▼
Local Repo    Central Repo
```

---

## Maven Repositories

### 1. Local Repository

Repository stored on the developer's machine.

Location:

```text
C:\Users\<username>\.m2\repository
```

Stores downloaded dependencies.

---

### 2. Central Repository

Official Maven repository available on the internet.

Contains:

- JUnit
- Lombok
- Spring Boot
- Hibernate
- Log4j
- Thousands of Java libraries

---

### 3. Remote Repository

Repository maintained by an organization.

Examples:

- Nexus
- Artifactory

Used in enterprise applications.

---

## Maven Project Structure

```text
project-name
│
├── src
│   ├── main
│   │   ├── java
│   │   └── resources
│   │
│   └── test
│       ├── java
│       └── resources
│
├── pom.xml
└── target
```

---

## pom.xml

POM stands for:

```text
Project Object Model
```

It is the most important file in a Maven project.

Used for:

- Project Information
- Dependencies
- Plugins
- Build Configuration
- Java Version Configuration

Example:

```xml
<groupId>com.ratikant.maven</groupId>
<artifactId>maven-introduction</artifactId>
<version>1.0-SNAPSHOT</version>
```

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
<artifactId>contact-book-app</artifactId>
```

---

## version

Represents the current version of the project.

Example:

```xml
<version>1.0-SNAPSHOT</version>
```

---

## Dependency Management

Dependencies are external libraries required by the project.

Example:

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.38</version>
</dependency>
```

Maven automatically downloads and manages dependencies.

---

## Maven Lifecycle

Maven lifecycle is a sequence of phases used to build a project.

```text
validate
   ↓
compile
   ↓
test
   ↓
package
   ↓
install
   ↓
deploy
```

### validate

Checks project configuration.

### compile

Compiles Java source code into `.class` files.

Command:

```bash
mvn compile
```

---

### test

Runs JUnit test cases.

Command:

```bash
mvn test
```

---

### package

Creates JAR or WAR files.

Command:

```bash
mvn package
```

---

### install

Stores the generated artifact in the local repository.

Command:

```bash
mvn install
```

---

### deploy

Deploys the artifact to a remote repository.

Command:

```bash
mvn deploy
```

---

## Maven Commands Practiced

### Validate Project

```bash
mvn validate
```

### Compile Project

```bash
mvn compile
```

### Run Tests

```bash
mvn test
```

### Create JAR File

```bash
mvn package
```

### Install Artifact

```bash
mvn install
```

---

## Compile vs Package

### mvn compile

Compiles source code and generates `.class` files.

```text
.java
  ↓
.class
```

Output Location:

```text
target/classes
```

---

### mvn package

Compiles code, runs tests, and creates a JAR/WAR file.

```text
.java
   ↓
.class
   ↓
.jar
```

Output Location:

```text
target/
```

---

## Lombok Integration

Lombok helps reduce boilerplate code.

Annotations Used:

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
```

Generates:

- Getters
- Setters
- Constructors
- toString()
- equals()
- hashCode()

Automatically.

---

## Projects Built

### 01 - Maven Introduction

Concepts Covered:

- Maven Setup
- pom.xml
- Maven Lifecycle
- Dependencies
- Repositories

---

### 02 - Contact Book Application

Features:

- Add Contact
- View Contacts
- Menu Driven Interface

Concepts Used:

- Maven
- Lombok
- OOP
- ArrayList
- Switch Case
- Loops

---

## Key Learning Outcomes

- Installed and configured Maven
- Understood Maven architecture
- Worked with pom.xml
- Managed dependencies
- Learned Maven repositories
- Understood Maven lifecycle
- Used Maven commands
- Integrated Lombok
- Built a Maven-based mini project
- Generated JAR files using Maven

---

## Author

Ratikant Patil

MCA Student | Java Full Stack Developer