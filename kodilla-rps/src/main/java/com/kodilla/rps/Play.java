package com.kodilla.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Play {
    List<String> playName = new ArrayList<>();
    public void enterPlay() {

        int chosenGame=0;
        boolean isNumber = false;

        while (!isNumber) {
            Scanner numberSelected = new Scanner(System.in);
            if (numberSelected.hasNextInt()) {
                chosenGame = numberSelected.nextInt();
                if ((chosenGame > 0) && (chosenGame < 6)) {
                    numberSelected.reset();

                    if (chosenGame == 1) {
                        playName.add(0, "rock");
                        playName.add(1, "lizard");
                        playName.add(2, "scissors");
                    }

                    if (chosenGame == 2) {
                        playName.add(0, "paper");
                        playName.add(1, "rock");
                        playName.add(2, "spock");
                    }

                    if (chosenGame == 3) {
                        playName.add(0, "scissors");
                        playName.add(1, "paper");
                        playName.add(2, "lizard");
                    }

                    if (chosenGame == 4) {
                        playName.add(0, "lizard");
                        playName.add(1, "spock");
                        playName.add(2, "paper");
                    }

                    if (chosenGame == 5) {
                        playName.add(0, "spock");
                        playName.add(1, "scissors");
                        playName.add(2, "rock");
                    }

                    //Clean screen Start
                    for (int i = 0; i < 40; i++) {
                        System.out.println();
                    }
                    //Clean screen End
                    isNumber = true;

                } else {
                    System.out.println("Please select number from 1 to 5");
                }
            } else {
                if (numberSelected.hasNext())
                    System.out.println("Please select number from 1 to 5");

            }
        }
    }
}

