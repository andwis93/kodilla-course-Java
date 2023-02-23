package com.kodilla.matrix.rps;

import java.util.Comparator;
import java.util.List;

public class RpsRunner {
    public static void main(String[] args) {


        PlayGame playTheGame = new PlayGame();
        PlayersList playersList = new PlayersList();
        OptionsSet optionSet = new OptionsSet();
        boolean end;
        int winSet = 1;
        int roundCounter = 1;
        long topScore = 0;
        String keepGoing;

        //SetUp Starts ***
        System.out.println("Hi.\n\nYou are playing \"ROCK, PAPERK, SCISSORS,LIZARD, SPOCK\" game.\n\n" +
                "Scissors cuts paper, paper covers rock, rock crushes lizard, lizard poisons Spock, \n" +
                "Spock smashes scissors, scissors decapitates lizard, lizard eats paper, paper disproves \n" +
                "Spock, Spock vaporizes rock, and as it always has, rock crushes scissors. \n\n" +
                "1) Each round has only one winner.\n2) You play round untill all other players will be eliminated.\n" +
                "3) During each play player with smallest amount of points will be eliminated.\n" +
                "4) For draw you get 1 point, for win you get 3 points.");

        System.out.println("\nLets set up the game\n");

        //Setting number of players Start
        int numberOfPlayers = optionSet.setNumberOfPlayers();
        //Setting number of players End

        //Enter names for players Start
        while (numberOfPlayers > playersList.players.size()) {
            int displayI = playersList.players.size() + 1;
            System.out.println("Enter name for player #" + displayI);
            playersList.addPlayer();
        }
        //Enter names for players End

        // Setting numbers of Wins Start
        winSet = optionSet.setHowManyWins();
        System.out.println("\nRock, Paper, Scissors, Lizard, Spock. LETS GO!!!\n");
        //Setting numbers of Wins End

        //Settings Ends***

        //Start ***
        end = false;
        while (!end){
            while (topScore < winSet){
                System.out.println("ROUND " + roundCounter + " >>>");
                playTheGame.playGames(playersList.players);
                for (Player addPointToPlayer : playersList.players) {
                    if (addPointToPlayer.getWinOrLost() == 'W') {
                        addPointToPlayer.setWinCounter();
                    }
                }
                System.out.println("\n-" + playTheGame.getRoundWinner(playersList.players) + "- WON round #" + roundCounter+"\n");
                roundCounter++;

                topScore = playersList.players.stream()
                        .mapToLong(Player::getWinCounter)
                        .max()
                        .orElse(Long.MAX_VALUE);
            }
            end = true;

            long finalTopScore = topScore;

            //Summary Start
            List<Player> sortedList = playersList.players.stream()
                    .sorted(Comparator.comparing(Player::getWinCounter).reversed())
                    .toList();

            System.out.println("\nSUMMARY:\n");

            for(Player playerSummary:sortedList)
                System.out.println(playerSummary + "\n");

            List<Player> winnersList = playersList.players.stream()
                    .filter(n->n.getWinCounter()== finalTopScore)
                    .toList();

            System.out.println("****************************************************************************************" +
                    "\nPlayer -" + winnersList.get(0).getPlayerName() + "- is the WINNER. Congratulations to All!\n" +
                    "****************************************************************************************\n");
            //Summary End

            //Checking if you want to keep playing Start
            keepGoing = optionSet.selectContinuingOrNot();
            System.out.println(keepGoing.toUpperCase());

            if (keepGoing.toUpperCase().equals("X")) {
                winSet = optionSet.setHowManyWins();
                for (Player resetPlayers : playersList.players) {
                    resetPlayers.resetPoints();
                    resetPlayers.resetWinCounter();
                    resetPlayers.setWin();
                }
                topScore=0;
            }

            end = false;

            if (keepGoing.toUpperCase().equals("N")) end = true;
            //Checking if you want to keep playing End
        }
        //End***

        System.out.println("\n\nGOODBYE!");
    }
}

