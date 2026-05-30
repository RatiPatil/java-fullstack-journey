# Java Stream API

## What is Stream API?

Stream API was introduced in Java 8.

It is used to process collections of data in a simple and readable way.

A Stream does not store data.
It performs operations on data from collections.

---

# Stream API Flow

Collection
↓
Stream
↓
Intermediate Operations
↓
Terminal Operation
↓
Result

Example:

List
↓
filter()
↓
map()
↓
collect()
↓
New List

---

# Methods Covered

| Method | Purpose |
|----------|----------|
| filter() | Select elements based on condition |
| map() | Transform elements |
| distinct() | Remove duplicates |
| sorted() | Sort elements |
| limit() | Get first N elements |
| skip() | Skip first N elements |
| count() | Count elements |
| min() | Find smallest value |
| max() | Find largest value |
| reduce() | Combine elements |
| collect() | Convert stream to collection |
| forEach() | Iterate elements |
| anyMatch() | Check if any element matches |
| allMatch() | Check if all elements match |
| noneMatch() | Check if no element matches |
| findFirst() | Get first element |
| findAny() | Get any element |

---

# Output

Original List:
[10, 20, 30, 40, 50, 20, 30]

filter() - Numbers Greater Than 20
30
40
50
30

map() - Multiply By 2
20
40
60
80
100
40
60

distinct() - Remove Duplicates
10
20
30
40
50

sorted() - Ascending Order
10
20
20
30
30
40
50

limit() - First 3 Elements
10
20
30

skip() - Skip First 3 Elements
40
50
20
30

count()
Total Elements = 7

min()
Minimum = 10

max()
Maximum = 50

reduce()
Sum = 200

collect()
[30, 40, 50, 30]

anyMatch()
true

allMatch()
true

noneMatch()
true

findFirst()
10

findAny()
10

---

# Quick Revision Notes

## filter()

Used to select elements based on a condition.

Example:

```java
filter(num -> num > 20)
```

---

## map()

Used to transform data.

```java
map(num -> num * 2)
```

---

## distinct()

Removes duplicate values.

```java
distinct()
```

---

## sorted()

Sorts elements.

```java
sorted()
```

---

## reduce()

Combines all elements into a single value.

```java
reduce(0, Integer::sum)
```

Used for:
- Sum
- Product
- Custom calculations

---

## collect()

Converts Stream into List, Set, etc.

```java
collect(Collectors.toList())
```

---

# Interview Questions

### What is Stream API?

A feature introduced in Java 8 used for processing collections efficiently.

### Is Stream a data structure?

No.
It processes data but does not store data.

### Difference between Collection and Stream?

Collection stores data.
Stream processes data.

### What are Intermediate Operations?

Operations that return another Stream.

Examples:
- filter()
- map()
- sorted()

### What are Terminal Operations?

Operations that produce final result.

Examples:
- collect()
- count()
- forEach()

---

# Learning Outcome

After completing this example you can:

✅ Use Stream API confidently

✅ Perform filtering and sorting

✅ Transform data using map()

✅ Use match operations

✅ Convert streams into collections

✅ Answer Stream API interview questions