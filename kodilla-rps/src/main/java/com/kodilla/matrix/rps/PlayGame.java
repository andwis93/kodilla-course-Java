package com.kodilla.matrix.rps;

import java.util.List;
import java.util.Objects;

public final class PlayGame {
    Play play = new Play();
    long howManyDraw = 0;
    boolean roundEnds;
    String roundWinner = null;
    public void playGames(List<Player> playersList) {
        setPlayersAsWinners(playersList);
        //List<Player> whoWon = null;
        do {
            roundEnds = false;
            System.out.println();

            //Each Player Move Start
            int ii = 0;
            while (ii < playersList.size()) {
                playersList.get(ii).resetPoints();
                if (playersList.get(ii).getWinOrLost() == 'W'){

                    System.out.println("-" + playersList.get(ii).getPlayerName() + "-" +
                            " (WINS [" + playersList.get(ii).getWinCounter() + "]), select:");

                    System.out.println("[1]-ROCK, [2]-PAPER, [3]-SCISSORS, [4]-LIZARD, [5]-SPOCK");

                    play.enterPlay();
                    playersList.get(ii).setGameSelected((play.playName.get(0)));
                    playersList.get(ii).setCase1((play.playName.get(1)));
                    playersList.get(ii).setCase2((play.playName.get(2)));
                }
                ii++;
            }
            //Each Player Move End

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println();

            //Calculating draw Start
            for (int i = 0; i < playersList.size(); i++) {
                int finalI = i;
                howManyDraw = playersList.stream()
                        .filter(winOrlost -> winOrlost.getWinOrLost() == 'W')
                        .filter(n -> n.getGameSelected() == playersList.get(finalI).getGameSelected())
                        .filter(n -> playersList.get(finalI).getPlayerName() != n.getPlayerName())
                        .count();

                List<String> withWhoDraw = playersList.stream()
                        .filter(wonOrlost -> wonOrlost.getWinOrLost() == 'W')
                        .filter(n -> n.getGameSelected() == playersList.get(finalI).getGameSelected())
                        .map(Player::getPlayerName)
                        .filter(playerName -> playersList.get(finalI).getPlayerName() != playerName)
                        .toList();

                playersList.get(i).setPoints(howManyDraw);

                System.out.println("\nPlayer: *" + playersList.get(i).getPlayerName() +
                        "* played with -" + playersList.get(i).getGameSelected().toUpperCase() +
                        "-\nDRAW with:");

                for (String playerWon : withWhoDraw) {
                    System.out.println("'" + playerWon + "'");
                }
                //Calculating draw End

                //Calculating win Start
                List<Player> listCollectedWin = playersList.stream()
                        .filter(winOrlost -> winOrlost.getWinOrLost() == 'W')
                        .filter(n -> !Objects.equals(n.getPlayerName(), playersList.get(finalI).getPlayerName()))
                        .filter(win -> win.getGameSelected().equals(playersList.get(finalI).getCase1()) ||
                                win.getGameSelected().equals(playersList.get(finalI).getCase2()))
                        .toList();

                long howManyWins = playersList.stream()
                        .filter(winOrlost -> winOrlost.getWinOrLost() == 'W')
                        .filter(n -> !Objects.equals(n.getPlayerName(), playersList.get(finalI).getPlayerName()))
                        .filter(win -> win.getGameSelected().equals(playersList.get(finalI).getCase1()) ||
                                win.getGameSelected().equals(playersList.get(finalI).getCase2()))
                        .count();

                playersList.get(i).setPoints((howManyWins) * 3);

                System.out.println("WON with:");
                for (Player playerLost : listCollectedWin) {
                    System.out.println("'" + playerLost.getPlayerName() + "'" + " - " + playerLost.getGameSelected().toUpperCase());
                }
                System.out.println("Scored: " + playersList.get(i).getPoints() + " pts.");
            }

            //Checking List for Winners and Loosers Start
            System.out.println();

            long ListSize = playersList.stream()
                    .filter(wonOrlost -> wonOrlost.getWinOrLost() == 'W')
                    .count();

            if (howManyDraw < ListSize) {
                long minPoints = playersList.stream()
                        .filter(winOrlost -> winOrlost.getWinOrLost() == 'W')
                        .mapToLong(Player::getPoints)
                        .min()
                        .orElse(Long.MIN_VALUE);

                List<Player> removeMinPointsPlayers = playersList.stream()
                        .filter(winOrlost -> winOrlost.getWinOrLost() == 'W')
                        .filter(p -> p.getPoints() == minPoints)
                        .toList();

                if (removeMinPointsPlayers.size() < ListSize) {
                    for (Player playerToRemove : removeMinPointsPlayers) {
                        System.out.println("-" + playerToRemove.getPlayerName() +"-" + " has been ELIMINATED from this round!");
                        playerToRemove.setLost();
                    }
                }
            }
            //Checking List for Winners and Loosers End

            //Checking if there is more then one winner Start
            long howManyPlayers = playersList.stream()
                    .filter(wonOrLost -> wonOrLost.getWinOrLost() == 'W')
                    .count();
            roundEnds = howManyPlayers == 1;
            //Checking if there is more then one winner End
        }
        while(!roundEnds);
    }

    public String getRoundWinner(List<Player> playersList){
        List<Player> tempRoundWinner = playersList.stream()
                .filter(wonOrLost -> wonOrLost.getWinOrLost() == 'W')
                .toList();
        return roundWinner = tempRoundWinner.get(0).getPlayerName();
    }
    public void setPlayersAsWinners(List<Player> playersList){
        for(Player playerListForSetAsWinner:playersList){
            playerListForSetAsWinner.setWin();
        }
    }
}
