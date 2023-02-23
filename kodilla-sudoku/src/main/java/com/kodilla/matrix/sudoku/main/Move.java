package com.kodilla.matrix.sudoku.main;

public final class Move {
    private int column;
    private int row;
    private int value;
    private boolean validMove = false;

    public Move(int column, int row, int value, boolean validMove) {
        this.column = column;
        this.row = row;
        this.value = value;
        this.validMove = validMove;
    }

    public Move() {
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getValue() {
        return value;
    }

    public void setValidMove(boolean validMove) {
        this.validMove = validMove;
    }

    public boolean isValidMove() {
        return validMove;
    }

    @Override
    public String toString() {
        return "Column: [" + (column + 1) +"] Row: [" + (row + 1)  + "] Value: [" + value + "]";
    }

}
