package com.kodilla.matrix.sudoku;

import com.kodilla.matrix.sudoku.engin.SudokuGame;
import com.kodilla.matrix.sudoku.options.PlayAgain;

public class PlayGame {

    public static void main(String[] args) throws CloneNotSupportedException {
        boolean gameFinished = true;

        while (gameFinished) {
            SudokuGame sudokuGame = new SudokuGame();
            PlayAgain playAgain = new PlayAgain();

            try {
                sudokuGame.isResolveSudoku();
            } catch (CloneNotSupportedException err) {
                System.out.println(err);
            }
            gameFinished = playAgain.playAgain();
        }
    }
}

