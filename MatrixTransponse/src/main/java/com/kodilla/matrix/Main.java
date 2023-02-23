package com.kodilla.matrix;

public class Main {
    public static void main(String[] args) {
    MatrixTranspose matrixTranspose = new MatrixTranspose();
    CreateMatrix matrix = new CreateMatrix();
    matrixTranspose.matrixTranspose(matrix.create());
    }
}