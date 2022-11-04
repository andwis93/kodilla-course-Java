package com.kodilla.sudoku.options;

public final class DisplayOptions {

    public void boardSizeDisplay() {
        System.out.println("""
                ***********************
                Select board size:
                press 1 for 9x9
                press 2 for 16x16
                press 3 for 25x25
                ***********************
                """);
    }

    public void levelDisplay() {
        System.out.println(
                """
                ***********************
                Select difficulty:
                press 1 for EASY
                press 2 for MEDIUM
                press 3 for HARD
                ***********************
                """);
    }

    public void hello() {
        System.out.println(
                """
                 ***********************
                 Hello.
                 I'm Sudoku.
                 ***********************
                 """);
    }

    public void instructions() {

        System.out.println("""
             *****************************************************************
             To select square please type:
             number for column, number for row, number entered.
             For example "4,6,1" - for column #4 and row #6 you will enter #1
             If you want to revers your move, please type "Z".
             If you want to see solved sudoku type "SUDOKU".
             Good luck!
             *****************************************************************
             """);
    }

}
