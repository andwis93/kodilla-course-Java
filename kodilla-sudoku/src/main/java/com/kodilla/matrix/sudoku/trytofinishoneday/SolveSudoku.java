package com.kodilla.matrix.sudoku.trytofinishoneday;

import com.kodilla.matrix.sudoku.main.Board;
import com.kodilla.matrix.sudoku.engin.PossibleValues;
import com.kodilla.matrix.sudoku.main.SetSudoku;

import static com.kodilla.matrix.sudoku.main.SudokuElement.EMPTY;

public final class SolveSudoku {

    public void solveSudoku (SetSudoku setSudoku) {
        PossibleValues possibleValues = new PossibleValues();
        Board clonedBoard = null;
        Board clonedBoardTemp = null;
        boolean solved;
        boolean unsolvable;
        boolean copymade;
        int possibleVal;
        boolean found;

        try {
            clonedBoard = setSudoku.getBoard().deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        solved = false;
        copymade = false;
        unsolvable = false;

        while (!solved) {
            solved = true;
            found = false;
            if (!unsolvable) {
                for (int cc = 0; cc < setSudoku.getOption().getBoard_size(); cc++) {
                    for (int rr = 0; rr < setSudoku.getOption().getBoard_size(); rr++) {
                        if (clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getValue() == EMPTY) {
                            solved = false;
                            if (clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getPossibleValues().size() == 1) {

                                possibleVal = clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getPossibleValues().get(0);
                                clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).setValue(possibleVal);
                                possibleValues.removePossibleValues(clonedBoard, setSudoku.getOption().getSquare_size());
                                found = true;
                            }
                        }
                    }
                }
            }
            if ((!found) && (!solved)) {

                int ii = 2;
                while (( ii < setSudoku.getOption().getBoard_size()) && (!found) && (!unsolvable)) {
                    int cc = 0;
                    while (( cc < setSudoku.getOption().getBoard_size()) && (!found) && (!unsolvable)) {
                        int rr = 0;
                        while (( rr < setSudoku.getOption().getBoard_size()) && (!found) && (!unsolvable)) {
                            if (clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getValue() == EMPTY) {
                                if (clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getPossibleValues().size() != 0) {
                                    solved = false;
                                    if (clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getPossibleValues().size() == ii) {
                                        possibleVal = clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getPossibleValues().get(0);
                                        clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).getPossibleValues().remove(0);
                                        found = true;
                                        if (!copymade) {
                                            try {
                                                clonedBoardTemp = clonedBoard.deepCopy();
                                                copymade = true;
                                            } catch (CloneNotSupportedException e) {
                                                System.out.println(e);
                                            }
                                            clonedBoard.getBoard().get(cc).getSudokuRow().get(rr).setValue(
                                                    possibleVal);
                                            possibleValues.removePossibleValues(clonedBoard, setSudoku.getOption().getSquare_size());
                                        }
                                    }
                                } else {
                                    unsolvable = true;
                                }
                            }
                            rr++;
                        }
                        cc++;
                    }
                    ii++;
                }
            }
            if (unsolvable) {
                if (copymade) {
                    try {
                        clonedBoard = clonedBoardTemp.deepCopy();
                        copymade = false;
                        unsolvable = false;
                    } catch (CloneNotSupportedException e) {
                        System.out.println(e);
                    }
                } else {
                    System.out.println("Couldn't solve Sudoku!");
                    solved = true;
                }
            }
        }
        System.out.println(clonedBoard.toString());
    }

}
