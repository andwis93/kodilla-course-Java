package com.kodilla.patterns;

import com.kodilla.patterns.builder.checkers.Figure;

public class PatternsRunner {

    public static void main(String[] args) {

        Figure[][] board = new Figure[10][];

        for (int n = 0; n < 10; n++) {
            board[n] = new Figure[10];
            System.out.println(board[n]);
        }
    }
}
