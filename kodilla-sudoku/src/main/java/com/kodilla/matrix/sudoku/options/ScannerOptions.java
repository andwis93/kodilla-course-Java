package com.kodilla.matrix.sudoku.options;

import com.kodilla.matrix.sudoku.main.Move;

import java.util.Scanner;

public final class ScannerOptions {

    public int boarSizeScannerSelection() {
        int boardSelected = 0;
        Scanner scannerHowManyPlayers = new Scanner(System.in);

            if (scannerHowManyPlayers.hasNextInt()) {
                int enteredNumber = scannerHowManyPlayers.nextInt();
                if (enteredNumber > 0) {
                    boardSelected = enteredNumber;
            } else {
                throw new IllegalStateException();
            }
            scannerHowManyPlayers.reset();
        }
        return boardSelected;
    }

    public int levelScannerSelection() {
        int level = 0;
        Scanner scannerHowManyPlayers = new Scanner(System.in);

        if (scannerHowManyPlayers.hasNextInt()) {
            int enteredNumber = scannerHowManyPlayers.nextInt();
            if (enteredNumber > 0) {
                level = enteredNumber;
            } else {
                throw new IllegalStateException("Selected option was incorrect. Medium level was selected as default.");
            }
            scannerHowManyPlayers.reset();
        }
        return level;
    }

    public Move squareSelection(int boardSize, String valueEntered) {
        Scanner enteredValue = new Scanner(valueEntered);
        Scanner numbersSelected = new Scanner(enteredValue.nextLine()).useDelimiter("\\s*,\\s*");
        int row = 0;
        int column = 0;
        int value = 0;

        if (numbersSelected.hasNextInt()) {
                column = numbersSelected.nextInt()-1;
        }
        if (numbersSelected.hasNextInt()) {
                row = numbersSelected.nextInt()-1;
        }
        if (numbersSelected.hasNextInt()) {
                value = numbersSelected.nextInt();
        }
        if ((column >= 0) && (column <= boardSize) && (row >= 0) && (row <= boardSize) &&
                (value > 0) && (value <= boardSize)) {

            return new Move(column,row,value, false);
        } else {
            System.out.println("""
            Invalid parameters entered.
            Please enter "column,row,value" with values not smaller then "0"
            and not greater then board size""");
        return null;
        }
    }

    public String generalScanner() {
        String returnValue="";
        Scanner typedValue = new Scanner(System.in);

        if (typedValue.hasNext()) {
           returnValue = typedValue.next();
        }

        typedValue.reset();
        return returnValue;
    }

}
