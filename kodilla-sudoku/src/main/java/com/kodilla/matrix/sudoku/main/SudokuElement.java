package com.kodilla.matrix.sudoku.main;

import java.util.List;

public final class SudokuElement {
    public static int EMPTY = -1;
    private int value;
    private final List<Integer> possibleValues;

    public SudokuElement(int value, List<Integer> possibleValues) {
        this.value = value;
        this.possibleValues = possibleValues;
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getPossibleValues() {
        return possibleValues;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
