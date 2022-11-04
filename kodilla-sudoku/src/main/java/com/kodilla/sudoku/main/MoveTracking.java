package com.kodilla.sudoku.main;

public final class MoveTracking {
     private Board board;
     private final Move move;

    public MoveTracking(Board board, Move move) {
        this.board = board;
        this.move = move;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Move getMove() {
        return move;
    }

}
