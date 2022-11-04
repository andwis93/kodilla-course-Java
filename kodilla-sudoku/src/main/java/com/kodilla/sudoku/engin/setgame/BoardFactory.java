package com.kodilla.sudoku.engin.setgame;

import com.kodilla.sudoku.main.Board;

public final class BoardFactory {

    public void boardFactory(Board board, int boardSize, int squareSize) {
      GenerateSudoku generateSudoku = new GenerateSudoku();

      generateSudoku.generateSudoku(board, boardSize, squareSize);
      generateSudoku.mixRows(board, boardSize, squareSize);
      generateSudoku.mixColumns(board, boardSize, squareSize);
      generateSudoku.mixRows(board, boardSize, squareSize);
      generateSudoku.mixColumns(board, boardSize, squareSize);
    }

}
