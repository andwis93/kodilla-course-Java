package com.kodilla.matrix.patterns.prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Board extends Prototype<Board> {
    private String name;
    private Set<TasksList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<TasksList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (TasksList list:lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board cloneBoard = super.clone();
        cloneBoard.lists = new HashSet<>();
        for (TasksList theList: lists) {
            TasksList cloneList = new TasksList(theList.getName());
            for (Task task : theList.getTasks()) {
                cloneList.getTasks().add(task);
            }
            cloneBoard.getLists().add(cloneList);

        }
        return cloneBoard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Board board)) return false;
        return Objects.equals(getName(), board.getName()) && Objects.equals(getLists(), board.getLists());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLists());
    }
}
