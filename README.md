# CSC372MOD6 – Sorting and Searching with ArrayLists

A hand-written selection sort that orders an `ArrayList<Student>` by roll number or by name using `Comparator` objects, plus zyBooks implementations of the classic sorting and searching algorithms.

## Overview

This is **CSU Global CSC372 (Programming II), Module 6: Sorting and Searching and Using Array Lists** (Chapter 18 of *Programming in Java with ZyLab*). It is an Eclipse Java project with two packages: `module6` (the module program) and `textbook` (algorithm examples).

## `module6` – Student sorting with Comparators

| Class | Role |
|---|---|
| `Student` | Immutable data class: `rollno`, `name`, `address`, with getters and a `toString()` of the form `Student{rollno=…, name='…', address='…'}` |
| `SortByRoll implements Comparator<Student>` | Compares roll numbers with `Integer.compare` |
| `SortByName implements Comparator<Student>` | Compares names with `compareToIgnoreCase` |
| `SelectionSort.sort(List<Student>, Comparator<Student>)` | **Selection sort written by hand** (it doesn't use `Collections.sort`). The outer loop marks the boundary of the unsorted region. The inner loop uses the comparator to find the smallest remaining element, which is then swapped into place with `list.set`. O(n²) comparisons, sorts in place. |
| `Main` | Adds 10 unsorted students to an `ArrayList`, prints the list, sorts it by roll number and prints it, then sorts it by name and prints it again. |

Because the comparator is passed in, the same sort method works for either ordering (the strategy pattern).

Output (verified, abridged):
```
Sorted by Roll Number:
Student{rollno=101, name='Noah', address='2483 Arapahoe Rd'}
Student{rollno=102, name='Sam', address='826 Uravan St'}
...
Sorted by Name:
Student{rollno=120, name='Ana', address='8445 Hampden Ave'}
Student{rollno=111, name='Ben', address='2336 Chambers St'}
...
```

## `textbook` – algorithm implementations

Each class has its own `main` that runs the algorithm on a hard-coded `int` array (`{10, 2, 78, 4, 45, 32, 7, 11}` for the sorts) and prints the UNSORTED and SORTED results.

| File | Algorithm | Notes |
|---|---|---|
| `SelectionSort.java` | Selection sort | O(n²) |
| `InsertionSort.java` | Insertion sort | Swaps each element left until it is in position; O(n²), fast on nearly-sorted data |
| `MergeSort.java` | Merge sort | Recursive `mergeSort(i, k)` plus `merge()` into a temporary array; O(n log n) |
| `QuickSort.java` | Quicksort | Middle-element pivot, `partition()` with low/high indexes, recursive `quicksort()`; O(n log n) on average |
| `LinearSearch.java` | Linear search | Scans `{2, 3, 4, 10, 40}` for 10 and prints "Element is present at index 3" |
| `BinarySearch.java` | Iterative binary search | Prompts for a value and searches the sorted array `{2, 4, 7, 10, 11, 32, 45, 87}` |

## Build and run

JDK 8 or newer:

```bash
mkdir -p bin
javac -d bin src/module6/*.java src/textbook/*.java
java -cp bin module6.Main
java -cp bin textbook.QuickSort        # UNSORTED: 10 2 78 4 45 32 7 11 / SORTED: 2 4 7 10 11 32 45 78
```

## Concepts demonstrated
- `ArrayList` of objects and the `List` interface
- `Comparator<T>` implementations that supply different sort orders
- Selection, insertion, merge and quick sort, and how their complexity compares
- Linear search compared with binary search (binary search needs sorted input)
- Recursion in divide-and-conquer sorts

## Module readings

Required
- [ ] Chapter 18 in Programming in Java with ZyLab
- [ ] Messer, O. (2023, July 12). Practical Java examples of the Big O Notation. Baeldung.
- [ ] GeeksforGeeks. (2025, July 31). Binary search.
- [ ] GeeksforGeeks. (2025, July 30). Linear search.

Recommended
- [ ] Burch, C. (n.d.). Chapter 20: Sorting. Programming via Java.
- [ ] GeeksforGeeks. (2025, March 12). ArrayList in Java.
- [ ] GeeksforGeeks. (2025, July 23). Bubble sort.
- [ ] GeeksforGeeks. (2025, July 23). Insertion sort.
- [ ] GeeksforGeeks. (2025, July 30). Merge sort.
- [ ] GeeksforGeeks. (2025, July 23). Selection sort.
- [ ] Sorting in Java. (2025, January 5). Baeldung.
