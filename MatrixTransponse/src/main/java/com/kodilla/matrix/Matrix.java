package com.kodilla.matrix;

public record Matrix(int[][] matrix) {

    public int getColumn() {
        return matrix.length;
    }

    public int getRow() {
        return matrix[0].length;
    }

    @Override
    public String toString() {
        StringBuilder matrixString = new StringBuilder();
        for (int[] ints : matrix) {
            matrixString.append("|");
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] < 10) {
                    matrixString.append(" ").append(ints[j]).append("|");
                } else {
                    matrixString.append(ints[j]).append("|");
                }
            }
            matrixString.append("\n");
        }
        return matrixString.toString();
    }
}
