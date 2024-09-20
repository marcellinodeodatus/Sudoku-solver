import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sudoku {

	// Helper function to print the Sudoku grid
    private static void printGrid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j]);
                if (j < 8) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } // end function printGrid

    // Function to check if placing num in grid[row][col] is valid
    private static boolean isValid(int[][] grid, int row, int col, int num) {
        // Check the row
        for (int x = 0; x < 9; x++) {
            if (grid[row][x] == num) {
                return false;
            }
        }

        // Check the column
        for (int x = 0; x < 9; x++) {
            if (grid[x][col] == num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    } // end function isValud

    // Function to solve the Sudoku puzzle using backtracking
    private static boolean solveSudoku(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    // Try numbers from 1 to 9
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(grid, row, col, num)) {
                            grid[row][col] = num;

                            // Recursively attempt to fill in the grid
                            if (solveSudoku(grid)) {
                                return true;
                            }

                            // Undo the current cell and backtrack
                            grid[row][col] = 0;
                        }
                    }

                    // No valid number found for this cell, hence no solution
                    return false;
                }
            }
        }

        // All cells are filled correctly, solution is found
        return true;
    } // end function solveSudoku

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner = new Scanner(new File("in.txt"));
		int n = scanner.nextInt(); // Read number of test cases

		for (int testCase = 1; testCase <= n; testCase++) {

			int[][] grid = new int[9][9];

			// Reading the 9x9 Sudoku grid for the current test case
			for (int i = 0; i < 9; i++){
				for (int j = 0; j < 9; j++){
					grid[i][j] = scanner.nextInt();
				}
			}

			// Output the test case number
			System.out.println("Test case " + testCase + ":");

			// Try solving the sudoku puzzle
			if (solveSudoku(grid)) {
				// If a solution is found, print the grid
				printGrid(grid);
			} else {
				// If no solution is possible
				System.out.println("No solution possible.");
			}

			// Print a blank line between cases (except after the last case)
			if (testCase < n) {
				System.out.println();
			}

		} // end for-loop

		scanner.close();

	} // end main



} // end class sudoku