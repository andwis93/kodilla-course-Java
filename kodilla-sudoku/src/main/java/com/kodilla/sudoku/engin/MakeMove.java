package com.kodilla.sudoku.engin;

import com.kodilla.sudoku.options.ScannerOptions;
import com.kodilla.sudoku.main.Board;
import com.kodilla.sudoku.main.Move;

import static com.kodilla.sudoku.main.SudokuElement.EMPTY;

public final class MakeMove {
ScannerOptions scannerOptions = new ScannerOptions();

    public Move moveValidation(Board board, Move move) {

       if (move != null) {
           if (board.getBoard().get(move.
                   getColumn()).getSudokuRow().get(move.getRow()).getValue() == EMPTY) {
               boolean moveExisting = board.getBoard().get(move.getColumn()).getSudokuRow().get(move.getRow())
                       .getPossibleValues().contains(move.getValue());
               if (moveExisting) {
                   board.getBoard().get(move.getColumn()).getSudokuRow().get(move.getRow()).setValue(move.getValue());
                   move.setValidMove(true);
               } else {
                   System.out.println("This move is against game rules! Please select another move.");
               }
           } else {
               System.out.println("Selected square is not EMPTY! Please select another square.");
           }
       }
       return move;
    }

    public Move giveMove(Board board, String valueEntered) {
        return scannerOptions.squareSelection(board.getBoard().size(), valueEntered);
    }

    public Move makeMove(Board board, String valueEntered) {
        Move move = giveMove(board,valueEntered);
        return moveValidation(board,move);
    }

}
