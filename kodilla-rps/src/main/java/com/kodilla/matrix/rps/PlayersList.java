package com.kodilla.matrix.rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public final class PlayersList {

    public final List<Player> players = new ArrayList<>();
    public PlayersList() {
    }
    public void addPlayer()
    {
        Scanner sc = new Scanner(System.in);
        String enteredName = sc.next();
        boolean playerNameExist = players.stream()
                .anyMatch(p -> Objects.equals(p.getPlayerName(), enteredName));
        if (!playerNameExist) {
            players.add(new Player(enteredName));
        }else
        {
            System.out.println("Player name already exist. Please choose different player name!");
        }
    }
}

