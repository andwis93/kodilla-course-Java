package com.kodilla.sudoku.classesset;

import com.kodilla.sudoku.engin.MakeMove;
import com.kodilla.sudoku.engin.PossibleValues;
import com.kodilla.sudoku.engin.SudokuSolvedCheck;
import com.kodilla.sudoku.options.ScannerOptions;
import com.kodilla.sudoku.engin.setgame.SetSudokuExecution;

public final class GameClassSet {
  private final SudokuSolvedCheck resolveCheck;
  private final SetSudokuExecution setExecution;
  private final MakeMove makeMove;
  private final PossibleValues possibleVal;
  private final ScannerOptions scannerOp;

    public GameClassSet() {
        this.resolveCheck = new SudokuSolvedCheck();
        this. setExecution = new SetSudokuExecution();
        this.makeMove = new MakeMove();
        this.possibleVal = new PossibleValues();
        this.scannerOp = new ScannerOptions();
    }

    public SudokuSolvedCheck getResolveCheck() {
        return resolveCheck;
    }

    public SetSudokuExecution getSetExecution() {
        return setExecution;
    }

    public MakeMove getMakeMove() {
        return makeMove;
    }

    public PossibleValues getPossibleVal() {
        return possibleVal;
    }

    public ScannerOptions getScannerOp() {
        return scannerOp;
    }
}
