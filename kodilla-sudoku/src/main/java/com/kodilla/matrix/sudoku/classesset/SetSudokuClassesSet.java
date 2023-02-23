package com.kodilla.matrix.sudoku.classesset;

import com.kodilla.matrix.sudoku.engin.setgame.BoardFactory;
import com.kodilla.matrix.sudoku.engin.setgame.SetLevel;
import com.kodilla.matrix.sudoku.engin.setgame.SetUpProcess;
import com.kodilla.matrix.sudoku.options.TrackingOptions;

public final class SetSudokuClassesSet {
    private final TrackingOptions trackingOptions;
    private final SetUpProcess setUpProcess;
    private final BoardFactory boardFactory;
    private final SetLevel level;

    public SetSudokuClassesSet() {
        this.trackingOptions = new TrackingOptions();
        this.setUpProcess = new SetUpProcess();
        this.boardFactory = new BoardFactory();
        this.level = new SetLevel();
    }

    public TrackingOptions getTrackingOptions() {
        return trackingOptions;
    }

    public SetUpProcess getSetUpProcess() {
        return setUpProcess;
    }

    public BoardFactory getBoardFactory() {
        return boardFactory;
    }

    public SetLevel getLevel() {
        return level;
    }

}
