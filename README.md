# DSA Journey

![Language](https://img.shields.io/badge/language-Java-007396?logo=openjdk&logoColor=white)
![Solutions](https://img.shields.io/badge/solutions-83-brightgreen)
![Topics](https://img.shields.io/badge/topics-10-blue)
![License](https://img.shields.io/badge/license-MIT-lightgrey)

My data structures & algorithms practice in **Java**, organized by topic. The goal isn't a pile of solved problems. It's building pattern recognition: knowing *which technique fits which problem* (two pointers, sliding window, binary search on the answer, stack-based matching, hashing, and so on).

---

## Contents

- [Repository structure](#repository-structure)
- [How to run a solution](#how-to-run-a-solution)
- [Progress](#progress)
- [Problem index](#problem-index)
  - [Basic Math](#basic-math)
  - [Basic Recursion](#basic-recursion)
  - [Arrays](#arrays)
  - [Sorting](#sorting)
  - [Binary Search](#binary-search)
  - [Hashing](#hashing)
  - [Strings](#strings)
  - [DSA Challenge](#dsa-challenge)
- [Patterns I keep reaching for](#patterns-i-keep-reaching-for)
- [Roadmap](#roadmap)
- [License](#license)

---

## Repository structure

```
DSA-Journey/
├── Basics/             Java warm-up (Hello World)
├── Basic Math/         Digits, primes, GCD, divisors, palindromes
├── Basic Recursion/    Factorial, Fibonacci, printing, palindromes
├── Arrays/             Fundamentals + Medium/ (Kadane, Two Sum, Dutch flag...)
├── Search/             Linear search
├── Sort/               Bubble, Selection, Insertion, Merge, Quick
├── Binary_Search/      Classic BS, rotated arrays, BS on answer (A_BS_ON_ANS/)
├── Hashing/            Frequency counting with arrays and HashMap
├── String/             Palindromic substrings, parenthesis problems, parsing
├── DSA Challenge/      Larger array problems (Next Permutation, Pascal, Set Matrix Zeroes)
└── DSA_TODO.txt        Running notes on what to revisit
```

Every solution is a **standalone `.java` file with its own `main` method**, with a sample input at the bottom so you can run it straight away.

---

## How to run a solution

You need a JDK. Use Java 18 or newer, because `KokoEatingBananas` uses `Math.ceilDiv`, which was added in Java 18.

```bash
# from the folder containing the file
javac Largest.java
java Largest
```

Example:

```bash
cd Arrays/Medium
javac KadanesAlgo.java
java KadanesAlgo
```

> Some files in `Arrays/Medium/` declare `package Medium;`. For those, compile from the `Arrays/` folder instead:
> `javac -d out Medium/KadanesAlgo.java && java -cp out Medium.KadanesAlgo`

---

## Progress

| Topic | Solutions |
|---|---:|
| Basics | 1 |
| Basic Math | 7 |
| Basic Recursion | 9 |
| Arrays (incl. Medium) | 21 |
| Search | 1 |
| Sort | 6 |
| Binary Search (incl. BS on answer) | 17 |
| Hashing | 4 |
| String | 14 |
| DSA Challenge | 3 |
| **Total** | **83** |

---

## Problem index

### Basic Math

| File | Problem | Technique | Time |
|---|---|---|---|
| `DigitsInNo` | Count digits in a number | `log10` | O(1) |
| `ReverseDigits` | Reverse an integer with overflow check | Digit extraction | O(log n) |
| `IsPalindrome` | Is a number a palindrome | Reverse and compare | O(log n) |
| `ArmStrong` | Armstrong number check | Digit powers sum | O(log n) |
| `Divisors` | All divisors of n | Loop to √n, add the pair `i` and `n/i` | O(√n) |
| `PrimeNo` | Prime check | Trial division up to √n | O(√n) |
| `GCD2No` | GCD of two numbers | Euclidean algorithm | O(log min(a,b)) |

### Basic Recursion

| File | Problem | Technique |
|---|---|---|
| `Print1ToN` | Print 1 to N | Recursion (print on the way back) |
| `PrintNTimes` | Print a string N times | Recursion |
| `SumNNo` | Sum of first N numbers | Recursion |
| `FactorialN` | Factorial | Recursion |
| `FibonaciRec` | Nth Fibonacci | Recursion, O(2ⁿ) |
| `Fibonaci` | Fibonacci series | Iterative array, O(n) |
| `ReverseArray` | Reverse an array | Two pointers |
| `Palindrome` | Valid palindrome string (ignores punctuation and case) | Two pointers |
| `PalindromeRec` | Palindrome check, recursive version | Recursion |

### Arrays

**Fundamentals**

| File | Problem | Technique | Time |
|---|---|---|---|
| `Array1`, `Largest` | Largest element | Single pass | O(n) |
| `SecondLargest` | Second largest element | Track two maxima in one pass | O(n) |
| `ArraySorted` | Is the array sorted | Adjacent comparison | O(n) |
| `IfArraySortedRoteted` | Is the array sorted and rotated | Count order breaks (at most 1) | O(n) |
| `LinearSearch` | Linear search | Scan | O(n) |
| `RemoveSortedArrayDuplicates` | Remove duplicates in place from a sorted array | Two pointers | O(n) |
| `RotateLeftByOne` | Rotate array left | Reversal algorithm | O(n) |
| `RotateRightByOne` | Rotate array right by k | Shift one step, k times | O(n·k) |
| `MoveZerosAtEnd` | Move zeros to the end | Two pointers | O(n) |
| `UnionOfSortedArray` | Union of two sorted arrays | Two pointers merge | O(n+m) |
| `FindMissingNumber` | Missing number in 1..N | HashSet | O(n) |
| `NoAppearOnce` | Number appearing once, rest twice | XOR | O(n) |
| `Consective1s` | Max consecutive 1s | Running counter | O(n) |
| `LongestSubArrayOfSum` | Longest subarray with sum K | Sliding window | O(n) |

**Medium** (`Arrays/Medium/`)

| File | Problem | Technique | Time |
|---|---|---|---|
| `TwoSum` | Two Sum | HashMap of complements | O(n) |
| `Sort012` | Sort 0s, 1s and 2s | Dutch National Flag (3 pointers) | O(n) |
| `MajorityElem` | Majority element (> n/2) | Boyer-Moore voting | O(n) |
| `KadanesAlgo` | Maximum subarray sum | Kadane's algorithm | O(n) |
| `BuyAndSellStocks` | Best time to buy and sell stock | Track min price so far | O(n) |
| `RearrangeBySign` | Rearrange by sign (alternating) | Fill even/odd positions | O(n) |

### Sorting

| File | Algorithm | Time (avg) | Space |
|---|---|---|---|
| `BubbleSort` | Bubble sort, with early exit | O(n²) | O(1) |
| `SelectionSort` | Selection sort | O(n²) | O(1) |
| `InsertionSort` | Insertion sort | O(n²) | O(1) |
| `MergeSort` | Merge sort | O(n log n) | O(n) |
| `QuickSortClass`, `QuickSortClass2` | Quick sort (two versions) | O(n log n) | O(log n) stack |

### Binary Search

**Classic and variants**

| File | Problem |
|---|---|
| `BasicSearch` | Binary search (recursive) |
| `LowerBound` | Upper/lower bound of a key |
| `InsertAtPosition` | Search insert position |
| `FloorCeil` | Floor and ceiling of a value |
| `FirstAndLastOccurance` | First and last position of a key |
| `CountOccurances` | Count occurrences in a sorted array |

**Rotated sorted array**

| File | Problem |
|---|---|
| `SearchInSortedRotatedArray` | Search in rotated array (distinct values) |
| `SearchSortedRotatedDup` | Search in rotated array (with duplicates) |
| `FindMinSortRotated`, `FindMinInSortedRotated` | Minimum in rotated array |
| `RotatedHowManyTimes` | How many times the array was rotated |

**Other**

| File | Problem |
|---|---|
| `NonDupElement` | Single non-duplicate element (uses the `mid ^ 1` trick) |
| `PeakElement` | Find a peak element |

**Binary Search on the Answer** (`Binary_Search/A_BS_ON_ANS/`)

| File | Problem |
|---|---|
| `SquareRoot` | Integer square root |
| `NthRoot` | Nth root of a number |
| `KokoEatingBananas` | Minimum eating speed (Koko Eating Bananas) |
| `MakingBanquets` | Minimum days to make m bouquets |

### Hashing

| File | Problem | Technique |
|---|---|---|
| `BasicHashing` | Frequency of numbers and characters | `HashMap`, `int[26]` char hash |
| `CountFreqElements` | Frequency of each element | Visited array (brute force) |
| `HighestLowest` | Element with the highest frequency | `HashMap` + `getOrDefault` |
| `HashingLeet` | Frequency counting practice | `HashMap` |

### Strings

**Parenthesis family** (counters and stacks)

| File | Problem | Technique |
|---|---|---|
| `ValidParenthesis` | Valid parentheses with `()[]{}` | Stack |
| `MaxNestedParenthesis` | Maximum nesting depth | Depth counter |
| `ParenthesisProblem` | Remove outermost parentheses | Depth counter |
| `ScoreOfParenthesis` | Score of parentheses | Depth counter, 2^depth |
| `MinAddParenthesisValid` | Minimum additions to make valid | Counters |
| `MinRemoveParenthesisValid` | Minimum removals to make valid | Stack + StringBuilder |
| `MinInsertDoubleClosing` | Balance when `(` needs `))` | Counters |

**Palindromic substrings**

| File | Problem | Technique |
|---|---|---|
| `PalindromeSubString` | Longest palindromic substring | Expand around center, O(n²) |
| `CountPalSubStrings` | Count palindromic substrings | Expand around center, O(n²) |

**Parsing and substrings**

| File | Problem |
|---|---|
| `StringToInt` | String to integer (atoi) with overflow handling |
| `RomanToInt` | Roman numeral to integer |
| `PrintAllSubStrings` | Print all substrings |
| `SumOfBeautySubString` | Sum of beauty of all substrings |

### DSA Challenge

`DSA Challenge/Arrays/Arrays pt1/`

| File | Problem | Technique |
|---|---|---|
| `NextPermutation` | Next permutation | Find pivot, swap, reverse suffix (O(n)) |
| `PascalTraingle` | Pascal's triangle | Build each row from the previous row |
| `SetMatrixZero` | Set matrix zeroes | First row/column as markers, O(1) extra space |

---

## Patterns I keep reaching for

- **Two pointers**: remove duplicates, move zeros, palindromes, union of sorted arrays
- **Sliding window**: longest subarray with a given sum
- **Hashing for O(n)**: Two Sum, frequency counting
- **Binary search on the answer**: square root, Nth root, Koko Eating Bananas
- **Modified binary search**: rotated arrays, peak element, single non-duplicate
- **Stack / depth counter**: every parenthesis problem
- **Expand around center**: palindromic substrings
- **In-place tricks**: Dutch National Flag, Next Permutation, Set Matrix Zeroes
- **XOR**: finding the element that appears once

---

## Roadmap

- [ ] Add `// Problem / Approach / Time / Space` comments to every file
- [ ] Cover the next core topics: Stack & Queue, Linked List, Trees, Graphs, Dynamic Programming
- [ ] Add a few harder problems per topic once the fundamentals feel solid
- [ ] Keep this table and the progress counts updated

---

## License

Released under the [MIT License](LICENSE).
