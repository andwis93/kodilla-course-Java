package com.kodilla.sudoku.options;

public final class BoardOptions {
    public final static int BOARD_SIZE_9 = 9;
    public final static int SQUARE_SIZE_9 = 3;
    public final static int BOARD_SIZE_16 = 16;
    public final static int SQUARE_SIZE_16 = 4;
    public final static int BOARD_SIZE_25 = 25;
    public final static int SQUARE_SIZE_25 = 5;

    public Option setOptions(int optionsSelected) {
        switch (optionsSelected) {
            case 1 -> {
                return new Option(BOARD_SIZE_9, SQUARE_SIZE_9);
            }
            case 2 -> {
                return new Option(BOARD_SIZE_16, SQUARE_SIZE_16);
            }
            case 3 -> {
                return new Option(BOARD_SIZE_25, SQUARE_SIZE_25);
            }
            default -> {
                System.out.println("Selected option was incorrect.Board size 9x9 was selected as default.");
                return new Option(BOARD_SIZE_9, SQUARE_SIZE_9);
            }
        }
    }

}
