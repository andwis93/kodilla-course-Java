package com.kodilla.matrix.sudoku.options;

public final class Option {
    private final int board_size;
    private final int square_size;
    private int level;

    public Option(int board_size, int square_size, int level) {
        this.board_size = board_size;
        this.square_size = square_size;
        this.level = level;
    }

    public Option(int board_size, int square_size) {
        this.board_size = board_size;
        this.square_size = square_size;
    }

    public int getBoard_size() {
        return board_size;
    }

    public int getSquare_size() {
        return square_size;
    }

    public int getLevel() {
        return level;
    }

}
