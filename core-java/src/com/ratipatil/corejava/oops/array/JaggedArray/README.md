# Jagged Array in Java

## Definition

A Jagged Array is a type of 2D array where each row can have different number of columns.

It is also called:
- Uneven Array
- Ragged Array

---

# Simple Understanding

Normal 2D Array:

```text
10 20 30
40 50 60
70 80 90
```

All rows have same columns.

---

Jagged Array:

```text
10 20 30
40 50
60 70 80 90
```

Rows have different columns.

---

# Syntax

```java
dataType[][] arrayName = {

    {values},
    {values},
    {values}
};
```

---

# Example

```java
int[][] numbers = {

    {10, 20, 30},
    {40, 50},
    {60, 70, 80, 90}
};
```

---

# Accessing Elements

```java
System.out.println(numbers[0][1]);
```

---

# Traversing Jagged Array

```java
for(int i = 0; i < numbers.length; i++) {

    for(int j = 0; j < numbers[i].length; j++) {

        System.out.println(numbers[i][j]);
    }
}
```

---

# Important Points

1. Jagged array is a special type of 2D array.
2. Each row can have different size.
3. Uses nested loops for traversal.
4. Saves memory when data size differs.
5. Very useful in dynamic table structures.

---

# Quick Revision Points

## Jagged Array

- Unequal columns
- Different row sizes
- 2D array type
- Nested loops required
- Flexible structure

---

# Difference Between 2D Array and Jagged Array

| 2D Array | Jagged Array |
|---|---|
| Equal columns | Unequal columns |
| Fixed structure | Flexible structure |
| Uniform rows | Different row sizes |

---

# Real Life Example

| Situation | Jagged Array Use |
|---|---|
| Student marks | Different subjects |
| Monthly sales | Different weekly entries |
| Matrix with uneven data | Flexible rows |

---

# Complete Example

```java
public class JaggedArrayExample {

    public static void main(String[] args) {

        int[][] data = {

            {1, 2},
            {3, 4, 5},
            {6}
        };

        for(int i = 0; i < data.length; i++) {

            for(int j = 0; j < data[i].length; j++) {

                System.out.print(data[i][j] + " ");
            }

            System.out.println();
        }
    }
}
```

---

# Conclusion

Jagged arrays are useful when rows contain different amounts of data.

They provide flexibility and efficient memory usage in Java.