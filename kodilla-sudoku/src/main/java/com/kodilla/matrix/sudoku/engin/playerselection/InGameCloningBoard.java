package com.kodilla.matrix.sudoku.engin.playerselection;

import com.kodilla.matrix.sudoku.main.Board;
import com.kodilla.matrix.sudoku.main.Move;
import com.kodilla.matrix.sudoku.main.MoveTracking;
import com.kodilla.matrix.sudoku.main.SetSudoku;

public final class InGameCloningBoard implements TaskSelected {

    @Override
    public void taskSelected(SetSudoku setSudoku, Move move) {
        Board clonedBoard = null;

        try {
            clonedBoard = setSudoku.getBoard().deepCopy();
        } catch (CloneNotSupportedException e) {
          System.out.println(e);
        }
        setSudoku.getTrackingOptions().addMoveToList(new MoveTracking(clonedBoard, move));
    }

}

