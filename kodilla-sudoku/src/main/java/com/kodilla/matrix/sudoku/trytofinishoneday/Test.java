package com.kodilla.matrix.sudoku.trytofinishoneday;

import com.kodilla.matrix.sudoku.main.SetSudoku;
import com.kodilla.matrix.sudoku.classesset.GameClassSet;

public class Test {
    GameClassSet gameClassSet = new GameClassSet();
    SetSudoku setSudoku = gameClassSet.getSetExecution().setSudokuExecution();
    SolveSudoku solveSudoku = new SolveSudoku();

    public Test() throws CloneNotSupportedException {
    }

    public void solveSudokuTest() {
        gameClassSet.getPossibleVal().removePossibleValues(setSudoku.getBoard(),setSudoku.getOption().getSquare_size());
        System.out.println(setSudoku.getBoard().toString());
       solveSudoku.solveSudoku(setSudoku);
    }
}
