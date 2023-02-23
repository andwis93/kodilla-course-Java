package com.kodilla.matrix.sudoku.main;

import com.kodilla.matrix.sudoku.options.Option;
import com.kodilla.matrix.sudoku.options.TrackingOptions;

public final class SetSudoku {
    private Board board;
    private final Board boardSolved;
    private final Option option;
    private final TrackingOptions trackingOptions;
    public SetSudoku(Board board, Option option, TrackingOptions trackingOptions, Board boardSolved) {
        this.board = board;
        this.option = option;
        this.trackingOptions = trackingOptions;
        this.boardSolved = boardSolved;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Option getOption() {
        return option;
    }

    public TrackingOptions getTrackingOptions() {
        return trackingOptions;
    }

    public Board getBoardSolved() {
        return boardSolved;
    }

}
