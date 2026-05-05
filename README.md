# cyclic-substring-assignment

Cyclic Substring and Array Transformation Assignment

Problem 1: Cyclic Substring Maximum Sum

Problem:
Find the maximum sum of a cyclic substring such that:
- Each character is unique
- Characters have values: a = 1, b = 2, ..., z = 26

Approach:
- Used sliding window technique
- Converted string into circular form by doubling it
- Used HashSet to maintain unique characters

Time Complexity:
O(n)

How to Run:
1. Compile:
   javac Problem1.java

2. Run:
   java CyclicSubstringMaxSum



Problem 2: Array Transformation Cost Minimization

Problem:
Given an array, you can add or subtract K from any element.
Goal:
- Make all elements equal
- Return minimum operations or -1 if not possible

Approach:
- Checked if all elements have same remainder modulo K
- Sorted the array
- Chose median to minimize total operations
- Calculated steps using |A[i] - median| / K

Time Complexity:
O(n log n)

How to Run:
1. Compile:
   javac Problem2.java

2. Run:
   java ArrayTransformation


Output:
Screenshots of execution are attached in the repository.


Summary:
- Problem 1 uses sliding window and circular array concept
- Problem 2 uses modulo property and median concept
