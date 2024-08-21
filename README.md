# Sorting Algorithms

This repository contains Java implementations of several fundamental sorting algorithms. Each algorithm is organized into its own subdirectory within the `SORTING ALGORITHMS` folder.

## Folder Structure

- `BubbleSort/`: Contains the implementation of the Bubble Sort algorithm.
- `SelectionSort/`: Contains the implementation of the Selection Sort algorithm.
- `InsertionSort/`: Contains the implementation of the Insertion Sort algorithm.
- `MergeSort/`: Contains the implementation of the Merge Sort algorithm.

## Algorithms

### 1. Bubble Sort

Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted.

- **Folder:** `BubbleSort/`
- **File:** `BubbleSortAlgorithm.java`
- **Key Points:**
  - Easy to implement but inefficient for large lists.
  - Time Complexity: O(n^2).

### 2. Selection Sort

Selection Sort is an in-place comparison-based sorting algorithm. It repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first unsorted element.

- **Folder:** `SelectionSort/`
- **File:** `SelectionSortAlgorithm.java`
- **Key Points:**
  - Performs fewer swaps compared to Bubble Sort.
  - Time Complexity: O(n^2).

### 3. Insertion Sort

Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms like Merge Sort.

- **Folder:** `InsertionSort/`
- **File:** `InsertionSortAlgorithm.java`
- **Key Points:**
  - Efficient for small or nearly sorted lists.
  - Time Complexity: O(n^2).

### 4. Merge Sort

Merge Sort is a divide-and-conquer algorithm that divides the list into equal halves, sorts each half, and then merges the sorted halves to produce a sorted list.

- **Folder:** `MergeSort/`
- **File:** `MergeSortAlgorithm.java`
- **Key Points:**
  - Stable sorting algorithm with consistent O(n log n) time complexity.
  - Requires additional space for the temporary arrays.

## How to Run

To run the sorting algorithms, follow these steps:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/2Ntlaks/SORTING-ALGORITHMS.git
   ```

## Author

Ntlakanipho Mgaguli

If you have any questions or suggestions, feel free to reach out!
