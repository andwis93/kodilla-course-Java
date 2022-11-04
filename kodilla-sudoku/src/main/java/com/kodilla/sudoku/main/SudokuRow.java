package com.kodilla.sudoku.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static com.kodilla.sudoku.main.SudokuElement.EMPTY;

public final class SudokuRow  {
    private  List<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow(List<SudokuElement> sudokuRow) {
        this.sudokuRow = sudokuRow;
    }

    public SudokuRow() {
    }

    public SudokuRow creatSudokuRow(int maxBoard) {
        SudokuRow newSudokuRow = new SudokuRow();

        IntStream.iterate(1, n -> n + 1)
                .limit(maxBoard)
                .forEach(n -> newSudokuRow.sudokuRow.add(new SudokuElement(EMPTY, creatPossibleValueList(maxBoard))));
        return newSudokuRow;
    }

    public List<Integer> creatPossibleValueList(int maxBoard) {
        List<Integer> possibleValues = new ArrayList<>();

        IntStream.iterate(1, n -> n + 1)
                .limit(maxBoard)
                .forEach(possibleValues::add);

        return possibleValues;
    }

    public List<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }

    @Override
    public String toString() {
        String result = " ";
        for (SudokuElement theElement:sudokuRow) {
            System.out.println(theElement.getValue() + ", " + Arrays.toString(theElement.getPossibleValues().toArray()));
        }
        return result;
    }

}
