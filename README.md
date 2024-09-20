# Sudoku Solver

This is a Java program that solves Sudoku puzzles using a backtracking algorithm. The program reads puzzles from an input file and either outputs the solved puzzle or states that no solution is possible.

## Features

- Solves standard 9x9 Sudoku puzzles.
- Uses backtracking to fill in missing values.
- Handles multiple test cases from an input file.
- Outputs the solved grid or "No solution possible" if no valid solution exists.

## Input Format

The input file should follow this format:
- The first line contains a positive integer `n`, representing the number of puzzles.
- Each puzzle consists of 9 lines, with 9 integers (between 0 and 9), where 0 represents a blank space.

Example input:

1 0 6 0 1 0 4 0 5 0 0 0 8 3 0 5 6 0 0 2 0 0 0 0 0 0 0 1 8 0 0 4 0 7 0 0 6 0 0 6 0 0 0 3 0 0 7 0 0 9 0 1 0 0 4 5 0 0 0 0 0 0 0 2 0 0 7 2 0 6 9 0 0 0 4 0 5 0 8 0 7 0

## Output Format

For each test case, the program outputs:

- `Test case k:` (where `k` is the test case number)
- Either:
  - The solved 9x9 grid, with numbers separated by spaces, or
  - `No solution possible` if the puzzle cannot be solved.
  
The output is separated by a blank line between test cases.

Example output:

Test case 1: 9 6 3 1 7 4 2 5 8 1 7 8 3 2 5 6 4 9 2 5 4 6 8 9 7 3 1 8 2 1 4 3 7 5 9 6 4 9 6 8 5 2 3 1 7 7 3 5 9 6 1 8 2 4 5 8 9 7 1 3 4 6 2 3 1 7 2 4 6 9 8 5 6 4 2 5 9 8 1 7 3


## How to Run

1. Ensure you have [Java installed](https://www.java.com/en/download/).
2. Compile the program:
   ```bash
   javac sudoku.java

