package com.kodilla.matrix;

public class MatrixTranspose {
    public void matrixTranspose(int[][] oldTable) {
        Matrix oldMatrix = new Matrix(oldTable);
        int[][] newTable = new int[oldMatrix.getRow()][oldMatrix.getColumn()];
        Matrix newMatrix = new Matrix(newTable);
        System.out.println(oldMatrix);
        for(int i = 0; i < oldMatrix.getColumn(); i++){
            for (int j = 0; j < oldMatrix.getRow(); j++) {
                newMatrix.matrix()[j][i] = oldMatrix.matrix()[i][j];
            }
        }
        System.out.println(newMatrix);
    }
}
