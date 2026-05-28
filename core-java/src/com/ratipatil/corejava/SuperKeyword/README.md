# this Keyword, super Keyword and Anonymous Object in Java

---

# 1. this Keyword

## Definition

The `this` keyword refers to the current object of a class.

It is mainly used to differentiate:
- Instance variables
- Local variables

---

# Example

```java
this.name = name;
```

---

# Simple Understanding

```java
Student(String name) {

    this.name = name;
}
```

| Part | Meaning |
|---|---|
| `this.name` | Instance variable |
| `name` | Local variable |

---

# Important Points About this Keyword

1. Refers to current object.
2. Used inside constructors and methods.
3. Resolves variable name conflict.
4. Can call current class methods.
5. Cannot be used inside static method directly.

---

# Quick Revision

## this Keyword

- Current object reference
- Used in constructor
- Resolves confusion
- Access current object members

---

# 2. super Keyword

## Definition

The `super` keyword refers to parent class object.

It is used to:
- Access parent class variables
- Call parent class methods
- Call parent class constructor

---

# Example

```java
super.color
```

---

# Simple Understanding

```java
super();
```

Calls parent class constructor.

---

# Important Points About super Keyword

1. Refers to parent class object.
2. Used in inheritance.
3. Calls parent constructor.
4. Accesses parent variables.
5. Accesses parent methods.

---

# Quick Revision

## super Keyword

- Parent class reference
- Used in inheritance
- Calls parent constructor
- Access parent members

---

# 3. Anonymous Object

## Definition

An anonymous object is an object created without storing reference.

---

# Example

```java
new Mobile().showMessage();
```

---

# Simple Understanding

Normally:

```java
Mobile obj = new Mobile();
obj.showMessage();
```

Anonymous Object:

```java
new Mobile().showMessage();
```

---

# Important Points About Anonymous Object

1. No reference variable.
2. Used for one-time usage.
3. Saves memory.
4. Cannot reuse object later.
5. Simple and short syntax.

---

# Quick Revision

## Anonymous Object

- No object name
- One-time use
- Direct method calling
- Short code

---

# Difference Between this and super

| this | super |
|---|---|
| Refers current object | Refers parent object |
| Current class | Parent class |
| Used inside same class | Used in inheritance |

---

# Real Life Example

| Concept | Real Life |
|---|---|
| this | Myself |
| super | Parent |
| Anonymous Object | Temporary visitor |

---

# Important Interview Points

1. `this` refers current object.
2. `super` refers parent object.
3. `super()` calls parent constructor.
4. Anonymous object has no reference.
5. Anonymous objects are for one-time use.

---

# Conclusion

- `this` keyword refers current object.
- `super` keyword refers parent object.
- Anonymous object is temporary object without reference variable.

These are very important concepts in Java OOPs.