package com.kodilla.matrix.sudoku.engin.setgame;

import com.kodilla.matrix.sudoku.main.Board;
import com.kodilla.matrix.sudoku.main.SudokuElement;
import com.kodilla.matrix.sudoku.main.SudokuRow;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class GenerateSudoku {

    public void generateSudoku(Board board, int boardSize, int squareSize) {
        Random rand = new Random();
        int element;

        List<Integer> boardElements = Stream.iterate(1, n -> n + 1)
                .limit((long) squareSize * squareSize)
                .collect(Collectors.toList());

        for (int c = 0; c < squareSize; c++) {
            for (int r = 0; r < squareSize; r++) {
                if (boardElements.size() > 0) {
                    element = rand.nextInt(boardElements.size());
                    board.getBoard().get(c).getSudokuRow().get(r).setValue(boardElements.get(element));
                    boardElements.remove(element);
                } else {
                    board.getBoard().get(c).getSudokuRow().get(r).setValue(boardElements.get(boardElements.get(0)));
                }
            }
        }
        for (int cc = squareSize; cc < boardSize; cc += squareSize) {
            for (int c = cc; c < cc + squareSize; c++) {
                board.getBoard().get(c).getSudokuRow().get(0).setValue(
                        board.getBoard().get(c - squareSize).getSudokuRow().get(squareSize - 1).getValue());
            }
            for (int c = cc; c < cc + squareSize; c++) {
                for (int r = 1; r < squareSize; r++) {
                    board.getBoard().get(c).getSudokuRow().get(r).setValue(
                            board.getBoard().get(c - squareSize).getSudokuRow().get(r - 1).getValue());
                }
            }
        }
        for (int cc = squareSize; cc < boardSize; cc += squareSize) {
            for (int c = cc; c < cc + squareSize; c++) {
                board.getBoard().get(c).getSudokuRow().get(0).setValue(
                        board.getBoard().get(c - squareSize).getSudokuRow().get(squareSize - 1).getValue());
            }
            for (int c = cc; c < cc + squareSize; c++) {
                for (int r = 1; r < squareSize; r++) {
                    board.getBoard().get(c).getSudokuRow().get(r).setValue(
                            board.getBoard().get(c - squareSize).getSudokuRow().get(r - 1).getValue());
                }
            }
        }
        for (int rr = squareSize; rr < boardSize; rr += squareSize) {
            for (int c = 0; c < boardSize; c += squareSize) {
                for (int r = rr; r < rr + squareSize; r++) {
                    board.getBoard().get(c).getSudokuRow().get(r).setValue(
                            board.getBoard().get(c + squareSize - 1).getSudokuRow().get(r - squareSize).getValue());
                }
            }
            for (int cc = 0; cc < boardSize; cc += squareSize) {
                for (int c = cc + 1; c < cc + squareSize; c++) {
                    for (int r = rr; r < rr + squareSize; r++) {
                        board.getBoard().get(c).getSudokuRow().get(r).setValue(
                                board.getBoard().get(c - 1).getSudokuRow().get(r - squareSize).getValue());
                    }
                }
            }
        }
    }

    public void mixRows(Board board, int boardSize, int squareSize) {
        SudokuRow sudokuRowFirst;
        Random rand = new Random();
        int rowFirst;
        int rowSecond;

        for (int rr = 0; rr < boardSize; rr += squareSize) {
            for(int i = 0; i < 2; i++) {
                rowFirst = rand.nextInt(squareSize);
                rowSecond = rand.nextInt(squareSize);
                sudokuRowFirst = board.getBoard().get(rr + rowFirst);
                board.getBoard().set(rr + rowFirst, board.getBoard().get(rr + rowSecond));
                board.getBoard().set(rr + rowSecond, sudokuRowFirst);
            }
        }
    }

    public void mixColumns(Board board, int boardSize, int squareSize) {
        SudokuElement sudokuElement;
        Random rand = new Random();

        for (int cc = 0; cc < boardSize; cc += squareSize) {
            for(int i=0; i < 2; i++) {

                int rowFirst = rand.nextInt(squareSize);
                int rowSecond = rand.nextInt(squareSize);

                for (int j = 0; j < boardSize; j++) {
                    sudokuElement = board.getBoard().get(j).getSudokuRow().get(rowFirst + cc);
                    board.getBoard().get(j).getSudokuRow().set(rowFirst + cc,board.getBoard().get(j).getSudokuRow().get(rowSecond + cc));
                    board.getBoard().get(j).getSudokuRow().set(rowSecond + cc,sudokuElement);
                }
            }
        }
    }

}