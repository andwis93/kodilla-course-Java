package com.kodilla.sudoku.engin.playerselection;

import com.kodilla.sudoku.main.Board;
import com.kodilla.sudoku.main.Move;
import com.kodilla.sudoku.main.MoveTracking;
import com.kodilla.sudoku.main.SetSudoku;

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

