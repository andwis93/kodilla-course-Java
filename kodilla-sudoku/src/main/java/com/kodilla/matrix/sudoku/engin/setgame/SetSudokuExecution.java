package com.kodilla.matrix.sudoku.engin.setgame;

import com.kodilla.matrix.sudoku.classesset.SetSudokuClassesSet;
import com.kodilla.matrix.sudoku.options.Option;
import com.kodilla.matrix.sudoku.main.Board;
import com.kodilla.matrix.sudoku.main.SetSudoku;

public final class SetSudokuExecution {

    public SetSudoku setSudokuExecution() throws CloneNotSupportedException {
        SetSudokuClassesSet setSudokuClassesSet = new SetSudokuClassesSet();
        Board board = new Board();
        Board boardSolved;
        Option option = setSudokuClassesSet.getSetUpProcess().setUpProcess();

        board.setMaxBoard(option.getBoard_size());
        board.createBoard(option.getBoard_size());
        setSudokuClassesSet.getBoardFactory().boardFactory(
                board, option.getBoard_size(), option.getSquare_size());
        boardSolved = board.deepCopy();
        setSudokuClassesSet.getLevel().setLevel(board, option.getLevel());

        return new SetSudoku(board,option, setSudokuClassesSet.getTrackingOptions(), boardSolved);
    }

}
