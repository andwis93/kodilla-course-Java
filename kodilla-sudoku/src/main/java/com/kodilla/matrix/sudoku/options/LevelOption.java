package com.kodilla.matrix.sudoku.options;

public final class LevelOption {
    public static final int EASY = 2;
    public static final int MEDIUM = 10;
    public static final int HARD = 80;

    public int getLevel(int optionsSelected) {
        switch (optionsSelected) {
            case 1 -> {
                return EASY;
            }
            case 2 -> {
                return MEDIUM;
            }
            case 3 -> {
                return HARD;
            }
            default -> {
                System.out.println("Selected option was incorrect. Medium level was selected as default.");
                return MEDIUM;
            }
        }
    }

}
