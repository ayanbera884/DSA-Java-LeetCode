# Container With Most Water

**LeetCode Problem:** 11
**Difficulty:** Medium
**Topic:** Arrays, Two Pointers

## Problem

You are given an integer array `height` where `height[i]` represents the height of a vertical line at position `i`.

Choose two lines that, together with the x-axis, form a container that can hold the maximum amount of water.

Return the maximum amount of water the container can store.

## Example

### Input

```text
height = [1,8,6,2,5,4,8,3,7]
```

### Output

```text
49
```

### Explanation

The maximum area is obtained by choosing the lines with heights `8` and `7`.

```text
width = 8
minimum height = 7

area = width × minimum height
     = 8 × 7
     = 56
```

> Note: For the standard LeetCode example above, the correct maximum area is **49**, achieved by heights `8` and `7` with width `7`.

## Approach — Two Pointers

We use two pointers:

* `left` starts from the beginning of the array.
* `right` starts from the end of the array.
* Calculate the area between the two pointers.
* Move the pointer pointing to the **smaller height**.
* Continue until `left` and `right` meet.

### Formula

```text
area = (right - left) × min(height[left], height[right])
```

## Why Move the Smaller Pointer?

The width decreases whenever we move a pointer.

If we move the pointer with the **larger height**, the smaller height still limits the container, so we cannot get a better area because the width has decreased.

Therefore, we move the pointer with the **smaller height** to search for a potentially taller boundary.

## Complexity

**Time Complexity:** `O(n)`

Each pointer moves from one end toward the other at most once.

**Space Complexity:** `O(1)`

Only a few variables are used.

## Key Concept

The important idea is:

> **Maximum Area = Width × Minimum Height**

The Two Pointer technique allows us to solve the problem in `O(n)` time instead of checking every possible pair.

## Java

The solution is implemented in:

```text
solution.java
```
