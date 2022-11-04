package com.kodilla.sudoku.main;

import com.kodilla.sudoku.other.Prototype;

import java.util.ArrayList;
import java.util.List;

public final class Board extends Prototype<Board> {
    public final static int MIN_BOARD = 0;
    private int maxBoard = 9;
    private  List<SudokuRow> board = new ArrayList<>();

    public void createBoard(int maxBoard) {
        int i = 0;
        while (i < maxBoard) {
           board.add(new SudokuRow().creatSudokuRow(maxBoard));
            i++;
        }
    }

    public void setBoard(List<SudokuRow> board) {
        this.board = board;
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = super.clone();
        clonedBoard.setMaxBoard(maxBoard);
        List<SudokuRow> clonedBoardList = new ArrayList<>();
        for (SudokuRow sudokuRow : board) {
            List<SudokuElement> clonedSudokuRowList = new ArrayList<>();
            for (int ii = 0; ii < sudokuRow.getSudokuRow().size(); ii++) {
                List<Integer> clonedPossibleValuesList = new ArrayList<>(sudokuRow.getSudokuRow().get(ii).getPossibleValues());
                clonedSudokuRowList.add(new SudokuElement(sudokuRow.getSudokuRow().get(ii).getValue(),
                        clonedPossibleValuesList));
            }
            clonedBoardList.add(new SudokuRow(clonedSudokuRowList));
        }
        clonedBoard.setBoard(clonedBoardList);
        return clonedBoard;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("    ");
        for(int i = MIN_BOARD; i < maxBoard; i++) {
            if (i < 9) {
                result.append(" ").append(i + 1).append(" ");
            } else {
                result.append(i + 1).append(" ");
            }
        }
        result.append("\n");
        for(int i = MIN_BOARD; i < maxBoard; i++) {
            if (i < 9) {
                result.append(" ").append(i + 1).append(" |");
            } else{
                result.append(i + 1).append(" |");
            }
            for (int j = MIN_BOARD; j < maxBoard; j++) {
                if (board.get(j).getSudokuRow().get(i).getValue() != -1) {
                    if (board.get(j).getSudokuRow().get(i).getValue() > 9) {
                        result.append(board.get(j).getSudokuRow().get(i).getValue());
                    } else {
                        result.append(" ").append(board.get(j).getSudokuRow().get(i).getValue());
                    }
                } else {
                    result.append("  ");
                }
                    result.append("|");
            }
            result.append("\n");
        }
        return result.toString();
    }

    public List<SudokuRow> getBoard() {
        return board;
    }

    public void setMaxBoard(int maxBoard) {
        this.maxBoard = maxBoard;
    }

}
