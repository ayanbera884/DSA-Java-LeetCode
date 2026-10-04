# Set Matrix Zeroes

## 📌 Problem

Given an `m × n` integer matrix, if an element is `0`, set its **entire row and entire column to `0`**.

The modification must be done **in-place**.

### Example

**Input:**

```text
1  1  1
1  0  1
1  1  1
```

**Output:**

```text
1  0  1
0  0  0
1  0  1
```

---

## 💡 Approach

We use the **first row and first column as markers** to store information about which rows and columns need to become zero.

### Step 1: Check the first row

We store whether the first row originally contains a `0`.

```java
boolean firstRowZero = false;
```

### Step 2: Check the first column

We store whether the first column originally contains a `0`.

```java
boolean firstColZero = false;
```

### Step 3: Mark rows and columns

For every `0` inside the matrix:

```java
matrix[i][0] = 0;
matrix[0][j] = 0;
```

Here:

* `matrix[i][0]` → marks the **entire row**
* `matrix[0][j]` → marks the **entire column**

### Step 4: Set the inner matrix to zero

Using the markers:

```java
if (matrix[i][0] == 0 || matrix[0][j] == 0) {
    matrix[i][j] = 0;
}
```

This converts all elements belonging to a marked row or column into `0`.

### Step 5: Handle the first row and first column

Finally, if the first row or first column originally contained `0`, make the entire row/column zero.

---

## 💻 Java Solution

```java
class Solution {

    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set inner matrix to zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row to zero
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set first column to zero
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
```

---

## 🧠 Key Concept

The main trick is:

```text
First Row    → Column Markers
First Column → Row Markers
```

For example:

```text
1  0  1
0  0  1
1  1  1
↑     ↑
row   column
marker marker
```

If:

```java
matrix[i][0] == 0
```

then **row `i` must become zero**.

If:

```java
matrix[0][j] == 0
```

then **column `j` must become zero**.

---

## ⏱️ Complexity

### Time Complexity

```text
O(m × n)
```

We traverse the matrix a few times, but each traversal is at most `m × n`.

### Space Complexity

```text
O(1)
```

We don't create another matrix or separate row/column arrays.

---

## 📚 What I Learned

* Matrix traversal
* Row and column manipulation
* Using matrix elements as markers
* In-place modification
* Optimizing space complexity
* `O(m × n)` time with `O(1)` extra space

### 🔑 Remember

> **First row = column markers**
> **First column = row markers**
