package com.kodilla.sudoku.engin.setgame;

import com.kodilla.sudoku.main.Board;

import java.util.Random;
import static com.kodilla.sudoku.main.SudokuElement.EMPTY;

public final class SetLevel {

    public void setLevel(Board board, int level) {
        Random rand = new Random();
        int toBeRemoved;
        int boardSize = board.getBoard().size();

        toBeRemoved = (boardSize * boardSize) - ((boardSize * boardSize) / level);

        for (int i = 0; i < toBeRemoved; i++) {
            int columnSelect = rand.nextInt(boardSize);
            int rowSelect = rand.nextInt(boardSize);
            board.getBoard().get(columnSelect).getSudokuRow().get(rowSelect).setValue(EMPTY);
        }
    }

}
