package com.kodilla.sudoku.trytofinishoneday;

import com.kodilla.sudoku.main.SetSudoku;
import com.kodilla.sudoku.classesset.GameClassSet;

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
