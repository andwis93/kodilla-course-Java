package com.kodilla.matrix.sudoku.engin.setgame;

import com.kodilla.matrix.sudoku.options.*;
import com.kodilla.sudoku.options.*;

public final class SetUpProcess {

    public Option setUpProcess() {
        ScannerOptions scannerOptions = new ScannerOptions();
        DisplayOptions displayOptions = new DisplayOptions();
        BoardOptions optionsSet = new BoardOptions();
        LevelOption levelOption = new LevelOption();
        int boarSize;
        int squareSize;
        int level;
        displayOptions.hello();
        displayOptions.boardSizeDisplay();

        Option option = optionsSet.setOptions(scannerOptions.boarSizeScannerSelection());
        boarSize = option.getBoard_size();
        squareSize = option.getSquare_size();

        displayOptions.levelDisplay();
        level = levelOption.getLevel(scannerOptions.levelScannerSelection());

        displayOptions.instructions();
        return new Option(boarSize,squareSize,level);
    }

}
