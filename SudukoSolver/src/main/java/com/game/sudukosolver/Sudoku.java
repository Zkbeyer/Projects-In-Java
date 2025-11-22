package com.game.sudukosolver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sudoku {
    int[][] sudoku;
    final int SIZE = 9;
    final int SUBGRID_SIZE = 3;

    public Sudoku() {
        sudoku = new int[SIZE][SIZE];
    }

    //this function takes a string input for the file path, then loads the file into the sudoku array
    public void loadBoard(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(file));

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                sudoku[i][j] = sc.nextInt();
            }
        }
    }

    //wrapper function that calls solve sudoku and prints the output
    public void solve() {
        if(solveSudoku()) {
            System.out.println("Solved Sudoku:");
            printBoard();
        } else {
            System.out.println("No solution found");
        }
    }

    //recursive solve sudoku function that searches for an empty cell, tries every number and continues until a solution or failure
    //resets and temporary placements if there is a failure
    private boolean solveSudoku() {
        int row = -1;
        int col = -1;
        boolean foundEmpty = false;
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (sudoku[r][c] == 0) {
                    row = r;
                    col = c;
                    foundEmpty = true;
                    break;
                }
            }
            if (foundEmpty) {
                break;
            }
        }
        if (!foundEmpty) {
            return true;
        }
        for (int n=1; n <= SIZE; n++) {
            if(isSafe(row, col, n)) {
                sudoku[row][col] = n;
                if (solveSudoku()){
                    return true;
                } else {
                    sudoku[row][col] = 0;
                }
            }
        }
        return false;

    }

    //checks the given row and column to see if the given number is safe to place there
    //checks row, column, and subgrid before returning true
    private boolean isSafe(int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (sudoku[row][i] == num) {
                return false;
            }
            if (sudoku[i][col] == num) {
                return false;
            }
        }

        int subgridRow = (row / SUBGRID_SIZE) * SUBGRID_SIZE;
        int subgridCol = (col / SUBGRID_SIZE) * SUBGRID_SIZE;

        for (int i = 0; i < SUBGRID_SIZE; i++) {
            for (int j = 0; j < SUBGRID_SIZE; j++) {
                if (sudoku[subgridRow + i][subgridCol + j] == num) {
                    return false;
                }
            }
        }

        return true;


    }


    //prints the board in a visible format to see the solution if there is one
    private void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
