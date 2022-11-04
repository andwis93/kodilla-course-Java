package com.kodilla.sudoku.engin;

import com.kodilla.sudoku.classesset.GameClassSet;
import com.kodilla.sudoku.engin.playerselection.InGameCloningBoard;
import com.kodilla.sudoku.engin.playerselection.LastMove;
import com.kodilla.sudoku.engin.playerselection.TaskSelected;
import com.kodilla.sudoku.main.Move;
import com.kodilla.sudoku.main.SetSudoku;

public final class SudokuGame {
    private boolean resolveSudoku;
     GameClassSet gameClassSet = new GameClassSet();
     SetSudoku setSudoku = gameClassSet.getSetExecution().setSudokuExecution();

    public SudokuGame() throws CloneNotSupportedException {
    }

    public void isResolveSudoku() throws CloneNotSupportedException {
        Move move = new Move();
        TaskSelected taskSelected = new InGameCloningBoard();
        String typedValue;

        gameClassSet.getPossibleVal().removePossibleValues(setSudoku.getBoard(),setSudoku.getOption().getSquare_size());
        taskSelected.taskSelected(setSudoku, move);

        while (!resolveSudoku) {
            System.out.println(setSudoku.getBoard().toString());
            typedValue = (gameClassSet.getScannerOp().generalScanner()).toUpperCase();
            move = null;
            switch (typedValue) {
                case "Z" -> {
                    try {
                        taskSelected = new LastMove();
                        taskSelected.taskSelected(setSudoku, move);
                    } catch (NullPointerException err) {
                        System.out.println("This is initial board.\n");
                    }
                }
                case "SUDOKU" -> {
                    setSudoku.setBoard(setSudoku.getBoardSolved());
                    resolveSudoku = true;
                }
                default -> {
                    try {
                        taskSelected = new InGameCloningBoard();
                        move = gameClassSet.getMakeMove().makeMove(setSudoku.getBoard(),typedValue);
                        gameClassSet.getPossibleVal().removePossibleValues(setSudoku.getBoard(), setSudoku.getOption().getSquare_size());
                        resolveSudoku = gameClassSet.getResolveCheck().sudokuSolvedCheck(setSudoku);
                        if (move!=null) {
                            if (move.isValidMove()) {
                                taskSelected.taskSelected(setSudoku, move);
                            }
                        }
                    } catch (NullPointerException ignored) {}
                }
            }
        }
        System.out.println(setSudoku.getBoard().toString());
    }

}
