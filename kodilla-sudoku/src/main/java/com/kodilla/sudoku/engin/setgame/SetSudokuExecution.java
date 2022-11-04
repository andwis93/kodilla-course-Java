package com.kodilla.sudoku.engin.setgame;

import com.kodilla.sudoku.classesset.SetSudokuClassesSet;
import com.kodilla.sudoku.options.Option;
import com.kodilla.sudoku.main.Board;
import com.kodilla.sudoku.main.SetSudoku;

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
