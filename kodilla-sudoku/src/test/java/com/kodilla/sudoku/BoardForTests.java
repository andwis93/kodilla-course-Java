package com.kodilla.sudoku;

import com.kodilla.sudoku.engin.setgame.SetUpProcess;
import com.kodilla.sudoku.main.Board;
import com.kodilla.sudoku.options.Option;

import static com.kodilla.sudoku.options.BoardOptions.BOARD_SIZE_9;

public class BoardForTests {

    public void addMoves(Board board) {
        board.createBoard(BOARD_SIZE_9);
        board.setMaxBoard(BOARD_SIZE_9);

        board.getBoard().get(3).getSudokuRow().get(5).setValue(7);
        board.getBoard().get(6).getSudokuRow().get(2).setValue(1);
        board.getBoard().get(5).getSudokuRow().get(8).setValue(1);
        board.getBoard().get(2).getSudokuRow().get(3).setValue(8);
        board.getBoard().get(6).getSudokuRow().get(8).setValue(4);
    }
}
