# Arrays in Java

## Definition

An array in Java is a collection of multiple values stored in a single variable.

Arrays store elements of the same data type.

---

# Types of Arrays in Java

| Array Type | Description |
|---|---|
| 1D Array | Stores elements in single row |
| 2D Array | Stores elements in rows and columns |

---

# 1. One Dimensional Array (1D Array)

## Definition

A one-dimensional array stores elements in a single list.

---

## Syntax

```java
dataType[] arrayName = {values};
```

---

## Example

```java
int[] numbers = {10, 20, 30, 40};
```

---

## Accessing Elements

```java
System.out.println(numbers[0]);
```

---

## Traversing Array

```java
for(int i = 0; i < numbers.length; i++) {

    System.out.println(numbers[i]);
}
```

---

# Important Points About 1D Array

1. Stores multiple values in one variable.
2. All elements must be same data type.
3. Index starts from 0.
4. Array size becomes fixed after creation.
5. Arrays improve code efficiency.

---

# 2. Two Dimensional Array (2D Array)

## Definition

A two-dimensional array stores data in rows and columns like a table.

---

## Syntax

```java
dataType[][] arrayName = {

    {value1, value2},
    {value3, value4}
};
```

---

## Example

```java
int[][] numbers = {

    {10, 20},
    {30, 40}
};
```

---

## Accessing Elements

```java
System.out.println(numbers[0][1]);
```

---

# Traversing 2D Array

```java
for(int i = 0; i < numbers.length; i++) {

    for(int j = 0; j < numbers[i].length; j++) {

        System.out.println(numbers[i][j]);
    }
}
```

---

# Important Points About 2D Array

1. Stores data in table format.
2. Uses rows and columns.
3. Requires nested loops for traversal.
4. Index starts from 0.
5. Useful for matrices and tables.

---

# Difference Between 1D and 2D Array

| Feature | 1D Array | 2D Array |
|---|---|---|
| Structure | Single row | Rows and columns |
| Index | One index | Two indexes |
| Loop Required | Single loop | Nested loop |
| Example | List | Table |

---

# Complete Example

```java
public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        for(int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }
}
```

---

# Conclusion

Arrays are used to store multiple values efficiently in Java.

1D arrays store data in a list format, while 2D arrays store data in table format.