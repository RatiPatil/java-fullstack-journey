# Java Collections Framework

This repository contains simple and clean examples of Java Collections Framework for learning and interview preparation.

---

# 📌 Topics Covered

1. Collection API Overview
2. ArrayList
3. Set (HashSet)
4. Map (HashMap)
5. Comparable Interface
6. Comparator Interface (explained conceptually or in separate file if added)

---

# 📘 1. Collection API

- Root interface of Java Collections
- Used to store group of objects
- Main child interfaces:
    - List
    - Set
    - Queue

---

# 📗 2. ArrayList

- Dynamic array (resizable)
- Maintains insertion order
- Allows duplicate values

### Example Use:
- Storing list of students
- Maintaining ordered data

---

# 📕 3. Set

- Stores UNIQUE elements only
- No duplicates allowed
- Does not guarantee order (HashSet)

### Example Use:
- Unique usernames
- Removing duplicates from data

---

# 📙 4. Map

- Stores data in KEY-VALUE pairs
- Keys are unique
- Values can be duplicated

### Example Use:
- Student ID → Name mapping
- Database-like structure

---

# 📘 5. Comparable

- Used for NATURAL sorting
- Implemented inside class
- Uses compareTo() method

### Example:
Sorting students by ID automatically

---

# 📕 6. Comparator

- Used for CUSTOM sorting
- Implemented outside class
- Uses compare() method

### Example:
Sorting by name, age, marks, etc.

---

# 🔥 Key Differences

| Feature | Comparable | Comparator |
|--------|-----------|------------|
| Sorting | Natural order | Custom order |
| Method | compareTo() | compare() |
| Location | Inside class | Outside class |
| Flexibility | One way | Multiple ways |

---

# 🚀 Learning Outcome

After studying this module, you will understand:

- How Java stores data collections
- How to choose correct collection type
- How sorting works internally
- Interview-level understanding of Collections Framework

---

# 👨‍💻 Author

Java Collections Learning Series (Practice Project)