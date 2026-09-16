# Sort Colors

**LeetCode Problem:** 75
**Difficulty:** Medium
**Topics:** Array, Two Pointers, Sorting

## Problem

You are given an array `nums` containing `0`, `1`, and `2`, representing three colors:

* `0` → Red
* `1` → White
* `2` → Blue

Sort the array **in-place** so that objects of the same color are adjacent, with the colors in the order:

```text
0 → 1 → 2
```

You must solve the problem **without using the built-in sorting function**.

## Example

### Input

```text
nums = [2,0,2,1,1,0]
```

### Output

```text
[0,0,1,1,2,2]
```

## Approach — Dutch National Flag Algorithm

We use three pointers:

```text
low
mid
high
```

The array is divided into four regions:

```text
[ 0 ... low-1 ]     → 0
[ low ... mid-1 ]   → 1
[ mid ... high ]    → unknown
[ high+1 ... end ]  → 2
```

### Rules

#### If `nums[mid] == 0`

Swap `nums[low]` and `nums[mid]`.

Then:

```text
low++
mid++
```

Because the element placed at `mid` is already processed.

#### If `nums[mid] == 1`

The element is already in the correct middle section.

So:

```text
mid++
```

#### If `nums[mid] == 2`

Swap `nums[mid]` and `nums[high]`.

Then:

```text
high--
```

**Do not increment `mid` here.**

The element coming from the `high` side has not been checked yet, so it must be processed again.

## Algorithm

1. Initialize `low = 0`, `mid = 0`, and `high = nums.length - 1`.
2. Continue while `mid <= high`.
3. If the current element is `0`, move it to the left.
4. If the current element is `1`, move `mid` forward.
5. If the current element is `2`, move it to the right.
6. Repeat until all elements are processed.

## Complexity

**Time Complexity:** `O(n)`

Each element is processed at most a constant number of times.

**Space Complexity:** `O(1)`

The algorithm sorts the array in-place and uses only a few variables.

## Key Concept

The **Dutch National Flag Algorithm** is an efficient three-pointer technique for partitioning an array containing three distinct values.

Instead of using:

```java
Arrays.sort(nums);
```

we solve the problem in:

```text
O(n) time
O(1) extra space
```

## Java Solution

The solution is implemented in:

```text
solution.java
```
