package com.kodilla.rps;

import java.util.Objects;

public final class Player {

    private char winOrLost = 'W';
    private final String playerName;
    private  int winCounter;
    private  long points=0;
    private  String gameSelected;
    private String case1="spock";
    private String case2="paper";

    public Player(String playerName) {this.playerName = playerName;}
    public String getPlayerName() {return playerName;}
    public int getWinCounter() {
        return winCounter;
    }
    public long getPoints() {
        return points;
    }
    public String getGameSelected() {
        return gameSelected;
    }
    public String getCase1() {
        return case1;
    }
    public String getCase2() {
        return case2;
    }
    public char getWinOrLost(){
        return this.winOrLost;
    }
    public void setPoints(long points) {
        this.points += + points;
    }
    public void setGameSelected(String gameSelected) {
        this.gameSelected = gameSelected;
    }
    public void setWinCounter() {this.winCounter++;}
    public void setCase1(String case1) {
        this.case1 = case1;
    }
    public void setCase2(String case2) {
        this.case2 = case2;
    }
    public void setWin(){
        this.winOrLost ='W';
    }
    public void setLost(){this.winOrLost = 'L';}
    public void resetPoints() {
        this.points = 0;
    }
    public void resetWinCounter(){
        this.winCounter=0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        Player that = (Player) o;

        return Objects.equals(playerName, that.playerName);
    }

    @Override
    public String toString() {
        return "Player "
                + playerName +
                "\nWon: " + winCounter + " times";
    }
}

