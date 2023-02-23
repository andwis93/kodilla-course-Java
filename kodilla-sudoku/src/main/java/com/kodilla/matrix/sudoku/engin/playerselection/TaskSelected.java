package com.kodilla.matrix.sudoku.engin.playerselection;

import com.kodilla.matrix.sudoku.main.Move;
import com.kodilla.matrix.sudoku.main.SetSudoku;

public interface TaskSelected {
    void taskSelected(SetSudoku setSudoku, Move move);
}
