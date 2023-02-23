package com.kodilla.matrix.sudoku.options;

import java.util.Scanner;

public class PlayAgain {

    public boolean playAgain() {
        String entered;
        boolean enteredReturns = false;
        boolean returnOk = false;
        int tryCounter = 0;

        while (!returnOk) {
            System.out.println("Do you want to play again? Please enter [y]-Yes or [n]-No");
            Scanner stringSelected = new Scanner(System.in);
            if (stringSelected.hasNext()) {
                entered = stringSelected.next();

                if (entered.equalsIgnoreCase("Y")) {
                    enteredReturns = true;
                    returnOk = true;
                } else {
                    if ((tryCounter > 4) || (entered.equalsIgnoreCase(("N")))) {
                        returnOk = true;
                    }
                }
            }
            tryCounter++;
            stringSelected.reset();
        }
        return enteredReturns;
    }

}


