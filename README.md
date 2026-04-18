# DSA Journey — Java

A structured, progressive record of my Data Structures and Algorithms learning in Java.

Each topic is approached with intention: start with the brute-force solution, understand *why* it's slow, then work toward optimized approaches. The goal isn't to collect solutions — it's to build genuine problem-solving intuition.

---

## 📂 Progress Tracker

### ✅ 1. Patterns
Foundational loop control and nested iteration logic.

| File | Description |
|---|---|
| `pattern_basic.java` | Standard patterns — triangles, squares, number/star grids |
| `pattern_advanced.java` | Complex patterns — diamonds, hollow shapes, alternating 0/1 grids |

---

### ✅ 2. Arrays

#### Basics

| File | Complexity | Description |
|---|---|---|
| `LinearSearch.java` | O(n) | Sequential search through unsorted array |
| `Binary_Search.java` | O(log n) | Divide-and-conquer search on sorted array |
| `Largest_Element.java` | O(n) | Single-pass max using `Integer.MIN_VALUE` init |
| `Smallest_Element.java` | O(n) | Single-pass min using `Integer.MAX_VALUE` init |
| `Reverse_Array.java` | O(n) | In-place reversal using two-pointer swap |
| `Print_Pairs.java` | O(n²) | All unique pairs — nC2 = n*(n-1)/2 total |

#### SubArrays — Maximum Subarray Sum (3 approaches)

This is the clearest example of the brute → optimized progression in this repo:

| File | Complexity | Approach |
|---|---|---|
| `Print_SubArrays.java` | O(n³) | Print all subarrays with their sums |
| `SubArraySum_BruteForce.java` | O(n³) | Check every subarray, track max sum |
| `SubArraySum_PrefixSum.java` | O(n²) | Precompute cumulative sums, eliminate inner loop |
| `SubArraySum_Kadane_Algorithm.java` | O(n) | Kadane's algorithm — optimal single-pass solution |

---

## 🗺 Roadmap

Topics planned in order:

- [x] Patterns
- [x] Arrays — Basics
- [x] Arrays — SubArrays
- [ ] Arrays — Sorting (Bubble, Selection, Insertion, Merge, Quick)
- [ ] Strings
- [ ] Recursion & Backtracking
- [ ] Linked Lists
- [ ] Stacks & Queues
- [ ] Binary Trees & BST
- [ ] Heaps
- [ ] Hashing
- [ ] Graphs (BFS, DFS, Dijkstra)
- [ ] Dynamic Programming
- [ ] Greedy Algorithms

---

## 🧠 How I Approach Each Topic

1. **Understand the problem** before touching code
2. **Write the brute-force solution first** — correctness before optimization
3. **Analyze the complexity** — identify the bottleneck
4. **Optimize step by step** — don't jump straight to the optimal solution
5. **Annotate complexity** in code comments

This approach is intentional. Jumping to optimized solutions without understanding the brute force is how you memorize patterns without building intuition.

---

## 🛠 Language & Setup

**Language:** Java  
**IDE:** Any — files are standalone and runnable from the command line

```bash
# Compile
javac filename.java

# Run
java filename
```

---

> This repository will grow consistently as I progress through each topic.  
> Early code may not be perfectly clean — it will improve as understanding deepens.
