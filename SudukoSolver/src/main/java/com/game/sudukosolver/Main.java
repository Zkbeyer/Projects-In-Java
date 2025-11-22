package com.game.sudukosolver;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();

        try{ sudoku.loadBoard("src/main/resources/sudoku.txt"); }
        catch (FileNotFoundException e) { System.out.println(e.getMessage()); }

        sudoku.solve();
    }


}
