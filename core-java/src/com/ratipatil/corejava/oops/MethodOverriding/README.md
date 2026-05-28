# Method Overriding in Java

## Definition

Method Overriding means redefining a parent class method inside child class.

The child class provides its own implementation of the method.

---

# Main Requirement

Parent and child class methods must have:

- Same method name
- Same parameters

---

# Syntax

```java
class Parent {

    void show() {

    }
}

class Child extends Parent {

    @Override
    void show() {

    }
}
```

---

# Example

```java
class Animal {

    void sound() {

        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Dog Bark");
    }
}
```

---

# Output

```text
Dog Bark
```

---

# How Method Overriding Works

1. Parent class contains method.
2. Child class redefines same method.
3. Child class version executes.

---

# Quick Revision Points

## Method Overriding

- Same method name
- Same parameters
- Parent and child classes
- Runtime polymorphism
- Child changes parent behavior

---

# Important Rules

| Rule | Description |
|---|---|
| Method name same | Mandatory |
| Parameters same | Mandatory |
| Inheritance required | Yes |
| Return type should be same | Recommended |
| Access modifier cannot be more restrictive | Important |

---

# @Override Annotation

## Definition

`@Override` tells Java that method is overriding parent method.

---

# Example

```java
@Override
void show() {

}
```

---

# Advantages of Method Overriding

| Advantage | Description |
|---|---|
| Runtime Polymorphism | Dynamic behavior |
| Flexibility | Different implementations |
| Code Reusability | Reuse parent features |

---

# Difference Between Overloading and Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same class | Different classes |
| Parameters different | Parameters same |
| Compile time | Runtime |
| No inheritance required | Inheritance required |

---

# Real Life Example

| Parent | Child |
|---|---|
| Animal Sound | Dog Bark |
| Vehicle Start | Bike Start |

---

# Important Interview Points

1. Method overriding requires inheritance.
2. Same method name and parameters required.
3. Child class changes parent method behavior.
4. Achieves Runtime Polymorphism.
5. `@Override` annotation improves readability.

---

# Conclusion

Method Overriding allows child classes to provide their own implementation of parent class methods.

It is one of the most important concepts of Java OOPs and Runtime Polymorphism.