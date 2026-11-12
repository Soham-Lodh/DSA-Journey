# Data Structures & Algorithms in Java

**Soham Lodh** · B.Tech CSE (AI & ML), KIIT University

Implementations of core data structures and algorithms in Java, built from brute-force baselines toward optimized solutions, plus **281 solved LeetCode problems** (Easy 157 · Medium 112 · Hard 11) in a separate, documented collection.

![Java](https://img.shields.io/badge/Java-primary-orange)
![LeetCode](https://img.shields.io/badge/LeetCode-281%20solved-FFA116)
![Problems](https://img.shields.io/badge/Problems%20documented-281-blue)

---

## At a glance

| Track | Location | Contents |
|---|---|---|
| Core DSA (Java) | Numbered folders, 1 to 16 | 133 standalone Java files across 16 topics |
| LeetCode collection | [`leetcode/`](./leetcode) | 281 problem folders, each with a README and a solution file |

Each core file is standalone and runs from the command line:

```bash
javac "2. Arrays/SubArrays/SubArraySum_Kadane_Algorithm.java"
java -cp "2. Arrays/SubArrays" SubArraySum_Kadane_Algorithm
```

---

## Approach

For each topic I write the brute-force version first, measure why it is slow, then move toward an optimized solution. The clearest example is maximum subarray sum, implemented in four stages:

| File | Complexity | Approach |
|---|---|---|
| [`Print_SubArrays.java`](./2.%20Arrays/SubArrays/Print_SubArrays.java) | O(n³) | Enumerate and print every subarray |
| [`SubArraySum_BruteForce.java`](./2.%20Arrays/SubArrays/SubArraySum_BruteForce.java) | O(n³) | Check every subarray, track the maximum |
| [`SubArraySum_PrefixSum.java`](./2.%20Arrays/SubArrays/SubArraySum_PrefixSum.java) | O(n²) | Precompute prefix sums to remove the inner loop |
| [`SubArraySum_Kadane_Algorithm.java`](./2.%20Arrays/SubArrays/SubArraySum_Kadane_Algorithm.java) | O(n) | Kadane's algorithm, single pass |

---

## Core DSA Topics

| # | Topic | Files | Highlights |
|---|---|---|---|
| 1 | [Patterns](./1.%20Patterns) | 16 | Basic and advanced nested-loop patterns: pyramids, diamonds, Floyd's triangle |
| 2 | [Arrays](./2.%20Arrays) | 21 | Search, two-pointer, prefix sums, Kadane's, trapping rain water, container with most water, 2D search and traversal |
| 3 | [Sorting](./3.%20Sorting) | 4 | Bubble, selection, insertion, counting sort |
| 4 | [Strings](./4.%20Strings) | 5 | Anagrams, palindrome checks, string compression, title case |
| 5 | [Bit Manipulation](./5.%20Bit%20Manipulation) | 10 | Set, clear, get and swap bits, count set bits, power-of-two check, fast exponentiation |
| 6 | [Recursion](./6.%20Recursion) | 21 | Tower of Hanoi, subsequences, tiling, friends pairing, fast power, first and last occurrence |
| 7 | [Divide and Conquer](./7.%20Divide%20and%20Conquer) | 4 | Merge sort, quick sort, search in rotated array |
| 8 | [Backtracking](./8.%20Backtracking) | 9 | N-Queens (once, count, all), N-Knights, permutations, subsets, Sudoku solver, grid paths |
| 9 | [Linked List](./9.%20Linked%20List) | 3 | Singly, doubly and circular linked lists |
| 10 | [Stack](./10.%20Stack) | 12 | Array and linked-list stacks, monotonic stack (next greater element, stock span), trapping rain water, valid parentheses, decode string |
| 11 | [Queue](./11.%20Queue) | 10 | Circular queue, queue from two stacks, reverse first K elements, sliding-window stream problems, connect ropes |
| 12 | [Greedy Algorithms](./12.%20Greedy%20Algorithms) | 8 | Activity selection, fractional knapsack, job sequencing, max pair chain, chocolate distribution |
| 13 | [Binary Trees](./13.%20Binary%20Trees) | 1 | Tree construction and traversal |
| 14 | [BST](./14.%20BST) | 1 | Binary search tree operations |
| 15 | [Heaps](./15.%20Heaps) | 7 | Min and max heap, heap sort, sliding window maximum, K nearest cars, weakest soldier |
| 16 | [Hashing](./16.%20Hashing) | 1 | Hash map implementation |

Topics not yet covered in this repository: graphs (BFS, DFS, shortest paths), dynamic programming as a standalone track, tries, and disjoint set union. Some of these appear inside LeetCode solutions (see below) but do not yet have their own core-track folder.

---

## LeetCode Collection

All solutions live in [`leetcode/`](./leetcode). Each problem folder contains a `README.md` with the problem title, difficulty, language, runtime, memory, a link to the problem, and the solve date, plus the solution file.

### Difficulty distribution

| Difficulty | Solved |
|---|---|
| Easy | 157 |
| Medium | 112 |
| Hard | 11 |
| **Total** | **281** |

### Languages

Java (263 solutions), C (15), JavaScript (2). Difficulty and language are taken from each problem's README metadata.

### Solve timeline

Problems were solved from September 2025 through November 2026. The most active month was January 2026 (70 problems), followed by February 2026 (57).

### Selected problems

| Problem | Difficulty | Folder |
|---|---|---|
| LRU Cache (O(1) get and put with a hash map and a doubly linked list) | Medium | [`lru-cache`](./leetcode/lru-cache) |
| Trapping Rain Water | Hard | [`trapping-rain-water`](./leetcode/trapping-rain-water) |
| Largest Rectangle in Histogram | Hard | [`largest-rectangle-in-histogram`](./leetcode/largest-rectangle-in-histogram) |
| Median of Two Sorted Arrays | Hard | [`median-of-two-sorted-arrays`](./leetcode/median-of-two-sorted-arrays) |
| Sliding Window Maximum | Hard | [`sliding-window-maximum`](./leetcode/sliding-window-maximum) |
| N-Queens | Hard | [`n-queens`](./leetcode/n-queens) |
| Sudoku Solver | Hard | [`sudoku-solver`](./leetcode/sudoku-solver) |

All 11 Hard problems: Basic Calculator, Distinct Subsequences, First Missing Positive, Largest Rectangle in Histogram, Median of Two Sorted Arrays, Merge K Sorted Lists, N-Queens, N-Queens II, Sliding Window Maximum, Sudoku Solver, and Trapping Rain Water.

---

## Repository Structure

```
.
├── 1. Patterns/
├── 2. Arrays/            (Basics, 2D Arrays, Problems, SubArrays)
├── 3. Sorting/
├── 4. Strings/
├── 5. Bit Manipulation/
├── 6. Recursion/
├── 7. Divide and Conquer/
├── 8. Backtracking/
├── 9. Linked List/
├── 10. Stack/
├── 11. Queue/
├── 12. Greedy Algorithms/
├── 13. Binary Trees/
├── 14. BST/
├── 15. Heaps/
├── 16. Hashing/
└── leetcode/             (one folder per problem: README.md + solution)
```

---

## Languages & Tools

- **Java**: all core DSA implementations and most LeetCode solutions
- **C** and **JavaScript**: a small number of LeetCode solutions
- Plain `javac` and `java`; no build system or external dependencies

---

## Roadmap

- [x] Patterns
- [x] Arrays (basics, 2D, problems, subarrays)
- [x] Sorting
- [x] Strings
- [x] Bit Manipulation
- [x] Recursion
- [x] Divide and Conquer
- [x] Backtracking
- [x] Linked Lists
- [x] Stacks and Queues
- [x] Greedy Algorithms
- [x] Binary Trees and BST (initial)
- [x] Heaps (initial)
- [x] Hashing (initial)
- [ ] Graphs: BFS, DFS, topological sort, Dijkstra
- [ ] Dynamic Programming, as a standalone track
- [ ] Tries
- [ ] Disjoint Set Union
