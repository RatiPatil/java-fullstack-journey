# Inheritance in Java

## Definition

Inheritance is a process where one class acquires properties and methods of another class.

It helps in:
- Code reusability
- Better organization
- Reducing duplicate code

---

# Syntax

```java
class ChildClass extends ParentClass {

}
```

---

# Types of Inheritance in Java

| Inheritance Type | Description |
|---|---|
| Single Inheritance | One child inherits one parent |
| Multilevel Inheritance | Child becomes parent for another class |
| Hierarchical Inheritance | Multiple child classes inherit one parent |

---

# 1. Single Inheritance

## Definition

One child class inherits one parent class.

---

# Example

```text
Animal
   ↓
 Dog
```

---

## Code Example

```java
class Animal {

    void eat() {

        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println("Barking");
    }
}
```

---

# Quick Revision

## Single Inheritance

- One parent
- One child
- Simple inheritance

---

# 2. Multilevel Inheritance

## Definition

A child class becomes parent for another class.

---

# Example

```text
Animal
   ↓
 Dog
   ↓
BabyDog
```

---

## Code Example

```java
class Animal {

}

class Dog extends Animal {

}

class BabyDog extends Dog {

}
```

---

# Quick Revision

## Multilevel Inheritance

- Parent → Child → Grandchild
- Multiple levels
- Inheritance chain

---

# 3. Hierarchical Inheritance

## Definition

Multiple child classes inherit from one parent class.

---

# Example

```text
       Animal
       /   \
     Dog   Cat
```

---

## Code Example

```java
class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}
```

---

# Quick Revision

## Hierarchical Inheritance

- One parent
- Multiple child classes
- Shared properties

---

# Important Points

1. Inheritance improves code reusability.
2. `extends` keyword is used.
3. Child class inherits parent properties.
4. Java supports single inheritance with classes.
5. Inheritance is an important OOP concept.

---

# Real Life Example

| Parent Class | Child Class |
|---|---|
| Animal | Dog |
| Vehicle | Car |
| Person | Student |

---

# Advantages of Inheritance

| Advantage | Description |
|---|---|
| Reusability | Reuse existing code |
| Less Code | Reduces duplication |
| Better Structure | Organized programs |

---

# Difference Between Inheritance Types

| Type | Structure |
|---|---|
| Single | One parent → One child |
| Multilevel | Parent → Child → Grandchild |
| Hierarchical | One parent → Multiple children |

---

# Important Interview Points

1. Inheritance means acquiring properties.
2. `extends` keyword is used.
3. Child class accesses parent methods.
4. Supports code reusability.
5. One of the core OOP concepts.

---

# Conclusion

Inheritance allows one class to use properties and methods of another class.

It helps create reusable and organized Java programs.