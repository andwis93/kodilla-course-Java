package com.kodilla.sudoku.engin.playerselection;

import com.kodilla.sudoku.main.Board;
import com.kodilla.sudoku.main.Move;
import com.kodilla.sudoku.main.SetSudoku;

public final class LastMove implements TaskSelected{

    @Override
    public void taskSelected(SetSudoku setSudoku, Move move) {
        Board clonedBoard = null;
        if (setSudoku.getTrackingOptions().getMoveTrackingList().size() > 1) {
            try {
                clonedBoard = setSudoku.getTrackingOptions().getMoveTrackingList().get(
                        setSudoku.getTrackingOptions().getMoveTrackingList().size() - 2).getBoard().deepCopy();
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }
            System.out.println("Move retracted: " + setSudoku.getTrackingOptions().getMoveTrackingList().get(
                    setSudoku.getTrackingOptions().getMoveTrackingList().size() - 1).getMove());
            setSudoku.setBoard(clonedBoard);

            setSudoku.getTrackingOptions().getMoveTrackingList().remove(
                       setSudoku.getTrackingOptions().getMoveTrackingList().size() - 1 );
        } else {

            try {
                clonedBoard = setSudoku.getTrackingOptions().getMoveTrackingList().get(
                        setSudoku.getTrackingOptions().getMoveTrackingList().size() - 1).getBoard().deepCopy();
            } catch (CloneNotSupportedException e) {
                System.out.println(e);
            }
            System.out.println("""
                    It is starting board.
                     
                    Move retracted:  """ + setSudoku.getTrackingOptions().getMoveTrackingList().get(
                    setSudoku.getTrackingOptions().getMoveTrackingList().size() - 1).getMove());
            setSudoku.setBoard(clonedBoard);
        }
    }

}
