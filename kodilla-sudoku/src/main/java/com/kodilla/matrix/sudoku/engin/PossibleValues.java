package com.kodilla.matrix.sudoku.engin;

import com.kodilla.matrix.sudoku.main.Board;

import static com.kodilla.matrix.sudoku.main.SudokuElement.EMPTY;

public final class PossibleValues {

    public void removePossibleValuesRow(Board board, int c, int r) {
        for(int i = 0; i < board.getBoard().size(); i++) {
            if (board.getBoard().get(i).getSudokuRow().get(r).getValue() != EMPTY) {
                for (int ii=0; ii < board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().size(); ii++) {
                    if (board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().get(ii) ==
                            board.getBoard().get(i).getSudokuRow().get(r).getValue()) {
                        board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().remove(ii);
                    }
                }
            }
        }
    }

    public void removePossibleValuesColumn(Board board, int c, int r) {
        for(int i = 0; i < board.getBoard().size(); i++) {
            if (board.getBoard().get(c).getSudokuRow().get(i).getValue() != EMPTY) {
                for (int ii=0; ii < board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().size(); ii++) {
                    if (board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().get(ii) ==
                            board.getBoard().get(c).getSudokuRow().get(i).getValue()) {
                        board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().remove(ii);
                    }
                }
            }
        }
    }

    public void removePossibleValuesSquare(Board board, int c, int r, int squareSize){
        int squaresQty = board.getBoard().size() / squareSize;
        int squarePositionForColumn = (c) / squaresQty;
        int squarePositionForRow = (r) / squaresQty;

        for (int ii = squarePositionForColumn *squareSize; ii < (squarePositionForColumn * squareSize) + squareSize; ii++) {
            for (int jj = squarePositionForRow * squareSize; jj < (squarePositionForRow * squareSize) + squareSize; jj++) {
                if (board.getBoard().get(ii).getSudokuRow().get(jj).getValue() != EMPTY) {

                    for (int n=0; n < board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().size(); n++) {
                        if (board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().get(n) ==
                                board.getBoard().get(ii).getSudokuRow().get(jj).getValue()) {
                            board.getBoard().get(c).getSudokuRow().get(r).getPossibleValues().remove(n);
                        }
                    }

                }
            }
        }
    }

    public void removePossibleValues(Board board, int squareSize) {
        for (int c = 0; c < board.getBoard().size(); c++) {
            for (int r = 0; r < board.getBoard().get(c).getSudokuRow().size(); r++) {
                if (board.getBoard().get(c).getSudokuRow().get(r).getValue() == EMPTY) {
                    removePossibleValuesRow(board, c, r);
                    removePossibleValuesColumn(board, c, r);
                    removePossibleValuesSquare(board, c, r, squareSize);
               }
            }
        }
    }

}
