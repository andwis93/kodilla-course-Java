package com.kodilla.sudoku.engin;

import com.kodilla.sudoku.main.SetSudoku;

public final class SudokuSolvedCheck {

    public boolean sudokuSolvedCheck(SetSudoku setSudoku){
        boolean isResolved = true;

        for (int c = 0; c < setSudoku.getOption().getBoard_size(); c++) {
            for (int r = 0; r < setSudoku.getOption().getBoard_size(); r++) {
                if (setSudoku.getBoard().getBoard().get(c).getSudokuRow().get(r).getValue() == -1) {
                    isResolved = false;
                    break;
                }
            }
        }
        return isResolved;
    }

}
