package com.kodilla.matrix.rps;

import java.util.Scanner;

public class OptionsSet {
    public int setHowManyWins(){
        int howManyWins=1;
        boolean isNumber=false;

        while (!isNumber) {
            System.out.println("How many wins you should have to win The Game? (select number from 1 to 101)!");
            Scanner scannerHowManyGames = new Scanner(System.in);

            if (scannerHowManyGames.hasNextInt()) {
                int enteredNumber = scannerHowManyGames.nextInt();
                if ((enteredNumber > 0) && (enteredNumber < 101)) {
                    howManyWins = enteredNumber;
                    isNumber = true;
                }
            }
            scannerHowManyGames.reset();
        }
        return howManyWins;
    }

    public int setNumberOfPlayers(){
        int numberOfPlayers = 2;
        boolean isNumber=false;

        while (!isNumber) {
            System.out.println("Enter numbers of players (from 2 to 50)!");
            Scanner scannerHowManyPlayers = new Scanner(System.in);

            if (scannerHowManyPlayers.hasNextInt()) {
                int enteredNumber = scannerHowManyPlayers.nextInt();
                if ((enteredNumber > 1) && (enteredNumber < 51)) {
                    numberOfPlayers=enteredNumber;
                    isNumber = true;
                }
            }
            scannerHowManyPlayers.reset();
        }
        return numberOfPlayers;
    }
    public String selectContinuingOrNot() {
        int tryCounter = 0;
        String keepGoing = null;
        do {
            System.out.println("You want to keep going? [x]-Yes [n]-No");
            Scanner userPressedForKeepGoing = new Scanner(System.in);
            keepGoing = userPressedForKeepGoing.next();
            tryCounter++;
        }
        while ((keepGoing.toUpperCase() == "X") || (keepGoing.toUpperCase() == "N") || (tryCounter > 5));
        return keepGoing;
    }
}

